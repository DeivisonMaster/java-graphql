<h1> API de demonstração do GraphQL </h1>
<p>Api desenvolvida com Spring boot</p>

GraphQL especificação desenvolvida pelo Facebook para tornar mais performático o acesso a dados de multiplos endpoints.
<br/>
Como vantagens tem-se o menor consumo de rede ao trafegar dados via HTTP.
Evita a criação de rotas adicionais no REST

<br/>
Foi desenvolvido API simples para aplicar o GraphQL. O dominio é composto por Produtos N:1 Categoria sendo persistidos em banco em memória H2.
<br/>

Mutation: 
adicionaCategoria:

![Screenshot](docs/adiciona-categoria.jpg)

<br/>

Mutation: adicionaCategoria / Query: listarProdutos:
<br/>
No exemplo abaixo é possivel notar que o client do recurso via query string, obtem apenas o que lhe é necessário via requisição, sem a necessidade
de se ter varios dados do objeto de retorno.

![Screenshot](docs/adiciona-lista-produtos.jpg)

<br/>

<h2>Tecnologias Aplicadas</h2>
<p>Java 8</p>
<p>Apache Maven</p>
<p>Spring Boot</p>
<p>Spring Data JPA</p>
<p>Devtools</p>
<p>Apache Tomcat Embarcado</p>
<p>GraphQL</p>
<p>h2</p>

