package com.duan.service.exceptions;

import com.duan.service.enums.CommentStatus;

/**
 * Created on 2019/11/1.
 *
 * @author DuanJiaNing
 */
public class IllegalStatusException extends CommentException {

    public IllegalStatusException(CommentStatus status) {
        super("Comment status illegal: " + status + ", conflict with current operational.");
    }
}
