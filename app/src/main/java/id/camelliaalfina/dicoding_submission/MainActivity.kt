package id.camelliaalfina.dicoding_submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seacrh_btn: TextView = findViewById(R.id.seacrh_btn)
        seacrh_btn.setOnClickListener(this)

        val profile: CircleImageView = findViewById(R.id.profile)
        profile.setOnClickListener(this)

        val cardView1: CardView = findViewById(R.id.cardView1)
        cardView1.setOnClickListener(this)

        val cardView2: CardView = findViewById(R.id.cardView2)
        cardView2.setOnClickListener(this)

        val cardView3: CardView = findViewById(R.id.cardView3)
        cardView3.setOnClickListener(this)

        val cardView4: CardView = findViewById(R.id.cardView4)
        cardView4.setOnClickListener(this)

        val cardView5: CardView = findViewById(R.id.cardView5)
        cardView5.setOnClickListener(this)

        val cardView6: CardView = findViewById(R.id.cardView6)
        cardView6.setOnClickListener(this)

        val cardView7: CardView = findViewById(R.id.cardView7)
        cardView7.setOnClickListener(this)

        val cardView8: CardView = findViewById(R.id.cardView8)
        cardView8.setOnClickListener(this)

        val cardView9: CardView = findViewById(R.id.cardView9)
        cardView9.setOnClickListener(this)

        val cardView10: CardView = findViewById(R.id.cardView10)
        cardView10.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.seacrh_btn -> {
                val moveIntent = Intent(this@MainActivity, SepatuActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView1 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu1Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView2 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu2Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView3 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu3Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView4 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu4Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView5 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu5Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView6 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu6Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView7 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu7Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView8 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu8Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView9 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu9Activity::class.java)
                startActivity(moveIntent)
            }
            R.id.cardView10 -> {
                val moveIntent = Intent(this@MainActivity, DetailSepatu10Activity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}