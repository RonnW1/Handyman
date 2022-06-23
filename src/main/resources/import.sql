-- Insert to ServiceTypes

INSERT INTO ServiceTypes (description) VALUES ('Reparación');;
INSERT INTO ServiceTypes (description) VALUES ('Instalación');

-- Insert to Services

INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 10',	123,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (2,	'Calle 11',	789,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 12',	145,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 13',	519,	'Noche');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 14',	657,	'Noche');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 15',	953,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 16',	6498,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (2,	'Calle 17',	135,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 18',	123,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (2,	'Calle 19',	789,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 20',	145,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 21',	519,	'Noche');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 22',	657,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 23',	953,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 24',	6498,	'Mañana');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (2,	'Calle 25',	135,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 26',	123,	'Noche');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (2,	'Calle 27',	789, 'Noche');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 28',	145,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 29',	519,	'Tarde');
INSERT INTO Services (idServiceTypes, direction, user, jornad) VALUES (1,	'Calle 30',	657,	'Mañana');

-- Insert to Technicians

INSERT INTO Technicians (documentType, documentNumber, fullName) VALUES ('CC',	'1152987324',	'Cristian Camilo Zambrano Grajales');
INSERT INTO Technicians (documentType, documentNumber, fullName) VALUES ('CC',	'1152669883',	'Jaime Alejandro Gomez Solarte');
INSERT INTO Technicians (documentType, documentNumber, fullName) VALUES ('CC',	'9999999999',	'Sebastián David Carvajal Rosero');
INSERT INTO Technicians (documentType, documentNumber, fullName) VALUES ('CC',	'78956453',	'Sammy Steven Muñoz Hidalgo');
INSERT INTO Technicians (documentType, documentNumber, fullName) VALUES ('CC',	'16466873',	'Raquel Sofía Neira Chaparro');
INSERT INTO Technicians (documentType, documentNumber, fullName) VALUES ('Cédula de extrangería',	'E153354A',	'Carlos Lugo');
