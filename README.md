# Polymorphism: Method Overloading dan Overriding (Java)
## Identitas
- Nama  : Nency Elvaretta Ardelia  
- NIM   : E31251934  


## Deskripsi
Proyek ini merupakan implementasi konsep **OOP** dalam Java, khususnya **polimorfisme** melalui:
- Method overloading  
- Method overriding  

Studi kasus: sistem login (username, email, Google).


## Konsep


```java
Overloading: Method sama, parameter berbeda.
void login(String username, String password)
void login(String email, String password, boolean isEmail)

Overriding: Method sama, diubah di subclass.
@Override
void login(String username, String password)
