package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * A control unit to control a hamster.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * the controlled hamsters act according to those patterns.
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
	 * The Hamster executes a left half circle move, where he ends up standing on the tile to the left from his start
	 * tile. Also he's facing the opposide dirction.
	 */
	void leftHalfCircle() {
		//TODO 
		controlledHamster.write("Executing half circle:");
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
	 * Hamster turns left 'turns' times, while turns has to be a number.
	 *
	 * @param turns
	 */
	void turnLeftTimes(Integer turns) {
		controlledHamster.write("Turn x times left:");
		for (Integer i = 0; i < turns; i++) {
			controlledHamster.turnLeft();
		}
		controlledHamster.write(String.format("I turned %d times!", turns));
	}

	/**
	 * The Hamster picks us all grains on hit tile. Then he moves one tile.
	 *
	 * Ensures that all grains on the starting tile got picked up.
	 */
	void turnRightTimes(int turns){
		controlledHamster.write("Turn x times right:");
		for(int i = 0; i < turns; i++){
			controlledHamster.turnLeft();
			controlledHamster.turnLeft();
			controlledHamster.turnLeft();
		}
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

	//___________________________________________________

	/**
	 * Creates a new event with the specified details.
	 *
	 * @param userID     The ID of the user creating the event. Cannot be null.
	 * @param start_time The start time of the event. Cannot be null.
	 * @param start_date The start date of the event. Cannot be null.
	 * @param end_time   The end time of the event. Cannot be null.
	 * @param end_date   The end date of the event. Cannot be null.
	 * @param notes      Additional notes or description for the event. Can be null.
	 *
	 * @return An integer indicating the result of the event creation.
	 */
	Integer createEvent(String userID, Time start_time, Date start_date, Time end_time, Date end_date, String notes){
		// Creating event

		return eventId;
	}

	/**
	 * Modifies the details of an already existing event.
	 *
	 * @param userID     The ID of the user creating the event. Cannot be null.
	 * @param start_time The start time of the new event. Cannot be null.
	 * @param start_date The start date of the new event. Cannot be null.
	 * @param end_time   The end time of the new event. Cannot be null.
	 * @param end_date   The end date of the new event. Cannot be null.
	 * @param notes      Additional notes or description for the event. Can be null.
	 *
	 * @return A string confirming the change.
	 */
	String modifyEvent(Sring userID, Time start_time, Date start_date, Time end_time, Date end_date, String notes){
		// Creating event

		return "Modified event successfully!"
	}


	/**
	 * Deletes an already existing event.
	 *
	 * @param userID The ID of the user deleting the event. Cannot be null.
	 *
	 * @return A string confirming the deletion.
	 */
	String deleteEvent(String userID){
		// Deleting event

		return "Deleted event successfully!"
	}

	/**
	 * Shows an event created by a user.
	 *
	 * @param eventID	The ID of the event to be checked. Cannot be null.
	 * @param userID	The ID of the acting user. Cannot be null.
	 *
	 * @return A string with the event content. If not found return -1.
	 */
	String[] getEventByID(Integer eventID, String userID){
		// Getting event

		return event_data;
	}

	/**
	 * Shows all events.
	 *
	 * @param userID The ID of the acting user. Cannot be null.
	 *
	 * @return 2D String array with all events of the user with the userID,
	 */
	String[][] getAllEvents(String userID) {
		// Getting events

		return events;
	}

	/**
	 *
	 *
	 * @param userID	The ID of the acting user. Cannot be null.
	 * @param eventID	The ID of the event to be checked. Cannot be null.
	 *
	 * @return A string showing recent changed data.
	 */
	String getSingleEventChangeLog(String userID, int eventID) {
		// Getting change Log

		return eventChangeLog;
	}

	createEvent:
	PRE: userID has to be valid
	POST: created event and returned id if successful otherwise return -1

	modifyEvent:
	PRE: userID has to be valid, eventide has to be valid
	POST: modified Event as specified when calling the method

	deleteEvent:
	PRE: eventID must be valid as well as the userID
	POST: deleting event with the passed eventID

	getEventByID:
	PRE: eventID must be valid as well as the userID
	POST: returns the event_data for the eventID

	getAllEvents:
	PRE: userID must be valid
	POST: returns all the events of the user with userID

	getSingleEventChangeLog:
	PRE: eventID must be valid as well as the userID
	POST: returns the change log of the event with the eventID
}
