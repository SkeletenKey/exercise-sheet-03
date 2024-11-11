package de.unistuttgart.iste.sqa.pse.sheet03.homework;

/**
 * Describe the class TwoHamstersHamsterGame here.
 *
 * @author (Your name)
 *
 */
public class TwoHamstersHamsterGame extends InternalTwoHamstersHamsterGame {

	@Override
	void hamsterRun() {
		// TODO implement Exercise 2 (b) here
		controllerPaule.pickGrainsAndMove();
		controllerPaule.pickAllGrains();
		controllerPaule.turnRightTimes(1);
		controllerPaule.moveTimes(1);
		controllerPaule.pickAllGrains();
		controllerPaule.moveTimes(1);
		controllerPaule.turnRightTimes(1);
		controllerPaule.pickGrainsAndMove();
		controllerPaule.turnLeftTimes(1);
		controllerPaule.moveTimes(1);
		controllerPaule.pickAllGrains();
		controllerPaule.turnLeftTimes(1);
		controllerPaule.moveTimes(3);
		controllerPaule.putAllGrains();

		controllerTiffany.moveTimes(1);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnLeftTimes(1);
		controllerTiffany.moveTimes(2);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnRightTimes(1);
		controllerTiffany.moveTimes(2);
		controllerTiffany.pickAllGrains();
		controllerTiffany.turnRightTimes(1);
		controllerTiffany.moveTimes(3);
		controllerTiffany.putAllGrains();

		controllerPaule.moveTimes(1);
		controllerTiffany.moveTimes(1);
		controllerPaule.turnLeftTimes(10);
		controllerTiffany.turnLeftTimes(10);
	}
}
