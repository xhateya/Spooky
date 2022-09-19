package com.xhateya.idn.spooky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xhateya.idn.spooky.data.SpookiesContent
import com.xhateya.idn.spooky.data.SpookiesContentObject
import com.xhateya.idn.spooky.ui.DetailSpookyActivity
import com.xhateya.idn.spooky.ui.ListSpookyAdapter
import com.xhateya.idn.spooky.ui.SpookiezActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvSpooky: RecyclerView
    private var list: ArrayList <SpookiesContent> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSpooky = findViewById(R.id.rv_spooky)
        rvSpooky.setHasFixedSize(true)
        list.addAll(SpookiesContentObject.listContent)
        showRecyclerList()

    }


    private fun showRecyclerList() {
        rvSpooky.layoutManager = LinearLayoutManager(this)
        val listSpookyAdapter = ListSpookyAdapter(list)
        rvSpooky.adapter =listSpookyAdapter

        listSpookyAdapter.setOnItemClickCallback(object : ListSpookyAdapter.OnItemClickCallback{
            override fun onItemClickedData(content: SpookiesContent) {
                showSelectedSpookies(content)
            }


        })
    }


    private fun showSelectedSpookies(content: SpookiesContent) {
        val detailSpookyActivity=
            Intent(this@MainActivity, DetailSpookyActivity::class.java).apply{
                putExtra(DetailSpookyActivity.EXTRA_PICTURE,content.picture)
                putExtra(DetailSpookyActivity.EXTRA_TITLE,content.title)
                putExtra(DetailSpookyActivity.EXTRA_REVIEW,content.review)
                putExtra(DetailSpookyActivity.EXTRA_STORIES,content.stories)

            }
        startActivity(detailSpookyActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            
            R.id.action_user ->{
                val moveIntent = Intent(this@MainActivity, SpookiezActivity::class.java)
                moveIntent.putExtra(SpookiezActivity.EXTRA_PROFILE, R.drawable.pp)
                moveIntent.putExtra(SpookiezActivity.EXTRA_EMAIL, "natheya36@gmail.com")
                moveIntent.putExtra(SpookiezActivity.EXTRA_USER, "Nabila Ateya Nasayu Salim")


                startActivity(moveIntent)


            }
            
        }

    }




}