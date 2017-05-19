package com.tim.page;

/**
 * Created by timhuo on 2017/5/18.
 */
public class Page {
    private Integer pagesize; //页面大小
    private Integer pageno; //当前页
    private Integer startrow; //起始行
    private Integer totalpage; //总页数
    private Integer totalcount; //总条数

    public Page() {
    }
    public Page(Integer pageSize, Integer pageNo, Integer totalCount) {
        this.pagesize = pageSize; //页面大小
        this.pageno = pageNo;  //当前页
        this.totalcount = totalCount; //计算总条数
        this.setStartrow(pageNo, pageSize); //计算起始行
        this.setTotalpage(totalCount, pageSize); //计算总页数
    }

    /**
     * 计算总页数
     * @param totalCount
     * @param pageSize
     */
    public void setTotalpage(Integer totalCount,Integer pageSize) {
        this.totalpage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
    }

    public void setStartrow(Integer pageNo,Integer pageSize) {
        this.startrow = (pageNo-1)*pageSize;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getPageno() {
        return pageno;
    }

    public void setPageno(Integer pageno) {
        this.pageno = pageno;
    }

    public Integer getStartrow() {
        return startrow;
    }

    public Integer getTotalpage() {
        return totalpage;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }
}
