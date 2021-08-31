package com.itne.dto;





import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private String id;
	private String pwd;
	private String phone;
	private String email;
	private String grade;
	private String lastUpdate;
	private String logincount;
}
