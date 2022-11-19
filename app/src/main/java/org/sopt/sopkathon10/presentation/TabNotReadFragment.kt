package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import org.sopt.sopkathon10.data.dto.response.ResponseGetMessage
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.databinding.FragmentTabNotReadBinding
import org.sopt.sopkathon10.util.binding.BindingFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class TabNotReadFragment :
    BindingFragment<FragmentTabNotReadBinding>(R.layout.fragment_tab_not_read) {

    @Inject
    lateinit var sopkathonService: SopkathonService

    var nickname: String = "천재"
    private var messageList: MutableList<ResponseGetMessage> = mutableListOf()

    private lateinit var notReadAdapter: NotReadAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        initMessageInfo()
    }

    private fun initMessageInfo() {
        sopkathonService.getMessage(nickname, 0).enqueue(object :
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
                        notReadAdapter.setItems(messageList)
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
        notReadAdapter = NotReadAdapter()
        binding.rvTabNotRead.adapter= notReadAdapter
        notReadAdapter.setItems(messageList)
    }


}