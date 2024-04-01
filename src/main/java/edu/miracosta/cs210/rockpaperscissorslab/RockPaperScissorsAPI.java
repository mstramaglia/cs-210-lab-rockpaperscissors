package edu.miracosta.cs210.rockpaperscissorslab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class RockPaperScissorsAPI {

    public String playGame(String choice) {

        System.out.println("You chose: " + choice);

        try {

            // Create URL object for the API
            URL url = new URL("https://cs210-rock-paper-scissors.replit.app/play?choice=" + choice);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // See if the connection was successful (status code 200)
            if(connection.getResponseCode() == 200) {
                System.out.println("Yay! We got a valid web service response!");
                //System.out.println(connection.getResponseMessage());
                // Read in all the data from the web service response and build a String of text;
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("Response: " + response);

                // Parse JSON Response
                JSONObject jsonResponse = new JSONObject((response.toString()));

                String playerChoice = jsonResponse.getString("player_choice");

                // Display the results
                System.out.println("Player's Choice: " + playerChoice);
                System.out.println("Computer's Choice: " + jsonResponse.getString("computer_choice"));
                System.out.println("Winner: " + jsonResponse.getString("winner"));
            }

        } catch (Exception e) {
            System.out.println("Uh oh, that didn't work!");
            e.printStackTrace();
        }

        return "Choice" + choice;
    }

}
