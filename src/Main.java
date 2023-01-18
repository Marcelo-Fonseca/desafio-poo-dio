import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentaoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*instanciar obejto*/
        Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescicao("descrição curso java");
       curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScritp");
        curso2.setDescicao("descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Mentaoria mentoria = new Mentaoria();
        mentoria.setTitulo("mentoria curso jova");
        mentoria.setDescricao("Descrição curso java");
        mentoria.setData(LocalDate.now());//neste caso cai pegar a data da criaçao no caso a data de hoje.

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

    }