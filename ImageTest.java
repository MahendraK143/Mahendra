package com.java8.examples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageTest {
    private int width;
    private int height;
    public int[][][] rgb = new int[255][255][255];
    BufferedImage writeImage = null;

    public ImageTest(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void set(int x, int y, int val) throws IOException {
        writeImage = new BufferedImage(x+1, y+1, BufferedImage.TYPE_3BYTE_BGR);
        writeImage.setRGB(x, y, val);
        //writeImage.getRaster().setDataElements(x, y, width, height, rgb);
    }

    public void write(String imagePath) throws IOException {
        File outputImage = new File(imagePath);
        ImageIO.write(writeImage, "png", outputImage);
    }

    public static void main(String[] arg) throws IOException {
        ImageTest imageTest = new ImageTest(255, 255);
        BufferedImage image = new BufferedImage(imageTest.width, imageTest.height, BufferedImage.TYPE_3BYTE_BGR);
        int rgb = 0;
        for (int width = 0; width < imageTest.width; width++) {
            //System.out.println("dfgdfgdgf");
            for (int height = 0; height < imageTest.height; height++) {
                imageTest.rgb[width][height][rgb] = (byte) image.getRGB(width, height);
                imageTest.set(width, height, image.getRGB(width, height));
                rgb++;
            }
            rgb = 0;
        }
        imageTest.write("/Users/698675/Downloads/MahendraRGB.jpg");
    }
}
