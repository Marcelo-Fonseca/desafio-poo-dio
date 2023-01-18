package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentaoria {
    String titulo;
    String descricao;
    LocalDate data;


    //criar construtor vazio
    public Mentaoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //para imprimir

    @Override
    public String toString() {
        return "Mentaoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
