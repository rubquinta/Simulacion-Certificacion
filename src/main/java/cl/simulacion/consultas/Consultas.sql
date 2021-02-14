
/*
MODIFICO DATOS DESCRIPCION EN TABLA ESPECIALIDADES
PORQUE LLEGARON CON VALORES EXTRA�OS POR EL ACENTO
*/
update ESPECIALIDADES 
set especialidades.descripcion = 'Proctologia' 
where especialidades.idespecialidad=1;

update ESPECIALIDADES 
set especialidades.descripcion = 'Gastroenterologia' 
where especialidades.idespecialidad=2;

update ESPECIALIDADES 
set especialidades.descripcion = 'Ginecologia' 
where especialidades.idespecialidad=3;

update ESPECIALIDADES 
set especialidades.descripcion = 'Neurologia' 
where especialidades.idespecialidad=4;

update ESPECIALIDADES 
set especialidades.descripcion = 'Traumatologia'
where especialidades.idespecialidad=5;

update ESPECIALIDADES 
set especialidades.descripcion = 'Cardiologia' 
where especialidades.idespecialidad=6;

update ESPECIALIDADES 
set especialidades.descripcion = 'Psiquiatria' 
where especialidades.idespecialidad=7;
select * from especialidades;

/*
Listado de los doctores pertenecientes a la especialidad de Cardiolog�a, indicando el
apellido, nombre y RUT, y ordenados ascendentemente por el apellido y despu�s por el
nombre.
*/

Select nombre, apellido, rutDoctor 
from doctores inner join especialidades
on doctores.idespecialidad = especialidades.idespecialidad
where especialidades.descripcion = 'Cardiologia'
Order By apellido, nombre asc ;

/*
Reporte que muestre la cantidad total de minutos agendados por cada d�a, desplegando
la fecha de forma descendente, y asignando a la columna que representa la suma de
minutos el nombre �TIEMPOTOTAL�.
*/
 

select fecha, SUM(duracion) as TIEMPOTOTAL 
from AGENDAS
group by fecha
order by fecha desc;

/*
Listado de los pacientes atendidos por el doctor Juan Manogrande, junto con el d�a y hora
en que son atendidos. Debe estar ordenado ascendentemente por fecha y
posteriormente por hora, desplegando del paciente su nombre y su apellido
*/


select pacientes.nombre, pacientes.apellido, agendas.fecha, agendas.horadesde from pacientes
INNER JOIN agendas
ON pacientes.idpaciente = agendas.idpaciente
INNER JOIN doctores
ON agendas.iddoctor = doctores.iddoctor
where doctores.nombre = 'Juan' and doctores.apellido = 'Manogrande';

/*
Listado de todos los doctores registrados en sistema, indicando RUT del doctor, su
nombre y su apellido, considerando adem�s en otra columna la cantidad de citas
agendadas. En caso de que el doctor no tenga horas agendadas, debe indicar un valor 0;
adem�s, la columna debe llevar por nombre �CANTIDADAGENDA�. El resultado debe
estar ordenado ascendentemente por el RUT del doctor
*/

 select doctores.rutdoctor, doctores.nombre, doctores.apellido, count(agendas.idagenda) from doctores 
 Left Join agendas on doctores.iddoctor = agendas.iddoctor
 group by doctores.rutdoctor, doctores.nombre, doctores.apellido
 order by doctores.rutdoctor asc;
 
 /*
 Listado de los pacientes (nombre, apellido y RUT) que se han atendido con doctores de
la especialidad de Neurolog�a. Este listado debe estar ordenado ascendentemente por el
RUT del paciente.
 */
 
 select pacientes.nombre, pacientes.apellido, pacientes.rutpaciente from pacientes
 INNER JOIN AGENDAS
 ON pacientes.idpaciente = agendas.idpaciente
 INNER JOIN doctores
 ON agendas.iddoctor = doctores.iddoctor
 INNER JOIN especialidades
 ON doctores.idespecialidad = especialidades.idespecialidad
 where especialidades.descripcion = 'Neurologia'
 ORDER BY pacientes.rutpaciente asc
 ;
 
 SELECT PACIENTES.NOMBRE FROM PACIENTES ORDER BY PACIENTES.NOMBRE ASC;
 