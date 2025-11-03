package ohm.softa.a06;


import ohm.softa.a06.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CNJDBApi {
	// transfer the path from: "https://api.chucknorris.io/"
	@GET("jokes/random")
	Call<Joke> getRandomJoke();

	// requests with following structure:
	// jokes/random?query=Chuck -> frag nach der Zimmernummer
	@GET("jokes/random")
	Call<Joke> getRandomJoke(@Query("category") String[] category);
	@GET("jokes/random")
	Call<Joke> getJokesBySearch(@Query("query") String query);

	// requests with following structure:
	// jokes/72 -> exakte Nummer
	@GET("jokes/{id}")
	Call<Joke> getJoke(@Path("id") String id);
}
