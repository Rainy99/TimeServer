package cn.devzhou.timeserver.Interface;

import java.io.IOException;
import java.util.Date;

public interface TimeService {
    Date getDateFromNtpServer() throws IOException;
}
