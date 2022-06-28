package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author hawk
 * @package com.gree.ecommerce.category.dto
 * @desc 平台类目表 仅用于后端接口之间调用
 * @date 2021/12/14
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PlatformCategoryDO implements Serializable {
    private static final long serialVersionUID = -4655086558867640058L;
    /**
     * id
     */
    private Long id;

    /**
     * 一级类目id
     */
    private Long firstPlatformCid;

    /**
     * 二级类目id
     */
    private Long secondPlatformCid;

    /**
     * 三级类目id
     */
    private Long thirdPlatformCid;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 全名称 一级名称/二级名称/三级名称
     */
    private String fullName;

    /**
     * 状态 10-启用；20-停用
     */
    private Integer state;

    /**
     * 是否需要审核 10-需要；20-不需要
     */
    private Integer needAudit;

    /**
     * 排序号
     */
    private Long sorted;

    /**
     * 类目扣点
     */
    private BigDecimal rebateRate;

    /**
     * 设置扣点时间
     */
    private LocalDateTime rebateTime;

    /**
     * 层级：1-一级，2-二级，3-三级
     */
    private Integer level;

    /**
     * 图片
     */
    private String pictureUrl;



    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 是否可用 10-可用 20-删除
     */
    private Integer enableFlag;

    /**
     * 版本号--乐观锁预留字段
     */
    private Long version;


}
