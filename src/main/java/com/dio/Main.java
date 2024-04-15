package com.dio;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso SpringBoot");
        curso1.setDescricao("descrição: Curso SpringBoot");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição Curso JavaScript");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndrei = new Dev();
        devAndrei.setNome("Andrei");
        devAndrei.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andrei:" + devAndrei.getConteudosInscritos());
        devAndrei.progredir();
        devAndrei.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Andrei:" + devAndrei.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andrei:" + devAndrei.getConteudosConcluidos());
        System.out.println("XP:" + devAndrei.calcularTotalXp());

        System.out.println("||-----------------------------------------------------------------------------------------------------------------||");

        Dev devKarla = new Dev();
        devKarla.setNome("Karla");
        devKarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Karla:" + devKarla.getConteudosInscritos());
        devKarla.progredir();
        devKarla.progredir();
        devKarla.progredir();
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Karla:" + devKarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Karla:" + devKarla.getConteudosConcluidos());
        System.out.println("XP:" + devKarla.calcularTotalXp());

    }

}
