import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        GerenciadorCheque gerenciador = new GerenciadorCheque();

        List<Cheque> cheques = gerenciador.criar();
        gerenciador.imprimir(cheques);

    }
}
