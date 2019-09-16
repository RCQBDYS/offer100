package cn.itsource.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshen
 * @date 2019/9/16 21:17
 * 主要功能说明：公共工具类的抽象
 */
public class PageList<T> {
    private long total = 0;
    private List<T> rows = new ArrayList<T>();

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

}
