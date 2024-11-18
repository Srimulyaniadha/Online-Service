package id.ac.polbeng.srimulyaniadha.onlineservice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.srimulyaniadha.onlineservice.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}