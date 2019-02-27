package android.edu.picasso_v0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private static final String url="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Añadimos permiso a internet en el manifiesto
        //Build>Edit Libraries and Dependencies> +>Picasso

        /*
        En Gradle.Build.Gradle:
        Se añade: implementation 'com.squareup.picasso:picasso:2.71828'
        Por incompatibilidad:
        implementation 'com.android.support:appcompat-v7:27.1.0'
        compileSdkVersion 27
        targetSdkVersion 27
        */

        ImageView img=findViewById(R.id.imagen);
        Picasso.get().load(url).into(img);
    }
}
