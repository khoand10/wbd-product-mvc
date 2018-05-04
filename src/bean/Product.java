package bean;

public class Product {
    private int id;
    private String name;
    private int price;
    private String depcription;
    private String made;

    public Product(){

    }

    public Product(int id, String name, int price, String depcription, String made) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.depcription = depcription;
        this.made = made;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepcription() {
        return depcription;
    }

    public void setDepcription(String depcription) {
        this.depcription = depcription;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", depcription='" + depcription + '\'' +
                ", made='" + made + '\'' +
                '}';
    }
}
