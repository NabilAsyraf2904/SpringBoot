# SpringBoot Database Connection

1- Application.properties (Make connection)
    ##Connect to database
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/DatabaseTable
    spring.datasource.username=username
    spring.datasource.password=password
    ##config JPA
    spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQLDialect
    spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
    spring.jpa.hibernate.ddl-auto= none
    spring.jpa.open-in-view=false

2- Create Entity (Beans)
    ##Declare Variable
    ##Create constructor
    ##Create setter & Getter

3- Create Repository (CRUD section)

4- Controller
    ##Autowired Repository
    ##Create method for the html function
