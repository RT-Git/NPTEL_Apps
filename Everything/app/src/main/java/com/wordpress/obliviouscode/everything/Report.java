package com.wordpress.obliviouscode.everything;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ravi on 14-10-2016.
 */

public class Report {
    private UUID mId;
    private String mTitle;
    private Date mDate;

    private boolean mResolved;


    public boolean ismResolved() {
        return mResolved;
    }


    public void setResolved(boolean mResolved) {
        this.mResolved = mResolved;
    }


    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }


    public Report()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId()
    {
        return mId;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void setTitle(String title)
    {
        mTitle = title;
    }
}
