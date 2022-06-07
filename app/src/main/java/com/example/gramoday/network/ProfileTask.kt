package com.example.gramoday.network

import android.content.Context
import android.os.AsyncTask
import com.example.gramoday.model.UserData
import com.example.gramoday.utils.MySharedPref
import com.google.gson.GsonBuilder
import java.net.URL

class ProfileTask( private val context: Context, private val username : String) : AsyncTask<String, String, String>() {

    val mySharedPref = MySharedPref("UserData",Context.MODE_PRIVATE,context)
    var userData : UserData? = null
    override fun doInBackground(vararg params: String?): String {
        var response: String?
        try {
            response =
                URL("https://api.gramoday.net:8082/v1/user/bySlug?profileSlug=$username").readText(
                    Charsets.UTF_8
                )
        } catch (e: Exception) {
            response = null
        }




        return response.toString()
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        val gsonBuilder = GsonBuilder()
        val gson = gsonBuilder.create()
        userData= gson.fromJson(result, UserData::class.java)
        mySharedPref.putSerializable("data",userData)



    }
}
