package cn.devzhou.timeserver.Controller;

import cn.devzhou.timeserver.Interface.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HomeController {

    @Autowired
    private TimeService _timeService;

    @GetMapping("/")
    public String index() throws IOException
    {
        Date date = _timeService.getDateFromNtpServer();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateFormat.format(date);
        return dateStr;

    }
}
