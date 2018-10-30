package com.java8.examples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class ImageByte {
    private byte[] imgRGB;
    public static void main(String arg[])throws IOException{
        ImageByte ib=new ImageByte();
        byte[] imageByte = ib.extractBytes("/Users/698675/Downloads/Mahendra.jpg");
        System.out.println(imageByte);
        for (byte b:imageByte) {
            System.out.println(b);
        }
    }
    public byte[] extractBytes (String ImageName) throws IOException {
        // open image
        File imgPath = new File(ImageName);
        BufferedImage bufferedImage = ImageIO.read(imgPath);

        // get DataBufferBytes from Raster
        WritableRaster raster = bufferedImage .getRaster();
        DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
        return ( data.getData() );
    }
}
