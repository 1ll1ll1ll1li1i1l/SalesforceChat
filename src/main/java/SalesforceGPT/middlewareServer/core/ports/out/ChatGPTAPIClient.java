package SalesforceGPT.middlewareServer.core.ports.out;


import SalesforceGPT.middlewareServer.core.domain.chatGPT.ChatGPTRequest;
import SalesforceGPT.middlewareServer.core.domain.chatGPT.ChatGPTResponse;

public interface ChatGPTAPIClient {
    ChatGPTResponse chat(ChatGPTRequest request);
}
