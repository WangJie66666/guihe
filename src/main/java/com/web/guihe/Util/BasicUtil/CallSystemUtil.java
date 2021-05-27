package com.web.guihe.Util.BasicUtil;

import com.web.guihe.Entity.GhCallSystem;

/**
 * 呼叫中心分页工具
 */
public class CallSystemUtil extends GhCallSystem {
    //当前页
    private int pageNum;

    //每页的数量
    private int pageSize;

    //总记录数
    private long total;

    //总页数
    private int pages;

    //首页
    private int firstPage;

    //最后页
    private int lastPage;

    //上一页
    private int prePage;

    //下一页
    private int nextPage;

    private GhCallSystem ghCallSystem;

    public GhCallSystem getGhCallSystem() { return ghCallSystem; }

    public void setGhCallSystem(GhCallSystem ghCallSystem) { this.ghCallSystem = ghCallSystem; }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
