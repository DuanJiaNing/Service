package com.duan.service.exceptions;

import com.duan.service.enums.TopicStatus;

/**
 * Created on 2019/11/1.
 *
 * @author DuanJiaNing
 */
public class IllegalStatusException extends TopicException {

    public IllegalStatusException(TopicStatus status) {
        super("Topic status illegal: " + status + ", conflict with current operational.");
    }
}
