package com.devopsbuddy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devopsbuddy.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private I18NService i18NService;
	
	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap Starter Template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		
		Assert.assertEquals("The actual and expected String don't match", expectedResult, actual);
	}
}
