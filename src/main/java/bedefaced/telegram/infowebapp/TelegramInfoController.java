package bedefaced.telegram.infowebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;

@RestController
public class TelegramInfoController {

    @Autowired
    TelegramClientWrapper telegramClientWrapper;

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public ContactInfo getInfo(@RequestParam(value="phone") String phone) throws InterruptedException {
        if (phone.substring(0,1).equals("+")) {
            phone = phone.substring(1);
        }

        ContactInfo result = telegramClientWrapper.getInfoByPhone(phone);

        if (!result.getPhotofilename().isEmpty()) {
            result.setPhotofilename("/photos/" + result.getUserId());
        }

        return result;
    }

    String toRealPhotoFilename(String fileName) {

        long userId = Long.parseLong(fileName);

        return new File(TelegramClientWrapper.PATH,userId + ".png").toString();
    }

    @RequestMapping(value = "/photos/{filename}", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody
    public FileSystemResource getFile(@PathVariable("filename") String fileName) {
        return new FileSystemResource(toRealPhotoFilename(fileName));
    }

}
