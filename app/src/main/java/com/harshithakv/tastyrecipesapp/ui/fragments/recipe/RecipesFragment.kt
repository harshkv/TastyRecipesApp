package com.harshithakv.tastyrecipesapp.ui.fragments.recipe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.harshithakv.tastyrecipesapp.R
import com.harshithakv.tastyrecipesapp.databinding.FragmentRecipesBinding


class RecipesFragment : Fragment() {
  private lateinit var binding: FragmentRecipesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recipes, container, false)
        binding.recyclerView.showShimmer()
        return binding.root
    }

}