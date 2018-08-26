package export;

import org.springframework.http.ResponseEntity;

public interface ExportData<T> {
	public String exportObject(T value);
	public ResponseEntity<String> exportObjectToHttp(T value);
}
