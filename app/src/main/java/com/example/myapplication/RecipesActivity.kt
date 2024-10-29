package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class RecipesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                RecipesScreen()
            }
        }
    }
}

@Composable
fun RecipesScreen() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = "Recetas Chilenas", modifier = Modifier.padding(16.dp))
            // Aquí puedes agregar botones para cada receta
            Button(onClick = { /* Acción para Receta 1 */ }) {
                Text("Receta 1")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Acción para Receta 2 */ }) {
                Text("Receta 2")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Acción para Receta 3 */ }) {
                Text("Receta 3")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* Acción para Receta 4 */ }) {
                Text("Receta 4")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipesScreenPreview() {
    MyApplicationTheme {
        RecipesScreen()
    }
}
