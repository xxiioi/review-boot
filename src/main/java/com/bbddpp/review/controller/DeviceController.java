package com.bbddpp.review.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbddpp.review.dto.ShakeHandsReq;
import com.bbddpp.review.dto.ShakeHandsRsp;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/device")
@Api(tags = "设备控制交互")
public class DeviceController {

    @PostMapping("/shakeHands")
    @ApiOperation(value = "接收心跳包，同时下发任务信息")
    private ShakeHandsRsp shakeHands(@RequestBody ShakeHandsReq shakeHandsReq) {
        ShakeHandsRsp rsp = new ShakeHandsRsp();
        return rsp;
    }
}
