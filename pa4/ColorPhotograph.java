package com.company;

public class ColorPhotograph extends Photograph {

    public ColorPhotograph(int size, String date){
        super(size, date);
    }

    public void setPixel(int location, int red, int green, int blue){
        super.setPixel(location, encodePixel(red, green, blue));
    }

    @Override
    public void setPixel(int location, int value) {
        int encoded = encodePixel(value, value, value);
        super.setPixel(location, encoded);
    }

    public int encodePixel(int red, int green, int blue) {
        if (red >= 0 && green >= 0 && blue >= 0 &&
                red <= 255 && green <= 255 && blue <= 255) {
            green = green << 8;
            blue = blue << 16;
            return blue | green | red;
        }
        else
            return 0;
    }
}
