package com.example.exp2c1.resource;

import com.example.exp2c1.dto.StudentDTO;
import com.example.exp2c1.service.StudentClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentResource {
  private final StudentClientService studentClientService;

  @GetMapping
  public ResponseEntity<List<StudentDTO>> findAll() {
    var students = studentClientService.obtainAll();
    return ResponseEntity.ok(students);
  }
}
