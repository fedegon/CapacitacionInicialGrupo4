package export;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

public class ExportJSON<T> implements ExportData<T> {

	
	private Gson gson;
	
	public ExportJSON() {
		this.gson=new Gson();
	}
	
	@Override
	public String exportObject(T value) {
		// TODO Auto-generated method stub
		return gson.toJson(value);
	}

}
