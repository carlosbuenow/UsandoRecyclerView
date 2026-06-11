package br.com.etecia.myapp;

public class Times {

    private String nome;
    private String liga;
    private int imagemTime;
    private double valorElenco;

    public Times(String nome, String liga, int imagemTime, double valorElenco){

        this.nome = nome;
        this.liga = liga;
        this.imagemTime = imagemTime;
        this.valorElenco = valorElenco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getImagemTime() {
        return imagemTime;
    }

    public void setImagemTime(int imagemTime) {
        this.imagemTime = imagemTime;
    }

    public double getValorElenco() {
        return valorElenco;
    }

    public void setValorElenco(double valorElenco) {
        this.valorElenco = valorElenco;
    }
}

