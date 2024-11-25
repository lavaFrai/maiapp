package ru.lavafrai.maiapp.platform

import androidx.compose.ui.Modifier
import com.russhwolf.settings.Settings
import io.ktor.client.engine.*
import io.ktor.client.engine.android.*
import ru.lavafrai.maiapp.data.Storage

actual fun getPlatformName(): String {
    return "Android"
}

actual fun getPlatformKtorEngine(): HttpClientEngineFactory<*> {
    return Android
}

actual fun Modifier.pointerCursor(): Modifier = this

actual fun getPlatformDispatchers(): Dispatchers = Dispatchers(
    IO = kotlinx.coroutines.Dispatchers.IO,
    Main = kotlinx.coroutines.Dispatchers.Main,
    Default = kotlinx.coroutines.Dispatchers.Default
)

actual fun getPlatformSettingsStorage(): Settings = Settings()