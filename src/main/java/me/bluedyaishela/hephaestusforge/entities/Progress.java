package me.bluedyaishela.hephaestusforge.entities;

public class Progress {
    private final String firstColor;
    private final String secondColor;
    private final String format;

    public Progress(String firstColor, String secondColor, String format) {
        this.firstColor = firstColor;
        this.secondColor = secondColor;
        this.format = format;
    }

    public String getFirstColor() {
        return firstColor;
    }

    public String getSecondColor() {
        return secondColor;
    }

    public String getFormat() {
        return format;
    }
}
