package com.example.debugnavigationsinglefragment.customview

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.debugnavigationsinglefragment.R

class BottomNavigation @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayoutCompat(context, attrs) {
    data class Item(
        val imageIdBlack: Int,
        val name: String,
        val onClick: () -> Boolean
    )

    var selectable: Boolean = true
        set(value) {
            field = value
        }

    private var list: List<Item>? = null
    var selectedColor = Color.argb(255, 0, 100, 255)
        set(value) {
            field = value
            update()
        }
    var unselectedColor = Color.GRAY
        set(value) {
            field = value
            update()
        }

    var selectedItem: Int = 0
        set(value) {
            field = value
            update()
        }

    fun createView(context: Context, item: Item): View? {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.bottom_navigation_item, null)
        view.rootView.apply {
            setOnClickListener {
                if (item.onClick() && selectable) {
                    selectedItem = (list!!.indexOf(item))
                }
            }
        }
        val tintColor = if (list!!.indexOf(item) == selectedItem) {
            selectedColor
        } else unselectedColor
        view.rootView.apply {
            layoutParams = LayoutParams(0, -2).apply {
                weight = 1f
            }
        }
        view.findViewById<ImageView>(R.id.navigation_bottom_image_view).apply {
            setImageResource(item.imageIdBlack)
            setColorFilter(tintColor)
        }
        view.findViewById<TextView>(R.id.navigation_bottom_text_view).apply {
            text = item.name
            setTextColor(tintColor)
        }
        return view
    }

    fun setContent(list: List<Item>) {
        this.list = list
        init(context)
    }

    fun init(context: Context) {
        try {
            removeAllViews()
        } catch (e: Exception) {

        }
        list?.forEach {
            addView(createView(context, it))
        }
    }

    fun update() {
        val item = list!!.get(selectedItem)
        list!!.indices.forEach {
            getChildAt(it).apply {
                val tint = if (it == selectedItem) selectedColor else unselectedColor
                findViewById<ImageView>(R.id.navigation_bottom_image_view)
                    .setColorFilter(tint)
                findViewById<TextView>(R.id.navigation_bottom_text_view).setTextColor(tint)
            }
        }
    }

    init {
        layoutParams = LayoutParams(-1, -2)
        orientation = HORIZONTAL

    }
}