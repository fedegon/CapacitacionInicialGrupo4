package export;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.google.gson.Gson;

public class ExportWithGSON<T> implements ExportData<T> {

	
	private Gson gson;
	
	public ExportWithGSON() {
		this.gson=new Gson();
	}
	
	@Override
	public String exportObject(T value) {
		// TODO Auto-generated method stub
		return gson.toJson(value);
	}

	@Override
	public ResponseEntity<String> exportObjectToHttp(T value) {
		// TODO Auto-generated method stub
		return new ResponseEntity<String>(this.exportObject(value),HttpStatus.OK);
		
	}

}
