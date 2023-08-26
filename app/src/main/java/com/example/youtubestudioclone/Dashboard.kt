package com.example.youtubestudioclone

import android.widget.Toast
import androidx.annotation.Dimension
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Dashboard() {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xff100c0c))){
        item {
//            TopNavigation()
//            Divider(color = Color.Gray , thickness = 1.dp)
            ChannelNameInfo()
            ChannelAnalytics()
        }
        items(10){
            LatestPublicContent()
        }
    }
}


@Composable
fun TopNavigation() {
    val context = LocalContext.current
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff100c0c))
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.mainlogoofficial),
                contentDescription = "Top Navigation Logo",
                modifier = Modifier.size(40.dp)
            )
//        Spacer(Modifier.weight(1f))
            IconButton(
                onClick = {
                    Toast.makeText(context, "Functionality will be implemented soon." , Toast.LENGTH_SHORT).show()
                },
//            modifier = Modifier.padding( 5.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.channellogo),
                    contentDescription = "Right channel logo",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                )
            }

        }
    Divider(color = Color.Gray , thickness = 1.dp)
}


@Composable
fun ChannelNameInfo() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xff100c0c))){
        Column(modifier = Modifier.padding(20.dp)) {
            Image(
                painter = painterResource(id = R.drawable.channellogo),
                contentDescription = "Channel Logo",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
            )
        }
        Column() {
            Text(
                text = "FD Gaming",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp) ,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "2,753",
                fontSize = 25.sp,
                modifier = Modifier.padding(horizontal = 10.dp) ,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Total Subscribers",
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 10.dp) ,
                color = Color.White,
//                fontWeight = FontWeight.Bold
            )
        } 
    }
}


@Composable
fun ChannelAnalytics() {
    val context = LocalContext.current
    val screenWidth = with(LocalContext.current) {
        resources.displayMetrics.widthPixels / resources.displayMetrics.density
    }.dp
    Column(modifier = Modifier.padding(vertical = 20.dp)) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xff100c0c))
//                .padding(horizontal = 10.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Channel analytics",
                color = Color.White,
                modifier = Modifier.padding(horizontal = 15.dp)
            )
            Text(
                text = "Last 28 days",
                color = Color.White,
                fontSize = 12.sp ,
                modifier = Modifier.padding(horizontal = 15.dp))
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xff100c0c))
//            .padding(horizontal = 10.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

//            Column(modifier = Modifier.widthIn(max = Dimension.fillMaxWidth() / 2)) {
            Column(modifier = Modifier.width(screenWidth / 2)) {
//            Column(modifier = Modifier.width((LocalConfiguration.current.screenWidthDp.dp / 2)) {
                Button(
                    onClick = {
                        Toast.makeText(context, "Functionality will be implemented soon." , Toast.LENGTH_SHORT).show()
                              },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp)
                ) {
                    Text(text = "Last 7 days", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = {
                        Toast.makeText(context, "Functionality will be implemented soon." , Toast.LENGTH_SHORT).show()
                    },                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp)
                ) {
                    Text(text = "Last 7 days", color = Color.White, fontSize = 12.sp)
                }
            }
            Column(modifier = Modifier.width(screenWidth / 2)) {
                Button(
                    onClick = {
                        Toast.makeText(context, "Functionality will be implemented soon." , Toast.LENGTH_SHORT).show()
                    },                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp)
                ) {
                    Text(text = "Last 7 days", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = {
                        Toast.makeText(context, "Functionality will be implemented soon." , Toast.LENGTH_SHORT).show()
                    },                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp)
                ) {
                    Text(text = "Last 7 days", color = Color.White, fontSize = 12.sp)
                }
            }
        }
        Text(text = "Latest published content", fontSize = 20.sp , color = Color.White , fontWeight = FontWeight.Bold , modifier = Modifier.padding(vertical = 20.dp))
    }
}


@Composable
fun LatestPublicContent() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xff100c0c))) {
        Card(elevation = 32.dp , modifier = Modifier
            .background(Color(0xff100c0c))
            .padding(15.dp)
            .clip(RoundedCornerShape(24.dp))
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF282424))){
                Row(modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(R.drawable.channellogo), contentDescription = "Video thumbnail",
                        modifier = Modifier
                            .size(60.dp)
                            .padding(15.dp)
                    )
                    Text(text = "Fortnite SOlo High Intenstity Match", color = Color.White , modifier = Modifier.padding(15.dp))
                }
                Divider(color = Color.Gray , thickness = 1.dp)
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Daniayl" , color = Color.White)
                }
                Divider(color = Color.Gray , thickness = 1.dp)
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Daniayl" , color = Color.White)
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Daniayl" , color = Color.White)
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Daniayl" , color = Color.White)
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text("Daniayl" , color = Color.White)
                }
            }
        }
    }
}