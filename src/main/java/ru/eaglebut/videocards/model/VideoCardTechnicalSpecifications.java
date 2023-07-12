package ru.eaglebut.videocards.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.UUID;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class VideoCardTechnicalSpecifications extends AbstractPersistable<UUID> {

	private String fullDescription;
	@ManyToOne
	private Manufacturer manufacturer;

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
