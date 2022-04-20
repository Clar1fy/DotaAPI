package com.timplifier.dotaapp.presentation.ui.fragments.heroes

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.dotaapp.R
import com.timplifier.dotaapp.base.BaseFragment
import com.timplifier.dotaapp.databinding.FragmentHeroesBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HeroesFragment :
    BaseFragment<FragmentHeroesBinding, HeroesViewModel>(R.layout.fragment_heroes) {
    override val binding by viewBinding(FragmentHeroesBinding::bind)
    override val viewModel: HeroesViewModel by viewModels()

    override fun setupViews() {
    }

    override fun setupListeners() {
    }

    override fun establishRequest() {
    }

    override fun launchObservers() {
    }

}