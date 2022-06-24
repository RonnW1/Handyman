-- Insert to ServiceTypes

INSERT INTO service_types (description) VALUES ('Reparación');;
INSERT INTO service_types (description) VALUES ('Instalación');

-- Insert to services

INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 10',	123,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (2,	'Calle 11',	789,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 12',	145,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 13',	519,	'Noche');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 14',	657,	'Noche');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 15',	953,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 16',	6498,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (2,	'Calle 17',	135,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 18',	123,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (2,	'Calle 19',	789,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 20',	145,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 21',	519,	'Noche');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 22',	657,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 23',	953,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 24',	6498,	'Mañana');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (2,	'Calle 25',	135,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 26',	123,	'Noche');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (2,	'Calle 27',	789, 'Noche');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 28',	145,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 29',	519,	'Tarde');
INSERT INTO services (id_service_type, direction, user_number, journey) VALUES (1,	'Calle 30',	657,	'Mañana');

-- Insert to technicians

INSERT INTO technicians (document_type, document_number, full_name) VALUES ('CC',	'1152987324',	'Cristian Camilo Zambrano Grajales');
INSERT INTO technicians (document_type, document_number, full_name) VALUES ('CC',	'1152669883',	'Jaime Alejandro Gomez Solarte');
INSERT INTO technicians (document_type, document_number, full_name) VALUES ('CC',	'9999999999',	'Sebastián David Carvajal Rosero');
INSERT INTO technicians (document_type, document_number, full_name) VALUES ('CC',	'78956453',	'Sammy Steven Muñoz Hidalgo');
INSERT INTO technicians (document_type, document_number, full_name) VALUES ('CC',	'16466873',	'Raquel Sofía Neira Chaparro');
INSERT INTO technicians (document_type, document_number, full_name) VALUES ('Cédula de extrangería',	'E153354A',	'Carlos Lugo');
