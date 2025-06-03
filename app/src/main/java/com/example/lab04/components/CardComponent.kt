package com.example.lab04.components

@Composable
fun CardComponent() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp),  // Aumentamos la elevación
        colors = CardDefaults.cardColors(             // Añadimos colores personalizados
            containerColor = Color(0xFFE3F2FD),
            contentColor = Color.DarkGray
        ),
        shape = RoundedCornerShape(16.dp)            // Esquinas redondeadas
    ) {
        Column(modifier = Modifier.padding(20.dp)) { // Más padding interno
            Text(
                text = "Título Mejorado",
                style = MaterialTheme.typography.headlineMedium, // Nuevo estilo
                color = Color(0xFF0D47A1)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Descripción con mejor formato y colores.",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}