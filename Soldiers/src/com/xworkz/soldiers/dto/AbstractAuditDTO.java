package com.xworkz.soldiers.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditDTO implements Serializable {
	private String createdAt;
	private LocalDateTime createdBy;
	private String updatedAt;
	private LocalDateTime updatedBy;

}
