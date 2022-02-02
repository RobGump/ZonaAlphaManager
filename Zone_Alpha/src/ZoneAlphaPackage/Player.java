package ZoneAlphaPackage;
import java.lang.String;
import java.util.ArrayList;

public class Player
{
	private String playerName;
	private Faction playerFaction;
	private int zoneScript;
	private String[] relationList;
	private ArrayList<Unit> unitList = new ArrayList<Unit>();
	
	public Player(String newName, int factionNum , int newScript)
	{
		this.playerName = newName;
		this.zoneScript = newScript; 
	}
	
	/*public void addNewStalker(String stalkerName, int rankNum, )
	{
		characterList.add(new Stalker(stalkerName, rankNum, ))
	}*/
	
	//*****************Getters*****************
	
	public String getName() {
		return this.playerName;
	}
	
	public Faction getFaction() {
		return this.playerFaction;
	}
	
	public int getZoneScript() {
		return zoneScript;
	}
	
	public ArrayList<Unit> getStalkers(){
		return unitList;
		
	}
	
	//*****************Setters*****************
	
	public void changeName(String newName) {
		this.playerName = newName;
	}
	
	public void changeFaction(int factionNum) {
		//this.playerFaction = factionNum;
	}
	
	public void changeZoneScript(int newValue) {
		zoneScript = newValue;
	}
	
}
