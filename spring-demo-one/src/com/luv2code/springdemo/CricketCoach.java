package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach()
	{
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//our setter method
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
