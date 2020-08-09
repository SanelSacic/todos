package todo.classic.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import todo.classic.domain.Todo;
import todo.classic.repository.TodoRepository;

@Service
@RequiredArgsConstructor
public class TodoService {

  private final TodoRepository todoRepository;

  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  public Todo create(Todo todo) {
    return todoRepository.save(todo);
  }
}
