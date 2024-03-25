package store.demo;

public class Shopping {
    private int id;
    private String producto;
    
    public Shopping(int id, String producto){
        this.id = id;
        this.producto = producto;

    }

    public int getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

}
