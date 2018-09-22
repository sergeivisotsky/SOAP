DROP DATABASE IF EXISTS soap_services;
CREATE DATABASE soap_services /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

DROP TABLE IF EXISTS soap_services.customers;
CREATE TABLE soap_services.customers (
  customer_id bigint AUTO_INCREMENT UNIQUE NOT NULL,
  first_name  VARCHAR(50),
  last_name   VARCHAR(50),
  age         INTEGER,
  PRIMARY KEY (customer_id)
);

DROP TABLE IF EXISTS soap_services.orders;
CREATE TABLE soap_services.orders (
  order_id       BIGINT AUTO_INCREMENT UNIQUE NOT NULL,
  customer_id    BIGINT NOT NULL,
  trans_id       BIGINT NOT NULL,
  product        VARCHAR(50),
  product_weight DOUBLE PRECISION,
  price          DOUBLE PRECISION,
  PRIMARY KEY (order_id),
  FOREIGN KEY (customer_id)
  REFERENCES soap_services.customers (customer_id)
  ON UPDATE NO ACTION ON DELETE CASCADE
);

DROP TABLE IF EXISTS soap_services.photos;
CREATE TABLE soap_services.photos
(
  photo_id    BIGINT AUTO_INCREMENT UNIQUE NOT NULL,
  customer_id BIGINT NOT NULL,
  file_name   VARCHAR(100),
  file_url    VARCHAR(150),
  file_type   VARCHAR(50),
  file_size   integer,
  PRIMARY KEY (photo_id),
  FOREIGN KEY (customer_id)
  REFERENCES soap_services.customers (customer_id)
  ON UPDATE NO ACTION ON DELETE CASCADE
);