package id.ac.polbeng.srimulyaniadha.onlineservice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.srimulyaniadha.onlineservice.databinding.ActivityEditProfileBinding
class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
