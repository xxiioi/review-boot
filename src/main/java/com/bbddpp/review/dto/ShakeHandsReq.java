package com.bbddpp.review.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "设备的握手请求", description = "")
public class ShakeHandsReq {

    // 握手包编号
    @ApiModelProperty(value = "握手包编号", required = true, example = "1", position = 1)
    private Integer no;
    // 设备名
    @ApiModelProperty(value = "设备名", required = true, example = "DESKTOP-XXXXXX", position = 2)
    private String deviceName;
    // 设备IP
    @ApiModelProperty(value = "设备IP", required = true, example = "192.168.1.1", position = 3)
    private String deviceIP;
    // 设备型号
    @ApiModelProperty(value = "设备型号", required = true, example = "HockingX-A1111", position = 4)
    private String deviceModel;
    // 客户机状态， 0 - 空闲 1 - 忙碌
    @ApiModelProperty(value = "客户机状态", required = true, example = "0", position = 5)
    private Integer workStatus;
    // 附带的执行结果
    @ApiModelProperty(value = "客户机任务执行结果", required = false, position = 6)
    private TaskResult taskResult;
}
