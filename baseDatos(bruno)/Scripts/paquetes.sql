--VISUALIZACION DE TODOS LOS CENTROS PAQUETES
CREATE OR REPLACE PACKAGE CONSULTACENTROS
AS 
PROCEDURE CENTROS (C OUT SYS_REFCURSOR);
END CONSULTACENTROS;

CREATE OR REPLACE PACKAGE BODY CONSULTACENTROS AS 
 PROCEDURE CENTROS(C OUT SYS_REFCURSOR) AS
 BEGIN 
  OPEN C FOR
SELECT ID, NOMBRE,  CALLE, NUMERO, CIUDAD, CODIGOPOSTAL, PROVINCIA, TELEFONO FROM CENTROS;
 END CENTROS;
END CONSULTACENTROS;


--VISUALIZACION DE TODOS LOS CENTROS Y DE UN CENTRO EN CONCRETO
DROP PACKAGE COMPLEJOS;

CREATE OR REPLACE PACKAGE COMPLEJOS
AS 
PROCEDURE CONSULTACENTROS (C OUT SYS_REFCURSOR);
PROCEDURE CONSULTACENTRO (C OUT SYS_REFCURSOR, BUSCAR IN VARCHAR2);
END COMPLEJOS;

CREATE OR REPLACE PACKAGE BODY COMPLEJOS AS 
 PROCEDURE CONSULTACENTROS(C OUT SYS_REFCURSOR) 
 AS
 BEGIN 
  OPEN C FOR
SELECT ID, NOMBRE,  CALLE, NUMERO, CIUDAD, CODIGOPOSTAL, PROVINCIA, TELEFONO FROM CENTROS;
   CLOSE C;
  END CONSULTACENTROS;

  PROCEDURE CONSULTACENTRO (C OUT SYS_REFCURSOR, BUSCAR IN VARCHAR2)
AS
 BEGIN 
OPEN C FOR
SELECT ID, NOMBRE,  CALLE, NUMERO, CIUDAD, CODIGOPOSTAL, PROVINCIA, TELEFONO FROM CENTROS;
CLOSE C;
END CONSULTACENTRO;
END COMPLEJOS;

--LISTADO DE EMPLEADOS
DROP PROCEDURE LISTADOEMPLEADOS;	
	
CREATE OR REPLACE PROCEDURE LISTADOEMPLEADOS
(IDN IN VARCHAR2, C OUT SYS_REFCURSOR)
AS
BEGIN
OPEN C FOR
SELECT * FROM TRABAJADORES WHERE CENTROS_ID=IDN;
CLOSE C;
END LISTADOEMPLEADOS;

--VER UN EMPLEADO
DROP PROCEDURE EMPLEADO;

CREATE OR REPLACE PROCEDURE EMPLEADO
(IDN IN VARCHAR 2, C OUT SYS_REFCURSOR)
AS 
BEGIN
OPEN C FOR
SELECT * FROM TRABAJADORES WHERE ID=IDN;
CLOSE C;
END EMPLEADO;