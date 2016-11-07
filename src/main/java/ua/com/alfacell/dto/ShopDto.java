package ua.com.alfacell.dto;

public class ShopDto {
    private int id;
    private String nameShop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    @Override
    public String toString() {
        return "ShopDto{" +
                "id=" + id +
                ", nameShop='" + nameShop + '\'' +
                '}';
    }
}
