package com.akbarmd.music_app.views.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akbarmd.music_app.R
import com.akbarmd.music_app.databinding.ActivityMainBinding
import com.akbarmd.music_app.views.mytracks.MyTracksFragment
import com.akbarmd.music_app.views.topalbums.TopAlbumsFragmens
import com.akbarmd.music_app.views.topchars.TopCharsFragment
import com.akbarmd.music_app.views.users.UserFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val items = binding.btNavigationMain.getSelectedItemId()
        /*
        saat backPress ditekan jika posisi menu berada pada top chars maka akan langsung keluar aplikasi
        jika posisi menu tidak pada top chars maka akan kembali pada top chars
         */
        if (items == R.id.action_top_charts) {
            finishAffinity()
        } else {
            openHomeFragment()
        }
    }

    private fun init() {
        //setup nav bar
        binding.btNavigationMain.setOnItemSelectedListener { id ->
            when (id) {
                R.id.action_top_charts -> openFragment(TopCharsFragment())
                R.id.action_my_tracks -> openFragment(MyTracksFragment())
                R.id.action_top_album -> openFragment(TopAlbumsFragmens())
                R.id.action_user -> openFragment(UserFragment())
            }
        }
        openHomeFragment()
    }

    private fun openHomeFragment() {
        binding.btNavigationMain.setItemSelected(R.id.action_top_charts)
    }

    private fun openFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_main, fragment)
            .addToBackStack(null)
            .commit()
    }

}