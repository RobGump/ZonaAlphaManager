package ZoneAlphaPackage;
import java.util.ArrayList;

import ZoneAlphaPackage.Catagories.Ranks;

public class Unit
{
	String unitName;
	String Description;
	Ranks Rank;
	rangedWeapon unitRanged; 
	meleeWeapon unitMelee;
	ArrayList<Grenade> grenadeList;
	ArrayList<Equipment> equipmentList;
	ArrayList<String> skills;
}
