package ohm.softa.a06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

	// reference the Exception on the method
	public static void main(String[] args) throws IOException {
		// TODO fetch a random joke and print it to STDOUT
		final String baseURL =  "https://api.chucknorris.io/";

		// Den Builder erstellen
		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(baseURL)
			.addConverterFactory(GsonConverterFactory.create())
			.build();

		CNJDBApi api = retrofit.create(CNJDBApi.class);

		App app1 = new App();
		app1.easyCall(api);
//		app1.secondCall(api);
	}

	// reference the Exception on the method
	public void easyCall(CNJDBApi api) throws IOException {
		Call<Joke> call = api.getRandomJoke();

		Response<Joke> resp = call.execute();

		if (resp.isSuccessful()){
			System.out.println(resp.body());
		}
	}

	// handle array
	public void secondCall(CNJDBApi api) throws IOException {
		Call<Joke> call = api.getRandomJoke();

		Response<Joke> resp = call.execute();

		if (resp.isSuccessful()){
			System.out.println(resp.body());
		}
	}

}
