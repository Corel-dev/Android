package com.example.anthonyproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.unit.dp
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.anthonyproject.ui.theme.AnthonyProjectTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.img), contentScale = ContentScale.FillBounds)) {
        val mContext = LocalContext.current

        //TopappBar
        TopAppBar(title = { Text(text = "Home", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu",
                        tint = Color.White)

                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share",
                        tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "settings",
                        tint = Color.White)
                }
            })
        //end of TopappBar

        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "BREED OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(5.dp))
        //First row
        Row {
            Image(painter = painterResource(id = R.drawable.jibwa), contentDescription = "dog",
                modifier = Modifier.size(width = 300.dp, height = 200.dp))

            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "BULL DOG", fontSize = 18.sp)
                Text(text = "Bull dog is an amazing dog")
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        //Second row
        Row {
            Image(painter = painterResource(id = R.drawable.jibwa), contentDescription = "dog",
                modifier = Modifier.size(width = 300.dp, height = 200.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "GERMAN SHEPHERED", fontSize = 18.sp)
                Text(text = "German shephered  is an amazing dog")
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row {
            Button(
                onClick = { mContext.startActivity(Intent(mContext , MainActivity::class.java )) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "arrowback",tint = Color.White)
                Text(text = "Back")
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(
                onClick = { mContext.startActivity(Intent(mContext , IntentActivity::class.java ))},
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Text(text = "Next")


            }
        }



    }



}

@Preview(showBackground = true)
@Composable
fun Layoutpreview(){
    Layout()

}