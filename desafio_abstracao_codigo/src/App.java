import dio.desafio.bootcamp.Bootcamp;
import dio.desafio.bootcamp.Conteudo;
import dio.desafio.bootcamp.Curso;
import dio.desafio.bootcamp.Dev;
import dio.desafio.bootcamp.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       Bootcamp bootcamp = new Bootcamp();
       Dev joao = new Dev();
       Dev maria = new Dev();
       
       Conteudo curso1 = new Curso();
       Conteudo mentoria1 = new Mentoria();

       mentoria1.setTitulo("Java em 2 horas");

       bootcamp.setNome("Dio Java");
       bootcamp.getConteudos().add(mentoria1);
       bootcamp.getConteudos().add(curso1);

       joao.inscrever(bootcamp);
       maria.inscrever(bootcamp);
       
        System.out.println(joao.getConteudosInscritos());

       joao.progredir();
       maria.progredir();

       double  totalXP = maria.calcularTotalXP();

    }
}
