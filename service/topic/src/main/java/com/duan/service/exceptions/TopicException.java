package com.duan.service.exceptions;

/**
 * Created on 2019/10/25.
 *
 * @author DuanJiaNing
 */
public class TopicException extends Throwable {

    public TopicException() {
    }

    public TopicException(String message) {
        super(message);
    }

    public TopicException(String message, Throwable cause) {
        super(message, cause);
    }

    public TopicException(Throwable cause) {
        super(cause);
    }

    public TopicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
