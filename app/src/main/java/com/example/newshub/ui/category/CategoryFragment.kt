package com.example.newshub.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.newshub.R
import com.example.newshub.databinding.FragmentCategoryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryFragment : Fragment() {

    private lateinit var binding: FragmentCategoryBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var categoryArrayList: ArrayList<CategoryItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryArrayList = ArrayList()
        categoryArrayList.add(CategoryItem(R.drawable.general, getString(R.string.general)))
        categoryArrayList.add(CategoryItem(R.drawable.business, getString(R.string.business)))
        categoryArrayList.add(
            CategoryItem(
                R.drawable.entertainment,
                getString(R.string.entertainment)
            )
        )
        categoryArrayList.add(CategoryItem(R.drawable.health, getString(R.string.health)))
        categoryArrayList.add(CategoryItem(R.drawable.science, getString(R.string.science)))
        categoryArrayList.add(CategoryItem(R.drawable.sports, getString(R.string.sport)))
        categoryArrayList.add(CategoryItem(R.drawable.technology, getString(R.string.technology)))

        categoryAdapter = CategoryAdapter(categoryArrayList){
            val bundle= bundleOf("category" to it)
            val action = CategoryFragmentDirections.actionCategoryFragmentToSourceFragment().actionId
            findNavController().navigate(action,bundle)
        }
        binding.rvCategory.adapter = categoryAdapter
        binding.rvCategory.setHasFixedSize(true)
        binding.rvCategory.layoutManager = GridLayoutManager(requireContext(), 2).apply {
            spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                override fun getSpanSize(position: Int): Int {
                    return when (position) {
                        0 -> 1
                        else -> 2
                    }
                }

            }
        }
    }
}

//    override fun onClick(position: Int) {
//        val action =
//            val bundle = bundleOf("category" to )
//            CategoryFragmentDirections.actionCategoryFragmentToSourceFragment()
//        findNavController().navigate(action)
//    }
