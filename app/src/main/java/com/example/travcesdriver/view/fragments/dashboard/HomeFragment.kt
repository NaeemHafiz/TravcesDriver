package com.example.travcesdriver.view.fragments.dashboard


import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travcesdriver.R
import com.example.travcesdriver.data.remote.travces.model.data.GetChildrenData
import com.example.travcesdriver.view.activities.base.BaseActivity
import com.example.travcesdriver.view.adapters.ChildrenAdapter
import com.example.travcesdriver.view.adapters.DriverAdapter
import com.example.travcesdriver.view.fragments.base.BaseFragment
import com.example.travcesdriver.viewModel.UserViewModel
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment(), DriverAdapter.Callback {


    override fun getLayoutId(): Int = R.layout.fragment_home

    lateinit var childrenAdapter: ChildrenAdapter
    lateinit var userViewModel: UserViewModel
    var childrenList = ArrayList<GetChildrenData>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initChildrenAdapter()
    }

    private fun initChildrenAdapter() {
        childrenAdapter = ChildrenAdapter(context as BaseActivity, childrenList, this)
        rvChildlist.layoutManager = LinearLayoutManager(context)
        rvChildlist.adapter = childrenAdapter
    }

    override fun onDeleteClicked(pos: Int) {

    }

    override fun oncvItemClicked(pos: Int) {

    }

    override fun onItemClicked(pos: Int) {
    }
}
