package za.ac.iie.imada2tamagotchiapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    private var hungerEditTextText = 100
    private var


     var feedButton: Button
     var playButton: Button
     var washButton: Button
     var hungerEditTextText: EditText
     var cleanEditText: EditText
     var happyEditText: EditText
     var petImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        feedButton = findViewById(R.id.feedButton)
        playButton = findViewById(R.id.playButton)
        washButton =findViewById(R.id.washButton)
        hungerEditTextText = findViewById<EditText>(R.id.hungerEditTextText)
        cleanEditText = findViewById<EditText>(R.id.cleanEditText)
        happyEditText = findViewById<EditText>(R.id.happyEditText)
        petImageView = findViewById<ImageView(R.id.petImageView)


        //Set all the initial values of text
        hungerEditTextText.setText(hunger)
        feedButton.setOnClickListener {
          startActivity(Intent(this, MainActivity2::class.java).putExtras(intent))

        }
        playButton.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java).putExtras(intent))
        }
        washButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtras(intent))
    }
}