package za.ac.iie.imada2tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main22)

        //Set of variables that gives the pet's status
        var editTextText1 = 0
        var editText2 = 0
        var editText3 = 0

        //Variables for the text and image view and button
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnWash = findViewById<Button>(R.id.btnWash)
        val editTextText1: EditText = findViewById<EditText>(R.id.editTextText1)
        val cleanEditText = findViewById<EditText>(R.id.cleanEditText)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val image = findViewById<ImageView>(R.id.imageView2)

        //This is the Welcome screen image of the app
        image.setImageDrawable(R.drawable.welcome_screen)

        btnFeed.setOnClickListener {
            startActivity(Intent(this, MainActivity22::class.java).putExtras(intent))
            image.setImageDrawable(R.drawable.eatng)
        }
        btnPlay.setOnClickListener {
            startActivity(Intent(this, MainActivity22::class.java).putExtras(intent))
            image.setImageDrawable(R.drawable.playing)
        }
        btnWash.setOnClickListener {
            startActivity(Intent(this, MainActivity22::class.java).putExtras(intent))
            image.setImageDrawable(R.drawable.bathe)
        }
    }
}