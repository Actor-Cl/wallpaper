package com.cl.modules.system.domain;

import com.cl.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author chenglei
 * @data 2021年05月2021/5/28日 17:31
 */
@Entity
@Getter
@Setter
@Table(name = "sys_dict_detail")
public class DictDetail extends BaseEntity implements Serializable {
    @Id
    @Column(name = "detail_id")
    @NotNull(groups = Update.class)
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "dict_id")
    @ManyToOne(fetch=FetchType.LAZY)
    @ApiModelProperty(value = "字典", hidden = true)
    private Dict dict;

    @ApiModelProperty(value = "字典标签")
    private String label;

    @ApiModelProperty(value = "字典值")
    private String value;

    @ApiModelProperty(value = "排序")
    private Integer dictSort = 999;
}
