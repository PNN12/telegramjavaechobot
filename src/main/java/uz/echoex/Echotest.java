package uz.echoex;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Echotest {
    public static void main(String[] args){
        System.out.println("gdiugtiughtrughtrghfuihi");

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Echobot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
