package smu.protain02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity implements OnClickListener {

    private Button mbuttonSignbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signbutton = (Button) findViewById(R.id.signbutton);
        signbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.signbutton:
                Intent intentSignbutton = new Intent(this, schduleFrament.class);
                startActivity(intentSignbutton);
                break;
        }

    }
}
