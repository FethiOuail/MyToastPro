package com.anwarkamel.ouail.mytoastpro

import android.content.Context
import android.widget.Toast

object AwesomeToast {

    fun showToast(context: Context) {
        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
    }

}