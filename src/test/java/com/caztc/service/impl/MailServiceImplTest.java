package com.caztc.service.impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author narata
 * @since 2019/03/27
 */
public class MailServiceImplTest {

    @Test
    public void sendMail() throws Exception {
        MailServiceImpl mailService = new MailServiceImpl();
        mailService.sendMail("∑¢ÀÕ” º˛", "” œ‰≤‚ ‘", "674661761@qq.com");
    }
}