

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final double CorteMaquina = 20.0;
    private static final double CorteTesoura = 25.0;
    private static final double BarbaSimples = 40.0;
    private static final double BarbaCompleto = 50.0;
    private static final double CorteGilete =25,0.0;
    private static final double Pezinho = 10.0;
    private static final double Tinta = 15.0;
    private static final double Nevou = 60.0;
    private static final double Sobrancelhas = 10.0;

corte gilete 25 , pezinho 10 , tinta 15, luzes 40 , nevou 60 , sobrancelha 10 , corte barba completo 50
    private static final double CustoOperacionais = 0.30;

    private TextView textViewResult;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatePayment();
            }
        });
    }

    private void calcularPagamento() {
        // Exemplo de valores, você pode alterar conforme necessário
        int numeroDeCorteMaquina = 1; // quantidade de cortes de máquina
        int numeroDeCorteTesoura = 1; // quantidade de cortes a tesoura
        int numeroDeBarbaSimples = 1; // quantidade de barbas simples
        int numeroDeBarbaCompleto = 1; // quantidade de barbas completas
        int numeroDeCorteGilete = 1; // quantidade de cortes a gilete
        int numeroDePezinho = 1; // quantidade de pezihos
        int numeroDeTinta = 1; // quantidade de cabelos pintados
        int numeroDeNevou = 1; // quantidade de cabelos nevados
        int numeroDeSobrancelhas = 1; // quantidade de sobrancelhas

        // Calculando o lucro total
        double receitaTotal = (numeroDeCorteMaquina * CorteMaquina) +
                              (numeroDeCorteTesoura * CorteTesoura) +
                              (numeroDeBarbaSimples * BarbaSimples) +
		      (numeroDeBarbaCompleto * BarbaCompleto)+
                              (numeroDeCorteGilete * CorteGilete)+ 
                              (numeroDePezinho * Pezinho) +
                              (numeroDeTinta * Tinta)+
                             (numeroDeNevou * Nevou) +
                             (numeroDeSobrancelhas* Sobrancelhas);
 
        // Calculando o custo de operação
        double custosOperacionais = receitaTotal * porcentagemCustosOperacionais;

        // Calculando o lucro após o custo de operação
        double lucroLiquido = receitaTotal - custosOperacionais;

        // Exibindo o resultado
        textViewResult.setText(String.format("Resultado: R$ %.2f", lucroLiquido));
    }
}