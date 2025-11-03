package ohm.softa.a06;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import retrofit2.Retrofit;

public class JokeAdapter<T> extends TypeAdapter<T> {
	@Override
	public T read(JsonReader reader) {
//		// Den Builder erstellen
//		Retrofit retrofit = new Retrofit.Builder()
//			.baseUrl("https://jsonplaceholder.typicode.com/")
//			.addConverterFactory(GsonConverterFactory.create())
//			.build();
//
//		return retrofit;
		return null;
	}

	// don't need
	@Override
	public void write(JsonWriter writer, T inst) {	}
}
