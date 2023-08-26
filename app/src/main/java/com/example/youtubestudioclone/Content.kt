package com.example.youtubestudioclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Content() {
    MainContent()
}

@Composable
fun MainContent() {
    Column(modifier= Modifier.fillMaxWidth()) {
         ContentScreenTopNavigation()
    }
}

@Composable
fun ContentScreenTopNavigation() {
    val navController = rememberNavController()
    Scaffold(topBar = { TopAppNavigation(navController = navController)}) {
        Box(modifier = Modifier.padding(it)){
            NavHost(navController = navController , startDestination = Videos.route){
                composable(Videos.route){
                    Videos()
                }
                composable(Shorts.route){
                    Shorts()
                }
                composable(Live.route){
                    Live()
                }
                composable(Playlists.route){
                    Playlists()
                }
            }
        }
    }
}

@Composable
fun TopAppNavigation(navController: NavController) {
    val destinationListContent = listOf<ContentDestination>(
        Videos,
        Shorts,
        Live,
        Playlists
    )
    val selectedIndex = rememberSaveable{
        mutableStateOf(0)
    }
    BottomNavigation(backgroundColor = Color(0xff100c0c)){
        destinationListContent.forEachIndexed{indexContent, destinationContent ->
            BottomNavigationItem(
                label = { Text(text = destinationContent.title , fontSize = 10.sp)},
                icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Need to remove it") },
                selected = indexContent == selectedIndex.value,
                selectedContentColor = Color.White,
                onClick = {
                    selectedIndex.value = indexContent
                    navController.navigate(destinationListContent[indexContent].route){
                        popUpTo(Dashboard.route)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Videos() {
    Column(modifier = Modifier
//        .fillMaxSize()
        .background(Color(0xff100c0c))) {
        LazyRow() {
            item {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Sort by", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Visibility", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Views", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Monetization", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Restrictions", color = Color.White, fontSize = 12.sp)
                }
            }
        }
//        Box(modifier = Modifier.weight(1f)) {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
//                items(20) {
////                    Text(text = "Muhammad", color = Color.White, fontSize = 20.sp)
////                    Text(text = "Daniyal", color = Color.White, fontSize = 20.sp)
////                    Text(text = "Khan", color = Color.White, fontSize = 20.sp)
//                }
                items(20) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(5.dp)) {
                            Box(modifier = Modifier
//                                .aspectRatio(16f/9f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.lemon),
                                    contentDescription = "This is for thumbnail",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
//                                        .fillMaxSize()
                                        .width(160.dp)
                                        .height(90.dp)
                                )
                                Row(modifier = Modifier
                                    .align(Alignment.BottomEnd)
                                    .padding(6.dp)) {
                                    Text(
                                        text = "10:00",
                                        color = Color(0xffffffff),
                                        modifier = Modifier
                                            .background(Color(0xff100c0c))
//                                        .align(Alignment.BottomEnd)
                                            .padding(horizontal = 3.dp)
                                    )
                                }
                            }
                        }
                        Column(modifier = Modifier.padding(5.dp)) {
                            Text(text = "Fortnite Gameplay", color = Color(0xffffffff))
                            Text(
                                text = "69 views - 2 hours ago",
                                fontSize = 11.sp ,
                                color = Color(0xffffffff),
                                modifier = Modifier.padding(vertical = 5.dp)
                            )
                            Text(
                                text = "Comment Like Something",
                                color = Color(0xffffffff)
                            )
                        }
                    }
                }
            }
//        }
    }
}

@Composable
fun Shorts() {
    Column(modifier = Modifier
//        .fillMaxSize()
        .background(Color(0xff100c0c))) {
        LazyRow() {
            item {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Sort by", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Visibility", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Views", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Monetization", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Restrictions", color = Color.White, fontSize = 12.sp)
                }
            }
        }
//        Box(modifier = Modifier.weight(1f)) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
//                items(20) {
////                    Text(text = "Muhammad", color = Color.White, fontSize = 20.sp)
////                    Text(text = "Daniyal", color = Color.White, fontSize = 20.sp)
////                    Text(text = "Khan", color = Color.White, fontSize = 20.sp)
//                }
            items(20) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(modifier = Modifier
//                                .aspectRatio(16f/9f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.lemon),
                                contentDescription = "This is for thumbnail",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
//                                        .fillMaxSize()
                                    .width(160.dp)
                                    .height(90.dp)
                            )
//                            Row(modifier = Modifier
//                                .align(Alignment.BottomEnd)
//                                .padding(6.dp)) {
//                                Text(
//                                    text = "10:00",
//                                    color = Color(0xffffffff),
//                                    modifier = Modifier
//                                        .background(Color(0xff100c0c))
////                                        .align(Alignment.BottomEnd)
//                                        .padding(horizontal = 3.dp)
//                                )
//                            }
                        }
                    }
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(text = "Fortnite Gameplay", color = Color(0xffffffff))
                        Text(
                            text = "69 views - 2 hours ago",
                            fontSize = 11.sp ,
                            color = Color(0xffffffff),
                            modifier = Modifier.padding(vertical = 5.dp)
                        )
                        Text(
                            text = "Comment Like Something",
                            color = Color(0xffffffff)
                        )
                    }
                }
            }
        }
//        }
    }
}

@Composable
fun Live() {
    Column(modifier = Modifier
//        .fillMaxSize()
        .background(Color(0xff100c0c))) {
        LazyRow() {
            item {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Sort by", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Visibility", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Views", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Monetization", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Restrictions", color = Color.White, fontSize = 12.sp)
                }
            }
        }
//        Box(modifier = Modifier.weight(1f)) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
//                items(20) {
////                    Text(text = "Muhammad", color = Color.White, fontSize = 20.sp)
////                    Text(text = "Daniyal", color = Color.White, fontSize = 20.sp)
////                    Text(text = "Khan", color = Color.White, fontSize = 20.sp)
//                }
            items(20) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Box(modifier = Modifier
//                                .aspectRatio(16f/9f)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.lemon),
                                contentDescription = "This is for thumbnail",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
//                                        .fillMaxSize()
                                    .width(160.dp)
                                    .height(90.dp)
                            )
                            Row(modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(6.dp)) {
                                Text(
                                    text = "10:00",
                                    color = Color(0xffffffff),
                                    modifier = Modifier
                                        .background(Color(0xff100c0c))
//                                        .align(Alignment.BottomEnd)
                                        .padding(horizontal = 3.dp)
                                )
                            }
                        }
                    }
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(text = "Fortnite Gameplay", color = Color(0xffffffff))
                        Text(
                            text = "69 views - 2 hours ago",
                            fontSize = 11.sp ,
                            color = Color(0xffffffff),
                            modifier = Modifier.padding(vertical = 5.dp)
                        )
                        Text(
                            text = "Comment Like Something",
                            color = Color(0xffffffff)
                        )
                    }
                }
            }
        }
//        }
    }
}

@Composable
fun Playlists() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xff100c0c))) {
        LazyRow() {
            item {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Sort by", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Visibility", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Views", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Monetization", color = Color.White, fontSize = 12.sp)
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF282424)),
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                ) {
                    Text(text = "Restrictions", color = Color.White, fontSize = 12.sp)
                }
            }
        }
    }
}