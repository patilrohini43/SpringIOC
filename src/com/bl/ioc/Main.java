package com.bl.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
//		Airtel airtel=new Airtel();
//		airtel.data();
//		airtel.recharge();
//		
//		Jio jio=new Jio();
//		jio.data();
//		jio.recharge();
//		
//		Sim sim=new Jio();
//		sim.data();
//		sim.recharge();
//				
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Sim sim=context.getBean("sim",Sim.class);
		sim.data();
		sim.recharge();
			
		
	}

}
