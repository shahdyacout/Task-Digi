import androidx.lifecycle.ViewModel
import com.example.taskdigi.data.model.User
import com.example.taskdigi.domain.usecase.loginScreenUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUseCase: loginScreenUsecase
) : ViewModel() {

    fun login(username: String, password: String): User {
        return User(username, password)
    }
}