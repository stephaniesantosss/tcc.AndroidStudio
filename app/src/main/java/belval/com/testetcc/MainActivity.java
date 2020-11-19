package belval.com.testetcc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Cadê meu bilhete?");
        criarSplash();
    }

    private void criarSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu=new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(menu);
            }},SPLASH_TIME_OUT);
    }
}
