package com.haiyu.manager.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;

@ApiModel(value="com.haiyu.manager.dto.MainData")
@Table(name = "main_data")
public class MainData {
    /**
     * 主键id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    @ApiModelProperty(value="id主键id")
    private Long id;

    /**
     * 编码
     */
    @ApiModelProperty(value="code编码")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty(value="name名称")
    private String name;

    /**
     * 状态
     */
    @ApiModelProperty(value="state状态")
    private Integer state;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="createTime创建时间")
    private Date createTime;

    /**
     * 备注
     */
    @ApiModelProperty(value="note备注")
    private String note;

    /**
     * 版本号
     */
    @ApiModelProperty(value="version版本号")
    private String version;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public MainData setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public MainData setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public MainData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public MainData setState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public MainData setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public MainData setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public MainData setVersion(String version) {
        this.version = version;
        return this;
    }
}