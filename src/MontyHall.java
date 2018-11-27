import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Ethan Brilliant PD 5
 * MontyHall Assignment
 *
 */
public class MontyHall {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int doorRandom = rand.nextInt(3) + 1;
		
		System.out.print("Which door would you like to pick:  ");
		int door1 = scan.nextInt();
		scan.nextLine();
		
		int goat = rand.nextInt(3) + 1;
		
		if(door1 > 3 || door1 < 1)
			System.out.print("\nYou have entered an invalid door");
		
		if(door1 <= 3 && door1 >=1) {
			System.out.print("There is a goat behind Door#" + goat);
			System.out.print("\nWould you like to change your pick?");
				String pickChange = scan.nextLine();
				scan.nextLine();
				if(pickChange.equals("yes")) {
						System.out.print("The Car was behind door " + doorRandom);
				if(pickChange.equals("no"))
					System.out.print("The Car was  behind door " + doorRandom);
						if(door1 == doorRandom) {
							System.out.print("\nYou Won!");}
							
					
		
		
		
		
		
		
		
		
		
		
		
		/**System.out.print("The car was behind Door #" + doorRandom);
		System.out.print("\nYou picked Door #" + door1);*/
		
		
	}
		

		}

	}
}
