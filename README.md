# Database Abstraction

## The Story

This is a project that demonstrates the idea of loose coupling in a database abstraction context.

The idea behind this project is that you have to work on a project and store your data in a MySQL database. You do all your work properly, but one day your boss yells at you that he wants to migrate everything on MongoDB.

As you didn't think it through thoroughly from the beginning, now you have to update your entire code and replace all references to MySQL with the new reference to MongoDB.

<img alt="boss yelling at employee" src="https://image.freepik.com/free-vector/boss-yelling-employee_23-2147619711.jpg">
<sub><sup><a href='https://www.freepik.com/vectors/business'>Business vector created by freepik - www.freepik.com</a></sup></sub>

## The Solution

By using the **loose coupling** principle, you rely on interfaces (abstractions) rather than concrete implementations. For now, this project is just a mock to show how such a concept would apply in any application requiring a database (of any kind rather than a specific kind).  

Feel free to explore its contents and report any issue if needed.
