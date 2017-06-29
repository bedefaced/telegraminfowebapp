# Telegram phone info getter (Spring Boot web application)
Spring application that receives information about phone number using Telegram API.

Application is recommended for educational purposes (using Telegram API) only.

Application uses [Telegram API Java library](https://github.com/rubenlagus/TelegramApi) by *rubenlagus*.

## Building and running
As typical Spring Boot application:
```
./gradlew build
cd build/libs
java -jar telegraminfo-rest-service-0.1.0.jar
```
or
```
./gradlew bootRun
```

By default application will work at: `http://localhost:8080/`

Request example: `http://localhost:8080/getInfo?phone=70000000000`
where `70000000000` is phone what you want get information about.

## Input & Output
Input:
* phone

Output (`ContactInfo` instance):
* phone registered state
* user id
* first name
* last name
* username
* big photo

## Telegram API configuration
You should set your own Telegram API key and hash in `TelegramClientWrapper.java`:
```
static final int APIKEY = 0; // YOUR API KEY
static final String APIHASH = "000000000000000000000000000000000"; // YOUR API HASH
static final String PHONENUMBER = "70000000000"; // YOUR PHONE NUMBER
```
and then enter received SMS-code in console when application will ask for it.

Guide about obtaining API key/hash is present in Telegram API [documentation](https://core.telegram.org/api/obtaining_api_id).
