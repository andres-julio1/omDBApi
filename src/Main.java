import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import movie.CheckMovie;
import movie.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner data = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Escribir el nombre de la peliucula: ");
         var search = data.nextLine();
        System.out.println("-------------------------------------");

        Gson gso = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        CheckMovie checkMovie = new CheckMovie();
        Movie movie = checkMovie.getMovie(search);
        System.out.println(movie.toString());


        FileWriter write = new FileWriter("movie.json");
        write.write(gso.toJson(movie));
        write.close();
    }
}