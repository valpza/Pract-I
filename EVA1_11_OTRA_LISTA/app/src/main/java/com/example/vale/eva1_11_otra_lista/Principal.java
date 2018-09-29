package com.example.vale.eva1_11_otra_lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listView;
    TextView TextViewM;
    final String [] sObras = {"Don quijote","Los miserables","Correr o morir", "Trono de cristal","Eragon"};
    final String [] sReseñas = {"El ingenioso hidalgo don Quijote de la Mancha narra las aventuras de Alonso Quijano, " +
            "un hidalgo pobre que de tanto leer novelas de caballería acaba enloqueciendo y creyendo ser un caballero andante," +
            " nombrándose a sí mismo como don Quijote de la Mancha.", "Jean Valjean, un exconvicto al que encerraron durante " +
            "veinte años por robar un pedazo de pan, se convierte en un hombre ejemplar que lucha contra la miseria y la " +
            "injusticia y que empeña su vida en cuidar a la hija de una mujer que ha debido prostituirse para salvar a la niña." +
            " Así, Jean Valjean se ve obligado a cambiar varia s veces de nombres, es apresado, se fuga y reaparece. " +
            "Al mismo tiempo, debe eludir al comisario Javert, un policía inflexible que lo persigue convencido de que " +
            "tiene cuentas pendientes con la justicia. ","Al despertar dentro de un oscuro elevador en movimiento, lo único" +
            " que Thomas logra recordar es su nombre. No sabe quién es. Tampoco hacia dónde va. Pero no está solo: cuando la " +
            "caja llega a su destino, las puertas se abren y se ve rodeado por un grupo de jóvenes. «Bienvenido al Área, Novicio». " +
            "El Área. Un espacio abierto cercado por muros gigantescos. Al igual que Thomas, ninguno de ellos sabe cómo ha" +
            "llegado allí. Ni por qué. De lo que están seguros es de que cada mañana las puertas de piedra del laberinto que" +
            " los rodea se abren y por la noche, se cierran. Y que cada treinta días alguien nuevo es entregado por el elevador. " +
            "Un hecho altera de forma radical la rutina del lugar: llega una chica, la primera enviada al Área. Y más " +
            "sorprendente todavía es el mensaje que trae. Thomas será más importante de lo que imagina. Pero para eso deberá" +
            " descubrir los sombríos secretos guardados en su mente. Por alguna razón, sabe que para lograrlo debe correr. " +
            "Correr será la clave. O morirá.", "En un mundo sin magia, y tras un año de trabajos forzados en las minas de " +
            "sal, una joven asesina es convocada a palacio. Ella no acude para acabar con el sanguinario rey que gobierna " +
            "desde su trono de cristal, sino para conquistar su propia libertad. Si vence a veintitrés asesinos, ladrones y " +
            "guerreros en una competición a vida o muerte, será absuelta para ejercer como campeona real. Su nombre es " +
            "Celaena Sardothien. El príncipe la provocará. El capitán de la guardia la protegerá. Una princesa de tierras " +
            "lejanas se convertirá en su amiga. Pero algo maligno se esconde en el palacio de cristal, y está allí para matar. " +
            "Mientras sus competidores van muriendo uno a uno, la lucha de Celaena por conquistar su libertad se convierte en" +
            " una lucha por sobrevivir y en una incesante búsqueda del origen del mal antes de que destruya el mundo.",
            "En el reino legendario de Alagaësia la guerra se está gestando. Los jinetes protectores de la paz del Imperio " +
                    "y los únicos capaces de controlar a los inteligentes dragones, se han extinguido o han pasado a formar " +
                    "parte de las tropas del malvado rey Galbatorix. Los elfos hace tiempo que se han exiliado a un lugar oculto " +
                    "y los vardenos, un grupo disidente, se ocultan en ciudades protegidas. Cuando Eragon, un joven de 15 " +
                    "años que vive en una pequeña aldea, se encuentra con una piedra preciosa en medio del bosque a donde ha" +
                    " ido a cazar, poco se espera que ese suceso vaya a cambiar su vida y el destino de Alagaësia. Lo único " +
                    "que desea es venderla para así asegurar la subsistencia de su familia durante el duro invierno. Sin embargo, " +
                    "una noche la gema se rompe y lo que sale de ella lo llevará a un viaje que lo convertirá en héroe. ¿Podrá" +
                    " Eragon tomar la responsabilidad de los legendarios jinetes de dragones? La esperanza del Imperio descansa " +
                    "en sus manos..."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        listView = findViewById(R.id.listview);
        TextViewM = findViewById(R.id.TextViewM);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sObras));
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextViewM.setText(sReseñas[position]);
    }
}
