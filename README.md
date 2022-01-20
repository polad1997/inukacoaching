# inukacoaching

These are APIs that we need to provide:

Please be informed that server port changed to 8088
- localhost:8080

Also make sure that MySql is configured and database name is inukacoaching.
- jdbc:mysql://localhost:3306/inukacoaching

Methods Urls Actions:

- GET /api/test/all retrieve public content
- GET /api/test/user access User’s content
- GET /api/test/mod access Moderator’s content
- GET /api/test/admin access Admin’s content
- POST /api/auth/signup signup new account
- POST /api/auth/signin login an account

When application is running there are 3 roles will be inserted to roles table.
-   ROLE_USER      
-   ROLE_MODERATOR 
-   ROLE_ADMIN 