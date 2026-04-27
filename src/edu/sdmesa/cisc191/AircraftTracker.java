/**
 * Lead Author(s):
 * 
 * @author Nicholas Vilbrandt
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 *         Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 *         Version/date: 2026-04-26
 */

package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of AircraftTracker is ...
 *
 * AircraftTracker is-a ...
 * AircraftTracker is ...
 */
public class AircraftTracker
{

	private ADSBInformationGetter getter;

	/**
	 * Purpose:
	 */
	public AircraftTracker()
	{
		this.getter = new ADSBInformationGetter();
	}

	public static void main(String[] args)
	{
		AircraftTracker tracker = new AircraftTracker();
		tracker.getter.callAPI();
	}

}
