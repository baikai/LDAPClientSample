package com.asiainfo.bdx.ocdp;

import javax.naming.NamingEnumeration;
import javax.naming.directory.SearchResult;

/**
 * Created by baikai on 8/17/16.
 */
public class LdapClientTest {
    public static final void main(String[] args){
        System.out.println("Start ldap test.");
        // Please replace LDAP url, admin user dn and admin user password with your value.
        LdapClient client = new LdapClient("<LDAP URL>", "<LDAP admin user dn>", "<LDAP admin user password>");
        System.out.println("Create ldap user.");
        client.createLDAPUser("baikaitest", "Passw0rd", "100", "101");

        System.out.println("Search ldap user.");
        NamingEnumeration<SearchResult> searchResults = client.searchLDAPUser("uid=baikaitest,ou=People,dc=asiainfo,dc=com", "(uid=baikaitest)");
        System.out.println("Search result: " + searchResults.nextElement().getNameInNamespace());

        System.out.println("Modify attribute description.");
        client.updateLDAPUserAttribute("uid=baikaitest,ou=People,dc=asiainfo,dc=com", "description", "Description updated.");

        System.out.println("Delete ldap user.");
        client.deleteLDAPUser("uid=baikaitest,ou=People,dc=asiainfo,dc=com");

        System.out.println("Create ldap user group.");
        client.createLDAPUserGroup("baikaiGroup", "Passw0rd", "102");

        System.out.println("Delete ldap user group.");
        client.deleteLDAPUserGroup("cn=baikaiGroup,ou=People,dc=asiainfo,dc=com");

        System.out.println("LDAP test done.");
    }
}
