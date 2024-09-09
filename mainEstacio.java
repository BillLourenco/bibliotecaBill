import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainCLass extends AppCompatActivity {

    private static final double CorteMaquina = 15.0;
    private static final double CorteTesoura = 20.0;
    private static final double Barba = 12.0;
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

    private void calculaPagamento() {
        // Exemplo de valores, você pode alterar conforme necessário
        int numeroDeCorteMaquina = 1; // quantidade de cortes de máquina
        int numeroDeCorteTesoura = 1; // quantidade de cortes a tesoura
        int numeroDeBarba = 1; // quantidade de barbas

        // Calculando o lucro total
        double receitaTotal = (numeroDeCorteMaquina * CorteMaquina) +
                              (numeroDeCorteTesoura * CorteTesoura) +
                              (numeroDeBarba * Barba);

        // Calculando o custo de operação
        double custosOperacionais = receitaTotal * porcentagemCustosOperacionais;

        // Calculando o lucro após o custo de operação
        double lucroLiquido = receitaTotal - custosOperacionais;

        // Exibindo o resultado
        textViewResult.setText(String.format("Resultado: R$ %.2f", lucroLiquido));
    }
}
