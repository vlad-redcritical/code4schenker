package pl.codeschenker.model;

import lombok.Data;
import java.util.Date;

@Data
public class EmployeeEntityDto {

	private Long id;

	private String name;

	private String lastname;

	private String position;

	private String email;

	private Date dateCreate;

	private Date lastUpdated;
}
