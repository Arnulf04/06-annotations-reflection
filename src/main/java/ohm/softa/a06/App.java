package ohm.softa.a06;

import ohm.softa.a06.model.Joke;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Peter Kurfer
 * Created on 11/10/17.
 */
public class App {

	public static void main(String[] args) throws IOException {
		// TODO fetch a random joke and print it to STDOUT
		String baseURL =  "https://api.chucknorris.io/";

		// Den Builder erstellen
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(baseURL)
			.addConverterFactory(GsonConverterFactory.create())
			.build();

		CNJDBApi api = retrofit.create(CNJDBApi.class);

		Call<Joke> call = api.getRandomJoke();

		Response<Joke> resp = call.execute();

		if (resp.isSuccessful()){
			System.out.println(resp.body());
		}
	}

}
