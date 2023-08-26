package com.example.youtubestudioclone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector


interface Destinations{
    val route: String
    val icon: ImageVector
    val title: String
}
object Dashboard:Destinations{
    override val route = "Dashboard"
    override val icon = Icons.Filled.Home
    override val title = "Dashboard"
}
object Content:Destinations{
    override val route = "Content"
    override val icon = Icons.Filled.Settings
    override val title = "Content"
}
object Analytics:Destinations{
    override val route = "Analytics"
    override val icon = Icons.Filled.Settings
    override val title = "Analytics"
}
object Comments:Destinations{
    override val route = "Comments"
    override val icon = Icons.Filled.Settings
    override val title = "Comments"
}
object Earn:Destinations{
    override val route = "Earn"
    override val icon = Icons.Filled.Settings
    override val title = "Earn"
}