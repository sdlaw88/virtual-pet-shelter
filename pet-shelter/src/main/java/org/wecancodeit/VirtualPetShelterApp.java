package org.wecancodeit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		VirtualPetShelter virtualPetShelterObject = new VirtualPetShelter();

	System.out.println("Welcome to  "+ virtualPetShelterObject.getShelterName());
	System.out.println("We currently have "+  virtualPetShelterObject.getAnimalCount() + " animals in the "+ virtualPetShelterObject.getShelterName());
	System.out.println("Our residents include "+ virtualPetShelterObject.getAnimalName());
	System.out.println("You will be responsible for feeding, exercising, and playing with the pups in the shelter");
	Map<String, String>puppies= new HashMap<String,String>();
	
	puppies.put("A13456","Puppito" );
	puppies.put("A13556", "Big Dan");
	puppies.put("A13656", "Drouppy");
	puppies.put("A13756", "Barkley");
	puppies.put("A13856", "Ears");
	
	Set<String>dogCollar=puppies.keySet();
	
	System.out.println("Each dog has a unique identifier on his collar to keep track of their habits");
	System.out.println("They are "+ dogCollar);
	
	System.out.println("here is the status of each dog "+ virtualPetShelterObject.dogTypes);
	System.out.println(virtualPetShelterObject.getThirst());
	}
		
 

}
