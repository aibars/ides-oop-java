
create table inquilinos (
   dni INT NOT NULL,
   genero varchar(1) default NULL,
   PRIMARY KEY (dni)
);

create table unidades (
   id INT NOT NULL auto_increment,
   descripcion varchar(200) default NULL,
   superficie decimal default null, 
   PRIMARY KEY (id)
);
