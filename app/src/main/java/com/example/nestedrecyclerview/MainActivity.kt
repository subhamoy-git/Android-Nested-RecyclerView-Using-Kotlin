package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nestedrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mList: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainRecyclerView.setHasFixedSize(true)
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)

        mList = ArrayList()
        prepareData()

        val adapter = ParentAdapter(mList)
        binding.mainRecyclerView.adapter = adapter
    }

    private fun prepareData() {

        val clothingList = ArrayList<RecyclerItem>()
        clothingList.add(RecyclerItem(R.drawable.cloth1 , "Up to 20% off"))
        clothingList.add(RecyclerItem(R.drawable.cloth2, "Up to 15% off"))
        clothingList.add(RecyclerItem(R.drawable.cloth3, "Up to 45% off"))
        clothingList.add(RecyclerItem(R.drawable.cloth4, "Up to 25% off"))
        clothingList.add(RecyclerItem(R.drawable.cloth5, "Up to 70% off"))
        clothingList.add(RecyclerItem(R.drawable.cloth6, "Up to 42% off"))

        val shoesList = ArrayList<RecyclerItem>()
        shoesList.add(RecyclerItem(R.drawable.shoes1, "Up to 29% off"))
        shoesList.add(RecyclerItem(R.drawable.shoes2, "Up to 30% off"))
        shoesList.add(RecyclerItem(R.drawable.shoes3, "Up to 35% off"))
        shoesList.add(RecyclerItem(R.drawable.shoes4, "Up to 55% off"))
        shoesList.add(RecyclerItem(R.drawable.shoes5, "Up to 40% off"))
        shoesList.add(RecyclerItem(R.drawable.shoes6, "Up to 30% off"))

        val furnitureList = ArrayList<RecyclerItem>()
        furnitureList.add(RecyclerItem(R.drawable.fur1, "Up to 80% off"))
        furnitureList.add(RecyclerItem(R.drawable.fur2, "Up to 50% off"))
        furnitureList.add(RecyclerItem(R.drawable.fur3, "Up to 75% off"))
        furnitureList.add(RecyclerItem(R.drawable.fur4, "Up to 65% off"))
        furnitureList.add(RecyclerItem(R.drawable.fur5, "Up to 60% off"))
        furnitureList.add(RecyclerItem(R.drawable.fur6, "Up to 55% off"))

        val electronicList = ArrayList<RecyclerItem>()
        electronicList.add(RecyclerItem(R.drawable.tec1, "Up to 21% off"))
        electronicList.add(RecyclerItem(R.drawable.tec2, "Up to 30% off"))
        electronicList.add(RecyclerItem(R.drawable.tec3, "Up to 35% off"))
        electronicList.add(RecyclerItem(R.drawable.tec4, "Up to 25% off"))
        electronicList.add(RecyclerItem(R.drawable.tec5, "Up to 30% off"))
        electronicList.add(RecyclerItem(R.drawable.tec6, "Up to 45% off"))

        mList.add(DataItem(DataItemType.BEST_SELLING_ITEMS, clothingList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.banner1)))
        mList.add(DataItem(DataItemType.OTHER_ITEMS, shoesList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.banner2)))
        mList.add(DataItem(DataItemType.BEST_SELLING_ITEMS, furnitureList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.banner3)))
        mList.add(DataItem(DataItemType.OTHER_ITEMS, electronicList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.banner6)))
    }
}