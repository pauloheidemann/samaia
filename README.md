# Samaia
Backend desenvolvido em Java utilizando SpringBoot

# Build
Para poder utilizar o frontend em Vue do teste da Samaia com o Back são necessárias as seguintes configurações:

* Alterar a porta padão do Wildfly de 8080 para 8081
  * Acessar o arquivo standalone.xml e alterar a seguinte linha
    * `<socket-binding name="http" port="${jboss.http.port:8081}"/>`
* Alterar a politica de CORS do servidor de aplicação
  * Adicionar as seguintes linhas dentro da tag `<host name="default-host" alias="localhost">`:
    * `<filter-ref name="Access-Control-Allow-Origin"/>
       <filter-ref name="Access-Control-Allow-Methods"/>
       <filter-ref name="Access-Control-Allow-Headers"/>
       <filter-ref name="Access-Control-Allow-Credentials"/>
       <filter-ref name="Access-Control-Max-Age"/>`
  * Adicionar as seguintes linhas dentro da tag `<filters>`
    * `<response-header name="Access-Control-Allow-Origin" header-name="Access-Control-Allow-Origin" header-value="*"/>
       <response-header name="Access-Control-Allow-Methods" header-name="Access-Control-Allow-Methods" header-value="GET, POST, OPTIONS, PUT, DELETE"/>
       <response-header name="Access-Control-Allow-Headers" header-name="Access-Control-Allow-Headers" header-value="accept, authorization,  content-type, x-requested-with"/>
       <response-header name="Access-Control-Allow-Credentials" header-name="Access-Control-Allow-Credentials" header-value="true"/>
       <response-header name="Access-Control-Max-Age" header-name="Access-Control-Max-Age" header-value="1"/>`
       
# Banco de dados
É necessária a criação de uma instância de Banco de dados de MySql com as seguintes configurações

* Criar schema chamado samaia `create database samaia;`
* Criar usuario e senha samaia `GRANT ALL PRIVILEGES ON *.* TO 'samaia'@'localhost' IDENTIFIED BY 'samaia';`

# Passos futuros
Adicionar a aplicação de front e de back em um Docker
