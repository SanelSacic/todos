package todo.classic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.classic.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
