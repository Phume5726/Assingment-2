package vcmsa.ci.quizzapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Quiz : AppCompatActivity() {
    private val historyquestions = arrayOf(
        "World War II began in 1939 when Germany invaded Poland.",
        "Apartheid laws in South Africa gave all citizens equal rights regardless of race.",
        "The Berlin Wall was built to stop East Germans from fleeing to West Berlin.",
        "The Soviet Union collapsed because it was defeated in a war by the United States.",
        "Nelson Mandela was imprisoned for over 20 years for fighting against apartheid."
    )
    private val correctAnswers = booleanArrayOf(
        true,   // WWII began in 1939...
        false,  // Apartheid laws...
        true,   // Berlin Wall...
        false,  // Soviet Union collapsed...
        true    // Nelson Mandela...
    )
    private var currentQuestionIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnTrue = findViewById<Button>(R.id.btnTrue)
        val btnFalse = findViewById<Button>(R.id.btnFalse)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val tvQuestions = findViewById<TextView>(R.id.tvQuestions)
        val tvQuiz = findViewById<TextView>(R.id.tvQuiz)



    }
}