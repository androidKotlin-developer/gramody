package com.example.gramoday.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gramoday.adapter.ViewPagerAdapter
import com.example.gramoday.databinding.ActivityMainBinding
import com.example.gramoday.model.UserData
import com.example.gramoday.network.ProfileTask
import com.example.gramoday.utils.MySharedPref
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var username: String? = null
    private var userData: UserData? = null
    private val mySharedPref = MySharedPref("UserData", Context.MODE_PRIVATE, this)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        if (Intent.ACTION_VIEW == intent.action) {
            handleIntent(intent)
            ProfileTask(this, username!!).execute()
            val handler = Handler()
            val monitor = Runnable {
                userData = mySharedPref.getSerializable("data", null, UserData::class.java)
                init()

            }
            handler.postDelayed(monitor,3000)


        }else {
            username = "mmtradingco"
            ProfileTask(this, username!!).execute()
            val mHandler = Handler()
            val monitor = Runnable {
                userData = mySharedPref.getSerializable("data", null, UserData::class.java)
                init()
            }
            mHandler.postDelayed(monitor, 3000)

        }

    }

    private fun handleIntent(intent: Intent?) {
        val appLinkAction: String? = intent?.action
        val appLinkData: Uri? = intent?.data
        showDeepLink(appLinkAction, appLinkData)
    }

    private fun showDeepLink(appLinkAction: String?, appLinkData: Uri?) {
        if (Intent.ACTION_VIEW == appLinkAction && appLinkData != null) {
            val promotionCode1: List<String> = appLinkData.pathSegments
            if (promotionCode1.isNotEmpty()) {
                username = promotionCode1[promotionCode1.size - 1]


            }
        } else {
            Toast.makeText(this, "No PathSegment", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStop() {
        super.onStop()
       // Toast.makeText(this, "data delete", Toast.LENGTH_SHORT).show()
      //  mySharedPref.deleteExtra("data")
    }

    @SuppressLint("SetTextI18n")
    fun init(){
        binding.pbProg.visibility = View.GONE
        binding.llProfile.visibility = View.VISIBLE
        binding.username.text = userData!!.name
        binding.usercity.text = "${userData!!.loclevel3Name} + ${userData!!.loclevel2Name}"
        binding.language.text = userData!!.language
        val adapter = ViewPagerAdapter(this, supportFragmentManager, lifecycle)

        binding.viewPager2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "BUSINESS"
                }
                1 -> {
                    tab.text = "REVIEW"
                }
            }
        }.attach()
    }
}
