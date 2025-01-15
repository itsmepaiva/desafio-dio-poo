import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("sei la");
        curso1.setTitulo("Matematica");

        Mentoria ment = new Mentoria();
        ment.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(ment);

    }
}
