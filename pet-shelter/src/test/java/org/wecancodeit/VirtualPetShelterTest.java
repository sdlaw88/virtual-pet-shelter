package org.wecancodeit;

import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetShelterTest {
	String result;
	@Test
	public void virtualPetShelterComesBackWithAName() {
		//Arrange 
		VirtualPetShelter petShop = new VirtualPetShelter();
		//Act 
		petShop.setShelterName("Pet Shop");
		result=petShop.getShelterName();
		//Assert
	assertEquals("Pet Shop",result);
	
	}

	@Test
	public void numberOfPetsInThisShelter() {
		
		//Arrange
		VirtualPetShelter animalCount = new VirtualPetShelter();
		//Act
		animalCount.setCount(3);
		int result=animalCount.getAnimalCount();
		//Assert
	assertEquals(3,result);
	}
	
	@Test
	public void nameOfAParticularPet() {
		//Arrange
		VirtualPetShelter animalName= new VirtualPetShelter();
		//Act 
		animalName.setName("Java");
		result=animalName.getAnimalName();
		//Assert
		assertEquals("Java",result);
	
	}
	}

	

	
	

	
	


