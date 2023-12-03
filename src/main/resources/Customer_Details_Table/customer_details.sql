CREATE TABLE `example`.`customer_details`
(
    `id`                 INT NOT NULL AUTO_INCREMENT,
    `customer_reference` VARCHAR(48) NULL,
    `customer_name`      VARCHAR(48) NULL,
    `address_line_one`   VARCHAR(100) NULL,
    `address_line_two`   VARCHAR(48) NULL,
    `town`               VARCHAR(48) NULL,
    `county`             VARCHAR(48) NULL,
    `country`            VARCHAR(48) NULL,
    `postcode`           VARCHAR(24) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);
