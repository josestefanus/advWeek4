package id.ac.ubaya.informatika.advweek4.view

import android.view.View
import id.ac.ubaya.informatika.advweek4.model.Student

interface ButtonDetailClickListener {
    fun onButtonDetailClick(v:View)
}

interface ButtonUpdateClickListener {
    fun onButtonUpdateClick(v: View)
}

interface ButtonNotificationClickListener {
    fun onButtonNotificationClick(v: View, obj: Student)
}