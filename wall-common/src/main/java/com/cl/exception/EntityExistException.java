package com.cl.exception;

import com.cl.utils.StringUtils;

/**
 * @author chenglei
 * @data 2021年05月2021/5/27日 18:19
 */
public class EntityExistException extends RuntimeException{
    public EntityExistException(Class clazz, String field, String val) {
        super(EntityExistException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " existed";
    }
}
