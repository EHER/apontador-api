# Apontador Api Java

Wrapper da API do Apontador <http://api.apontador.com.br> usando o Restfulie <http://restfulie.caelum.com.br/>


## Setup do projeto

Você precisa configurar as chaves de acesso da API Apontador. Para isso é 
preciso ter um aplicativo cadastrado no Apontador. Veja os links abaixo!

### Criar um novo Aplicativo
http://www.apontador.com.br/accounts/app/create.html

### Listar seus Aplicativos
http://www.apontador.com.br/accounts/apps.html

Para ter um novo arquivo de configuração, basta rodar um dos comandos abaixo
a partir da raiz do projeto.

	./config.sh

ou

	cp src/main/resources/config.properties.example src/main/resources/config.properties


Depois basta adicionar sua key e secret ao arquivo

	src/main/resources/config.properties


Vai ficar parecido com isso

	HOST=api.apontador.com.br
	PATH=v1
	KEY=my_key
	SECRET=my_secret