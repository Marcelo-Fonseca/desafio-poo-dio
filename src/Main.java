import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*instanciar obejto*/
        Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("descrição curso java");
       curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScritp");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);

        //polimorfismo
        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria curso jova");
        mentoria.setDescricao("Descrição curso java");
        mentoria.setData(LocalDate.now());//neste caso vai pegar a data da criaçao no caso a data de hoje.

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/

        //criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcap java developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developoer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //criando dev
     System.out.println("-------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("-");

        System.out.println(" Conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("------------");
        System.out.println(" Conteudos concluiods Camila: " + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());


        System.out.println("----------------------------------------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos inscritos Joao: " + devJoao.getConteudoInscritos());


        devJoao.progredir();
        System.out.println("-");

        System.out.println(" Conteudos inscritos Joao: " + devJoao.getConteudoInscritos());
        System.out.println(" Conteudos concluidos Joao: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());




    }

    }