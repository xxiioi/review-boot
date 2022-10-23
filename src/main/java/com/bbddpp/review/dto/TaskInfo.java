package com.bbddpp.review.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "工位测试任务信息", description = "")
public class TaskInfo {

    @ApiModelProperty(value = "任务编号", required = true, example = "1", position = 1)
    private Integer taskNo;
    @ApiModelProperty(value = "工站名称", required = true, example = "DI_I", position = 2)
    private String station;
    // 配置文件地址信息，暂不启用
    @ApiModelProperty(value = "配置文件信息", required = false, example = "", position = 3)
    private String configPath;
    @ApiModelProperty(value = "测试TU的路径信息", required = true, example = "DI_I.20120101/xxxx", position = 4)
    private String tuPath;
}
