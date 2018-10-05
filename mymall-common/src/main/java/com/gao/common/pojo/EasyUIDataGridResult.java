package com.gao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Program:mymall
 * @Description: datagrid 展示数据的pojo 包括商品的pojo
 * @Author Gqjian
 * @Create 2018/10/3 13:38:09
 */
public class EasyUIDataGridResult implements Serializable {

    private Integer total;

    private List rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
