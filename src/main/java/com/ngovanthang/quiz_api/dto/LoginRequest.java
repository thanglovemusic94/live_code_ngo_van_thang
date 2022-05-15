package com.ngovanthang.quiz_api.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {
	@NotBlank
  private String username;

	@NotBlank
	private String password;
}
