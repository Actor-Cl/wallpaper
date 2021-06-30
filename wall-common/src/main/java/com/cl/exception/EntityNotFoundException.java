package com.cl.exception;

import com.cl.utils.StringUtils;

/**
 * @author chenglei
 * @data 2021年05月2021/5/27日 18:24
 */
public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " does not exist";
    }
}
