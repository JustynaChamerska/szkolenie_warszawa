package it.kgtg.szkolenie;

public interface DBOperations {

	Product findOne(Long id);
	List<Product> findAll();
	Long insert(Product p);
	
}
