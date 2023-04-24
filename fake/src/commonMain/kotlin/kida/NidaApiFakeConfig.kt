package kida

import koncurrent.Executor
import koncurrent.SynchronousExecutor
import kotlinx.collections.interoperable.List
import kotlinx.collections.interoperable.iListOf

class NidaApiFakeConfig(
    val executor: Executor = SynchronousExecutor,
    val fakes: List<Person> = DEFAULT_FAKES
) {
    companion object {
        val DEFAULT_FAKES = iListOf(
            Person(
                nin = "19900101000000000001",
                name = "John Makongoro Doe",
                sex = Sex.Male,
                dateOfBirth = "1990-01-01",
                nationality = "TANZANIAN",
            ),
            Person(
                nin = "19900101000000000002",
                name = "Jane Makukuru Doe",
                sex = Sex.Male,
                dateOfBirth = "1990-01-01",
                nationality = "TANZANIAN",
            ),
        )
    }
}