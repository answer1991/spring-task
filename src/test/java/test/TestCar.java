package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:beanstest.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCar {
	@Autowired
	private Car car;
	
	@Test
	public void test() {
		car.run();
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
		
	
}
