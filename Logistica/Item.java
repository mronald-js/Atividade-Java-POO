package Logistica;

public class Item {
    private int id;
    
    public Item(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Produto produto = new Produto("Produto", 0.0, 0);
    
}