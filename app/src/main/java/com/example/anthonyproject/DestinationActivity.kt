package com.example.anthonyproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anthonyproject.ui.theme.AnthonyProjectTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDestination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDestination(){
    val mContext = LocalContext.current
    Column (modifier = Modifier
        .fillMaxSize()){

        TopAppBar(title = { Text(text = "Destination", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext , LayoutActivity::class.java )) }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrowback",
                        tint = Color.White)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "add",
                        tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "settings",
                        tint = Color.White)
                }
            })
        //Start of Box
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "Nairobi",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
            androidx.compose.material3.Text(text = "Let's plan you next vacation",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                color = Color.White,
                textAlign = TextAlign.Center)

        }
        //End of Box
        Spacer(modifier = Modifier.height(20.dp))
        var search by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            placeholder = {androidx.compose.material3.Text(text = "What is your next destination")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search")}
            )
        //End of searchbar
        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(
            text = "Recently viewed",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 20.dp))
        Spacer(modifier = Modifier.height(5.dp))
       Row(modifier = Modifier
           .horizontalScroll(rememberScrollState())) {
           //Card 1
           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center){
                       Image(painter = painterResource(id = R.drawable.img_1), contentDescription = "Italy",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)
                   }
                   Spacer(modifier = Modifier.height(5.dp))
                   androidx.compose.material3.Text(
                       text = "Italy",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }

           }
           //End of card 1
           Spacer(modifier = Modifier.height(5.dp))
           //Card 2
           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center){
                       Image(painter = painterResource(id = R.drawable.china), contentDescription = "China",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)
                   }
                   Spacer(modifier = Modifier.height(5.dp))
                   androidx.compose.material3.Text(
                       text = "China",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }

           }
           //End of card 2
           Spacer(modifier = Modifier.height(5.dp))
           //Card 3
           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center){
                       Image(painter = painterResource(id = R.drawable.img_3), contentDescription = "Spain",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)
                   }
                   Spacer(modifier = Modifier.height(5.dp))
                   androidx.compose.material3.Text(
                       text = "Spain",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }

           }
           //End of card 3
           Spacer(modifier = Modifier.height(5.dp))
           //Card 4
           Card (modifier = Modifier
               .height(200.dp)
               .width(200.dp)){
               Column {
                   Box (modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center){
                       Image(painter = painterResource(id = R.drawable.img_4), contentDescription = "Italy",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)
                   }
                   Spacer(modifier = Modifier.height(5.dp))
                   androidx.compose.material3.Text(
                       text = "Florida",
                       fontSize = 15.sp,
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center)
               }

           }
           //End of card 4

       }
        Button(
            onClick = {mContext.startActivity(Intent(mContext , ExploreActivity::class.java )) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)

        )
        {
            Text(text = "Explore")

        }
        Button(
            onClick = {mContext.startActivity(Intent(mContext , HomeActivity::class.java )) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)

        )
        {
            Text(text = "HomeK")

        }
    }



}

@Preview(showBackground = true)
@Composable
fun MyDestinationPreview(){
    MyDestination()
}