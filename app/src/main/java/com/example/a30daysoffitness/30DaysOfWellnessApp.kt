package com.example.a30daysoffitness

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysoffitness.data.Datasource
import com.example.compose.AppTheme

@Composable
fun _30DaysOfWellnessApp(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = { AppBar(modifier = Modifier.padding(start = 8.dp, top = 8.dp)) },
        modifier = modifier
    ) {
        Column(modifier = Modifier.padding(it)) {
            AdviceList(
                advices = Datasource.advices,
            )

        }
    }


}


@Composable
@Preview(showBackground = true)
fun _30DaysOfWellnessAppPreview() {
    AppTheme {
        _30DaysOfWellnessApp(modifier = Modifier.fillMaxSize())
    }
}
