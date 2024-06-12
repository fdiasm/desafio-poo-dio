import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("curso Java", "descricao curso Java", 8);

        Curso curso2 = new Curso("descricao curso JS", "curso JS", 4);

        Mentoria mentoria1 = new Mentoria(
            "mentoria de Java", 
            "descricao mentoria Java", 
            LocalDate.now());

        Bootcamp bootcamp = new Bootcamp(
            "bootcamp Java Developer", 
            "descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("Bootcamp " + bootcamp.getNome() + "- conteúdos: " + bootcamp.getConteudos());

        System.out.println("----------------------");

        Dev dev1 = new Dev("Fernando");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome() + " - Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getNome() + " - Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println(dev1.getNome() + " - Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        
        System.out.println("----------------------");
        
        Dev dev2 = new Dev("Ana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getNome() + " - Conteúdos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println(dev2.getNome() + " - Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println(dev2.getNome() + " - Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
