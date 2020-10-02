package www.vsga.karyono;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int SIZE = 4;

    private Button[][] buttons;
    private String[] tombol={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"," "};

    private void populateButton(){
        buttons=new Button[SIZE][SIZE];
        buttons[0][0]=findViewById(R.id.a);
        buttons[0][1]=findViewById(R.id.b);
        buttons[0][2]=findViewById(R.id.c);
        buttons[0][3]=findViewById(R.id.d);
        buttons[1][0]=findViewById(R.id.e);
        buttons[1][1]=findViewById(R.id.f);
        buttons[1][2]=findViewById(R.id.g);
        buttons[1][3]=findViewById(R.id.h);
        buttons[2][0]=findViewById(R.id.i);
        buttons[2][1]=findViewById(R.id.j);
        buttons[2][2]=findViewById(R.id.k);
        buttons[2][3]=findViewById(R.id.l);
        buttons[3][0]=findViewById(R.id.m);
        buttons[3][1]=findViewById(R.id.n);
        buttons[3][2]=findViewById(R.id.o);
        buttons[3][3]=findViewById(R.id.blank);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}