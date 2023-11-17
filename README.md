# tokio-marine-challenge

Desenvolvi a api REST utilizando java na versão 17 com spring boot e h2 como base de dados em memória, seguindo orientações do desafio.

Utilizei Lombok para facilitar a construção das entitidades e dtos, e deixar o código um pouco mais enxuto na sua escrita.

A aplicação é simples, optei por utilizar Model Mapper para facilitar a conversão do DTO de entrada para a Entity que seria realmente persistida, há pontos que eu gostaria de melhorar tendo disponibilidade, tais como:  Adicionar um DTO personalizado para o retorno do POST e também do GET, para remover informações como o id e alguma outra informação que eu considere mais sigilosa. Também gostaria de adicionar algumas validações de dados no DTO, para fins de resolução do desafio, não adicionei, mas deixo a observação aqui, também criaria alguns testes unitários a classe de serviço para garantir o cumprimento de regra de negócio da forma como é pedida. 

Como extras adicionei o Swagger, para facilitar testes e também para facilitar no desenvolvimento. 

Para rodar a API basta rodar a aplicar com mvn spring-boot:run, fazer a requisição para seu localhost apontando para a porta 8080, como seguinte exemplo no POSTMAN: 

![image](https://github.com/evecoutinho/tokio-marine-challenge/assets/60928326/d0080341-d2e8-48bd-9a2e-a5e9c7898b4f)



