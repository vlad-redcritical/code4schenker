package pl.codeschenker.restapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.codeschenker.service.DeliveryService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RestApiApplicationTests {

	@Autowired
    DeliveryService deliveryService;

	@Test
	public void contextLoads() {

	}


}
