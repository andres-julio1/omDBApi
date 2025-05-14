package movie;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckMovie {
    public CheckMovie() {
    }

   public Movie getMovie(String name){
        URI uri = URI.create("http://www.omdbapi.com/?t="+ name +"&apikey=f46e6e69");
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return  new Gson().fromJson(response.body(), Movie.class);

    }
}
