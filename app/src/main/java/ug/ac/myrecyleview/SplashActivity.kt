package ug.ac.myrecyleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//import java.util.logging.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        Handler().postDelayed({}, 3000)

     //intent is a class/ method that defines where data is being sent to
         //or where you want to go
       // startActivity(Intent(this, MainActivity::class.java))

        //using coroutines
        val scope =  CoroutineScope(Dispatchers.Main)

        scope.launch {
            delay( 3500)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }
}