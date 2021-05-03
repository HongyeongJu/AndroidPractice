package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = FruitPagerAdapter(fruitList)
        val mViewPager : ViewPager = findViewById(R.id.mViewPager)

        mViewPager.adapter = adapter
    }

    companion object{
        val fruitList = arrayListOf(
            Fruit("Banana", "banana", "A banana is an edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa."),
            Fruit("Strawberry", "strawberry", "The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries, which are cultivated worldwide for their fruit."),
            Fruit("Tangerine", "tangerine", "The tangerine is a group of orange-colored citrus fruit consisting of hybrids of mandarin orange."),
            Fruit("Plum", "plum", "A plum is a fruit of the subgenus Prunus of the genus Prunus.")
        )
    }
}