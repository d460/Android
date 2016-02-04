package com.d460.messenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Llama al metodo onSendMessage() cuando se presiona el boton
    public void onSendMessage(View view){
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        //Intent explicito se indica desde donde y hacia donde es dirigido el intent
        // Intent intent = new Intent(this,ReceiveMessageActivity.class);
        //intent = putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        //startActivity(intent);
        // Intent implicito, se indica la accion hacia donde va el intent y se agrega texto
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        //empieza el intent
        // startActivity(intent);
        String chooserTitle = getString(R.string.chooser);
        Intent chooserIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chooserIntent);
    }
}
