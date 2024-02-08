public class Artwork {
    private String title;
    private Artist artist;
    private double price;

    public Artwork (String title, Artist artist, double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    //Getters and Setters
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public Artist getArtist(){
        return this.artist;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
