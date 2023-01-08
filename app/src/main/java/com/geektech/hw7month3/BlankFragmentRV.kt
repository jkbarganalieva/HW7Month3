package com.geektech.hw7month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.geektech.hw7month3.databinding.FragmentBlankRVBinding
import java.text.FieldPosition


class BlankFragmentRV : Fragment() {
    private var list = arrayListOf<Rick>()
lateinit var binding: FragmentBlankRVBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankRVBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = RickAdapter(list, this::onClick)
        binding.rickRV.adapter = adapter
    }

    private fun onClick(position: Int) {
        findNavController().navigate(BlankFragmentRVDirections.actionBlankFragmentRVToBlankFragmentINFO(
            list[position]
        ))
    }

    private fun loadData() {
        list.add(Rick(R.drawable.rickc137 , "Rick c-137" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.morty34c , "Morty 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
        list.add(Rick(R.drawable.rick_prime , "Rick Prime 34-C" , AliveOrNot.ALIVE))
    }
}