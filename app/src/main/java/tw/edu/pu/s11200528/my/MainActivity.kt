package tw.edu.pu.s11200528.my

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import tw.edu.pu.s11200528.my.ui.theme.MyTheme
import kotlin.math.absoluteValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "廖翊婷",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var x: Int = 0
    Row {
        Column {
            Button(
                onClick = {

                }
            ) {
                Text("歸零")
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "star",
                    modifier = modifier.clip(CircleShape),
                )
            }
        }
        Button(
            onClick = {

            }
        ) {
            Text("兩倍")
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = "star",
                modifier = modifier.clip(CircleShape),
            )
        }


        Column {
            Text(text = x.toString(),
                fontSize = 50.sp,
                modifier = modifier.clickable { x++ }
            )
            Row {
                Text(
                    text = stringResource(R.string.author),
                    color = Color.Blue,
                    fontSize = 30.sp,
                    modifier = modifier,
                    fontFamily = FontFamily(Font(R.font.hand))
                )


                Image(
                    painter = painterResource(id = R.drawable.images),
                    contentDescription = "狗狗",
                    modifier = modifier.clip(CircleShape),
                    alpha = 0.8f

                )


            }
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.images),
                    contentDescription = "狗狗",
                    modifier = modifier.clip(CircleShape),
                    alpha = 0.8f,
                )
            }
        }

    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyTheme {
            Greeting("Android")
        }
    }
}