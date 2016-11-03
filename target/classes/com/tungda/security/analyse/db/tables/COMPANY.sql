create table company
(
	name varchar(255),
	code varchar(255),
	industry varchar(255),
	business varchar(255),
	issue_price double,
	ipo_time date,
	location varchar(255),
	primary key(code),
	foreign key(code) references common_stock,dividend
	
)