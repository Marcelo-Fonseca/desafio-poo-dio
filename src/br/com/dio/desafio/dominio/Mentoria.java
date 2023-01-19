package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    //criar construtor vazio
    public Mentoria() {
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
