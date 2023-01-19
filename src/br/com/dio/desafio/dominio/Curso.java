package br.com.dio.desafio.dominio;
/*Modificadores de acesso
* private = somente essa classe que tem acesso a esse atributo
*  protected = somente essa classe e suas classes filhas tem esse atributo
* public  = qualquer classes tem acesso a esses atributos*/
public  class Curso extends Conteudo {

    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //construitor vazio

    public Curso() {
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
                "titulo='" + getTitulo() + '\'' +
                ", descicao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
