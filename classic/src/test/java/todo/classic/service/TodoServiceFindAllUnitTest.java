package todo.classic.service;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import todo.classic.UnitTest;
import todo.classic.domain.Todo;
import todo.classic.repository.TodoRepository;

class TodoServiceFindAllUnitTest extends UnitTest {

  @Mock
  TodoRepository todoRepository;

  @InjectMocks
  TodoService service;

  @Test
  void whenExists_thenReturnListOfEntries() {
    // given
    doReturn(singletonList(Todo.builder().build())).when(todoRepository).findAll();

    // when
    final List<Todo> todos = service.findAll();

    // then
    assertThat(todos).isNotNull().isNotEmpty().hasSize(1);
  }

  @Test
  void whenDoesNotExists_thenReturnEmptyList() {
    // given
    doReturn(emptyList()).when(todoRepository).findAll();

    // when
    final List<Todo> todos = service.findAll();

    // then
    assertThat(todos).isNotNull().isEmpty();
  }

}
