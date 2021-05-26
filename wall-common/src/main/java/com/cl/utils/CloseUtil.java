package com.cl.utils;

import java.io.Closeable;

/**
 * 用于关闭各种连接，缺啥补啥
 * @author chenglei
 * @data 2021年05月2021/5/26日 11:56
 */
public class CloseUtil {
    public static void close(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (Exception e) {
                // 静默关闭
            }
        }
    }

    public static void close(AutoCloseable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (Exception e) {
                // 静默关闭
            }
        }
    }
}
