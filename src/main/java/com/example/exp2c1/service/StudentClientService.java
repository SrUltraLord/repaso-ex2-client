package com.example.exp2c1.service;

import com.example.exp2c1.client.StudentClient;
import com.example.exp2c1.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentClientService {
  private final StudentClient client;
  //  private static final String BASE_URL = "http://localhost:8080/students";
  //  private static final RestTemplate restTemplate = new
  // RestTemplate(getClientHttpRequestFactory());

  public List<StudentDTO> obtainAll() {
    ResponseEntity<StudentDTO[]> response =
        client.getRestTemplate().getForEntity(client.getBaseUrl(), StudentDTO[].class);
    StudentDTO[] objectArray = response.getBody();

    assert objectArray != null;
    return Arrays.asList(objectArray);
  }

  //  private static ClientHttpRequestFactory getClientHttpRequestFactory() {
  //    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory =
  //        new HttpComponentsClientHttpRequestFactory();
  //    int connectTimeout = 5000;
  //    int readTimeout = 5000;
  //    clientHttpRequestFactory.setConnectTimeout(connectTimeout);
  //    clientHttpRequestFactory.setReadTimeout(readTimeout);
  //    return clientHttpRequestFactory;
  //  }
}
