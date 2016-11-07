package ua.com.alfacell.dto;

public class StorageDto {
    private Integer id;
    private ShopDto shopDto;
    private ProductDto productDto;
    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShopDto getShopDto() {
        return shopDto;
    }

    public void setShopDto(ShopDto shopDto) {
        this.shopDto = shopDto;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "StorageDto{" +
                "id=" + id +
                ", shopDto=" + shopDto +
                ", productDto=" + productDto +
                ", amount=" + amount +
                '}';
    }
}
