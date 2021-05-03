package com.example.viewpager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter


class FruitPagerAdapter(private val list: ArrayList<Fruit>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(container.context)
        val view = inflater.inflate(R.layout.layout_fruit, container, false);

        val tvItemTitle : TextView = view.findViewById(R.id.tvItemTitle)
        val ivItem : ImageView = view.findViewById(R.id.ivItem)
        val tvItemContent  : TextView = view.findViewById(R.id.tvItemContent)

        tvItemTitle.text = list[position].name
        //ivItem.setImageResource(list[position].getImageId(container.context))
        tvItemContent.text = list[position].content

        container.addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        container.removeView(obj as View?)
    }

    override fun isViewFromObject(view: View, obj: Any): Boolean {
        return view == obj
    }

    override fun getCount(): Int {
        return list.size
    }
}