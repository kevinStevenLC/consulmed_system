use consulmed_db;

-- Entidades Independientes

CREATE TABLE Enfermero (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombresCompletos VARCHAR(255) NOT NULL
);

CREATE TABLE Antecedentes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL
);
CREATE TABLE ExamenAdicional (
    id INT AUTO_INCREMENT PRIMARY KEY,
    grupo VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL
);
CREATE TABLE ExamenFisico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    grupo VARCHAR(255) NOT NULL,
    padecimiento VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL
);
CREATE TABLE SignoVital (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL
);


-- Datos ingresados --


-- Insertar datos en la tabla Enfermero
INSERT INTO Enfermero (nombresCompletos) VALUES 
('Juan Pérez'),
('Ana Gómez'),
('Luis Martínez');


-- Insertar datos en la tabla Antecedentes

-- Antecedentes Personales
INSERT INTO Antecedentes (tipo, descripcion) VALUES 
('Antecedentes Personales', 'Alergia al polvo'),
('Antecedentes Personales', 'Fumador desde los 18 años'),
('Antecedentes Personales', 'Bebe alcohol socialmente'),
('Antecedentes Personales', 'Sedentario, no hace ejercicio');

-- Antecedentes Patológicos
INSERT INTO Antecedentes (tipo, descripcion) VALUES 
('Antecedentes Patológicos', 'Hipertensión arterial'),
('Antecedentes Patológicos', 'Diabetes tipo 2'),
('Antecedentes Patológicos', 'Asma bronquial'),
('Antecedentes Patológicos', 'Colesterol alto');

-- Antecedentes Clínicos
INSERT INTO Antecedentes (tipo, descripcion) VALUES 
('Antecedentes Clínicos', 'Cirugía de apéndice a los 25 años'),
('Antecedentes Clínicos', 'Operación de rodilla por ligamento roto'),
('Antecedentes Clínicos', 'Extracción de vesícula biliar'),
('Antecedentes Clínicos', 'Cataratas en ambos ojos');

-- Antecedentes Gineco-Obstétricos
INSERT INTO Antecedentes (tipo, descripcion) VALUES 
('Antecedentes Gineco-Obstétricos', 'Embarazo a los 28 años'),
('Antecedentes Gineco-Obstétricos', 'Ciclo menstrual irregular'),
('Antecedentes Gineco-Obstétricos', 'Parto por cesárea'),
('Antecedentes Gineco-Obstétricos', 'Historia de endometriosis');

-- Insertar datos en la tabla SignoVital
INSERT INTO SignoVital (descripcion) VALUES 
('Presión arterial expresada en diastólica/sistólica'),
('Peso expresado en kilogramos'),
('Estatura expresada en metros'),
('Temperatura'),
('Índice de masa corporal (IMC)');

-- Insertar datos en la tabla ExamenFisico
INSERT INTO ExamenFisico (grupo, padecimiento, descripcion) VALUES 
('Examen por Sistemas', 'Cabeza y cuello', 'Ganglios inflamados, dolor, rigidez'),
('Examen por Sistemas', 'Respiratorio', 'Sonidos pulmonares anormales (sibilancias, crepitantes)'),
('Examen por Sistemas', 'Cardiovascular', 'Ritmo cardíaco regular o irregular, soplos'),
('Síntomas Reportados por el Paciente', 'Dolor', 'Ubicación, intensidad de 1 a 10'),
('Síntomas Reportados por el Paciente', 'Fiebre', 'Temperatura elevada'),
('Síntomas Reportados por el Paciente', 'Fatiga', 'Sensación de cansancio excesivo'),
('Síntomas Reportados por el Paciente', 'Tos', 'Persistente, seca o productiva'),
('Síntomas Reportados por el Paciente', 'Mareos', 'Sensación de desmayo o vértigo'),
('Síntomas Reportados por el Paciente', 'Náuseas o vómitos', 'Sensación de malestar estomacal');


-- Insertar datos en la tabla ExamenAdicional
INSERT INTO ExamenAdicional (grupo, descripcion) VALUES 
('Laboratorio', 'Análisis de sangre general'),
('Laboratorio', 'Prueba de glucosa en sangre'),
('Laboratorio', 'Perfil lipídico'),
('Laboratorio', 'Prueba de función hepática'),
('Laboratorio', 'Prueba de función renal'),

('Imagenologia', 'Radiografía de tórax'),
('Imagenologia', 'Ecografía abdominal'),
('Imagenologia', 'Tomografía computarizada (TC) de cabeza'),
('Imagenologia', 'Resonancia magnética (RM) de columna'),
('Imagenologia', 'Radiografía de extremidades');




