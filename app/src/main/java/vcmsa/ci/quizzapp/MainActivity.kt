package vcmsa.ci.quizzapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtUserName = findViewById<EditText>(R.id.edtUserName)
        val btnQuizStart = findViewById<Button>(R.id.btnQuizStart)

        val username = edtUserName.text.toString()
        btnQuizStart.setOnClickListener {
            val intent = Intent(this, Quiz::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
            finish()
        }
    }
}