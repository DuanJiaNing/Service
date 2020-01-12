package com.duan.service.enums;

/**
 * Created on 2019/10/29.
 *
 * @author DuanJiaNing
 */
public enum TopicStatus {

    FINE(1),
    DELETED(2);

    private int code;

    TopicStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
