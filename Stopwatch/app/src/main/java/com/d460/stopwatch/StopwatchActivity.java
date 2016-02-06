package com.d460.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    //Empezar el cronometro al pulsar el boton Start
    public void onClickStart(View view){
        running = true;
    }

    //Detener el cronometro al pulsar el boton Stop
    public void onClickStop(View view){
        running = false;
    }

    //Resetear el cronometro al pulsar el boton Reset
    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    private void runTimer(){
        final TextView timeView = (TextView)findViewById(R.id.time_view);

        int horas = seconds/3600;
        int minutos = (seconds%3600)/60;
        int secs = seconds%60;
        String time = String.format("%d:%02d:%02d",horas,minutos,secs);
        timeView.setText(time);
        if (running){
            seconds++;
        }
    }

}
