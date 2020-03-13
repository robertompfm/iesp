package com.robertompfm;

public class MyFrame {
    private double length;
    private double width;
    private double frameWidth;

    public MyFrame(double length, double width, double frameWidth) {
        this.length = length;
        this.width = width;
        this.frameWidth = frameWidth;
    }

    public double getFrameArea() {
        double outerArea, innerArea;
        outerArea = this.length * this.width;
        innerArea = (this.length - 2 * this.frameWidth) * (this.width - 2 * this.frameWidth);
        return outerArea - innerArea;
    }
}
