package com.example.myfirstapplicationjetpackcompose

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkThemeColors = this.materialDesignDarkTheme()
            val lightThemeColors = this.materialDesignLightTheme()
            MaterialTheme(
                colors = if (!isSystemInDarkTheme()) darkThemeColors else lightThemeColors
            ) {
                Poem()
            }
        }
    }

    @Composable
    private fun Poem() {
        val pointerImage = painterResource(id = R.drawable.pabloneruda)
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            val imageModifier = Modifier
                //.height(120.dp)
                .fillMaxWidth()
                .height(300.dp)
                .clip(shape = RoundedCornerShape(40.dp))

            Image(painter = pointerImage,
                contentDescription = "Photo Pablo Neruda",
                imageModifier,
                contentScale = ContentScale.Crop)
            Spacer(Modifier.height(16.dp))

            Text(text = "SONETO XVII",
                style = MaterialTheme.typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = MaterialTheme.colors.primary
            )
            var brk="";
            Text(text =
                    "No te amo como si fueras rosa de sal, topacio" +brk+
                    "o flecha de claveles que propagan el fuego:" +brk+
                    "te amo como se aman ciertas cosas oscuras," +brk+
                    "secretamente, entre la sombra y el alma." +brk+
                    "Te amo como la planta que no florece y lleva" +brk+
                    "dentro de sí, escondida, la luz de aquellas flores," +brk+
                    "y gracias a tu amor vive oscuro en mi cuerpo" +brk+
                    "el apretado aroma que ascendió de la tierra." +brk+
                    "Te amo sin saber cómo, ni cuándo, ni de dónde," +brk+
                    "te amo directamente sin problemas ni orgullo:" +brk+
                    "así te amo porque no sé amar de otra manera," +brk+
                    "sino así de este modo en que no soy ni eres," +brk+
                    "tan cerca que tu mano sobre mi pecho es mía," +brk+
                    "tan cerca que se cierran tus ojos con mi sueño.",
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.primaryVariant,
                textAlign = TextAlign.Justify,
                fontSize =  20.sp,
                fontFamily = FontFamily.Cursive
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "Cien sonetos de amor (1959)",
                style = MaterialTheme.typography.body2,
                color = Color.LightGray)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }

    }

    /*Funct for theme  Material Design DarkMode/LightMode */
    private fun materialDesignDarkTheme(): Colors {

        return darkColors(
            primary = Color(0xFF000000),
            primaryVariant = Color(0xFF000000),
            onPrimary = Color.White,
            secondary = Color.White,
            onSecondary = Color.White,
            surface = Color(0xFF212121),
            background = Color(0xFF212121),
            onBackground = Color.White,
            onSurface = Color.White,
            error = Color.Red,
            onError = Color.White
        )
    }
    /*Funct for theme  Material Design DarkMode/LightMode */
    private fun materialDesignLightTheme(): Colors {
        return lightColors(
            primary = Color(0xFFFFFFFF),
            primaryVariant = Color(0xFFFFFFFF),
            onPrimary = Color.Black,
            secondary = Color.Transparent,
            onSecondary = Color.White,
            background = Color.White,
            onBackground = Color(0xFF212121),
            surface = Color.White,
            onSurface = Color(0xFF212121),
            error = Color.Red,
            onError = Color.White
        )
    }
}