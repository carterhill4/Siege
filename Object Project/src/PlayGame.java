
public class PlayGame
	{

		public static void main(String[] args)
			{
						Operators.addOps();
						Meat.beginning();
				while(Operators.listOfOperators.get(Meat.playerIndexP1).getHealth() >= 0 && Operators.listOfOperators.get(Meat.playerIndexP2).getHealth() >= 0)
					{
						Meat.Tachanka();
						Meat.Dokkaebi();
					}
					
			}

	}
