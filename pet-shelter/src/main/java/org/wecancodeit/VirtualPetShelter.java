package org.wecancodeit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;






public class VirtualPetShelter<thrist> {
	
	private String shelterName="The Bad Luck Pup";
	private String animalName;
	private int hunger;
	private int thirst=0;
	private int bordom;
	private ArrayList<String> animalName2;
	private String animalType;
	private int animalCount;
	ArrayList<String> dogNames = new ArrayList<String>();
	ArrayList<String> dogTypes = new ArrayList<String>();
	
	public void setShelterName(String string) {
	
	shelterName = string;
}

public String getShelterName() {
	
	return shelterName;

}

public void setCount(int animalCount) {
	
	
	 
}

public int getAnimalCount() {
	
	dogNames.add("Puppito");
	dogNames.add("Big Dan");
	dogNames.add("Drouppy");
	dogNames.add("Barkley");
	dogNames.add("Ears");
	
        animalCount = dogNames.size();
	 
	
	return animalCount;
}

public void setName(String petsName, String petsDescription) {
	VirtualPets virtualPetsObject = new VirtualPets( petsName, petsDescription);
	
	this.animalName=petsName;
	this.animalType=petsDescription;
	
	
}
		

public ArrayList<String> getAnimalName() {
	
	dogTypes.add("Yorkie");
	dogTypes.add("GreyHound");
	dogTypes.add("Begal");
	dogTypes.add("Bull Dog");
	dogTypes.add("Unknown");
	
	return animalName2=dogTypes;
	
}
	



public   int VirtualPetShelter (int hunger){

	 VirtualPets virtualpetsObject = new VirtualPets(hunger);
	Map<String, Integer >dogTypes= new HashMap<String, Integer>();
	
	dogTypes.put("Yorkie", virtualpetsObject.getHunger());
	dogTypes.put("GreyHound", hunger);
	dogTypes.put("Begal", hunger);
	dogTypes.put("Bull Dog", hunger);
	dogTypes.put("Unknown", hunger);

	return hunger;

}

public int getThirst() {
	return thirst;
}

public void setThirst(int thirst) {
	this.thirst = thirst;
	this.thirst = thirst++;
	
}

public int moodOfShelter () {
	return 0;
} 
	
}

	
	


 


