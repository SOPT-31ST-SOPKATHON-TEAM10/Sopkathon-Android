package org.sopt.sopkathon10.util.extensions

import timber.log.Timber

class SopkathonDebugTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement) =
        "${element.fileName}:${element.lineNumber}#${element.methodName}"
}