package com.example.starterone.homeview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.starterone.R
import com.example.starterone.databinding.FragmentMainBinding
import com.example.starterone.homeview.adapter.CustomAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        viewModel.data.observe(viewLifecycleOwner) {
            binding.recyclerView.adapter = CustomAdapter(it)
        }

        binding.button.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToSecondFragment3(getString(R.string.ArgsSafePassedTextExample))
            findNavController().navigate(action)
        }

        return binding.root
    }
}
