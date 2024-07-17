<h1 align="center">FórumHub</h1>

# Descrição
Este projeto Java utiliza Spring Boot para criar uma api para um fórum interativo, permitindo aos usuários realizar diversas operações como criação de tópicos, busca por tópicos existentes, atualização e exclusão de tópicos. Utiliza um banco de dados MySQL para armazenar informações dos usuários, tópicos e cursos relacionados, além de implementar operações completas de CRUD (Create, Read, Update, Delete) para gerenciar tópicos e outras entidades conforme necessário.

# Funcionalidades
1. Criar novos tópicos, usuários e cursos
2. Atualizar informações de tópicos.
3. Excluir tópicos.
4. Listar todos os tópicos.
5. Buscar tópicos.
6. Autenticação e autorização para acesso à determinados recursos através da geraação de tokens JWT.
7. Validação dos dados informados.
8. Utilização do banco de dados MySQL.

# Tecnologias utilizadas
- Intelij IDEA Community Edition 2024.1
- Java 17
- Maven
- Banco de dados MySQL
- Jackson Databind
- Spring Boot
- Spring Data JPA (Java Persistence API)
  
# Como utilizar
Antes de utilizar o projeto certifique-se de estar utilizando as seguintes tecnologias:
- Java 17
- Spring boot
- Maven
- Spring Data JPA
- Jackson Databind
- Banco de dados PostgreSQL

1. Clone este repositório
   
 ```
bash
   git clone https://github.com/debCristina/literalura.git
```
2. Configure seu PostgreSQL criando um banco de dados para a aplicação
   
3.  No arquivo `src/main/resources/aplication.properties` configure com suas informações

   ```
   properties
      spring.datasource.url=jdbc:postgresql://${DB_HOST}/forumhub
      spring.datasource.username=${DB_USER}
      spring.datasource.password=${DB_PASSWORD}

   ```
   
- Configure as variáveis de ambiente ${DB_HOST}, ${DB_USER} e ${DB_PASSWORD} pelos valores específicos do seu ambiente de desenvolvimento.
- Abra o projeto em sua IDE java preferida e execute.

# Minha experiência
Desenvolver este projeto foi um desafio muito enriquecedor, onde pude aplicar e aprimorar significativamente minhas habilidades em Java. Esta jornada me proporcionou uma excelente oportunidade para explorar profundamente o desenvolvimento utilizando Spring Framework, além de me familiarizar com conceitos avançados de integração de banco de dados. Concluir esta etapa me deixa muito satisfeita, e estou motivada a continuar explorando os recursos disponíveis para continuar aprimorando minhas habilidades como desenvolvedora.

# Contribuíções
Contribuíções são sempre bem-vindas para enriquecer ainda mais o projeto.

# Envolvidos
Este foi um projeto  desenvolvido como parte da especialização em back-end pelo programa ONE (ORACLE NEXT EDUCATION)  parceria entre Oracle e Alura Latam.
<p align="center">
    <img src="https://github.com/user-attachments/assets/6d793c82-35e7-4116-a768-cee846791281">
    <img src="https://github.com/user-attachments/assets/b03c2893-4bba-4862-9223-a19940a8c47e">
</p>

# Autor
Este projeto foi desenvolvido por Débora Ferreira

# Badge
<p align="center">
  <img src="https://github.com/user-attachments/assets/97f6efe5-858c-407a-be97-8eb270973f18">
  

</p>
