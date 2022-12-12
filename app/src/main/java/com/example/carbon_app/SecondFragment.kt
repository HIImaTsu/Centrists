package com.example.carbon_app

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carbon_app.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var facultyList : ArrayList<Faculty>
    private lateinit var facultyAdapter: FacultyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSecondBinding.inflate(inflater, container, false)

        recyclerView = binding.recycleView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)

        facultyList = ArrayList()

        facultyList.add(Faculty(R.drawable.sdulogo, "SDU"))
        facultyList.add(Faculty(R.drawable.sdulogo, "SDU"))
        facultyList.add(Faculty(R.drawable.sdulogo, "SDU"))
        facultyList.add(Faculty(R.drawable.sdulogo, "SDU"))
        facultyList.add(Faculty(R.drawable.sdulogo, "SDU"))


        facultyAdapter = FacultyAdapter(facultyList)
        recyclerView.adapter = facultyAdapter

        return binding.root

    }
}

