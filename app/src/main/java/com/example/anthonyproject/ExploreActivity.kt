package com.example.anthonyproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.anthonyproject.ui.theme.AnthonyProjectTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column(modifier = Modifier
        .fillMaxSize()) {
        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Cities", color = Color.Black)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext , LayoutActivity::class.java )) }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "arrowback",
                        tint = Color.Black)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "share",
                        tint = Color.Black)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "add",
                        tint = Color.Black)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share",
                        tint = Color.Black)
                }
            })
        //end of TopAppBar
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())) {
            androidx.compose.material3.Text(
                text = "Tickets",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(start = 20.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "Tokyo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorrite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)
                    Spacer(modifier = Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.338,000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue)
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0722149987".toUri()
                            mContext.startActivity(callIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Call")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        OutlinedButton(onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tony.kyalo06@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Email")}

                    }
                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "Tokyo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorrite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)
                    Spacer(modifier = Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.338,000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue)
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0722149987".toUri()
                            mContext.startActivity(callIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Call")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        OutlinedButton(onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tony.kyalo06@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Email")}

                    }
                }
                //End of Column2
            }
            //End of Row 1
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.china), contentDescription = "Tokyo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorrite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)
                    Spacer(modifier = Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.338,000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue)
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0722149987".toUri()
                            mContext.startActivity(callIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Call")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        OutlinedButton(onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tony.kyalo06@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Email")}

                    }
                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.img_3), contentDescription = "Tokyo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorrite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)
                    Spacer(modifier = Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.338,000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue)
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0722149987".toUri()
                            mContext.startActivity(callIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Call")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        OutlinedButton(onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tony.kyalo06@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Email")}

                    }
                }
                //End of Column2
            }
            //  End of Row 2
            //Start of Row 3
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "Tokyo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorrite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)
                    Spacer(modifier = Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.338,000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue)
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0722149987".toUri()
                            mContext.startActivity(callIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Call")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        OutlinedButton(onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tony.kyalo06@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Email")}

                    }
                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "Tokyo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "favorrite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp))
                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Colosseum",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "start", tint = Color.Blue)
                    }
                    Spacer(modifier = Modifier.height(3.dp))
                    androidx.compose.material3.Text(
                        text = "443 reviews",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)
                    Spacer(modifier = Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "From Ksh.338,000",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue)
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        OutlinedButton(onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0722149987".toUri()
                            mContext.startActivity(callIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Call")
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        OutlinedButton(onClick = { val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("tony.kyalo06@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Application for a job")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent) }) {
                            androidx.compose.material3.Text(
                                text = "Email")}

                    }
                }
                //End of Column3
            }
            //End of Row 3

        }


    }

}
@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}