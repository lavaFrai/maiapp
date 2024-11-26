package ru.lavafrai.maiapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.dokar.sonner.Toaster
import com.dokar.sonner.rememberToasterState
import ru.lavafrai.maiapp.fragments.LocalToaster
import ru.lavafrai.maiapp.fragments.ToasterProvider
import ru.lavafrai.maiapp.navigation.AppNavigation
import ru.lavafrai.maiapp.navigation.Pages
import ru.lavafrai.maiapp.platform.getPlatformSettingsStorage
import ru.lavafrai.maiapp.theme.AppTheme
import ru.lavafrai.maiapp.theme.LocalThemeIsDark

@Composable
internal fun App() = AppTheme {
    val navController = rememberNavController()
    val toaster = rememberToasterState()
    val applicationContext = ApplicationContext(
        panicCleanup = {
            navController.navigate(Pages.Greeting) { popUpTo(0) }
            getPlatformSettingsStorage().clear()
        },
    )

    CompositionLocalProvider(LocalApplicationContext provides applicationContext) {
        AppNavigation(
            navController = navController,
            modifier = Modifier
                .fillMaxSize(),
        )
    }

    Toaster(
        state = toaster,
        alignment = Alignment.BottomCenter,
        darkTheme = LocalThemeIsDark.current.value,
    )
}
