package br.com.etecia.myspacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView idlistaValores;
    int imagem [] = {R.drawable.mario,R.drawable.barbie,R.drawable.besouro,R.drawable.flash,R.drawable.miles};
    String titulo [] = {"Mario Bros. O Filme","Barbie","Besouro Azul","The Flash","Spider-Man Através do Spiderverso"};
    String descricao [] = {"Dois encanadores são levados ao reino dos cogumelos para lutar contra uma ameaça vindoura","Uma TopModel" +
            " que tem diversos empregos  viaja pelo multiveso glamuroso","Um estudante notavel descobre um besouro alienigena que da uma" +
            "armadura com habilidades estraordinarias","O velocista escalarte decide viajar no tempo para salvar a " +
            "sua mãe, mas quando ele faz isso ele coloca todo o universo em risco","Miles o homem aranha viaja atraves de varios spider-versos" +
            "mas por um erro ele é perseguido pelos outros totens da aranha"};
    String score [] ={"5,0"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idlistaValores = findViewById(R.id.listaValores);
        myadapter adapter = new myadapter();

        idlistaValores.setAdapter(adapter);
    }
    public class myadapter extends BaseAdapter {

        @Override
        public int getCount() {return imagem.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imagemfilme;
            TextView titulofilme,descricaofilme,notafilme;

            View v =getLayoutInflater().inflate(R.layout.mdoelo_filme, null);

            imagemfilme = v.findViewById(R.id.mImg);
            titulofilme = v.findViewById(R.id.mTit);
            descricaofilme = v.findViewById(R.id.mDesc);
            notafilme = v.findViewById(R.id.mNota);

            imagemfilme.setImageResource(imagem[i]);
            titulofilme.setText(titulo[i]);
            descricaofilme.setText(descricao[i]);
            notafilme.setText(score[i]);

            return v;
        }
    }

}