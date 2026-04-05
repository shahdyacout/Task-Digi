import com.example.taskdigi.data.repo.UserRepositoryImpl
import com.example.taskdigi.domain.repository.TaskRepository
import com.example.taskdigi.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepo(
        impl: TaskRepositoryImplementation
    ): TaskRepository

    @Binds
    @Singleton
    abstract fun bindUserRepo(
        userRepoImpl: UserRepositoryImpl // تأكد إن الاسم مطابق للكلاس اللي عملته فوق
    ): UserRepository
}
