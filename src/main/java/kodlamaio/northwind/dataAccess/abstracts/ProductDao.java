package kodlamaio.northwind.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;


public interface ProductDao extends JpaRepository<Product, Integer> {
	
	Product getByProductName(String productName);
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	List<Product> getByCategoryIn(List<Integer>categories);
	List<Product> getByProductNameContains(String productName);
	List<Product> getByProductNameStartsWith(String productName);
	

	//select * from products where product_name=abc and category_id=1
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> GetByNameAndCategory(String productName,int categoryId);
	
	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName,c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
    // select p.productId , p.producName, c.categoryName from Category c inner join Product p
	// on c.categoryId =p.categoryId

}
