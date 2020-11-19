package belval.com.testetcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuPrincipal extends AppCompatActivity {

    EditText number, pwd;
    Button botaoEntrar, botaoRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        setTitle("Login");

        botaoEntrar=findViewById(R.id.btnLogar);
        botaoRegistrar=findViewById(R.id.btnRE);
        number=findViewById(R.id.edtCpf);
        pwd=findViewById(R.id.edtSenha);

        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=number.getText().toString();
                String senha=pwd.getText().toString();

                if(usuario.isEmpty() || senha.isEmpty()){
                    Metodos.alert("Em branco!",getApplicationContext());

                }else{
                    Metodos.alert("Usuário ou senha inválidos!",getApplicationContext());
                }

            }
        });

        botaoRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro=new Intent(MenuPrincipal.this,TelaRegistro.class);
                startActivity(registro);
            }
        });
    }
}
