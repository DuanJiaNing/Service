package com.duan.service.utils;

import com.github.pagehelper.PageInfo;

/**
 * Created on 2020/1/17.
 *
 * @author DuanJiaNing
 */
public class Utils {
    public static boolean emptyPage(PageInfo page) {
        return page == null || page.getTotal() == 0 || page.getList() == null || page.getList().size() == 0;
    }
}
