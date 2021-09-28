import java.util.ArrayList;
public class Operator
	{

		private String operator;
		private String team;
		private int health;
		
		public Operator (String o, String t, int h)
			{
				operator = o;
				team = t;
				health = h;
			}

		public String getOperator()
			{
				return operator;
			}

		public void setOperator(String operator)
			{
				this.operator = operator;
			}

		public String getTeam()
			{
				return team;
			}

		public void setTeam(String team)
			{
				this.team = team;
			}

		public int getHealth()
			{
				return health;
			}

		public void setHealth(int health)
			{
				this.health = health;
			}
		
	}
