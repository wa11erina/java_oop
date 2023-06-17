package guru.qa;

public class Cat {
    private String name;
    private double age;
    private String color;
    private String breed;
    private boolean isAffectionate;

    public Cat(String name, double age, String color, String breed, boolean isAffectionate) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.isAffectionate = isAffectionate;

    }

    @Override
    public String toString() {
        return name + "," + " " + age + " " + "years old" + "," + " " + color
                + " " + breed + "," + " " + isAffectionate;
    }
}
