package practice1;

public interface BonusEligibility {

	static boolean isEligibleForBonus(double salary){
		
		if(salary > 50000) {
		return true;
		
		}
		else 
			return false;
		
	};
}
