package anna.karp;

import android.graphics.Color;

public class Diamond {

    private String color;
    private float carat;

    public Diamond() {

        carat = (float) Math.random() * 10;

        switch ((int) (Math.random() * 5)) {
            case 0:
                color = "White";
                break;
            case 1:
                color = "Blue";
                break;
            case 2:
                color = "Green";
                break;
            case 3:
                color = "Pink";
                break;
            case 4:
                color = "Red";
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCarat() {
        return carat;
    }

    public void setCarat(float carat) {
        if (carat > 0) {
            this.carat = carat;
        }
    }

    public String toString() {
        return String.format("%s Diamond, %.3f Ct.", color, carat);
    }

    public static int getColorValue(String colorName) {
        switch (colorName) {
            case "White": return Color.GRAY;
            case "Blue": return Color.BLUE;
            case "Green": return Color.GREEN;
            case "Pink": return Color.MAGENTA;
            case "Red": return Color.RED;
        }
        return Color.BLACK;
    }
}