package org.example.learn;

import java.util.ArrayList;

public class Player {
	
	private String handleName;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	private ArrayList<InventoryItem> inventoryItems;
	
	public Player()
	{
		handleName = "Unkown Player";
		this.lives = 3;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
		inventoryItems = new ArrayList<InventoryItem>();
		
	}
	
	public Player(String handleName, int level) {
		this();
		setHandleName(handleName);
		setLevel(level);
	}
	
	private void setDefaultWeapon(){
		this.weapon = new Weapon("Sword", 10, 20);
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	
	public Player(String handleName) {
		super();
		setHandleName(handleName);
	}
	
	

	@Override
	public String toString() {
		return "Player [handleName=" + handleName + ", lives=" + lives
				+ ", level=" + level + ", score=" + score + "]";
	}

	public String getHandleName() {
		return handleName;
	}

	public void setHandleName(String handleName) {
		this.handleName = handleName;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public ArrayList<InventoryItem> getInventoryItems() {
		return inventoryItems;
	}

//	public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
//		this.inventoryItems = inventoryItems;
//	}
	
	public void addInventoryItem(InventoryItem inventoryItem){
		inventoryItems.add(inventoryItem);
	}
	
	public boolean dropInventoryItem(InventoryItem inventoryItem){
		if(this.inventoryItems.contains(inventoryItem)){
			inventoryItems.remove(inventoryItem);
			return true;
		}
		
		return false;
	}
}
