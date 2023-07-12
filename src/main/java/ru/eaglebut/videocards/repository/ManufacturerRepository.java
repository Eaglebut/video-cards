package ru.eaglebut.videocards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eaglebut.videocards.model.Manufacturer;

import java.util.UUID;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, UUID> {
}
