package com.caztc.service.impl;

import com.caztc.service.NoticeService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author narata
 * @since 2019/03/31
 */
public class NoticeServiceImplTest {

    private final NoticeService noticeService = new NoticeServiceImpl();

    @Test
    public void list() {
        System.out.println(noticeService.list());
    }

    @Test
    public void add() {
    }

    @Test
    public void delete() {
        noticeService.delete(1);
    }
}