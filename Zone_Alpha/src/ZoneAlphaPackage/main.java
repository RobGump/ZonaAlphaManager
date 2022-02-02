package ZoneAlphaPackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import ZoneAlphaPackage.Catagories.Relations;

public class main 
{

	public static void main(String[] args) 
	{
		ArrayList<Faction> factionList = generateFactions();
		displayAllRelations(factionList);
		menu();
	}
	
	//display menu
	private static void menu()
	{
		//MyFrame frame = new MyFrame();
		
		try (Scanner in = new Scanner(System.in)) {
			
			int input = in.nextInt();
		}
		catch(Exception E)
		{
			System.out.println("Error");
		}
	}
	
	//Displays all faction relations in the form of a table
	private static void displayAllRelations(ArrayList<Faction> factionList)
	{
		int arrSize = factionList.size();
		System.out.print("\nFaction");
		Faction currFaction;
		
		for(int i = 0; i < arrSize; i++)
		{
			System.out.print("\t" + factionList.get(i).getFactionName());
		}
		
		for(int i = 0; i < arrSize; i++)
		{
			currFaction = factionList.get(i);
			System.out.print("\n" + currFaction.getFactionName());
			
			for(int j = 0; j < arrSize; j++)
			{
				System.out.print("\t\t" + currFaction.getFactionRelation().get(factionList.get(j).getFactionName()));
			}
		}
	}
	
	//initialize main game factions
	private static ArrayList<Faction> generateFactions()
	{
		ArrayList<Faction> factionList = new ArrayList<Faction>();
		
		//Bandits instantiation
		HashMap<String, Relations> genTable = new HashMap<String, Relations>();
		genTable.put("Bandits", Relations.ALLIED);
		genTable.put("Cultists", Relations.NEUTRAL);
		genTable.put("Independents", Relations.NEUTRAL);
		genTable.put("Military", Relations.ENEMY);
		genTable.put("Traders", Relations.ENEMY);
		genTable.put("Scientists", Relations.ENEMY);
		factionList.add(new Faction("Bandits", "Free Molotovs", genTable));
		
		//Cultists instantiation
		genTable = new HashMap<String, Relations>();
		genTable.put("Bandits", Relations.NEUTRAL);
		genTable.put("Cultists", Relations.ALLIED);
		genTable.put("Independents", Relations.NEUTRAL);
		genTable.put("Military", Relations.ENEMY);
		genTable.put("Traders", Relations.ALLIED);
		genTable.put("Scientists", Relations.NEUTRAL);
		factionList.add(new Faction("Cultists" , "Cheaper Recruits", genTable));
		
		//Independents instantiation
		genTable = new HashMap<String, Relations>();
		genTable.put("Bandits", Relations.NEUTRAL);
		genTable.put("Cultists", Relations.NEUTRAL);
		genTable.put("Independents", Relations.ALLIED);
		genTable.put("Military", Relations.NEUTRAL);
		genTable.put("Traders", Relations.ALLIED);
		genTable.put("Scientists", Relations.ALLIED);
		factionList.add(new Faction("Independents", "Free Gas Mask", genTable));
		
		//Military instantiation
		genTable = new HashMap<String, Relations>();
		genTable.put("Bandits", Relations.ENEMY);
		genTable.put("Cultists", Relations.ENEMY);
		genTable.put("Independents", Relations.NEUTRAL);
		genTable.put("Military", Relations.ALLIED);
		genTable.put("Traders", Relations.NEUTRAL);
		genTable.put("Scientists", Relations.ALLIED);
		factionList.add(new Faction("Military", "Cheaper Guns", genTable));
		
		//Trader instantiation
		genTable = new HashMap<String, Relations>();
		genTable.put("Bandits", Relations.ENEMY);
		genTable.put("Cultists", Relations.ALLIED);
		genTable.put("Independents", Relations.NEUTRAL);
		genTable.put("Military", Relations.NEUTRAL);
		genTable.put("Traders", Relations.ALLIED);
		genTable.put("Scientists", Relations.ALLIED);
		factionList.add(new Faction("Traders", "Cheaper Equipment", genTable));
		
		//Scientists instantiation
		genTable = new HashMap<String, Relations>();
		genTable.put("Bandits", Relations.NEUTRAL);
		genTable.put("Cultists", Relations.NEUTRAL);
		genTable.put("Independents", Relations.ALLIED);
		genTable.put("Military", Relations.ALLIED);
		genTable.put("Traders", Relations.ALLIED);
		genTable.put("Scientists", Relations.ALLIED);
		factionList.add(new Faction("Scientists", "Free Detector", genTable));
		
		return factionList;
	}
}
