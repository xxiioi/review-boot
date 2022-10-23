package com.bbddpp.review.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "工位测试结果返回", description = "")
public class TaskResult {

    @ApiModelProperty(value = "任务编号", required = true, example = "1", position = 1)
    private Integer taskNo;
    // 测试结果 0 - 测试中 1 - 成功 2 - 失败
    @ApiModelProperty(value = "测试结果返回", required = true, example = "1", position = 2)
    private Integer result;
    // 测试进度 百分比（0 - 100）
    @ApiModelProperty(value = "握手包编号", required = true, example = "10", position = 3)
    private Integer progress;
    @ApiModelProperty(value = "开始时间", required = false, example = "2020-", position = 4)
    private String startTime;
    @ApiModelProperty(value = "结束时间", required = false, example = "2020-", position = 5)
    private String endTime;
    // 耗时，单位秒
    @ApiModelProperty(value = "耗时", required = false, example = "20", position = 6)
    private Integer timeConsuming;
}
