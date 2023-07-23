package com.example.ficheras;

public class ObjetosModelos {
    private int images;
    private String titulos;


    public ObjetosModelos(int images, String titulos) {
        this.images = images;
        this.titulos = titulos;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }
}
