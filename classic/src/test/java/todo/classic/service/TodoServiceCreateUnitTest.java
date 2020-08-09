package todo.classic.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import todo.classic.UnitTest;
import todo.classic.domain.Todo;
import todo.classic.repository.TodoRepository;

class TodoServiceCreateUnitTest extends UnitTest {

  @Mock
  TodoRepository todoRepository;

  @InjectMocks
  TodoService service;

  @Test
  void whenValid_thenCreateNew() {
    // given
    final Todo todo = Todo.builder().title("New one")
        .build();

    when(todoRepository.save(any(Todo.class))).thenReturn(todo);

    // when
    final Todo result = service.create(todo);

    // then
    assertThat(result.getTitle()).isNotNull();
  }
  
}
