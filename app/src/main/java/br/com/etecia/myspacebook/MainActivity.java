package br.com.etecia.myspacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView idlistaValores;
    int imagem [] = {R.drawable.mario,R.drawable.barbie,R.drawable.besouro,R.drawable.flash,R.drawable.miles};
    String titulo [] = {"Mario Bros. O Filme","Barbie","Besouro Azul","The Flash","Spider-Man Através do Spiderverso"

    }
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
        public int getCount() {
            return 0;
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
            return null;
        }
    }

}