package com.loki.moduleapp.di

import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.loki.core.routing.Router
import routing.StreamRouting

val mainActivityModule = Kodein.Module(allowSilentOverride = true) {
    bind<Router>() with instance(StreamRouting())
}