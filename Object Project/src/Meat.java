import java.util.Scanner;
import java.util.ArrayList;
public class Meat
	{		

		static Scanner tanner1 = new Scanner(System.in);
		static Scanner tanner2 = new Scanner(System.in);
		
		static int playerIndexP1 = 0;
		static int playerIndexP2 = 1;
		
		public static void beginning()
		{
			System.out.println("Player 1 is Warden (125 hp and less damage) and Player 2 is Dokkaebi (110 hp and more damage).");
			System.out.println();
//			for(int i = 0; i < Operators.listOfOperators.size(); i++)
//				{
//					System.out.print(Operators.listOfOperators.get(i).getOperator() + ", ");
//					System.out.print(Operators.listOfOperators.get(i).getTeam() + ", ");
//					System.out.println(Operators.listOfOperators.get(i).getHealth());
//					
//
//				}
			
//			if(characterChoice.equals("Warden"))
//				{
//					playerIndexP1 = 0;
//					System.out.println("You are on defense. FIRE!!!");
//				}
//			
//			if(characterChoice.equals("Dokkaebi"))
//				{
//					playerIndex = 1;
//					System.out.println("You are on offense. FIRE!!!");
//				}
		
		}
		public static void Warden()
		{
		
					System.out.println("Press enter to shoot Dokkaebi.");
		
					String shoot1 = tanner1.nextLine();
				 int shot = (int) (Math.random() * 6) + 1;
				 
				 if(shot == 1 || shot == 2)
					 {
						 Operators.listOfOperators.get(playerIndexP1).setHealth(Operators.listOfOperators.get(playerIndexP1).getHealth() - 30);
						 System.out.println("Leg shot! 30 damage.");
						 if(Operators.listOfOperators.get(playerIndexP1).getHealth() > 0)
							 {
						 System.out.println("Dokkaebi still has " + Operators.listOfOperators.get(playerIndexP1).getHealth() + " health left.");
							 }
						 if(Operators.listOfOperators.get(playerIndexP1).getHealth() <= 0)
							 {
								 System.out.println("Dokkaebi is dead.");
								 System.exit(shot);
							 }
					 }
				 if(shot == 3 || shot == 4)
					 {
						 Operators.listOfOperators.get(playerIndexP1).setHealth(Operators.listOfOperators.get(playerIndexP1).getHealth() - 55);
						 System.out.println("Chest shot! 55 damage.");
						 if(Operators.listOfOperators.get(playerIndexP1).getHealth() > 0)
							 {
								 System.out.println("Dokkaebi still has " + Operators.listOfOperators.get(playerIndexP1).getHealth() + " health left.");
							 }
						 if(Operators.listOfOperators.get(playerIndexP1).getHealth() <= 0)
							 {
								 System.out.println("Dokkaebi is dead.");
								 System.exit(shot);
							 }
					 }
				 		if(shot == 5 && shot == 6)
				 			{
				 				Operators.listOfOperators.get(playerIndexP1).setHealth(Operators.listOfOperators.get(playerIndexP1).getHealth() - 125);
				 				System.out.println("Head shot!");
				 				System.out.println("Dokkaebi is dead");
				 				System.out.println("Kill confirmed.");
				 				System.exit(shot);
				 			}
				
				 
				 	if(Operators.listOfOperators.get(playerIndexP1).getHealth() <= 0 && shot != 6)
				 		{
				 			System.out.println("Kill confirmed.");
				 			 System.exit(shot);
				 		}
					}			
	
		public static void Dokkaebi()
			{
			
						System.out.println("Press enter to shoot Warden.");
					
						String shoot2 = tanner2.nextLine();
					 int shot = (int) (Math.random() * 6) + 1;
					 
					 if(shot == 1 || shot == 2 || shot == 3)
						 {
							 Operators.listOfOperators.get(playerIndexP2).setHealth(Operators.listOfOperators.get(playerIndexP2).getHealth() - 40);
							 System.out.println("Leg shot! 30 damage.");
							 if(Operators.listOfOperators.get(playerIndexP2).getHealth() > 0)
								 {
							 System.out.println("Warden still has " + Operators.listOfOperators.get(playerIndexP2).getHealth() + " health left.");
								 }
							 if(Operators.listOfOperators.get(playerIndexP2).getHealth() <= 0)
								 {
									 System.out.println("Warden is dead.");
									 System.exit(shot);
								 }
						 }
					 if(shot == 4 || shot == 5)
						 {
							 Operators.listOfOperators.get(playerIndexP2).setHealth(Operators.listOfOperators.get(playerIndexP2).getHealth() - 65);
							 System.out.println("Chest shot! 55 damage.");
							 if(Operators.listOfOperators.get(playerIndexP2).getHealth() > 0)
								 {
							 System.out.println("Warden still has " + Operators.listOfOperators.get(playerIndexP2).getHealth() + " health left.");
								 }
							 if(Operators.listOfOperators.get(playerIndexP2).getHealth() <= 0)
								 {
									 System.out.println("Warden is dead.");
									 System.exit(shot);
								 }
						 }
					 if(shot == 6)
						 {
							 Operators.listOfOperators.get(playerIndexP2).setHealth(Operators.listOfOperators.get(playerIndexP2).getHealth() - 125);
							 System.out.println("Head shot!");
							 System.out.println("Warden is dead.");
							 System.out.println("Kill confirmed.");
							 System.exit(shot);
						 }
					
					 
					 	if(Operators.listOfOperators.get(playerIndexP2).getHealth() <= 0 && shot != 6)
					 		{
					 			System.out.println("Kill confirmed.");
					 			 System.exit(shot);
					 		}	
			}
	}