package za.ac.iie.imada2tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var startButton: Button
    val intent = fun intent(this@MainActivity, MainActivity2::class.java)
    startActivity(intent)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
         startButton = findViewById(R.id.startButton)

        startButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtras(intent))
        }
        }
    }
}