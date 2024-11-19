package id.ac.polbeng.srimulyaniadha.onlineservice.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.ac.polbeng.srimulyaniadha.onlineservice.R
import id.ac.polbeng.srimulyaniadha.onlineservice.activities.EditProfileActivity
import id.ac.polbeng.srimulyaniadha.onlineservice.activities.LoginActivity
import id.ac.polbeng.srimulyaniadha.onlineservice.databinding.FragmentProfileBinding
import id.ac.polbeng.srimulyaniadha.onlineservice.helpers.Config
import id.ac.polbeng.srimulyaniadha.onlineservice.helpers.SessionHandler
import id.ac.polbeng.srimulyaniadha.onlineservice.models.DefaultResponse
import id.ac.polbeng.srimulyaniadha.onlineservice.models.User
import id.ac.polbeng.srimulyaniadha.onlineservice.services.ServiceBuilder
import id.ac.polbeng.srimulyaniadha.onlineservice.services.UserService
import id.ac.polbeng.srimulyaniadha.onlineservice.viewmodel.ProfileViewModel
import retrofit2.Call
import retrofit2.Response

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val profileViewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
        _binding = FragmentProfileBinding.inflate(inflater, container,
            false)
        val root: View = binding.root

        profileViewModel.text.observe(viewLifecycleOwner) {
            //binding.textProfile.text = it
        }
        val session = SessionHandler(requireContext())
        val user: User? = session.getUser()
        val titikDua = ": "
        if(user != null) {
            val url = Config.PROFILE_IMAGE_URL + user.gambar
            Glide.with(requireContext())
                .load(url)
                .apply(
                    RequestOptions()
                        .placeholder(R.drawable.user)
                        .error(R.drawable.user))
                .into(binding.imgLogo)
            binding.tvNama.text = titikDua + user.nama
            binding.tvTanggalLahir.text = titikDua + user.tanggalLahir
            binding.tvJenisKelamin.text = titikDua + user.jenisKelamin
            binding.tvNomorHP.text = titikDua + user.nomorHP
            binding.tvAlamat.text = titikDua + user.alamat
            binding.tvEmail.text = titikDua + user.email
            binding.tvWaktuSesi.text = titikDua + session.getExpiredTime()
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}