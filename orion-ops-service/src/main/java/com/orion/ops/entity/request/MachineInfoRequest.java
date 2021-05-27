package com.orion.ops.entity.request;

import com.orion.lang.wrapper.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 机器信息
 *
 * @author Jiahang Li
 * @version 1.0.0
 * @since 2021/4/14 22:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MachineInfoRequest extends PageRequest {

    /**
     * id
     */
    private Long id;

    /**
     * 机房id
     */
    private Long roomId;

    /**
     * 代理id
     */
    private Long proxyId;

    /**
     * 主机ip
     */
    private String host;

    /**
     * ssh端口
     */
    private Integer sshPort;

    /**
     * 机器名称
     */
    private String name;

    /**
     * 机器标签
     */
    private String tag;

    /**
     * 机器描述
     */
    private String description;

    /**
     * 机器账号
     */
    private String username;

    /**
     * 机器密码
     */
    private String password;

    /**
     * 机器key
     */
    private Long keyId;

    /**
     * 机器认证方式 1: 账号认证 2: key认证
     */
    private Integer authType;

    /**
     * 系统类型  1: linux 2: windows
     */
    private Integer systemType;

    /**
     * 机器版本 如: centOS7.0
     */
    private String systemVersion;

    /**
     * 机器状态 1有效 2无效
     */
    private Integer status;

    /**
     * 同步属性
     */
    private String syncProp;

    /**
     * 跳过宿主机
     */
    private Integer skipHost;

}