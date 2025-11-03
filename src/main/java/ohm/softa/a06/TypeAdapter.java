package ohm.softa.a06;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// implement read and write methods for JSON
public abstract class TypeAdapter<T> {
	public abstract T read(final JsonReader reader);
	public abstract T[] read2(final JsonReader reader);
	public abstract void write(final JsonWriter writer, final T inst);
}
