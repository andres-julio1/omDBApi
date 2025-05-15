package movie;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void  createFile(Movie movie) {
        System.out.println("Create file");

        Gson gso = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter write = null;
        try {
            write = new FileWriter("movie.json");
            write.write(gso.toJson(movie));
            write.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
