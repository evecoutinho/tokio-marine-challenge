# tokio-marine-challenge

Desenvolvi a api REST utilizando java na versão 17 com spring boot e h2 como base de dados em memória, seguindo orientações do desafio.

Utilizei Lombok para facilitar a construção das entitidades e dtos, e deixar o código um pouco mais enxuto na sua escrita.

A aplicação é simples, optei por utilizar Model Mapper para facilitar a conversão do DTO de entrada para a Entity que seria realmente persistida. 

Há pontos que eu gostaria de melhorar tendo disponibilidade, tais como:  Adicionar um DTO personalizado para o retorno do POST e também do GET, para remover informações como o id e alguma outra informação que eu considere mais sigilosa. 

Também gostaria de adicionar algumas validações de dados extras no DTO e na Entidade, para fins de resolução do desafio, adicionei apenas as solicitadas, adicionar autenticação, e refatorar alguns pontos especificos da regra. 

Também criaria alguns testes unitários, com foco na classe de serviço para garantir o cumprimento de regra de negócio da forma como é pedida, validando o calculo das taxas e ranges de dias, conforme tabela do desafio, isso irá garantir que alterações no core do código, se afetarem o funcionamento, quebrem o build e não deixem que a aplicação suba com erros tão simples. 

Em relação a resolução do desafio em si, tomei as seguintes escolhas: Não somei a taxa da transferência no valor total da transação, mapeei a entidade com um campo chamado "fee" no qual eu realizo o calculo e seto o valor de taxa para aquela transfência de forma separada na persistência, assim mantendo a transparência do que é o valor a ser transferido e a taxa sobre tal montante. 

Qualqer dúvidas sobre a resolução do problema, dicas e pontos a melhoras, questionamentos das decisões que tomei, estou completamento aberto a bater um papo com vocês

# Como testar

Rodo o projeto com o comando:

~~~
mvn spring-boot:run
~~~

Ou rode o application pela sua IDE 

Faça a requisição para seu localhost apontando para a porta 8080, use o JSON de exemplo abaixo no POSTMAN:

~~~JSON
{
    "transferenceValue": 1500,
    "schedulingDate": "2023-11-27",
    "originAccount": 1234567890,
    "targetAccount": 2124487091
}
~~~

# Frontend 

O frontend foi desenvolvido em vue.js no qual estudei durante essa semana, então ainda tenho conhecimento básico, o repositório é o seguinte: 

https://github.com/evecoutinho/vue-frontend 

O CrossOrigin no backend está configurado para receber chamadas do front, através da porta 8081, então se atente a isso ao rodar o app vue.

O front infelizmente não foi finalizado totalmente e explico o motivo na mensagem abaixo (Peço sua gentileza em ler):

# Mensagem ao time Tokio Marine

Desenvolvi apenas uma tela que faz o get para a api, ou seja, seria o extrato pedido no desafio, infelizmente não pude terminar a tela de cadastro da transferência, para realizar o agendamento, pois estou com um problema de energia e internet, após as fortes chuvas que afetaram são paulo e aqui em Embu das artes, minha internet só voltou agora no domingo, e tenho nesses dias anteriores peregrinado, tentando fazer o máximo que consigo com a bateria do note, dados móveis, indo pra casa de colegas, mas acaba que é pouco produtivo trabalhar assim,  agradeço da mesma forma aos avaliadores do time tokio marine pela oportunidade, caso meu teste seja considerado assim mesmo, tanto o backend completo, como o front com esse detalhe faltante, estou disposto a fazer parte do time, aprender ainda mais de vue além do que pude estudar em 1 dia, tempo o qual tive disponível sem os problemas mencioanados anteriormente, possuo bastante experiência no backend, e sei que ainda não demonstrei todo meu potencial, sei que posso colaborar ativamente com o time e aprender muito com vocês e também compartilhar muito conhecimento e experiências que obtive durante minha carreira até aqui.  

De tudo que vi e ouvi sobre a tokio, espero realmente poder fazer parte dessa jornada no time de desenvolvimento com todos vocês, obrigado!

Everton Coutinho
Desenvolvedor Java e Kotlin









