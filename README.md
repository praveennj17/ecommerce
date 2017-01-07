# ecommerce

1. Create folder ecommerce
2. Open folder in cmd or gitshell
3. Run the following command from the ecommerce folder
```
   git init
   git remote add origin git@github.com:sks40gb/ecommerce.git
   git fetch
   git checkout develop
   git checkout -b <branchname>
   ```
4. Open Netbeans
5. Create New Project 
6. File -> New Project 
7. Select Categories - **Java Web**
8. Select Projects - **Web Application with existing source**
9. Click **Next**
10. Select the location of the project and click **next** and **finish**
11. Run the query from **DB.sql** and **Query.sql** located at folder */web/doc/DB*


---
#Generate a new SSH key

If you don't have an existing SSH key that you wish to use, generate one as follows:
Log in to your local computer as an administrator.
In a command prompt, run:

```
ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
```
```
Generating public/private rsa key pair.
```
```
Enter a file in which to save the key (/Users/you/.ssh/id_rsa): [Press enter]
```
```
Enter passphrase (empty for no passphrase): [Press enter]
Enter same passphrase again: [Press enter]
```

Look for public file, ex : /home/demo/.ssh/id_rsa.pub
```
ssh-keygen -t rsa
Generating public/private rsa key pair.
Enter file in which to save the key (/home/demo/.ssh/id_rsa): 
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /home/demo/.ssh/id_rsa.
Your public key has been saved in /home/demo/.ssh/id_rsa.pub.
The key fingerprint is:
4a:dd:0a:c6:35:4e:3f:ed:27:38:8c:74:44:4d:93:67 demo@a
The key's randomart image is:
+--[ RSA 2048]----+
|          .oo.   |
|         .  o.E  |
|        + .  o   |
|     . = = .     |
|      = S = .    |
|     o + = +     |
|      . o + o .  |
|           . o   |
|                 |
+-----------------+
```

#Troubleshooting 

---
```
ssh: Could not resolve hostname github.com: Name or service not known
```
Run the following command to resolve this issue
```
git remote set-url origin git@github.com:sks40gb/ecommerce.git
```

