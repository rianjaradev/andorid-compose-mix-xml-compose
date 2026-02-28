package com.rianjaradev.mobile.compose.ui.xml

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rianjaradev.mobile.compose.databinding.XmlFirstFragmentBinding

class FirstFragment : Fragment() {

    private var _binding: XmlFirstFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = XmlFirstFragmentBinding.inflate(
            inflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.firstViewBtnRedirectCompose.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToNoteFlowFragment()
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}