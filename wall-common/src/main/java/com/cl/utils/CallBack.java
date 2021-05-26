package com.cl.utils;

/**
 * 针对某些初始化方法，在SpringContextHolder 初始化前时，<br>
 * 可提交一个 提交回调任务。<br>
 * 在SpringContextHolder 初始化后，进行回调使用
 * @author chenglei
 * @data 2021年05月2021/5/26日 11:53
 */
public interface CallBack {
    /**
     * 回调执行方法
     */
    void executor();

    /**
     * 本回调任务名称
     * @return /
     */
    default String getCallBackName() {
        return Thread.currentThread().getId() + ":" + this.getClass().getName();
    }
}
