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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anthonyproject.ui.theme.AnthonyProjectTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Composable
fun Home(){
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 120.dp)) {
            Row {
                Image(painter = painterResource(id = R.drawable.print), contentDescription ="print",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop)
                androidx.compose.material3.Text(
                    text = "Woof",
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    modifier = Modifier
                        .fillMaxWidth())
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Card1
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.faye), contentDescription ="faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Koda",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card1
        //Card2
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.tzeitel), contentDescription ="Lola",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Lola",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "16 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card2
        //Card3
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.koda), contentDescription ="koda",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Frankie",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card3
        //Card4
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.lola), contentDescription ="lola",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Nox",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "8 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card4
        //Card5
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.nox), contentDescription ="nox",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Faye",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "8 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card5
        //Card6
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.faye), contentDescription ="faye",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Bella",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "14 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card6
        //Card7
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.bella), contentDescription ="bella",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Moana",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "2 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card7
        //Card8
        Spacer(modifier = Modifier.height(10.dp))
        Card(modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
            .height(70.dp)
            .fillMaxWidth()) {
            Row {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.moana), contentDescription ="moana",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(shape = CircleShape)
                            .padding(start = 1.dp, top = 4.dp),


                        contentScale = ContentScale.Crop)
                    Column {
                        androidx.compose.material3.Text(
                            text = "Tzeitel",
                            fontWeight = FontWeight.Bold,
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 100.dp, top = 4.dp))
                        androidx.compose.material3.Text(
                            text = "7 years old",
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(start = 100.dp))

                    }
                }
            }


        }
        //End of card8


    }




}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    Home()
}