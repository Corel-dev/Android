package com.example.anthonyproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anthonyproject.ui.theme.AnthonyProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo()
{Column(modifier = Modifier
    .fillMaxSize()
    .background(Color.Cyan)) {
    val mContext = LocalContext.current
    androidx.compose.material3.Text(text = "Welcome to android" ,
        fontSize = 30.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center)
    androidx.compose.material3.Text(text = "Type of cars", fontSize = 29.sp, modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline)
    androidx.compose.material3.Text(text = "1.Volvo")
    androidx.compose.material3.Text(text = "2.Vitz")
    androidx.compose.material3.Text(text = "3.BMW")
    androidx.compose.material3.Text(text = "4.Chevrolet")
    androidx.compose.material3.Text(text = "5.Mitsubishi")
    androidx.compose.material3.Text(text = "eMobilis" ,
        modifier = Modifier
            .background(Color.Black),
        fontSize = 30.sp,
        color = Color.Green,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center)
    Box(modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center) {
        Button(
            onClick = { },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)

        )
        {
            Text(text = "See more")

        }
    }
    androidx.compose.material3.Text(text = "Courses Offered", fontSize = 29.sp, modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline)

    androidx.compose.material3.Text(text = "1.Cyber Security")
    androidx.compose.material3.Text(text = "2.MIT")
    androidx.compose.material3.Text(text = "3.Full Stack Development")
    androidx.compose.material3.Text(text = "4.Software Engineering")
    Spacer(modifier = Modifier.height(20.dp))
    Divider()
    //Centering an image
   Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
       Image(painter = painterResource(id = R.drawable.background), contentDescription ="",
           modifier = Modifier
               .size(200.dp)
               .clip(shape = CircleShape),
           contentScale = ContentScale.Crop)
   }
    Button(
        onClick = {mContext.startActivity(Intent(mContext , LayoutActivity::class.java )) },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Text(text = "Continue")


    }
        
  }


}






@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}