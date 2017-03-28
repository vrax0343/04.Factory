package factory.fm;

import behavior.attack.CantAttack;
import behavior.attack.CastFireball;
import behavior.attack.Punch;
import behavior.attack.SwingSword;
import behavior.movement.Fly;
import behavior.movement.Teleport;
import behavior.movement.Walk;
import behavior.weapon.Fist;
import behavior.weapon.NoWeapon;
import behavior.weapon.Staff;
import behavior.weapon.Sword;
import function.GenerateRandomPosition;
import unit.TeamUnit;

public abstract class TeamFactoryStore {
	
	static final int CITIZEN = 0;
	static final int KNIGHT = 1;
	static final int MAGE = 2;
	
	abstract TeamUnit createTeamUnit(String type);
	
	public TeamUnit makeUnit(String type) {
		TeamUnit tempUnit = createTeamUnit(type);
		System.out.println(tempUnit.toString());
		
		return tempUnit; 
	}
}
