package com.example.debugnavigationsinglefragment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.debugnavigationsinglefragment.customview.BottomNavigation
import com.example.debugnavigationsinglefragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainActivity: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivity.root)



//        mainActivity.bottomNavigationViewId.apply {
//            setContent(
//                listOf(
//                    BottomNavigation.Item(
//                        R.drawable.ic_user_black,
//                        name = "user"
//                    ) {
//                        Toast.makeText(this@MainActivity, "user", Toast.LENGTH_SHORT).show()
//                        true
//                    },
//                    BottomNavigation.Item(R.drawable.ic_shopping_black, "shopping") { true },
//                    BottomNavigation.Item(R.drawable.ic_category_black, "category") { true },
//                    BottomNavigation.Item(R.drawable.home_black, "home") { true },
//                )
//            )
//            selectable = true
//            selectedItem = 2
//
//        }

    }
}