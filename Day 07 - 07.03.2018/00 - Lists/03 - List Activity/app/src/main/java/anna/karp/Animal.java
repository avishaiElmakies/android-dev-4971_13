package anna.karp;

public class Animal {

    private String type;
    private String description;

    public Animal(String type, String description) {
        setType(type);
        setDescription(description);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return type + "\n" + description;
    }
}