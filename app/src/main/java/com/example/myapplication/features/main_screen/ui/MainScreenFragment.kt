package com.example.myapplication.features.main_screen.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainScreenFragment() : Fragment() {

    private val viewModel by viewModel<MainScreenViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mainscreen, container, false) //если тру, то она унаследует все верстки, крч все не надо
    }



}