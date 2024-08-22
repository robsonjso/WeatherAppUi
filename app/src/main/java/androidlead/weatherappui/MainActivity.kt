package androidlead.weatherappui

import android.os.Bundle
import androidlead.weatherappui.ui.screen.WeatherScreen
import androidlead.weatherappui.ui.theme.WeatherAppUiTheme
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherAppUiTheme {
                WeatherScreen()
            }
        }
    }
}
