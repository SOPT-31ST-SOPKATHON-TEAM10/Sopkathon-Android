package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import org.sopt.sopkathon10.data.dto.response.ResponseGetMessage
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.databinding.FragmentTabReadBinding
import org.sopt.sopkathon10.util.binding.BindingFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class TabReadFragment : BindingFragment<FragmentTabReadBinding> (R.layout.fragment_tab_read){

    @Inject
    lateinit var sopkathonService: SopkathonService

    var nickname: String = "천재"
    private var messageList: MutableList<ResponseGetMessage> = mutableListOf()

    private lateinit var entireAdapter: EntireAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nickname = "천재"
        initRecyclerView()
        initMessageInfo()
    }

    private fun initMessageInfo() {
        sopkathonService.getMessage(nickname, 2).enqueue(object :
            Callback<ResponseBase<List<ResponseGetMessage>>> {
            override fun onResponse(
                call: Call<ResponseBase<List<ResponseGetMessage>>>,
                response: Response<ResponseBase<List<ResponseGetMessage>>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        messageList.clear()
                        for (message in it.data) {
                            messageList.add(message)
                            Log.i("messagedd", message.toString())
                        }
                        entireAdapter.setItems(messageList)
                    }
                }
            }

            override fun onFailure(
                call: Call<ResponseBase<List<ResponseGetMessage>>>,
                t: Throwable
            ) {
                Log.e("message", "fail")
            }

        })
    }

    private fun initRecyclerView() {
        entireAdapter = EntireAdapter()
        binding.rvTabRead.adapter = entireAdapter
        entireAdapter.setItems(messageList)
    }

}