-- Entidades Principales y detalles

CREATE TABLE Paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    tipoSangre VARCHAR(50),
    telefono VARCHAR(20),
    email VARCHAR(255),
    genero VARCHAR(50)
);

-- Tabla FichaMedica
CREATE TABLE FichaMedica (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fechaApertura DATE NOT NULL,
    idPaciente INT NOT NULL,
    idAntecedentes INT NOT NULL,
    idTomaSignosVitales INT,
    FOREIGN KEY (idPaciente) REFERENCES Paciente(id),
    FOREIGN KEY (idAntecedentes) REFERENCES Antecedentes(id),
    FOREIGN KEY (idTomaSignosVitales) REFERENCES TomaSignosVitales(id)
);

-- Tabla TomaSignosVitales
CREATE TABLE TomaSignosVitales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    direccion VARCHAR(255) NOT NULL,
    idEnfermero INT NOT NULL,
    idPaciente INT NOT NULL,
    FOREIGN KEY (idEnfermero) REFERENCES Enfermero(id),
    FOREIGN KEY (idPaciente) REFERENCES Paciente(id)
);

-- Tabla TomaSignosVitalesDetalles
CREATE TABLE TomaSignosVitalesDetalles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idTomaSignosVitales INT NOT NULL,
    valor DOUBLE NOT NULL,
    observaciones VARCHAR(255),
    FOREIGN KEY (idTomaSignosVitales) REFERENCES TomaSignosVitales(id)
);

-- Tabla ConsultaMedica
CREATE TABLE ConsultaMedica (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numeroConsulta VARCHAR(50) NOT NULL,
    idFichaMedica INT NOT NULL,
    idExamenDetalles INT,
    FOREIGN KEY (idFichaMedica) REFERENCES FichaMedica(id),
    FOREIGN KEY (idExamenDetalles) REFERENCES ExamenDetalles(id)
);

-- Tabla ExamenDetalles
CREATE TABLE ExamenDetalles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idExamenFisico INT,
    idExamenAdicional INT,
    FOREIGN KEY (idExamenFisico) REFERENCES ExamenFisico(id),
    FOREIGN KEY (idExamenAdicional) REFERENCES ExamenAdicional(id)
);

