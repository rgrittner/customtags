package com.reneegrittner.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalTime;

public class TimeOfDayGreeting extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        LocalTime localTime = LocalTime.now();
        super.doTag();
        JspWriter out = getJspContext().getOut();
        if (localTime.getHour() < 12) {
            out.println("Good Morning!");
        } else if (localTime.getHour() >= 12 && localTime.getHour() < 17) {
            out.println("Good Afternoon!");
        } else if (localTime.getHour() >= 17) {
            out.println("Good Evening!");
        } else {
            out.println("Lovely Day!");
        }

    }

}
