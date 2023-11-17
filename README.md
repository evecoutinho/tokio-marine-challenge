# tokio-marine-challenge

Desenvolvi a api REST utilizando java na versão 17 com spring boot e h2 como base de dados em memória, seguindo orientações do desafio.

Utilizei Lombok para facilitar a construção das entitidades e dtos, e deixar o código um pouco mais enxuto na sua escrita.

A aplicação é simples, optei por utilizar Model Mapper para facilitar a conversão do DTO de entrada para a Entity que seria realmente persistida. 

Há pontos que eu gostaria de melhorar tendo disponibilidade, tais como:  Adicionar um DTO personalizado para o retorno do POST e também do GET, para remover informações como o id e alguma outra informação que eu considere mais sigilosa. 

Também gostaria de adicionar algumas validações de dados extras no DTO e na Entidade, para fins de resolução do desafio, adicionei apenas as solicitadas, mas deixo a observação aqui.

Também criaria alguns testes unitários, com foco na classe de serviço para garantir o cumprimento de regra de negócio da forma como é pedida, validando o calculo das taxas e ranges de dias, conforme tabela do desafio, isso irá garantir que alterações no core do código, se afetarem o funcionamento, quebrem o build e não deixem que a aplicação suba com erros tão simples. 

Como extras adicionei o Swagger, para facilitar testes e também para facilitar no desenvolvimento. 

# Como testar

Rodo o projeto com o comando:

~~~
mvn spring-boot:run
~~~

Ou rode o application pela sua IDE 

Faça a requisição para seu localhost apontando para a porta 8080, como seguinte exemplo abaixo no POSTMAN:

~~~JSON
{
    "transferenceValue": 1500,
    "schedulingDate": "2023-11-27",
    "originAccount": 1234567890,
    "targetAccount": 2124487091
}
~~~

![image](https://github.com/evecoutinho/tokio-marine-challenge/assets/60928326/d0080341-d2e8-48bd-9a2e-a5e9c7898b4f)





