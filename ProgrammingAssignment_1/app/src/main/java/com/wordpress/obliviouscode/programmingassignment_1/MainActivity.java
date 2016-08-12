package com.wordpress.obliviouscode.programmingassignment_1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView q;
    private boolean answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        q = (TextView) findViewById(R.id.head);
        setQuestion();

        final Context c = this;

        Button t = (Button) findViewById(R.id.button);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer)
                    Toast.makeText(c,"Correct!",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(c,"Incorrect",Toast.LENGTH_SHORT).show();
            }
        });

        Button f = (Button) findViewById(R.id.button2);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer)
                    Toast.makeText(c,"Incorrect",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(c,"Correct",Toast.LENGTH_SHORT).show();
            }
        });


        Button nextQ = (Button) (findViewById(R.id.button3));
        nextQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q.setText("");
                setQuestion();
            }
        });

    }

    private int generateRandom()
    {
        Random a = new Random();
        return a.nextInt(Integer.MAX_VALUE);
    }

    private boolean primeCheck(int n)
    {
        for(int i=2; i<Math.sqrt(n); i++)
            if(n%i==0)
                return false;

        return true;
    }

    private void setQuestion()
    {
        int num = generateRandom();
        answer = primeCheck(num);
        String question = "Is "+Integer.toString(num)+" a prime number?";
        q.setText(question);
    }
}
