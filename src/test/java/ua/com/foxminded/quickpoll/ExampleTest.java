package ua.com.foxminded.quickpoll;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = QuickPollApplication.class)
@WebAppConfiguration
public class ExampleTest {

    @Before
    public void setup() {
    }

    @Test
    public void testSomeThing() {
    }

    @After
    public void teardown() {
    }
}
