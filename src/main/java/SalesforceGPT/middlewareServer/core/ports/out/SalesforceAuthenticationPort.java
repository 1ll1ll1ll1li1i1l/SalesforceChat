package SalesforceGPT.middlewareServer.core.ports.out;


import SalesforceGPT.middlewareServer.core.domain.salesforce.SalesforceLoginResult;

public interface SalesforceAuthenticationPort {
    SalesforceLoginResult loginToSalesforce() throws Exception;
}
