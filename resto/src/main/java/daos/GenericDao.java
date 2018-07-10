package daos;
import java.util.List;

public interface GenericDao<T>{ 
		

		public void save(T tipo);
		public List<T> toList();
		public T persist(T entity);
		public T findById(int id);
		public void update(T entity);
		public void delete(T entity);
		public void deleteAll();
		public T findByName(String nom);
}
