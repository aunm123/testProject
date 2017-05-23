package com.tim.BaseClass;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by timhuo on 2017/5/23.
 */
public class BasePojo {
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date gen_date;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date lase_update_date;

    public Date getGen_date() {
        return gen_date;
    }

    public void setGen_date(Date gen_date) {
        this.gen_date = gen_date;
    }

    public Date getLase_update_date() {
        return lase_update_date;
    }

    public void setLase_update_date(Date lase_update_date) {
        this.lase_update_date = lase_update_date;
    }
}
