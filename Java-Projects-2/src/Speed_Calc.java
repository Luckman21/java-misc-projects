import java.util.List;

/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class Speed_Calc {

//CONSTRUCT OBJECTS
	
	//Private Instance Variables
	
	private double num; //current number
	private double pnum; //previous number
	private double sI; //current instantaneous speed
	private double sA; //current average speed
	private List<Double> lsI; //list of all instantaneous speeds
	
	
	public Speed_Calc() {
		this.num = 0;
		this.pnum = 0;
		this.sI = 0;
		this.sA = 0;
	}
	
	public Speed_Calc(double abc, List<Double> tot) {
		this.num = abc;
		this.pnum = 0;
		this.sI = iSpeed(num,pnum);
		this.lsI.add(this.sI);
		this.sA = aSpeed(tot);
	}
	
	public Speed_Calc(double abc, double xyz, List<Double> tot) {
		this.num = xyz;
		this.pnum = abc;
		this.sI = iSpeed(num,pnum);
		this.lsI.add(this.sI);
		this.sA = aSpeed(tot);
	}
	
//CALCULATIONS
	
	/**
	 * Calculates the instantaneous speed by finding the distance covered in that second
	 * @param a New distance
	 * @param b previous distance
	 * @return Instantaneous speed (double)
	 */
	public double iSpeed(double a, double b) {
		return (a - b);
	}
	
	/**
	 * Calculates the average speed by taking the mean of the instantaneous speeds
	 * @return Average speed (double)
	 */
	public double aSpeed(List<Double> a) {
		double total = 0;
		
		for(int i = 0; i < a.size(); i++) {
			total += a.get(i);
		}
		return (total/a.size());
	}
	
//RETURN VALUES
	
	/**
	 * Returns the value stored in private instance variable sI (Instantaneous Speed)
	 * @return Instantaneous speed (sI [double])
	 */
	public double inSpeed() {
		return this.sI;
	}
	
	/**
	 * Returns the value stored in private instance variable sA (Average Speed)
	 * @return Average speed (sA [double])
	 */
	public double avSpeed() {
		return this.sA;
	}
	
	public List<Double> lists() {
		return this.lsI;
	}
	
}
