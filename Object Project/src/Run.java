import java.util.Scanner;
import java.util.ArrayList;
public class Run
	{

		
		static Scanner tanner = new Scanner(System.in);
		
		public static void display()
		{
			for(int i = 0; i < Operators.size(); i++)
				{
					System.out.print(Operators.get(i).getOperator() + ", ");
					System.out.print(Siege.get(i).getTeam() + ", ");
					System.out.println(Siege.get(i).getHealth());

				}
		}
			public static void input()
			{
				String shot = tanner.nextLine();
				
				System.out.println("Who are you shooting?");
				
				if(shot == "a")
					{
						Siege.get(playerIndex)setHealth(Siege.get(i).getHealth() );
					}
			}
	}