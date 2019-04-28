package cn.devzhou.timeserver.Serivice;

import cn.devzhou.timeserver.Interface.TimeService;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;

@Service
public class TimeServiceImpl implements TimeService {
    @Override
    public Date getDateFromNtpServer(String ntpServerAddress)
    {
        throw new NotImplementedException();
    }
}
