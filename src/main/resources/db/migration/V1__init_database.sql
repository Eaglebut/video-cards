CREATE TABLE manufacturer
(
	id   UUID NOT NULL,
	name VARCHAR(255),
	CONSTRAINT pk_manufacturer PRIMARY KEY (id)
);

CREATE TABLE video_card
(
	id                          UUID NOT NULL,
	name                        VARCHAR(255),
	short_description           VARCHAR(255),
	technical_specifications_id UUID,
	CONSTRAINT pk_videocard PRIMARY KEY (id)
);

CREATE TABLE video_card_technical_specifications
(
	id               UUID NOT NULL,
	full_description VARCHAR(255),
	manufacturer_id  UUID,
	CONSTRAINT pk_videocardtechnicalspecifications PRIMARY KEY (id)
);

ALTER TABLE video_card_technical_specifications
	ADD CONSTRAINT FK_VIDEOCARDTECHNICALSPECIFICATIONS_ON_MANUFACTURER FOREIGN KEY (manufacturer_id) REFERENCES manufacturer(id);

ALTER TABLE video_card
	ADD CONSTRAINT FK_VIDEOCARD_ON_TECHNICALSPECIFICATIONS FOREIGN KEY (technical_specifications_id) REFERENCES video_card_technical_specifications(id);