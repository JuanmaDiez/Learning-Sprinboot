CREATE TABLE store.categories (
	id TINYINT auto_increment NOT NULL,
	name varchar(255) NOT NULL,
	CONSTRAINT categories_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE store.products (
	id BIGINT auto_increment NOT NULL,
	name varchar(255) NOT NULL,
	description varchar(255) NULL,
	price DECIMAL(10, 2) NOT NULL,
	category_id TINYINT NOT NULL,
	CONSTRAINT products_pk PRIMARY KEY (id),
	CONSTRAINT products_categories_fk FOREIGN KEY (category_id) REFERENCES store.categories(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;