package com.example.sampletodosql.repository;

import com.example.sampletodosql.model.Todo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public interface TodoRepository extends CrudRepository<Todo, String> {
    List<Todo> findAll();

    Optional<Todo> findById(String id);

    @Query("SELECT id,title,description, isCompleted FROM Todo WHERE isCompleted = false")
    List<Todo> findUncompletedTodo();

    @Modifying
    @Query("UPDATE Todo SET isCompleted = true WHERE id = :id")
    void toggleComplete(@Param("id") String id);

}
