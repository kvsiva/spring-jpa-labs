package com.sv.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StudentInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long studentId;
  private long studentName;
}
