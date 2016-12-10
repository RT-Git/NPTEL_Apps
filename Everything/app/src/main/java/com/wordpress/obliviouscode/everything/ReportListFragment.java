package com.wordpress.obliviouscode.everything;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Ravi on 14-10-2016.
 */

public class ReportListFragment extends Fragment {
    private RecyclerView mReportRecyclerView;
    private ReportAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_report_list,container,false);
        mReportRecyclerView = (RecyclerView) view.findViewById(R.id.report_recycler_view);
        //Recyclerview needs a LinearLayoutManager
        mReportRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI(){
        ReportStore reportStore = ReportStore.get(getActivity());
        List<Report> reports = reportStore.getReports();
        mAdapter = new ReportAdapter(reports);
        mReportRecyclerView.setAdapter(mAdapter);
    }

    private class ReportHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitleTextView;
        private Report mReport;
        private TextView mDateTextView;
        private CheckBox mResolvedCheckBox;



        public ReportHolder(View itemView){
            super(itemView);

            itemView.setOnClickListener(this);
            mTitleTextView = (TextView)
                    itemView.findViewById(R.id.list_item_report_title_text_view);

            mDateTextView = (TextView)
                    itemView.findViewById(R.id.list_item_report_date_text_view);

            mResolvedCheckBox = (CheckBox)
                    itemView.findViewById(R.id.list_report_resolved_check);

        }


        @Override
        public void onClick(View v)
        {
            Toast.makeText(getActivity(), mReport.getTitle()+" clicked", Toast.LENGTH_SHORT).show();
        }
        
        private void bindReport(Report report){
            mReport = report;
            mTitleTextView.setText(mReport.getTitle());
            mDateTextView.setText(mReport.getmDate().toString());
            mResolvedCheckBox.setChecked(mReport.ismResolved());
        }
    }

    private class ReportAdapter extends RecyclerView.Adapter<ReportHolder>{
        private List<Report> mReports;

        public ReportAdapter(List<Report> reports){
            mReports = reports;
        }

        @Override
        public ReportHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_report,parent,false);
            return new ReportHolder(view);
        }

        @Override
        public void onBindViewHolder(ReportHolder holder, int position){
            Report report = mReports.get(position);
            holder.bindReport(report);
        }

        @Override
        public int getItemCount(){
            return mReports.size();
        }

    }
}
