package com.rizal.birthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rizal.birthday.ui.theme.BirthdayTheme

class ComposeLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LayoutPage()
                }
            }
        }
    }
}

@Composable
fun LayoutPage() {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = stringResource(R.string.first),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = stringResource(R.string.second),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun LayoutPagePreview() {
    BirthdayTheme {
        LayoutPage()
    }
}