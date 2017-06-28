package bedefaced.telegram.infowebapp;

import org.telegram.bot.structure.BotConfig;

public class BotConfigImpl extends BotConfig {

    String phoneNumber;

    public BotConfigImpl(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String getBotToken() {
        return null;
    }

    @Override
    public boolean isBot() {
        return false;
    }
}
