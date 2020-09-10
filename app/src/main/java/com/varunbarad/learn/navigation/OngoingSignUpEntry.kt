package com.varunbarad.learn.navigation

data class OngoingSignUpEntry (
    val emailError: Boolean,
    val passwordError: Boolean
) {
    companion object {
        val blank = OngoingSignUpEntry(false, false)
    }
}

class OngoingSignUpRepository {
    private var ongoingEntry = OngoingSignUpEntry.blank

    fun currentEntry(): OngoingSignUpEntry = ongoingEntry.copy()

    fun updateEmailError(isThereError: Boolean) {
        ongoingEntry = ongoingEntry.copy(emailError = isThereError)
    }

    fun updatePasswordError(isThereError: Boolean) {
        ongoingEntry = ongoingEntry.copy(passwordError = isThereError)
    }
}
