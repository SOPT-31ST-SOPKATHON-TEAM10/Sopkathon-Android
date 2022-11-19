package org.sopt.sopkathon10.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.data.dto.response.ResponseBase
import org.sopt.sopkathon10.data.dto.response.ResponseGetMessage
import org.sopt.sopkathon10.data.dto.response.ResponseShowMessage
import org.sopt.sopkathon10.data.service.SopkathonService
import org.sopt.sopkathon10.databinding.ActivityDetailBinding
import org.sopt.sopkathon10.util.binding.BindingActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class DetailActivity : BindingActivity<ActivityDetailBinding>(R.layout.activity_detail) {

    @Inject
    lateinit var sopkathonService: SopkathonService

    var messageId : Int = 22
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initLayout()
    }

    private fun initLayout() {
        sopkathonService.showMessage(messageId).enqueue(object :
            Callback<ResponseBase<ResponseShowMessage>> {
            override fun onResponse(
                call: Call<ResponseBase<ResponseShowMessage>>,
                response: Response<ResponseBase<ResponseShowMessage>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        binding.tvMusicTitle.text = it.data.title
                        binding.tvSinger.text = it.data.artist
                        binding.tvMessage.text = it.data.contents
                        binding.tvTitle.text = it.data.category.name
                    }
                }
            }

            override fun onFailure(
                call: Call<ResponseBase<ResponseShowMessage>>,
                t: Throwable
            ) {
                Log.e("message", "fail")
            }

        })
    }

}