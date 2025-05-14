package movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {
    @SerializedName("Title")
    private String title;

    @SerializedName("Year")
    private String year;

    @SerializedName("Rated")
    private String rated;

    @SerializedName("Released")
    private String released;

    @SerializedName("Runtime")
    private String runtime;

    @SerializedName("Genre")
    private String genre;

    @SerializedName("Director")
    private  String director;

    @SerializedName("Writer")
    private String write;

    @SerializedName("Actors")
    private String actors;

    @SerializedName("Plot")
    private String plot;

    @SerializedName("Language")
    private String language;

    @SerializedName("Country")
    private String country;

    @SerializedName("Awards")
    private String awards;

    @SerializedName("Poster")
    private String poster;

    @SerializedName("Ratings")
    private List<Ratings> ratings;

    @SerializedName("Metascore")
    private String metascore;

    private String imdbRating;

    private String imdbVotes;

    private String imdbID;

    @SerializedName("Type")
    private String type;

    private String totalSeasons;

    @SerializedName("Response")
    private String response;

    public Movie(String title, String year, String rated, String released, String runtime, String genre, String director, String write, String actors, String plot, String language, String country, String awards, String poster, List<Ratings> ratings, String metascore, String imdbRating, String imdbVotes, String imdbID, String type, String totalSeasons, String response) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.write = write;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.country = country;
        this.awards = awards;
        this.poster = poster;
        this.ratings = ratings;
        this.metascore = metascore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.type = type;
        this.totalSeasons = totalSeasons;
        this.response = response;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public List<Ratings> getRatings() {
        return ratings;
    }

    public void setRatings(List<Ratings> ratings) {
        this.ratings = ratings;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(String totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "{"
                + "\"title\":\"" + title + "\","
                + "\"year\":\"" + year + "\","
                + "\"rated\":\"" + rated + "\","
                + "\"released\":\"" + released + "\","
                + "\"runtime\":\"" + runtime + "\","
                + "\"genre\":\"" + genre + "\","
                + "\"director\":\"" + director + "\","
                + "\"writer\":\"" + write + "\","
                + "\"actors\":\"" + actors + "\","
                + "\"plot\":\"" + plot + "\","
                + "\"language\":\"" + language + "\","
                + "\"country\":\"" + country + "\","
                + "\"awards\":\"" + awards + "\","
                + "\"poster\":\"" + poster + "\","
                + "\"ratings\":" + ratings + ","
                + "\"metascore\":\"" + metascore + "\","
                + "\"imdbRating\":\"" + imdbRating + "\","
                + "\"imdbVotes\":\"" + imdbVotes + "\","
                + "\"imdbID\":\"" + imdbID + "\","
                + "\"type\":\"" + type + "\","
                + "\"totalSeasons\":\"" + totalSeasons + "\","
                + "\"response\":\"" + response + "\""
                + "}";
    }
}
