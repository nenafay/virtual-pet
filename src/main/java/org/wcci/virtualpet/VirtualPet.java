package org.wcci.virtualpet;

public class VirtualPet {
	int fullness = 7;
	int turgorPressure = 10;
	int entertainment = 10;
	int size = 1;
	int rootConstriction = 1;
	
	public int getFullness() {
		return fullness;
	}

	public void eatPerson() {
		fullness = fullness + 2;
		
	}
	public boolean isHungry() {
		return fullness < 5;
	}

	public boolean feedsSelf() {
		return fullness <= 1;
		
	}
	public int getTurgorPressure() {
		return turgorPressure;
	}

	public void beWatered() {
		turgorPressure = turgorPressure + 3;
	}

	public boolean isWilted() {
		return turgorPressure < 5 && turgorPressure > 2;
	}

	public boolean isDry() {
		return turgorPressure <= 2;
		
	}
	public int getEntertained() {
		return entertainment;
	}
	public int getRootConstriction() {
		return rootConstriction;
	}

	public void beSungTo() {
		entertainment = entertainment +2;
	}
	public boolean singsAndDances() {
		return entertainment > 10;
	}

	public boolean complains() {
		return entertainment < 5;
	}

	public int getsize() {
		return size;
	}

	public void grow() {
		size = size + 1;
	
	}

	public void tick() {
		fullness--;
		turgorPressure--;
		entertainment--;
	}
	public void roottick() {
		rootConstriction++;
		
		
	}
	public boolean hasPerished( ) {
		return ((turgorPressure == 0)||(rootConstriction < 3));
		
		
	}
	public boolean murdersUser() {
		return (entertainment==0);
			
	}
	public boolean isAnnoyed() {
		return entertainment==1;
	}

	public boolean isAlive() {
		// TODO Auto-generated method stub
		return turgorPressure!= 0;
	}	
}

