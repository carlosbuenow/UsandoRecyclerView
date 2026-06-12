package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    List<Times> lstTimes;
    RecyclerView idTimeFutebol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idTimeFutebol = findViewById(R.id.idTimeFutebol);

        lstTimes = new ArrayList<>();

        lstTimes.add(new Times("Brasil", "Seleção mais vitoriosa da história das copas, nunca ficou de fora de nenhuma copa do mundo.", R.drawable.brasil, R.drawable.copasemfundo, "5 Copas"));
        lstTimes.add(new Times("Espanha", "Uma seleção forte atualmente, vencedora da última edição da Eurocopa (2024). ", R.drawable.espanha, R.drawable.copasemfundo, "1 Copa"));
        lstTimes.add(new Times("França", "É a mais favorita atualmente, campeã da copa de 2018 e vice-campeã na de 2022.", R.drawable.franca, R.drawable.copasemfundo, "2 Copas"));
        lstTimes.add(new Times("Argentina", "A última campeã da copa do mundo (2022) e vencedora da última Copa América (2024).", R.drawable.argentina, R.drawable.copasemfundo, "3 Copas"));

        AdapterTimes adapterTimes = new AdapterTimes(getApplicationContext(), lstTimes);
        idTimeFutebol.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        idTimeFutebol.setAdapter(adapterTimes);
    }
}