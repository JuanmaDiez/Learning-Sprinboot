CREATE TABLE store.profiles (
	id BIGINT auto_increment NOT NULL,
	bio varchar(255) NULL,
	phone_number varchar(255) NULL,
	date_of_birth DATE NULL,
	loyalty_points INT DEFAULT 0,
	CONSTRAINT profiles_pk PRIMARY KEY (id),
	CONSTRAINT profiles_users_fk FOREIGN KEY (id) REFERENCES store.users(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE store.tags (
	id BIGINT auto_increment NOT NULL,
	name varchar(255) NOT NULL,
	CONSTRAINT tags_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE store.user_tags (
	user_id BIGINT NOT NULL,
	tag_id BIGINT NOT NULL,
	CONSTRAINT user_tags_pk PRIMARY KEY (user_id, tag_id),
	CONSTRAINT user_tags_users_fk FOREIGN KEY (user_id) REFERENCES store.users(id) ON DELETE CASCADE,
	CONSTRAINT user_tags_tags_fk FOREIGN KEY (tag_id) REFERENCES store.tags(id) ON DELETE CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;