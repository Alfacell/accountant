package ua.com.alfacell.models;


import javax.persistence.*;

@Entity
@Table(name = "SHOPS")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
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
        return "\nShop:" +
                "\nid=" + id +
                "\nnameShop='" + nameShop + "\n";
    }
}
