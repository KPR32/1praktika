package com.example.prak1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import com.example.prak1.ui.theme.Yellow200
import com.example.prak1.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prak1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green700
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Список дел", fontSize = 24.sp,color=Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {

        IconButton(onClick = {context.startActivity(Intent(context,ProfileActivity::class.java))}) {
            Image(
                painter = painterResource(R.drawable.avatar),
                contentDescription = "Avatar",
                modifier = Modifier
                    .padding(0.dp, 14.dp, 13.dp, 0.dp)
                    .size(56.dp)
                    .clip(CircleShape)
            )
        }


    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(132.dp))
        Card(
            shape = Shapes.large,
            modifier = Modifier
                .size(380.dp, 90.dp)
                .clickable {context.startActivity(Intent(context,EditTaskActivity::class.java))},
            elevation = 10.dp,
            backgroundColor = Yellow200

        )
        {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(16.dp,12.dp,0.dp,0.dp)) {
                Text(text = "Вечерний поход в кино", fontSize = 16.sp,color=Color.White, fontWeight = FontWeight.Bold)
                Text(text = "Идем в кино с коллегами!", fontSize = 11.sp,color= Gray100)
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(0.dp,17.dp,8.dp,0.dp)) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "10.02.2021", fontSize = 11.sp,color= Gray100)
                    Text(text = "19:40", fontSize = 11.sp,color= Gray100)
                }

            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            shape = Shapes.large,
            modifier = Modifier
                .size(380.dp, 90.dp)
                .clickable {},
            elevation = 10.dp,
            backgroundColor = Yellow200

        )
        {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(16.dp,12.dp,0.dp,0.dp)) {
                Text(text = "Забрать заказ Ozon", fontSize = 16.sp,color=Color.White, fontWeight = FontWeight.Bold)
                Text(text = "Пункт выдачи на ул. Ленина, 103", fontSize = 11.sp,color= Gray100)
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(0.dp,17.dp,8.dp,0.dp)) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "10.02.2021", fontSize = 11.sp,color= Gray100)
                    Text(text = "19:40", fontSize = 11.sp,color= Gray100)
                }

            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            shape = Shapes.large,
            modifier = Modifier
                .size(380.dp, 90.dp)
                .clickable {},
            elevation = 10.dp,
            backgroundColor = Yellow200

        )
        {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(16.dp,12.dp,0.dp,0.dp)) {
                Text( text = "Запись в автосервис", fontSize = 16.sp,color=Color.White, fontWeight = FontWeight.Bold)
                Text(modifier = Modifier.width(248.dp),text = "Сдать автомобиль в автосервис на ул.",fontSize = 11.sp,color= Gray100)
                Text(modifier = Modifier.width(248.dp),text = "Бисертская, д. 14. Замена масла",fontSize = 11.sp,color= Gray100)
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(0.dp,17.dp,8.dp,0.dp)) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "10.02.2021", fontSize = 11.sp,color= Gray100)
                    Text(text = "19:40", fontSize = 11.sp,color= Gray100)
                }

            }
        }
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(onClick = {context.startActivity(Intent(context,AddTaskActivity::class.java))},modifier = Modifier
                .width(324.dp)
                .height(48.dp)
                .clip(RoundedCornerShape(10.dp)),colors = ButtonDefaults.buttonColors(Green200)
            )
            {
                Text("Добавить задачу", fontSize = 18.sp, color =  Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp));
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(72.dp)
                    .width(300.dp)
                    .clip(
                        RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp)
                    )
                    .background(Green200)

            )
            {

                Row()
                {

                    IconButton(onClick = {})
                    {
                        Image(painter = painterResource(id = R.drawable.listbutton_green),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(onClick = {context.startActivity(Intent(context,AlarmActivity::class.java))})
                    {
                        Image(painter = painterResource(id = R.drawable.alarmbutton_red),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(onClick = {context.startActivity(Intent(context,CalendarActivity::class.java))})
                    {
                        Image(painter = painterResource(id = R.drawable.calendarbutton_red),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(onClick = {context.startActivity(Intent(context,SettingsActivity::class.java))})
                    {
                        Image(painter = painterResource(id = R.drawable.settingsbutton_red),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Prak1Theme {
        Greeting()
    }
}