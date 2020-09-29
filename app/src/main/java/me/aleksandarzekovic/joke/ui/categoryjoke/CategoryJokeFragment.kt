package me.aleksandarzekovic.joke.ui.categoryjoke

import android.opengl.Visibility
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import me.aleksandarzekovic.joke.R
import me.aleksandarzekovic.joke.data.model.CategoryJoke
import me.aleksandarzekovic.joke.databinding.CategoryJokeFragmentBinding

class CategoryJokeFragment : Fragment() {

    companion object {
        fun newInstance() = CategoryJokeFragment()
    }

    private lateinit var viewModel: CategoryJokeViewModel
    private lateinit var binding: CategoryJokeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.category_joke_fragment,
            container,
            false
        )
        var view = binding.root
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CategoryJokeViewModel::class.java)
        // TODO: Use the ViewModel
        val data =  listOf<CategoryJoke>(CategoryJoke("All"), CategoryJoke("Miscellaneous"),
            CategoryJoke("Programming"), CategoryJoke("Dark"), CategoryJoke("Pun"))
        populateData(data)
        binding.categoryJokeProgressBar.visibility = View.INVISIBLE

    }

    private fun populateData(listResults: List<CategoryJoke>) {
        var recyclerView = binding.categoryJokeRecyclerView
        val layoutManager = LinearLayoutManager(this.context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        var fillRecylerView = CategoryJokeAdapter(listResults)
        binding.adapter = fillRecylerView
    }

}