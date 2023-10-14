public class Clothes {
    private String pants;
    private String shirt;
    private String hat;
    private String ring1;
    private String ring2;

    public Clothes(String pants, String shirt, String hat, String ring1, String ring2, String shoes) {
        this.pants = pants;
        this.shirt = shirt;
        this.hat = hat;
        this.ring1 = ring1;
        this.ring2 = ring2;
        this.shoes = shoes;
    }
    
    public String getPants() {
        return pants;
    }
    public void setPants(String pants) {
        this.pants = pants;
    }
    public String getShirt() {
        return shirt;
    }
    public void setShirt(String shirt) {
        this.shirt = shirt;
    }
    public String getHat() {
        return hat;
    }
    public void setHat(String hat) {
        this.hat = hat;
    }
    public String getRing1() {
        return ring1;
    }
    public void setRing1(String ring1) {
        this.ring1 = ring1;
    }
    public String getRing2() {
        return ring2;
    }
    public void setRing2(String ring2) {
        this.ring2 = ring2;
    }
    public String getShoes() {
        return shoes;
    }
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    private String shoes;
}
