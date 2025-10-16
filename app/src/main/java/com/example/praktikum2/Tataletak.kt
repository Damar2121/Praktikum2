package com.example.praktikum2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.provider.FontsContractCompat.Columns
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColoumn(modifier: Modifier) {
    Column(modifier = modifier.padding( all = 20.dp)) {
        Text(text = "Komponenn1")
        Text(text = "Komponenn2")
        Text(text = "Komponenn3")
        Text(text = "Komponenn4")
    }
}




