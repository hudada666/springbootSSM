package cn.study.microboot.test;
import cn.study.microboot.controller.MessageController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import cn.mldn.microboot.StartSpringBootMain;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = MessageController.class )
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMessageController {
    @Resource
    private MessageController messageController;

    @Test
    public  void testEcho() {
//         System.out.println(this.messageController.echo("lgs"));
    }

}
