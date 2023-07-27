package ru.eaglebut.videocards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eaglebut.videocards.model.VideoCardTechnicalSpecifications;

import java.util.UUID;

public interface VideoCardTechnicalSpecificationsRepository
	extends JpaRepository<VideoCardTechnicalSpecifications, UUID> {
}
