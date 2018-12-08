package layout.bai7.hatis.hatisbai7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG=getClass().getSimpleName();
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_login);
 //       btnLogin = (Button)findViewById(R.id.btnLogin);
 //       btnLogin.setOnClickListener(new View.OnClickListener(){
 //           @Override
 //           public void onClick(View v) {
 //               Intent intent = new Intent(MainActivity.this, DialogActivity.class);
 //               startActivity(intent);
 //           getIntent();
 //         }
//       });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }


}
