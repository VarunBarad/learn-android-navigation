package com.varunbarad.learn.navigation

data class OngoingLoginEntry(
    val passwordError: Boolean
) {
    companion object {
        val blank = OngoingLoginEntry(false)
    }
}

class OngoingLoginRepository {
    private var ongoingEntry = OngoingLoginEntry.blank

    fun currentEntry(): OngoingLoginEntry = ongoingEntry.copy()

    fun updatePasswordError(isThereError: Boolean) {
        ongoingEntry = ongoingEntry.copy(passwordError = isThereError)
    }
}
