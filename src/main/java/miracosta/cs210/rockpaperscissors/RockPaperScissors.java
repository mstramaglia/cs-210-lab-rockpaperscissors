package miracosta.cs210.rockpaperscissors;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.*;

public class RockPaperScissors {

    public String getPlayerMove() {
        return playerMove;
    }

    public String getComputerMove() {
        return computerMove;
    }

    public String getWinner() {
        return winner;
    }

    private String playerMove;
    private String computerMove;
    private String winner;

    public static void play(String playerMove) {
        String requestURL = "https://games.mstramaglia.repl.co/quickplay/rockpaperscissors/" + playerMove;
        HttpResponse<String> response = invokeGET(requestURL);
        System.out.println(response.body());

        JSONObject obj = new JSONObject(response.body());
        System.out.println(obj.get("winner"));
    }

    /**
     * Takes the URL of a simple GET web service endpoint,
     * calls the web service, and then returns an
     * HttpResponse<String> object from the web service response.
     *
     * @param  requestURL  the web service URL to call
     * @return      the web service response
     */
    public static HttpResponse<String> invokeGET(String requestURL) {

        // Build HttpClient for making web service calls
        HttpClient client = HttpClient.newBuilder()
                // configure the HttpClient so that it will follow any web redirects
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build();

        // Create our web service request object
        HttpRequest request = HttpRequest.newBuilder()
                // set the URL using the from the method input parameter
                .uri(URI.create(requestURL))
                // configure the request to call the GET method of the web service
                .GET()
                .build();

        HttpResponse<String> response = null;

        try {
            // Attempt to call the web service
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // If successful, the web service should return a "200 OK" status code
            if(response.statusCode() == 200) {
                //System.out.println("Hey it worked!");
            }
        } catch(Exception e) {
            System.out.println("Encountered a problem calling web service");
            System.out.println(e.toString());
        }

        return response;
    }

}
