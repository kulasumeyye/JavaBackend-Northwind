package kodlamaio.northwind.entities.dtos;


public class ProductWithCategoryDto {
	
	
	private int id;
	private String ProductName;
	private String CategoryName;
	public ProductWithCategoryDto() {
		super();
	}
	public ProductWithCategoryDto(int id, String productName, String categoryName) {
		super();
		this.id = id;
		ProductName = productName;
		CategoryName = categoryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

}
