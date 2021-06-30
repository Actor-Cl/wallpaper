package com.cl.modules.system.service;

import com.cl.domain.vo.EmailVo;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 15:39
 */
public interface VerifyService {
    /**
     * 发送验证码
     * @param email /
     * @param key /
     * @return /
     */
    EmailVo sendEmail(String email, String key);


    /**
     * 验证
     * @param code /
     * @param key /
     */
    void validated(String key, String code);
}
