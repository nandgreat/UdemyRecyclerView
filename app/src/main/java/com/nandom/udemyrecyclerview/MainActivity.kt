package com.nandom.udemyrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fruitsList = listOf(Fruit("Banana","Nandom"), Fruit("Orange","Nandom"), Fruit("Pineapple","Nandom"), Fruit("Mango","Nandom"), Fruit("Lemon","Nandom"), Fruit("Grape Fruit", "Nandom"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.setBackgroundColor(Color.YELLOW)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerviewAdapter(fruitsList, {selectedFruitItem: Fruit->listItemClicked(selectedFruitItem)})
    }

    private fun listItemClicked(fruit: Fruit){
        Toast.makeText(this, "Supplier name is ${fruit.supplier}", Toast.LENGTH_SHORT).show()
    }
}