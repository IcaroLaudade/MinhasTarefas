package icaro.metodista.minhastarefas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MinhasTarefas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_tarefas);
    }
    public void entrar(View view) {
        EditText login = (EditText) findViewById(R.id.login);
        EditText senha = (EditText) findViewById(R.id.senha);

        if ("admin".equals(login.getText().toString()) && "123".equals(senha.getText().toString())) {
            Intent i= new Intent(this,TarefaActivity.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Login ou senha inválida!", Toast.LENGTH_SHORT).show();
        }
    }
}
