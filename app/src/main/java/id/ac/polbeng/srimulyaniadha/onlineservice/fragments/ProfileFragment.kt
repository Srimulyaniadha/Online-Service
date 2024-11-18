package id.ac.polbeng.srimulyaniadha.onlineservice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import id.ac.polbeng.srimulyaniadha.onlineservice.databinding.FragmentProfileBinding
import id.ac.polbeng.srimulyaniadha.onlineservice.viewmodel.ProfileViewModel

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
            binding.textProfile.text = it
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}