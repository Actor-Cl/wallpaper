package com.cl.modules.system.domain.vo;

import lombok.Data;

/**
 * 修改密码vo类
 * @author chenglei
 * @data 2021年05月2021/5/28日 15:40
 */
@Data
public class UserPassVo {
    private String oldPass;

    private String newPass;
}
