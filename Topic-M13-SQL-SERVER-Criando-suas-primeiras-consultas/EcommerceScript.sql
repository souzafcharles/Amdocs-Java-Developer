/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Thiago Campos
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 15, 2022
 */

create database Ecommerce
use Ecommerce

create table Produtos
(
	Codigo int not null,
	Nome varchar (100) not null,
	Descricao varchar (200) not null,
	Preco float not null
)

create table Clientes
(
	Codigo int not null,
	Nome varchar(50) not null,
	TipoPessoa char(1) not null
)

create table Pedido
(
	Codigo int not null,
	DataSolicitacao datetime not null,
	FlagPago bit not null,
	TotalPedido float not null,
	CodigoCliente int not null
)

create table PedidoItem
(
	CodigoPedido int not null,
	CodigoProduto int not null,
	Preco float not null,
	Quantidade int not null
)

insert into clientes(Codigo, Nome, TipoPessoa) values (1, 'Charles', 'F');
insert clientes(Nome, Codigo, TipoPessoa) values ('Balthazar', 2, 'F');
insert clientes(TipoPessoa, Nome, Codigo) values ('J', 'Ophelia', 3);
insert clientes values (4, 'Epaminondas', 'J');
insert clientes values (5, 'Crispim', 'F'), (6, 'Guerino', 'J'), (7, 'Clotilde', 'J'), (8, 'Filisbina', 'F')
select * from Clientes

delete from Clientes where Codigo in(5, 4, 3)

insert Produtos values(1, 'Caneta', 'Caneta Azul', 1.50)
insert Produtos values(2, 'Mochila', 'Cancguru', 70.50)
select * from Produtos

insert Pedido values (1, getdate(), 0, 1.5, 7)
insert Pedido values (2, getdate(), 0, 70.50, 1)
select * from Pedido

insert PedidoItem values(2, 1, 1.5, 1)
insert PedidoItem values(2, 2, 20.99, 1)
select * from PedidoItem

insert Clientes(Codigo, Nome, TipoPessoa) values(9, 'Gregorio', 'J')
select * from Clientes

select isnull(DataCriacao, getdate()), * from Clientes
select * from Clientes

select *,
	case
		when TipoPessoa = 'J' then 'Juridica'
		when TipoPessoa = 'F' then 'Fisica'
		else 'Pessoa Indefinida'
	end + convert(varchar, getdate(), 103)
from Clientes

select *, convert(varchar, DataSolicitacao, 103) from Pedido
select * from Pedido

alter table Clientes add constraint pk_Cliente primary key(Codigo)
insert Clientes values('Frederico', 'J', getdate())
select * from	Clientes

alter table PedidoItem add constraint fk_Pedido foreign key(CodigoPedido) references Pedido(Codigo)
select * from PedidoItem

alter table Pedido add CodigoStatus int
alter table Pedido add DescStatus varchar(50)

update Pedido set CodigoStatus = 1, DescStatus = 'Em Andamento'
select * from Pedido

Select * from Status
Select * from StatusPedidoItem
Select * From PedidoItemLog

insert PedidoItemLog (CodigoPedido, CodigoProduto, CodigoStatusPedidoItem, DataMovimento)
Select * From PedidoItemLog

select CodigoPedido, CodigoProduto, 1, getdate() from PedidoItem

insert PedidoItemLog values(1, 2, 1, getdate())
Select * From PedidoItemLog


select	*
	from  Clientes cli
	inner join Pedido ped
	on    cli.Codigo = ped.CodigoCliente

select	*
	from  Clientes cli
	left  join Pedido ped
	on    cli.Codigo = ped.CodigoCliente

select	*
	from  Pedido ped
	right join Clientes cli
	on    cli.Codigo = ped.CodigoCliente

select	cli.Nome,
		ped.TotalPedido,
		case
			when cli.TipoPessoa = 'F' then 'Fisica'
			else 'Juridica'
		end TipoPessoa
	from Clientes cli
	left join Pedido ped
	on	 cli.Codigo = ped.CodigoCliente

select	*
	from  PedidoItem t1
	inner join PedidoItemLog t2
	on	  t1.CodigoPedido = t2.CodigoPedido
	and	  t1.CodigoProduto = t2.CodigoProduto
	inner join StatusPedidoItem t3
	on	  t3.Codigo = t2.CodigoStatusPedidoItem
	where Preco between 1 and 2

select	sum(Preco * Quantidade) 
	from  	PedidoItem t1
	inner join PedidoItemLog t2
	on	  t1.CodigoPedido = t2.CodigoPedido
	and	  t1.CodigoProduto = t2.CodigoProduto
	inner join StatusPedidoItem t3
	on	  t3.Codigo = t2.CodigoStatusPedidoItem

select	avg(Preco) 
 	from  	PedidoItem t1
 	inner 	join PedidoItemLog t2
 	on    	t1.CodigoPedido = t2.CodigoPedido
 	and   	t1.CodigoProduto = t2.CodigoProduto
 	inner 	join StatusPedidoItem t3
 	on    	t3.Codigo = t2.CodigoStatusPedidoItem

select	count(*) 
 	from	PedidoItem t1
 	inner	join PedidoItemLog t2
 	on	t1.CodigoPedido = t2.CodigoPedido
 	and	t1.CodigoProduto = t2.CodigoProduto
 	inner	join StatusPedidoItem t3
 	on	t3.Codigo = t2.CodigoStatusPedidoItem

select	* 
 	from	PedidoItem t1
 	inner	join PedidoItemLog t2
 	on	t1.CodigoPedido = t2.CodigoPedido
 	and	t1.CodigoProduto = t2.CodigoProduto
	inner	join StatusPedidoItem t3
	on	t3.Codigo = t2.CodigoStatusPedidoItem
 	inner	join Produtos t4
 	on	t4.Codigo = t2.CodigoProduto

select	t4.Codigo,
	t4.Descricao,
	t1.Preco * t1.Quantidade
 	from	PedidoItem t1
 	inner	join PedidoItemLog t2
 	on	t1.CodigoPedido = t2.CodigoPedido
 	and	t1.CodigoProduto = t2.CodigoProduto
 	inner	join StatusPedidoItem t3
 	on	t3.Codigo = t2.CodigoStatusPedidoItem
 	inner	join Produtos t4
 	on	t4.Codigo = t2.CodigoProduto

select	t4.Codigo,
	t4.Descricao,
	sum(t1.Preco * t1.Quantidade) 
	from	PedidoItem t1
	inner	join PedidoItemLog t2
	on	t1.CodigoPedido = t2.CodigoPedido
	and	t1.CodigoProduto = t2.CodigoProduto
	inner	join StatusPedidoItem t3
	on	t3.Codigo = t2.CodigoStatusPedidoItem
	inner	join Produtos t4
	on	t4.Codigo = t2.CodigoProduto
	group	by t4.Codigo, t4.Descricao
	order	by 2 desc
