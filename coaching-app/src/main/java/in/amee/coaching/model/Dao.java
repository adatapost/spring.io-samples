package in.amee.coaching.model;

import java.util.List;

public interface Dao<T> {
	  boolean add(T obj);
	  boolean update(T obj);
	  boolean delete(T obj);
	  T get(T obj);   
	  List<T> gets();  
	  List<T> gets(int id);
}
