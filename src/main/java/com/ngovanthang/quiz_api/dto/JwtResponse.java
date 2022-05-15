package com.ngovanthang.quiz_api.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Getter
@Setter
@NoArgsConstructor
public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;

  public JwtResponse(String accessToken, Long id, String username) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
  }

}
