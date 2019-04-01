package com.caztc.service.impl;

import com.caztc.domain.Feedback;
import com.caztc.service.FeedbackService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author narata
 * @since 2019/03/27
 */
public class FeedbackServiceImplTest {

    FeedbackService feedbackService = new FeedbackServiceImpl();

    @Test
    public void add() {

        Feedback feedback = new Feedback();
        feedback.setSubject("1");
        feedback.setName("narata");
        feedback.setPhone("111");
        feedback.setDescription("111");
        Assert.assertTrue(feedbackService.add(feedback));
    }

    @Test
    public void list() {
        List<Feedback> feedbacks = feedbackService.list();
        System.out.println(feedbacks.toString());
    }
}