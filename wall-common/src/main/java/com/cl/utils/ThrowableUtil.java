package com.cl.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常工具
 * @author chenglei
 * @data 2021年05月2021/5/31日 10:35
 */
public class ThrowableUtil {

    /**
     * 获取堆栈信息
     */
    public static String getStackTrace(Throwable throwable){
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }
}
