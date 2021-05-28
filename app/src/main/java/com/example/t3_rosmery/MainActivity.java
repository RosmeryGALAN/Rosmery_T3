package com.example.t3_rosmery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.rvAnime);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Anime> anime = new ArrayList<>();
        anime.add(new Anime("https://wl-genial.cf.tsp.li/resize/728x/jpg/0ae/662/f343a9501e868507b03fa3ce7f.jpg",
                "Shigatsu wa Kimi no Uso",
                "Shigatsu wa Kimi no Uso es el anime ideal para los amantes de la música. Kōsei Arima es un joven prodigio del piano que, tras la muerte de su madre, se siente incapacitado para volver a tocar."));
        anime.add(new Anime("https://wl-genial.cf.tsp.li/resize/728x/jpg/830/b00/3cb553541c92ccfe96e9e38f63.jpg",
                "Kimi no na wa",
                " Taki y Mitsuha son dos adolescentes que descubren que, cuando duermen, sus cuerpos se intercambian, por lo que comienzan a comunicarse dejándose notas"));
        anime.add(new Anime("https://wl-genial.cf.tsp.li/resize/728x/jpg/37b/185/6dc2935a87b25e90c2172d2268.jpg",
                "Nanatsu no Taizai",
                "Siete guerreros conocidos como “los siete pecados capitales” fueron exiliados después de haber sido acusados por intentar derrocar al rey. Cuando la princesa Elizabeth Liones descubre que todo era un plan de “los caballeros sagrados."));
        anime.add(new Anime("https://depor.com/resizer/TERgY-DpgkZi7KjHs11LYkCthJ0=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/MIAX2ECTYFEILB5KVTD2FW7UKQ.jpg",
                "Dragon Ball Super",
                "La historia del anime se inicia aproximadamente 6 meses después de la derrota de Majin Boo, cuando la Tierra se ha convertido nuevamente en un lugar pacífico, y retrocontinuando con los acontecimientos de las películas "));
        anime.add(new Anime("https://wl-genial.cf.tsp.li/resize/728x/jpg/bd1/4f6/670c3b5c6daac6a9982fe255a9.jpg",
                "Omoide no Maanii",
                " Cuenta la historia de Anna, una niña solitaria y poco conversadora a la que envían a Hokkaidō, a la casa de unos familiares lejanos, para tratar sus problemas de asma. Allí conoce a la misteriosa Marnie, quien vive en una mansión entre las dunas"));
        anime.add(new Anime("https://www.omegacenter.es/blog/wp-content/uploads/2016/08/onepieceanime-1024x747.jpg",
                "One Piece",
                "Sserie de aventuras de acción que sigue la historia de Monkey D. Luffy, un chico que posee el poder de la elasticidad con la que consigue dar puñetazos y patadas tremendos."));
        anime.add(new Anime("https://www.omegacenter.es/blog/wp-content/uploads/2016/08/baccanoanime-1024x640.jpg",
                "Baccano",
                "Baccano tiene un único e irresistible estilo narrativo que hace que no quieras dejar de verlo hasta terminarlo."));
        anime.add(new Anime("https://cdn.superaficionados.com/imagenes/highschool-of-dead-anime.jpg",
                "Highschool of the Dead",
                "Komuro Takashi es un joven que ve cómo una terrible infección se extiende en su colegio, transformando a sus amigos en zombis. Hasta aquí ninguna novedad, ¿verdad?"));
        anime.add(new Anime("https://static.posters.cz/image/750/poster/death-note-collage-i28406.jpg",
                "Death Note",
                "Cuando un brillante estudiante de secundaria pone sus manos en un Death Note que le permite matar a quien quiera de la manera que él elija, decide utilizarlo en aras del bien y cambiar el mundo para mejor."));
        anime.add(new Anime("https://www.omegacenter.es/blog/wp-content/uploads/2016/08/ataquealostitanesanime-1024x719.jpg",
                "Ataque a los titanes ",
                "Un gran número de titanes han aparecido sobre el mundo y están aplastando ciudades como mosquitos en un día de verano."));
        anime.add(new Anime("https://www.eldesconcierto.cl/wp-content/uploads/2019/05/Shingeki-1024x576.jpg",
                "Shingeki no Kyojin",
                "Un gran número de titanes han aparecido sobre el mundo y están aplastando ciudades como mosquitos en un día de verano."));
        rv.setAdapter(new Adapter(anime));
    }
}