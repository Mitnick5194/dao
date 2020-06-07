package com.ajie.db.mybatis.support;

import java.util.ArrayList;
import java.util.Iterator;

import com.ajie.chilli.support.PageData;

public abstract class AbstractMybatisPageData<T> extends ArrayList<T> implements
		PageData<T> {

	private static final long serialVersionUID = 1L;
	/** 默认每页项数 */
	public static final int DEFAULT_PAGE_SIZE = 10;
	/** 当前页 */
	protected int page;
	/** 每页项数 */
	protected int pageSize;
	/** 总页数 */
	private int pageCount;
	/** 总项数 */
	private int count;
	/** 当前指针位置 */
	private int pos;

	protected AbstractMybatisPageData(int count) {
		pageSize = DEFAULT_PAGE_SIZE;
		this.count = count;
		page = 0;
		pos = -1;
		cal();
	}

	/**
	 * 计算页数
	 */
	private void cal() {
		this.pageCount = (int) Math.ceil((double) count / (double) pageSize);
	}

	/**
	 * 获取当前指针的数据
	 * 
	 * @return
	 */
	private T get() {
		if (page == 0) {
			page = 1;// 默认第一页
		}
		// 拿当前下标的值
		int size = super.size();
		if (size == 0 || pos > size - 1) {
			loadData();
			pos = 0;// 数组被清空了从0开始读
		}
		return super.get(pos);
	}

	/**
	 * 加载数据
	 */
	protected abstract void loadData();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Iterator<T> iterator() {
		return new PageDataIterator(this);
	}

	@Override
	public Iterable<T> toForeach() {
		pageSize = count;
		page = 1;
		return this;
	}

	/**
	 * 指针位置
	 * 
	 * @return
	 */
	protected int getPos() {
		return pos;
	}

	@Override
	public int getPage() {
		return page;
	}

	@Override
	public int getPageSize() {
		return pageSize;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public int getPageCount() {
		return pageCount;
	}

	@Override
	public boolean gotoPage(int page) {
		if (page <= 0) {
			return false;
		}
		if (page > pageCount
				|| (pageSize > 0 && (page > (int) Math
						.ceil(((double) count / (double) pageSize))))) {
			return false;
		}
		// pos = pageSize * (page - 1) - 1;// next的时候在向前走一步
		pos = 0;// 注释上面，每次翻页清空上次的数据，所以从0开始读取
		super.clear();// ：防止内存爆了
		this.page = page;
		return true;
	}

	@Override
	public boolean hasNext() {
		if (count == 0) {
			return false;
		}
		if (page == 0) {
			page = 1;// 默认第一页
		}
		// pos+1是否落在当前页
		return pos >= 0 && pos < pageSize && count > 0;
	}

	@Override
	public T next() {
		pos += 1;
		return get();
	}

	@Override
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		cal();
	}

	private static class PageDataIterator<T> implements Iterator<T> {
		private PageData<T> data;

		protected PageDataIterator(PageData<T> data) {
			this.data = data;
		}

		@Override
		public boolean hasNext() {
			return data.hasNext();
		}

		@Override
		public T next() {
			return data.next();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("不可删除");
		}
	}
}
