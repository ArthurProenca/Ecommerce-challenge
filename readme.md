
# Ecommerce challenge

A retail store in the city of Itaú de Minas wants to create the backend of an e-commerce. To do this, the SpringBoot technology and Java 17 were selected.


## Requirements
* Java17 installed
* An IDE (IntelliJ fully recommended)
* Postman (with the collection: Ecommerce collection.postman_collection.json)

## Author

- [@ArthurProenca](https://www.github.com/ArthurProenca)

## First steps
- Create a fork from its repository and start!

## Documentation
```http
  GET /api/v1/customer
```

| Param | Type   | Overview                      |
|:------|:-------|:------------------------------|
| `id`  | `Long` | **Need** uuid from a customer |


```http
  POST /api/v1/customer
```

| Param         | Type          | Overview                          |
|:--------------|:--------------|:----------------------------------|
| `CustomerDTO` | `CustomerDTO` | **Need** DTO from Customer entity |

```http
  PUT /api/v1/customer
```

| Param         | Type          | Overview                              |
|:--------------|:--------------|:--------------------------------------|
| `id`          | `Long`        | **Need** uuid from updatable customer |
| `CustomerDTO` | `CustomerDTO` | **Need** DTO from Customer entity     |

```http
  DELETE /api/v1/customer
```

| Param | Type   | Overview                              |
|:------|:-------|:--------------------------------------|
| `id`  | `Long` | **Need** uuid from deletable customer |

## Roadmap from phase 1
- Create Products Layer based on Customer Layer
- Upgrade the Customer Layer (and its "children") to a more professional code
- Make a filter for only admin users update/get/delete entities from database using endpoints that were created (implementation of it will be your way :) )

## Roadmap from phase 2
- Change the Customer Layer adding the CEP attribute where it will be passed on DTO and save to database only the street, number, neighborhood, city and state provided by <a href = "https://viacep.com.br/">VIACEP API</a> (will require changes on DTO and Entity!)
- Create a new layer called "Order" where it will be possible to create an order with a customer and a list of products
- Create a new layer called "Delivery" where it will be possible to create a delivery for an order 

## Roadmap from phase 3
- Create a Docker instance from the project to make a deploy on <a href="https://railway.app/"> RAILWAY </a>
- Use Swagger to documentation 
- Create tests for all services on application
- Refactor the project in all instances

## Final
- Add the the fork and deployed link to its readme.md

## ELIMINATION CRITERIA
- If you don't use the current code structure (not using Java Interface, Stream and lambda APIS, Lombok and H2 Database and package structure)
- Several bugs on your implementation (will not be described because bugs cant be predicted without thinking!)
- If your code is not readable (will be evaluated by me)
- Bad code smells like merge Portuguese and English implementations
- Bad commit messages (see <a href="https://www.freecodecamp.org/news/how-to-write-better-git-commit-messages/"> How to write better commit messages</a>)
- Do not use more than actual inheritance and association database relations

## Bonuses
- If you create Exceptions from each error occurred by client (like BadPasswordException and etc)
- If you do not recreate the wheel (like recreating functions that were previously created by Java Community)
- Make improvements on the project (like adding a new layer, new attributes, new relations and etc)

## Extra

You can use the console from database on <a href="http://localhost:8080/h2-console"> http://localhost:8080/h2-console </a> to see the database and its tables.
Use the following credentials to login:

`JDBC Url: jdbc:h2:mem:ecommerce_friday;`

`user: user`

`password: pwd`