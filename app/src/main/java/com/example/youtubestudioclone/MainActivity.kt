package com.example.youtubestudioclone

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ExitToApp
//import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MainScreen()
//            CheckingSomething()
//            PasswordTextField()
//            val title = "See You Again"
//            val body = "Damn, who knew?\n" +
//                    "All the planes we flew, good things we been through\n" +
//                    "That I'd be standing right here talking to you\n" +
//                    "'Bout another path, I know we loved to hit the road and laugh\n" +
//                    "But something told me that it wouldn't last\n" +
//                    "Had to switch up, look at things different, see the bigger picture\n" +
//                    "Those were the days, hard work forever pays\n" +
//                    "Now I see you in a better place (see you in a better place)\n" +
//                    "Uh\n" +
//                    "How can we not talk about family when family's all that we got?\n" +
//                    "Everything I went through, you were standing there by my side\n" +
//                    "And now you gon' be with me for the last ride"
//            ExpandableCard(title = title, body = body)
//            Surface(color = MaterialTheme.colors.background) {
//                Greeting("World")
//            }
//            MyComponent()
//            BoxPracticeChecking()
//            TextComposableChecking()
//            TestingTheDarkAndLightColorPalette()
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun TestingTheDarkAndLightColorPalette() {
//    Column() {
//        Text(text = "Daniyal" , fontSize = 40.sp , color = MaterialTheme.colorScheme.primary)
//    }
////    Column {Text(text = "Daniyal" , color = MaterialTheme.colors.primary)
////        if(isSystemInDarkTheme()){
////            Text(text = "Dark Mode" , color = Color.Black)
////        }
////        else{
////            Text(text = "Light Mode" , color = Color.Blue)
////       }
////    }
//}



//@Composable
//fun TextComposableChecking() {
//    Column(modifier = Modifier.fillMaxSize()) {
//        Text(
//            text = stringResource(id = R.string.app_name),
//            fontSize = 20.sp,
//            modifier = Modifier
//                .background(MaterialTheme.colors.primary)
//                .padding(16.dp)
//        )
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun BoxPracticeChecking() {
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.TopCenter
//    ){
//        Box(
//            modifier = Modifier
//                .background(Color.Blue)
//                .width(100.dp)
//                .height(100.dp)
//                .verticalScroll(rememberScrollState())
//        ){
//            Text(text = "Muhammad Daniyal Khan", fontSize = 40.sp)
//        }
//    }
//}

@Composable
fun MyComponent() {
    Surface(
        color = Color.White,
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        val context = LocalContext.current
        // Composables inside the Surface
        Column {
            Text(text = "Hello, Jetpack Compose!")
            Button(onClick = {
                Toast.makeText(
                    context,
                    "Button Clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Text(text = "Click me")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
//    Text(text = "Hello $name", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold))
    Text(text = "Hello $name", style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp , fontWeight = FontWeight.Bold))
}


//@Composable
//fun FirstScreen(
//    myViewModel: MyViewModel = viewModel()
//) {
//    val name: String by
//            myViewModel.name.observeAsState("")
//
//    ScreenContent(
//        name = name,
//        onNameChange = {
//            myViewModel.onNameChanged(it)
//        }
//    )
//}

@Composable
fun ExpandableCard(title: String , body: String) {
    var expanded by remember { mutableStateOf(false) }
    Card{
        Column(modifier = Modifier.width(IntrinsicSize.Max)){
//        Column(modifier = Modifier.fillMaxWidth()){
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            if(expanded){
                Text(text = body)
                IconButton(onClick = {expanded = false}){
                    Icon(Icons.Default.Share , contentDescription = "Collapse")
                }
            }else{
                IconButton(onClick={expanded = true}){
                    Icon(Icons.Default.ExitToApp , contentDescription = "Expand")
                }
            }
        }
    }
}

@Composable
fun PasswordTextField() {
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Enter Password", style = MaterialTheme.typography.h6)

        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface
            )
        )
    }
}

@Composable
fun CheckingSomething() {
    var valuee by rememberSaveable{ mutableStateOf(false)}
    Button(onClick = { valuee = !valuee }) {
        Text(text = "$valuee")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun MyTopAppBar() {
//    TopAppBar(
//        title = { Text(text = "My App") },
//        backgroundColor = Color.Blue,
//        contentColor = Color.White,
//        navigationIcon = {
//            IconButton(onClick = { /* Handle navigation icon click */ }) {
//                Icon(Icons.Filled.Menu, contentDescription = "Menu")
//            }
//        },
//        actions = {
//            IconButton(onClick = { /* Handle action 1 click */ }) {
//                Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
//            }
//            IconButton(onClick = { /* Handle action 2 click */ }) {
//                Icon(Icons.Filled.Share, contentDescription = "Share")
//            }
//        }
//    )
//}

@Composable
fun MainScreen() {
    Column {
        TopNavigation()
        MyApp()
    }
}

@Composable
fun MyApp(){
    val navController = rememberNavController()
    Scaffold(bottomBar = { MyBottomNavigation(navController = navController)}) {
        Box(modifier = Modifier.padding(it)){
            NavHost(navController = navController , startDestination = Dashboard.route){
                composable(Dashboard.route){
                    Dashboard()
                }
                composable(Content.route){
                    Content()
                }
                composable(Analytics.route){
                    Text(text = "Analytics Screen Daniyal" , color = Color.Black)
                }
                composable(Comments.route){
                    Text(text = "Comments Screen Daniyal" , color = Color.Black)
                }
                composable(Earn.route){
                    Text(text = "Earn Screen Daniyal" , color = Color.Black)
                }
            }
        }
    }
}

@Composable
fun MyBottomNavigation(navController: NavController){
    val destinationList = listOf<Destinations>(
        Dashboard,
        Content,
        Analytics,
        Comments,
        Earn
    )
    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
    }
    BottomNavigation(backgroundColor = Color.Black){
        destinationList.forEachIndexed{index, destination ->
            BottomNavigationItem(
                label = { Text(text = destination.title , fontSize = 10.sp)},
                icon = { Icon(imageVector = destination.icon, contentDescription = destination.title) },
                selected = index == selectedIndex.value,
                selectedContentColor = Color.White,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationList[index].route){
                        popUpTo(Dashboard.route)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}