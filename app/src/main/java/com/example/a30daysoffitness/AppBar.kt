package com.example.a30daysoffitness

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.compose.AppTheme

@Composable
fun AppBar(
    modifier: Modifier = Modifier
) {
    Text(
        text = "30 Дней здоровья",
        fontSize = 24.sp,
        style = MaterialTheme.typography.displayLarge,
        modifier = modifier
    )
}

@Composable
@Preview(showBackground = true)
fun AppBarPreview() {
    AppTheme {
     AppBar()
    }
}