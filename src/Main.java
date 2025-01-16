import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("sei la");
        curso1.setTitulo("curso java");

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("sei nao");
        curso2.setCargaHoraria(4);

        Mentoria ment = new Mentoria();
        ment.setData(LocalDate.now());
        ment.setDescricao("dunno");
        ment.setTitulo("mentoria java");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descriçao do bootcamp");
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(ment);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos");
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());



    }
}