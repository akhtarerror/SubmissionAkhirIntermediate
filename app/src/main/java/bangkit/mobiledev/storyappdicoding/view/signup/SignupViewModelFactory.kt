package bangkit.mobiledev.storyappdicoding.view.signup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import bangkit.mobiledev.storyappdicoding.data.repository.UserRepository

class SignupViewModelFactory(private val userRepository: UserRepository) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignupViewModel::class.java)) {
            return SignupViewModel(userRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}
