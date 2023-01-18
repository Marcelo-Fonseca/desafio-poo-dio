package br.com.dio.desafio.dominio;
/*Modificadores de acesso
* private = somente essa classe que tem acesso a esse atributo
*  protected = somente essa classe e suas classes filhas tem esse atributo
* public  = qualquer classes tem acesso a esses atributos*/
public class Curso {
    private String titulo;
    private String descicao;
    private int cargaHoraria;

    //construitor vazio

    public Curso() {
    }


    //criar metados gets e sets


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //para poder imprimir
    //to string

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descicao='" + descicao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
