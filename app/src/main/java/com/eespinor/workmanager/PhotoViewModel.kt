package com.eespinor.workmanager

import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.util.UUID

class PhotoViewModel : ViewModel (){

    var uncompressUri: Uri? by mutableStateOf(null)
        private set

    var compressBitmap: Bitmap? by mutableStateOf(null)
        private set

    var workId: UUID? by mutableStateOf(null)
        private set

    fun updateUncompressUri(uri:Uri?){
        uncompressUri = uri
    }

    fun updateCompressBitmap(bitmap:Bitmap?){
        compressBitmap = bitmap
    }

    fun updateWorkId(uuid:UUID?){
        workId = uuid
    }

}