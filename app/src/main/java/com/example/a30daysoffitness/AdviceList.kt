package com.example.a30daysoffitness

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysoffitness.data.Advice
import com.example.a30daysoffitness.data.Datasource
import com.example.compose.AppTheme

@Composable
fun AdviceList(
    advices: List<Advice>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        modifier = modifier
    ) {
        itemsIndexed(advices) { index, advice ->
            AdviceItem(
                advice = advice,
                number = index + 1,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AdviceListPreview() {
    AppTheme {
        AdviceList(
            advices = Datasource.advices,
            modifier = Modifier.padding(0.dp)
        )
    }
}