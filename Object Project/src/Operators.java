import java.util.ArrayList;

public class Operators
	{
		static ArrayList <Operator> Operators = new ArrayList<Operator>();
		public static void addOps()
		{
			
			Operators.add(new Operator("Warden", "Defender", 125));
			
			Operators.add(new Operator("Sledge", "Attacker", 110));
			
		}
	}
