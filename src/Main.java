import br.com.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Eduardo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos de Eduardo" + String.valueOf(dev1.getConteudosInscritos()));
        dev1.progredir();
        dev1.progredir();
        System.out.println("-------------------------");
        System.out.println("Conteúdos Incritos de Eduardo" + String.valueOf(dev1.getConteudosInscritos()));
        System.out.println("Conteúdos Concluidos de Eduardo" + String.valueOf(dev1.getConteudosConcluidos()));
        System.out.println("XP:" + dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos de Joao" + String.valueOf(dev2.getConteudosInscritos()));
        dev2.progredir();
        System.out.println("----------------");
        System.out.println("Conteúdos Incritos de Joao" + String.valueOf(dev2.getConteudosInscritos()));
        System.out.println("Conteúdos Concluidos de Joao" + String.valueOf(dev2.getConteudosConcluidos()));
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}