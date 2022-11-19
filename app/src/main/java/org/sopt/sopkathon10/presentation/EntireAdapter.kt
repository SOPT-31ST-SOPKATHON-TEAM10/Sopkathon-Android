package org.sopt.sopkathon10.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.sopkathon10.R
import org.sopt.sopkathon10.data.dto.response.ResponseGetMessage
import org.sopt.sopkathon10.databinding.ItemMessageListBinding
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class EntireAdapter : RecyclerView.Adapter<EntireAdapter.EntireViewHolder>() {
    private var entire_items: List<ResponseGetMessage>? = null
    fun setItems(items: List<ResponseGetMessage>) {
        this.entire_items = items
        notifyDataSetChanged()
    }

    class EntireViewHolder(
        private val binding: ItemMessageListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(message: ResponseGetMessage) {
            binding.tvMsgTitle.text = message.title
            if (message.is_opened == 0) {//안읽음
                binding.ivMsgStatus.setImageResource(R.drawable.ic_letter_not_read)
            } else if (message.is_opened == 1) {
                binding.ivMsgStatus.setImageResource(R.drawable.ic_letter_read)
            }
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            val time = LocalDate.parse(message.created_at, formatter)
            binding.tvMsgDate.text = time.monthValue.toString()+"/"+time.dayOfMonth.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntireViewHolder {
        val binding =
            ItemMessageListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EntireViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EntireViewHolder, position: Int) {
        entire_items?.let {
            holder.bind(it[position])
        }
    }

    override fun getItemCount(): Int = entire_items?.size ?: 0
}