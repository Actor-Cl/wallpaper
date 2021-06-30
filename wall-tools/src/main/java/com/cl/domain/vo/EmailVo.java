package com.cl.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 发送邮件时，接受参数的类
 * @author chenglei
 * @data 2021年05月2021/5/28日 15:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailVo {
    /** 收件人，支持多个收件人 */
    @NotEmpty
    private List<String> tos;

    @NotBlank
    private String subject;

    @NotBlank
    private String content;
}
