package ohm.softa.a06;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ohm.softa.a06.model.Joke;
import retrofit2.Retrofit;

public class JokeAdapter<T> extends TypeAdapter<T> {
	private final Gson gson;

	public JokeAdapter() {
		gson = new Gson();
	}

	// read a JSON file in a JSON format -> T can be Joke
	@Override
	public T read(JsonReader reader) {
		T result = gson.fromJson(reader, Joke.class);

		return result;
	}

	@Override
	public T[] read2(JsonReader reader) {
		T[] result = gson.fromJson(reader, SearchDTO.class);

		return result;
	}

	// don't need
	@Override
	public void write(JsonWriter writer, T inst) {	}
}
