package com.example.a30daysoffitness

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysoffitness.data.Advice
import com.example.a30daysoffitness.data.Datasource
import com.example.compose.AppTheme
import com.example.ui.theme.AppTypography

@Composable
fun AdviceItem(
    advice: Advice,
    number: Int,
    modifier: Modifier = Modifier
) {
    var expanded by rememberSaveable { mutableStateOf(false) }
    Card(
        onClick = { expanded = !expanded },
        modifier = modifier
    ) {
        Column(modifier = Modifier
            .animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy, // Параметры анимации
                stiffness = Spring.StiffnessMedium
            )
        )) {
            Text(
                text = "День $number",
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = advice.title,
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(start = 8.dp, end = 8.dp)
            )
            Image(
                painter = painterResource(id = advice.image),
                contentDescription = advice.title,
                modifier = Modifier.padding(8.dp)
            )
            if (expanded) {
                Text(
                    text = advice.description,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }


    }
}

@Composable
@Preview(showBackground = true)
fun AdviceItemPreview() {
    AppTheme {
        AdviceItem(
            advice = Datasource.advices.first(),
            number = 1,
            modifier = Modifier.fillMaxWidth()
        )
    }
}