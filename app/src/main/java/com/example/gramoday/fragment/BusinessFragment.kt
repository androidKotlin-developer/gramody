package com.example.gramoday.fragment

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gramoday.databinding.FragmentBusinessBinding
import com.example.gramoday.model.UserData
import com.example.gramoday.utils.MySharedPref
import org.json.JSONObject
import java.net.URL


class BusinessFragment(context: Context) : Fragment() {

    lateinit var binding: FragmentBusinessBinding
    val mySharedPref = MySharedPref("UserData",Context.MODE_PRIVATE,context)
    val userData = mySharedPref.getSerializable("data",null,UserData::class.java)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBusinessBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.useroption.text = userData.business.userOption
        binding.firmName.text = userData.business.firmName
        binding.marketName.text = userData.business.marketStdName
        binding.shopNumber.text = userData.business.mandiShopnum

        return root


    }


}
