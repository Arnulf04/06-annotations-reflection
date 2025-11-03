package ohm.softa.a06;

import com.google.gson.annotations.SerializedName;
import ohm.softa.a06.model.Joke;

public class SearchDTO {
	@SerializedName("result")
	public Joke[] result;
	@SerializedName("result")
	public int total;
}
