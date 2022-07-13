package com.example.exp2c1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

  private String internalId;

  private String name;

  private String email;

  private Integer countryCode;

  private Date birthDate;

  private String state;
}
