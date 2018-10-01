create table favoritos_itens (
	favoritoId LONG not null primary key,
	userId LONG,
	favoritos_itenscol VARCHAR(75) null
);