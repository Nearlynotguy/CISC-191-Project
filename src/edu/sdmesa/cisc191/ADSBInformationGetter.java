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

import java.io.IOException;
import java.net.URI;
/**
 * Purpose: The responsibility of ADSBInformationGetter is ...
 *
 * ADSBInformationGetter is-a ...
 * ADSBInformationGetter is ...
 */
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ADSBInformationGetter
{

	private URI apiURL;
	private String apiCallInformation;

	/**
	 * Purpose:
	 */
	public ADSBInformationGetter()
	{
		// Hardcoded URL to poll aircraft 50 nm radius from SAN
		this.apiURL = URI.create(
				"https://api.adsb.lol/v2/lat/32.73371/lon/-117.18717/dist/50");
	}

	public void callAPI()
	{
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(apiURL).GET()
				.build();

		HttpResponse<String> response = null;
		try
		{
			response = client.send(request,
					HttpResponse.BodyHandlers.ofString());
		}
		catch (IOException | InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(response.body());
	}

}
