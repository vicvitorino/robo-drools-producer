package br.robodroolsproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class N91Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(final String message) {
        log.info(String.format("Enviado -> %s", message));
        jmsTemplate.convertAndSend("robo-drools::n91", message);
    }

}
