package SalesforceGPT.middlewareServer.core.ports.out;


import SalesforceGPT.middlewareServer.core.domain.salesforce.SendToSalesforce;

public interface SalesforceOutboundPort {
    void sendChat(SendToSalesforce sendChat) throws Exception; //객체를 Salesforce로 전송

}