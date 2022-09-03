/*COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class SC_test {
	
	public static void main(String args[]) {
		
		Speed_Calc d1 = new Speed_Calc();
		Speed_Calc d2 = new Speed_Calc(3.2, tot);
		Speed_Calc d3 = new Speed_Calc(7.5,3.2, tot);
		Speed_Calc d4 = new Speed_Calc(1.2,7.5, tot);
		Speed_Calc d5 = new Speed_Calc(1.2,1.2, tot);
		
		Speed_Calc[] dist = {d1,d2,d3,d4};
		
		for (int i = 0; i < dist.length; i++) {
			tot.add(dist[i].inSpeed());
			System.out.println("\nDistance "+(i+1)+": \n\tInstantaneous Speed: "+dist[i].inSpeed()+"\n\tAverage Speed: "+dist[i].avSpeed()+"\nList: "+dist[i].lists());
		}
	}
}