package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * A control unit to control a hamster.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * the controlled hamsters act according to those patterns.
 *
 * @author (Tim Zimmermann)
 *
 */
public class HamsterController {

	private Hamster controlledHamster;

	/**
	 * Create a new controller for the controlling the given hamster.
	 *
	 * @param hamster The hamster that will be controlled, must not be null.
	 */
	public HamsterController(Hamster hamster) {
		this.controlledHamster = hamster;
	}

	/**
	 * Pick all grains on the controlled hamster's tile.
	 *
	 * Ensures that the tile is empty.
	 */
	void pickAllGrains() {
		controlledHamster.write("Executing pickAllGrains:");
		Integer counter = 0;
		while (controlledHamster.grainAvailable()) {
			controlledHamster.pickGrain();
			counter++;
		}
		controlledHamster.write(String.format("%d available grains on my Tile. I picked all of them!", counter));
	}

	/**
	 * Put all the controlled hamster's grain on the current tile.
	 *
	 * Ensures that the controlled hamster's mouth is empty.
	 */
	void putAllGrains() {
		controlledHamster.write("Executing putAllGrains:");
		Integer counter = 0;
		while (!controlledHamster.mouthEmpty()) {
			controlledHamster.putGrain();
			counter++;
		}
		controlledHamster.write(String.format("I had %d grains in my mouth. I put all of them on my Tile!", counter));
	}

	/**
	 * The Hamster executes a move, where he ends up standing on the tile to the left from his start tile. Also he's
	 * facing the opposide dirction.
	 */
	void halfCircle() {
		//TODO 
		controlledHamster.write("Executing wierd half circle:");
		controlledHamster.turnLeft();
		controlledHamster.move();
		controlledHamster.turnLeft();
		controlledHamster.write("I ran a half circle!");
	}

	/**
	 * The Hamster picks us all grains on hit tile. Then he moves one tile.
	 *
	 * Ensures that all grains on the starting tile got picked up.
	 */
	void pickGrainsAndMove() {
		controlledHamster.write("Pick up all grains and move:");
		while (controlledHamster.frontIsClear()) {
			pickAllGrains();
			controlledHamster.move();
		}
		controlledHamster.write("I picked all grains, on the tile behind me!");
	}

	/**
	 * Hamster turns 'turns' times, while turns has to be a number.
	 *
	 * @param turns
	 */
	void turnTimes(Integer turns) {
		controlledHamster.write("Turn x times:");
		for (Integer i = 0; i < turns; i++) {
			controlledHamster.turnLeft();
		}
		controlledHamster.write(String.format("I turned %d times!", turns));
	}

	/**
	 * Hamster moves 'steps' times, while steps has to be a number.
	 *
	 * @param steps
	 */
	void moveTimes(Integer steps) {
		controlledHamster.write("Move x times:");
		Integer counter = 0;
		for (; counter < steps && controlledHamster.frontIsClear(); counter++) {
			controlledHamster.move();
		}
		controlledHamster.write(String.format("I moved %d out of %d steps!", counter, steps));
	}
}
