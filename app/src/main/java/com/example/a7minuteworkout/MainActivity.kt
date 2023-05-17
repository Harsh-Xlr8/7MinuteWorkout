package com.example.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minuteworkout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //  The binding is name just like the name of the layout with Binding attached
    //Todo 1:We create a variable for it and assign to null
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Todo 2: We inflate the late file by calling inflate on the Binding name
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Todo 3: Then replace the setContentView parameter with binding?.root
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        //Todo 4: TO avoid memory leak we unassign the binding once the activity is destroyed
        binding = null
    }
}