package com.example.youtubestudioclone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface ContentDestination{
    val route: String
    val title: String
}
object Videos:ContentDestination{
    override val route = "Videos"
    override val title = "Videos"
}
object Shorts:ContentDestination{
    override val route = "Shorts"
    override val title = "Shorts"
}
object Live:ContentDestination{
    override val route = "Live"
    override val title = "Live"
}
object Playlists:ContentDestination{
    override val route = "Playlists"
    override val title = "Playlists"
}