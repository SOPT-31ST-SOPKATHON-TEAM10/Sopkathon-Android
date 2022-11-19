package org.sopt.sopkathon10.util.extensions

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace

inline fun <reified T : Fragment> AppCompatActivity.replace(@IdRes frameId: Int, tag: String? = null) {
    supportFragmentManager.commit {
        replace<T>(frameId, tag)
        setReorderingAllowed(true)
    }
}