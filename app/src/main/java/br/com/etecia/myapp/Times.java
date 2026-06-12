package br.com.etecia.myapp;

public class Times {

    private String nome;
    private String liga;
    private int imagemTime;
    private int imagemCopa;

    private String copas;

    public Times(String nome, String liga, int imagemTime, int imagemCopa, String copas) {

        this.nome = nome;
        this.liga = liga;
        this.imagemTime = imagemTime;
        this.imagemCopa = imagemCopa;
        this.copas = copas;

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

    public int getImagemCopa() {
        return imagemCopa;
    }

    public void setImagemCopa(int imagemCopa) {
        this.imagemCopa = imagemCopa;
    }

    public String getCopas() {
        return copas;
    }

    public void setCopas(String copas) {
        this.copas = copas;
    }
}



