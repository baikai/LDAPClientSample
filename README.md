# LDAPClientSample

A Sample LDAP Java client for add/delete/modify/search LDAP user/user group.

## Geting Started

### 1 Clone code from github

    git clone git@github.com:baikai/LDAPClientSample.git
    
### 2 Replace LDAP url, admin user dn and admin user password with your value.

    vim src/main/java/com/asiainfo/bdx/ocdp/LdapClientTest.java

### 3 Build by maven

    mvn package
    ls target/ldapsamples-1.0-SNAPSHOT.jar

### 4 Run

    java -cp ldapsamples-1.0-SNAPSHOT.jar com.asiainfo.bdx.ocdp.LdapClientTest