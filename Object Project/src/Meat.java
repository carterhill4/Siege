import java.util.Scanner;
import java.util.ArrayList;
public class Meat
	{		

		static Scanner tanner = new Scanner(System.in);
		
		static int playerIndex = 0;
		
		public static void beginning()
		{
			System.out.println("Who do you want to play as?");
			
			for(int i = 0; i < Operators.listOfOperators.size(); i++)
				{
					System.out.print(Operators.listOfOperators.get(i).getOperator() + ", ");
					System.out.print(Operators.listOfOperators.get(i).getTeam() + ", ");
					System.out.println(Operators.listOfOperators.get(i).getHealth());

				}
			
			String characterChoice = tanner.nextLine();
			
			if(characterChoice.equals("Warden"))
				{
					playerIndex = 0;
					System.out.println("You are on defense. FIRE!!!");
				}
			
			if(characterChoice.equals("Dokkaebi"))
				{
					playerIndex = 1;
					System.out.println("You are on offense. FIRE!!!");
				}
		
		}
			public static void go()
				{
					System.out.println("Press enter to shoot.");
					
				
				
				while(Operators.listOfOperators.get(playerIndex).getHealth() >= 0)
					{
					String shoot = tanner.nextLine();
				 int shot = (int) (Math.random() * 6) + 1;
				 
				 if(shot == 1 || shot == 2 || shot == 3)
					 {
						 Operators.listOfOperators.get(playerIndex).setHealth(Operators.listOfOperators.get(playerIndex).getHealth() - 30);
						 System.out.println("Leg shot! 30 damage.");
					 }
				 if(shot == 4 || shot == 5)
					 {
						 Operators.listOfOperators.get(playerIndex).setHealth(Operators.listOfOperators.get(playerIndex).getHealth() - 55);
						 System.out.println("Chest shot! 55 damage.");
					 }
				 if(shot == 6)
					 {
						 Operators.listOfOperators.get(playerIndex).setHealth(Operators.listOfOperators.get(playerIndex).getHealth() - 125);
						 System.out.println("Head shot!");
					 }
				
				 	System.out.println(Operators.listOfOperators.get(playerIndex).getHealth());
				 	if(Operators.listOfOperators.get(playerIndex).getHealth() <= 0)
				 		{
				 			System.out.println("Kill confirmed");
				 		}
					}
				}
						
			
	}