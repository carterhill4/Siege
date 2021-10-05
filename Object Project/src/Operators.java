import java.util.ArrayList;

public class Operators
	{
		static ArrayList <Operator> listOfOperators = new ArrayList<Operator>();
		
		public static void addOps()
		{
			
			listOfOperators.add(new Operator("Warden", "Defender", 125));
			
			listOfOperators.add(new Operator("Dokkaebi", "Attacker", 110));
			
		}
	}
