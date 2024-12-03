package com.bsoft.mybatis;

import lombok.Data;

import java.util.List;

/**
 * Created by wjtc8 on 2017/5/12.
 */
@Data
public class Pager {

    private int pageSize;

    private int pageNum;

    private Long total;

    private int pages;

    private List<Object> items;

}
