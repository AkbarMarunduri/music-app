package com.akbarmd.music_app.views.topalbums

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akbarmd.music_app.R
import com.akbarmd.music_app.databinding.FragmentTopAlbumFragmensBinding


class TopAlbumsFragmens : Fragment() {
    private var _binding:FragmentTopAlbumFragmensBinding?=null
    private val binding get()=_binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentTopAlbumFragmensBinding.inflate(layoutInflater,container,false)
        return _binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}