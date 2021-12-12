package com.sv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long studentId;
  private long studentName;
}
