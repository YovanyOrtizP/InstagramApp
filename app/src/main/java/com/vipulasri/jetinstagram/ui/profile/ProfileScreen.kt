package com.vipulasri.jetinstagram.ui.profile

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileScreen(names: List<String> = List(15) { "$it" }) {
    val scrollState = rememberScrollState()
    Scaffold(
        topBar = { ProfileToolbar() }
    ) {
        Column() {
            ProfileFollowers()
            ProfileInfo()
            LazyRow(){
                items(items = names) { name ->
                    StoryImageProfile()
                }
            }
            ProfilePosts()
        }


    }
}