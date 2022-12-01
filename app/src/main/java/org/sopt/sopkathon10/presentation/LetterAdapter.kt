package org.sopt.sopkathon10.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.sopt.sopkathon10.databinding.ItemLetterBinding
import org.sopt.sopkathon10.domain.entity.Letter
import org.sopt.sopkathon10.util.ItemDiffCallback

class LetterAdapter(private val onClickListener: (Letter) -> (Unit)) :
    ListAdapter<Letter, LetterAdapter.LetterViewHolder>(
        ItemDiffCallback<Letter>(
            onContentsTheSame = { old, new -> old == new },
            onItemsTheSame = { old, new -> old.id == new.id }
        )
    ) {
    private lateinit var inflater: LayoutInflater

    class LetterViewHolder(private val binding: ItemLetterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(letter: Letter, onClickListener: (Letter) -> (Unit)) {
            binding.letter = letter
            binding.root.setOnClickListener {
                onClickListener(letter)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        if (!::inflater.isInitialized)
            inflater = LayoutInflater.from(parent.context)
        return LetterViewHolder(ItemLetterBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(viewHolder: LetterViewHolder, position: Int) {
        viewHolder.bind(getItem(position), onClickListener)
    }
}
