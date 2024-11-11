/**
 * Creates a new event with the specified details.
 *
 * PRE: userID has to be valid
 * POST: created event and returned id if successful otherwise return -1
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
 * PRE: userID has to be valid, eventide has to be valid
 * POST: modified Event as specified when calling the method
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
 * PRE: eventID must be valid as well as the userID
 * POST: deleting event with the passed eventID
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
 * PRE: eventID must be valid as well as the userID
 * POST: returns the event_data for the eventID
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
 *
 * PRE: userID must be valid
 * POST: returns all the events of the user with userID
 * @param userID The ID of the acting user. Cannot be null.
 *
 * @return 2D String array with all events of the user with the userID,
 */
String[][] getAllEvents(String userID) {
    // Getting events

    return events;
}

/**
 * Shows when/ and from whom recent changes of one event been made.
 *
 * PRE: eventID must be valid as well as the userID
 * POST: returns the change log of the event with the eventID
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
