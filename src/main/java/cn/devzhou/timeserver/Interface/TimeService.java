package cn.devzhou.timeserver.Interface;

import java.util.Date;

public interface TimeService {
    Date getDateFromNtpServer(String ntpServerAddress);
}
