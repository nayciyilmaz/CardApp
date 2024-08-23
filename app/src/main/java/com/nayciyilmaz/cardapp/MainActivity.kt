package com.nayciyilmaz.cardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nayciyilmaz.cardapp.ui.theme.CardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .fillMaxSize(1f)
            .background(Color(0xFFEC400A)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .background(Color(0xFF776A66))
                .size(150.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null
            )
        }
        Text(text = stringResource(id = R.string.full_name), fontSize = 24.sp)
        Text(text = stringResource(id = R.string.title_name), fontSize = 20.sp)
    }

    // Spacer(Modifier.height(20.dp))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 60.dp)
            .fillMaxSize(1f),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.call),
                contentDescription = null,
                modifier = Modifier.size(22.dp)
            )
            Text(text = stringResource(id = R.string.tel_number))
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.share),
                contentDescription = null,
                modifier = Modifier.size(22.dp)
            )
            Text(text = stringResource(id = R.string.share_name))
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.mail),
                contentDescription = null,
                modifier = Modifier.size(22.dp)
            )
            Text(text = stringResource(id = R.string.mail_name))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CardAppTheme {
        Greeting()
    }
}