package cart;

public class Item {
    
    public class Apple {
    public class Orange {
        
    }
    }

    // Details - members
    private String name = "";
    private String code = "";
    private Float price = 0f;
    private Integer quantity = 0;
    
    // Member getter / setter

    public Item (String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}

    public Float getPrice() {return price;}
    public void setPrice(Float price) {this.price = price;}

    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}
    
    // Total cost
    public float totalprice () {
    return this.price * this.quantity;
}
    
    


    

}
