package screens.home.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun HomeScreen(
    navigator: Navigator
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            "Home"
        )
    }
}