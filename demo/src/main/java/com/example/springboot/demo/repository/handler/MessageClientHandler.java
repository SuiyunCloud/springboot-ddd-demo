package com.example.springboot.demo.repository.handler;

import com.alibaba.cola.repository.RepositoryHandler;
import com.alibaba.cola.repository.RepositoryHandlerI;
import com.example.springboot.core.view.MsgReq;
import com.example.springboot.core.view.MsgRes;
import com.example.springboot.demo.feign.MessageClient;
import lombok.AllArgsConstructor;

/**
 * @author lorne
 * @date 2020/2/9
 * @description
 */
@AllArgsConstructor
@RepositoryHandler
public class MessageClientHandler implements RepositoryHandlerI {

    private MessageClient messageClient;

    public MsgRes send(MsgReq request) {
        return messageClient.send(request);
    }

}
