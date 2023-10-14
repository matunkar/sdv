
public class Character {
    private String color;
    private String name;
    private String eyeColor;
    private String hairColor;
    private String hairStyle;
    
public Character(String color, String name, String eyeColor, String hairColor, String hairStyle, Clothes clothes) {
        this.color = color;
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
    }

    

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public String getHairStyle() {
        return hairStyle;
    }
    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public void move() {
        System.out.println(this.name + " skedaddled :P");
    }


}

