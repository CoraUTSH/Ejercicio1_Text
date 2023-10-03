package com.example.miaplicacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp
import com.example.miaplicacin.ui.theme.MiAplicaciónTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiAplicaciónTheme {
                Pantalla()
            }
        }
    }
}
@Composable
fun Pantalla(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.Tomate))
            .padding(20.dp)
    ) {
        Titulo("Android")
        Spacer(modifier = Modifier.height(30.dp))
        Contenido("Android es un sistema operativo inicialmente pensado para teléfonos móviles, al igual que iOS, Symbian y Blackberry OS. Lo que lo hace diferente es que está basado en Linux, un núcleo de sistema operativo libre, gratuito y multiplataforma.")
        Spacer(modifier=Modifier.height(30.dp))
        Titulo("La UTSH")
        Spacer(modifier=Modifier.height(30.dp))
        Contenido("La UTSH es una Institución de Educación Superior que contribuye a la superación social y al desarrollo tecnológico de la región, formando Técnicos Superiores Universitarios e Ingenieros competentes con conocimientos y habilidades para la solución creativa de problemas y con un sentido de innovación y pensamiento creativo")
    }
}

@Composable
fun Titulo(titulo:String){
 Text(text =titulo,
     color= Color.White,
     fontSize = 30.sp,
     letterSpacing = 21.sp,
     textAlign = TextAlign.Center,
     fontWeight = FontWeight.Bold,
     modifier=Modifier.fillMaxWidth()
     )
}
@Composable
fun Contenido(texto:String){
    Text(text = texto,
        textAlign = TextAlign.Justify,

        )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pantalla()
}