package com.duan.service.exceptions;

/**
 * Created on 2019/11/1.
 *
 * @author DuanJiaNing
 */
public class InternalException extends Throwable {

    public InternalException(String module) {
        super("Module " + module + " got unexpected error");
    }

    public InternalException(String module, String msg) {
        super(module + " error: " + msg);
    }
}
