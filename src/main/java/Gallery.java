import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<Artwork>();
    }

    //Getter and Setters
   public String getName(){
        return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }
    public void setTill(double till){
        this.till = till;
    }

    public void addTill(double till) {
        this.till += till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void addToStock(Artwork art){
        this.stock.add(art);
    }

    public void removeStock(Artwork art)
    {
        this.stock.remove(art);
    }

    public void purchaseArtwork(Customer customer, Artwork art){
        customer.buyProduct(art.getPrice());
        addTill(art.getPrice());
    }

    public void transferArtwork(Customer customer, Artwork art){
        customer.addToCollection(art);
        removeStock(art);
    }

    public int stock_take(){
        int total = 0;
        for(Artwork artwork : this.stock){
            total += artwork.getPrice();
        }
        return total;
    }
}
