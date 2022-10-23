package com.bbddpp.review.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "服务端握手返回", description = "")
public class ShakeHandsRsp {

    // 状态信息 0 - 正常 1 - 丢包断线（需要客户机发送握手包确认）
    @ApiModelProperty(value = "连接状态", required = true, example = "1", position = 1)
    private Integer conStatus;
    // 执行动作码 0 - 无动作 1 - 开始执行测试项
    @ApiModelProperty(value = "执行动作码", required = true, example = "0", position = 2)
    private Integer actionCode;
    // 要测试的工位任务信息
    @ApiModelProperty(value = "测试工位任务信息", required = false, position = 3)
    private TaskInfo taskInfo;
}
