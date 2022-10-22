package com.nowconder.community;

import com.nowconder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail(){
        mailClient.sendMail("jiangchuanu@163.com","Test","wuhu~");
    }

    @Test
    public void testHtmlMail(){
        Context context=new Context();
        context.setVariable("username","coconut");
        String content=templateEngine.process("/mail/demo",context);
        System.out.println(content);

        mailClient.sendMail("jiangchuanu@163.com","TestHtml",content);


    }

}
