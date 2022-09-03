/**
 COPYRIGHT Luqmaan Irshad 2019


 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
 
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class ConsecutiveSeries {

	public static void main(String[] args) {
		
		int x = 10000; int total = 0;
		
		for (int i = 0; i < x; i++) {
			if (total > 0)
				System.out.println((i-1)+" to "+total);
			total = i;
			for (int j = i+1; j < x; j++) {
				if (total + j >= x) {
					if (total + j > x) {
						total = 0;
					}
					else
						total = j;
					break;
				}
				total+=j;
			}
		}
	}
}
