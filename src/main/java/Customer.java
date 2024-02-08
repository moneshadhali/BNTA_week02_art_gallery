import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyProduct(double price){
        this.wallet -= price;
    }

    public void addToCollection(Artwork art){
        this.artCollection.add(art);
    }
}
