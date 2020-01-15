import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class funcionariosJude {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("jose");
        funcionarios.add("Josefa");
        funcionarios.add("Jefferson");
        funcionarios.add("Jroger");
        System.out.println(funcionarios);

        for (String funcionario : funcionarios){
            System.out.println(funcionario);
        }





        }
}
