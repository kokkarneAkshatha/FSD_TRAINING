package My_Company.Spring_dependency_demo.beans;

public class BaseBallCoach implements Coach {
	private Fortune fortune;
	
	public BaseBallCoach(Fortune fortune) {
		
		this.fortune = fortune;
	}

	public BaseBallCoach() {
		
	}
	@Override
	public String getDailyFortune() {
return fortune.Service().toString();
		//return fortune.getFortune().toString();
	}

	@Override
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		  
		  
		return "practice base ball";
		
	}

}
