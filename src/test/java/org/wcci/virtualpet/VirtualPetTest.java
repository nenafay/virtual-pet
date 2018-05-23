package org.wcci.virtualpet;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.wcci.virtualpet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void canCreatePet() {
		VirtualPet audrey = new VirtualPet();
		
	}
	@Test 
	public void hasFullness() {
		VirtualPet audrey = new VirtualPet();
		int fullness = audrey.getFullness();
	}
	@Test
	public void canBeFed() {
		VirtualPet audrey = new VirtualPet();
		int fullnessBefore = audrey.getFullness();//stores current fullness
		audrey.eatPerson();
		int fullnessAfter = audrey.getFullness ();
		assertTrue (fullnessBefore < fullnessAfter);
	}
	@Test
	public void canBeHungry() {
		VirtualPet	audrey = new VirtualPet();
		 boolean isHungry = audrey.isHungry();
	}
	@Test
	public void canFeedSelf() {
		VirtualPet audrey = new VirtualPet();
		boolean feedsSelf = audrey.feedsSelf();
	}
	@Test
	public void hasTurgorPressure () {
		VirtualPet audrey = new VirtualPet();
		int turgorPressure = audrey.getTurgorPressure();
	}
	@Test
	public void canBeWatered() {
		VirtualPet audrey = new VirtualPet();
		int turgorPressureBefore = audrey.getTurgorPressure();
		audrey.beWatered();
		int turgorPressureAfter = audrey.getTurgorPressure();
		assertTrue (turgorPressureBefore < turgorPressureAfter);
	}
	@Test
	public void canWilt() {
		VirtualPet	audrey = new VirtualPet();
		 boolean isWilted = audrey.isWilted();
	}
	@Test
	public void canDryOut() {
		VirtualPet	audrey = new VirtualPet();
		 boolean isDry = audrey.isDry();
	}
	@Test
	public void feelsEntertained() {
		VirtualPet audrey = new VirtualPet();
		int entertainment = audrey.getEntertained();
	}
	@Test
	public void canBeEntertained() {
		VirtualPet audrey = new VirtualPet();
		int entertainmentBefore = audrey.getEntertained();
		audrey.beSungTo();
		int entertainmentAfter = audrey.getEntertained();
		assertTrue (entertainmentBefore < entertainmentAfter);
	}
	@Test
	public void singsToYou() {
		VirtualPet audrey = new VirtualPet();
		boolean singsAndDances = audrey.singsAndDances();
	}
	@Test
	public void complainsWhenBored() {
		VirtualPet audrey = new VirtualPet();
		boolean complains = audrey.complains();
	
	}
	@Test
	public void hasSize() {
		VirtualPet audrey = new VirtualPet();
		int size = audrey.getsize();
		
	}
	@Test
	public void canGrow() {
		VirtualPet audrey = new VirtualPet();
		int sizeBefore = audrey.getsize();
		audrey.grow();
		int sizeAfter = audrey.getsize();
		assertTrue (sizeBefore < sizeAfter);

	}
	@Test
	public void getsHungryOverTime() {
		VirtualPet audrey = new VirtualPet();
		int fullnessBefore = audrey.getFullness();
		audrey.tick();
		audrey.tick();
		audrey.tick();
		int fullnessAfter =  audrey.getFullness();
		assertTrue (fullnessBefore > fullnessAfter);
	}
	@Test
	public void losesTurgorPressureOverTime() {
		VirtualPet audrey = new VirtualPet();
		int turgorPressureBefore = audrey.getTurgorPressure();
		audrey.tick();
		audrey.tick();
		audrey.tick();
		int turgorPressureAfter = audrey.getTurgorPressure();
		assertTrue (turgorPressureBefore > turgorPressureAfter);
		
	}
	@Test
	public void becomesBoredOverTime() {
		VirtualPet audrey = new VirtualPet();
		int entertainmentBefore = audrey.getEntertained();
		audrey.tick();
		audrey.tick();
		audrey.tick();
		int entertainmentAfter = audrey.getEntertained();
		assertTrue (entertainmentBefore > entertainmentAfter);
	}
	@Test
	public void canBeAlive() {
		VirtualPet audrey = new VirtualPet();
		boolean alive = audrey.isAlive();
	}
}