package com.java8.examples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image {
    static int width;
    static int height;
    static BufferedImage writeImage = null;
    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }
    static public void set(int width, int height, int val) throws IOException{
        writeImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        writeImage.setRGB(width,height,val);

      //  ImageIO.write(image,"png",write("path"));

        //image.getRaster().setDataElements(0, 0, width, height, new ImageByte().extractBytes("/Users/698675/Downloads/Mahendra.jpg"));
    }
    public static void write(String imagePath) throws IOException {
        File outputImage = new File(imagePath);
        ImageIO.write(writeImage,"png",outputImage);
    }

    public static void main(String []arg) throws IOException{

        BufferedImage image = new BufferedImage(10, 20, BufferedImage.TYPE_3BYTE_BGR);
        int xCordinateMax =  image.getMinX();
        int yCoordinateMax = image.getMinY();
        byte rgbValues[][][] = new byte[10][10][10];
        int z = 0;
        for(int x=0;x<xCordinateMax;x++){
            for(int y=0;y<yCoordinateMax;y++){
                rgbValues[x][y][z] = (byte)image.getRGB(x,y);
                z++;
            }
            z = 0;
        }



        int zz = 0;
        for(int i=0;i<10;i++){
            for(int y=0;y<10;y++){
                set(i,y,rgbValues[i][y][z]);
                zz++;
            }
            zz = 0;
        }


        // Write image to file




       /* 1. Load any image
                2. Read image, get its height, width, rgb value
                3. Add the same to byte array
                4. call the set method by looping byte array*/
       /* Image image = new Image(50, 50);
        image.set(50, 50 , 5);
        image.write("/Users/698675/Downloads/Mahendra1.jpg");
*/


    }


    /*1. load a image [][][]*/
}
