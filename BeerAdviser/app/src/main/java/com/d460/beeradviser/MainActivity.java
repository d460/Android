package com.d460.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private BeerExpert expert = new BeerExpert();

    //Metodo a llamar al apretar el boton
    public void onClicFindBeer(View view){
        //Referencia al TextView
        TextView brands = (TextView)findViewById(R.id.brands);
        //Referencia al Spinner
        Spinner color = (Spinner)findViewById(R.id.color);

        //Obtener el item seleccionado en el Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //Obtener los valores de la clase BeerExpert de acuerdo al tipo de cerveza seleccionado
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormateadas = new StringBuilder();
        for (String brand : brandList){
            brandsFormateadas.append(brand).append('\n');
        }
        //Muestra las cervezas
        brands.setText(brandsFormateadas);
    }
}
