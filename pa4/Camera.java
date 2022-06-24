package com.company;
import java.util.ArrayList;

public class Camera {

    private ArrayList<Photograph> memory;
    private int current;
    private float zoom;
    private String date;
    private int index = 0;


    public Camera() {
        memory = new ArrayList<>(16);
        current = 0;
        zoom = (float) 1.0;
        date = "19000101";
    }


    public Camera(int newMemory, String newDate){
        if (newMemory >= 16){
            memory = new ArrayList<>(newMemory);
        }
        else {
            memory = new ArrayList<>(16);
        }

        if (newDate.length() == 8 ) {
            date = newDate;
        }
        else{
            date = "19000101";}
    }


    public int getPhotographs() {
        return memory.size();
    }

    public float getZoom(){return zoom;}

    public String getCurrentDate(){return date;}

    public void setZoom(float newZoom) {
        if (newZoom >= 1 && newZoom <= 4) {
            zoom = newZoom;
        }
        else
            this.zoom = zoom;
    }

    public void setDate(String newDate) {
        if (newDate.length()==8){
            date = newDate;
            System.out.println("Date was successfully changed to " + newDate);
        }
        else {
            this.date = date;
            System.out.println("Invalid input. Date is now " + date);
        }
    }

    public boolean addPhoto(Photograph ref){
        if (index < memory.size()) {
            memory.set(index, ref);
            index += 1;
            return true;
        }
        else return false;
    }

    public boolean randomPhoto(int pixel){
        Photograph random = new Photograph(pixel, date);
        for (int i = 0; i < pixel; i++){
            random.setPixel(i, (int) (Math.random()*255));
        }
        if (index < memory.size()) {
            memory.set(index, random);
            index += 1;
            return true;
        }
        else return false;
    }

    public int getPixelSize(int index){
        if (index < memory.size() && memory.get(index)!=null)
            return memory.get(index).getSize();
        else return -1;
    }

    public String getDate(int index){
        if (index < memory.size() && memory.get(index)!=null)
            return memory.get(index).getDate();
        else return "00000000";
    }
}
