package com.nchu.model;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {
    private long total;//总记录数
    private List<T> rows;//当前页结果

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<T> getRows() {
        return rows;
    }
    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
