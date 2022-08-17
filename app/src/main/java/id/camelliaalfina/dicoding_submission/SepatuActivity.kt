package id.camelliaalfina.dicoding_submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SepatuActivity : AppCompatActivity() {
    private lateinit var rvSepatu: RecyclerView
    private var list: ArrayList<Sepatu> = arrayListOf()
    private var title: String = "Mode List"

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sepatu)
        setActionBarTitle(title)

        rvSepatu = findViewById(R.id.rv_sepatu)
        rvSepatu.setHasFixedSize(true)

        list.addAll(SepatuData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)
    }

    private fun showRecyclerList() {
        rvSepatu.layoutManager = LinearLayoutManager(this)
        val listSepatuAdapter = ListSepatuAdapter(list)
        rvSepatu.adapter = listSepatuAdapter

        listSepatuAdapter.setOnItemClickCallback(object : ListSepatuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Sepatu) {
                showSelectedSepatu(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvSepatu.layoutManager = GridLayoutManager(this, 2)
        val gridSepatuAdapter = GridSepatuAdapter(list)
        rvSepatu.adapter = gridSepatuAdapter

        gridSepatuAdapter.setOnItemClickCallback(object : GridSepatuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Sepatu) {
                showSelectedSepatu(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvSepatu.layoutManager = LinearLayoutManager(this)
        val cardViewSepatuAdapter = CardViewSepatuAdapter(list)
        rvSepatu.adapter = cardViewSepatuAdapter
    }

    private fun showSelectedSepatu(sepatu: Sepatu) {
        Toast.makeText(this, "Kamu memilih " + sepatu.name, Toast.LENGTH_SHORT).show()
    }
}