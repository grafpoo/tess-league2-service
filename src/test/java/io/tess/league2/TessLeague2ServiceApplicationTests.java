package io.tess.league2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TessLeague2ServiceApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void applicationContextTest() {
		TessLeague2ServiceApplication.main(new String[] {});
	}
	@Test
	public void seeSomething() {
		Assert.assertTrue((1==1));
	}
}
