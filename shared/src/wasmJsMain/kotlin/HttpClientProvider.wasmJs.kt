package ru.lavafrai.maiapp

import io.ktor.client.engine.*
import io.ktor.client.engine.js.*

actual fun platformHttpClientProvider(): HttpClientEngineFactory<*> = Js