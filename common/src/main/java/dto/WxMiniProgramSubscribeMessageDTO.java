package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 方希萌
 * @version 1.0
 * @description 微信推送消息对象
 * @package com.gree.ecommerce.module.wx_mini_program.message.dto
 * @date 2022/5/26
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class WxMiniProgramSubscribeMessageDTO implements Serializable {
    private static final long serialVersionUID = -5950053298419284894L;

    /**
     * token
     */
    private String accessToken;

    /**
     * openId
     */
    private String touser;

    /**
     * 模板id
     */
    private String templateId;

    /**
     * 跳转页面
     */
    private String page;

    /**
     * 跳转小程序类型：developer为开发版；trial为体验版；formal为正式版；默认为正式版
     */
    private String miniprogramState;

    /**
     * 进入小程序查看”的语言类型，支持zh_CN(简体中文)、en_US(英文)、zh_HK(繁体中文)、zh_TW(繁体中文)，默认为zh_CN
     */
    private String lang;

    /**
     * 数据对象
     */
    private Map<String, Value> data;

    class Value{
        private String value;

        public Value(String value) {
            this.value = value;
        }
    }

}
