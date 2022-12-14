package com.example.prak1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak1.ui.theme.Green700
import com.example.prak1.ui.theme.Prak1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.modifier.modifierLocalOf
import com.example.prak1.ui.theme.Green200

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prak1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green700
                ) {
                    Greeting3()
                }
            }
        }
    }
}

@Composable
fun Greeting3() {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Профиль пользователя", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {
        IconButton(onClick = {context.startActivity(Intent(context,SettingsActivity::class.java))}) {
            Image(painter= painterResource(R.drawable.backbutton),
                contentDescription="Avatar",
                modifier = Modifier
                    .padding(0.dp, 16.dp, 14.dp, 0.dp)
                    .size(56.dp)
                    .clip(CircleShape))
        }
    }
    Column() {

        Spacer(
            modifier = Modifier
                .height(200.dp)
                .width(100.dp)
        )
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(R.drawable.avatar_b), contentDescription = "",
                Modifier
                    .size(200.dp, 200.dp)
                    .clip(CircleShape)
            )
        }
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(128.dp))
            Text(text = "Вход не выполнен", fontSize = 16.sp, color = Color.White)
        }
        Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(16.dp))
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
                val context = LocalContext.current
                Button(onClick = {
                    context.startActivity(Intent(context,UserLoginActivity::class.java))
                },
                    Modifier
                        .size(340.dp, 54.dp)
                        .clip(RoundedCornerShape(15)),
                    colors = ButtonDefaults.buttonColors(Green200)) {
                    Text(text ="Войти", fontSize = 24.sp, color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
                val context = LocalContext.current
                Button(onClick = {
                    context.startActivity(Intent(context,UserRegActivity::class.java))
                },
                    Modifier
                        .size(340.dp, 54.dp)
                        .clip(RoundedCornerShape(15)),
                    colors = ButtonDefaults.buttonColors(Green200)) {
                    Text(text = "Регистрация", fontSize = 24.sp, color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(42.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Prak1Theme {
        Greeting3()
    }
}