package com.im.server.general.manage.common.data;

/**
 * date 2018-06-13 18:17:51<br>
 * description 
 * @author XiaHui<br>
 * @since 
 */
public class PageInfo {
	private int pageSize = 30;// 页码大小
	private int startResult = 0;// 起始记录数
	private int endResult = 0;// 起始记录数
	private int totalCount = 0;
	private int pageNumber = 1;
	private int totalPage;

	public int getTotalCount() {
		return totalCount;
	}

	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	
	public int getPageSize() {
		return pageSize;
	}

	
	public void setPageSize(int pageSize) {
		if (pageSize > 0) {
			this.pageSize = pageSize;
		}
	}

	public void setStartResult(int startResult) {
		this.startResult = startResult;
	}

	
	public int getTotalPage() {
		if (this.getTotalCount() > 0) {
			totalPage = this.getTotalCount() / this.getPageSize();
			if (this.getTotalCount() % this.getPageSize() > 0) {
				totalPage = totalPage + 1;
			}
		}
		return totalPage;
	}

	
	public int getStartResult() {
		if ( this.getPageSize() < 0 || this.getPageNumber() < 0) {
			startResult = 0;
		} else if (startResult > 0) {
			
		} else {
			startResult = (this.getPageNumber() - 1) * this.getPageSize();
			
			if (startResult < 0) {
				startResult = 0;
			}
		}
		return startResult;
	}

	
	public void setEndResult(int endResult) {
		if (endResult > this.getTotalCount()) {
			this.endResult = this.getTotalCount();
		} else {
			this.endResult = endResult;
		}
	}

	
	public int getEndResult() {
		endResult = (this.getPageNumber() * this.getPageSize());
		if (endResult > this.getTotalCount()) {
			endResult = this.getTotalCount();
		}
		return endResult;
	}

	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	
	public int getPageNumber() {
		return pageNumber;
	}
}
