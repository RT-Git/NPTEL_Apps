package com.wordpress.obliviouscode.everything;

import android.support.v4.app.Fragment;

/**
 * Created by Ravi on 14-10-2016.
 */

public class ReportListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new ReportListFragment();
    }
}
