package com.example.spinner;

public class Planeta {
    String nome;
    int imgplaneta;

    public Planeta(String nome, int imgplaneta){
        this.nome = nome;
        this.imgplaneta = imgplaneta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImgplaneta() {
        return imgplaneta;
    }

    public void setImgplaneta(int imgplaneta) {
        this.imgplaneta = imgplaneta;
    }
}
