package com.example.dwayne.conglemerate;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.Toast;

public class smile extends AppCompatActivity {
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);
        Toast.makeText(getApplicationContext(), "Click here!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void to2(View view) {
        Intent intent = new Intent(getApplicationContext(),number2.class);
        startActivity(intent);
    }
}
