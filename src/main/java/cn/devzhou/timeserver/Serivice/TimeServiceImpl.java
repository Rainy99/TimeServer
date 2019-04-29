package cn.devzhou.timeserver.Serivice;

import cn.devzhou.timeserver.Interface.TimeService;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

@Service
public class TimeServiceImpl implements TimeService {

    @Value("${cn.devzhou.ntpServerAddress}")
    private String ntpServerAddress;

    @Override
    public Date getDateFromNtpServer() throws IOException
    {
        NTPUDPClient timeClient = new NTPUDPClient();
        String timeServerUrl = ntpServerAddress;
        InetAddress timeServerAddress = InetAddress.getByName(timeServerUrl);
        TimeInfo timeInfo = timeClient.getTime(timeServerAddress);
        TimeStamp timeStamp = timeInfo.getMessage().getTransmitTimeStamp();
        Date date = timeStamp.getDate();
        return date;

    }
}
