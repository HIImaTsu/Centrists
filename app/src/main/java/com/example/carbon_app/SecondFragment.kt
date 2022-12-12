package com.example.carbon_app

import android.content.Intent
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

        facultyList.add(Faculty(R.drawable.bsh, "Школа Бизнеса СДУ"))
        facultyList.add(Faculty(R.drawable.eng, "Факультет Инженерных"))
        facultyList.add(Faculty(R.drawable.law, "Факультет педагогики"))
        facultyList.add(Faculty(R.drawable.sdulogo, "Факультет права"))
        facultyList.add(Faculty(R.drawable.sdulogo, "Новый Факультет "))


        facultyAdapter = FacultyAdapter(facultyList)
        recyclerView.adapter = facultyAdapter

        facultyAdapter.onItemClick = {
            val intent = Intent(context , DetailedActivity::class.java)
            intent.putExtra("faculty", it)
            startActivity(intent)
        }

        return binding.root

    }
}

