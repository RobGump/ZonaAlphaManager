package ZoneAlphaPackage;
import java.util.HashMap;
import ZoneAlphaPackage.Catagories.Relations;

//store faction information - name, bonuses, and relations between this faction and others
public class Faction{
	private String factionName;
	private String factionBonus;
	private HashMap<String, Relations> Relations;
	
	public Faction(String newName, String newBonus, HashMap<String, Relations> newRelations){
		this.factionName = newName;
		this.factionBonus = newBonus;
		this.Relations = newRelations;
	}
	
	//Return faction name
	public String getFactionName()
	{
		return factionName;
	}
	
	public String getFactionBonus() {
		return factionBonus;
	}
	
	public HashMap<String, Relations> getFactionRelation()
	{
		return this.Relations;
	}
}
