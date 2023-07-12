package ru.eaglebut.videocards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eaglebut.videocards.model.VideoCard;

import java.util.UUID;

public interface VideoCardBeanRepository extends JpaRepository<VideoCard, UUID> {


}