package unit;

import java.util.ArrayList;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import function.GenerateRandomPosition;

public abstract class TeamUnit {
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	
	public String type="";
	public int locationX=GenerateRandomPosition.generate(), locationY=GenerateRandomPosition.generate();
	public int health=0;
	
	@Override
	public String toString() { 
		StringBuffer display = new StringBuffer();
		display.append("location: ("+locationX+","+locationY+ ")\n");
		display.append("health: "+health + "\n");
		return display.toString();
	}
	
	
//	
//	private ArrayList<TeamUnit> detectList = new ArrayList<TeamUnit>();
//	
//	public TeamUnit(AttackBehavior attack, MovementBehavior movement, WeaponBehavior weapon, String type, int locationX,
//			int locationY, int health) {
//		super();
//		this.attack = attack;
//		this.movement = movement;
//		this.weapon = weapon;
//		this.type = type;
//		this.locationX = locationX;
//		this.locationY = locationY;
//		this.health = health;
//	}
//	
//	//for Owl
//	public TeamUnit(AttackBehavior attack, MovementBehavior movement, WeaponBehavior weapon,
//				String type, int locationX, int locationY, ArrayList<TeamUnit> unit) {
//			super();
//			this.attack = attack;
//			this.movement = movement;
//			this.weapon = weapon;
//			this.type = type;
//			this.locationX = locationX;
//			this.locationY = locationY;
//			this.detectList = unit;
//		}
//	
	
	
}
