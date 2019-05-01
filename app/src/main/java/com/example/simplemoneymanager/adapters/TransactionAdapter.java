package com.example.simplemoneymanager.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.simplemoneymanager.models.Category;
import com.example.simplemoneymanager.R;

import com.example.simplemoneymanager.models.Transaction;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder>{

    private ArrayList<Transaction> transactionArrayList;
    private Context context;

    public TransactionAdapter(Context context, ArrayList<Transaction> categoryArrayList) {
        this.context = context;
        this.transactionArrayList = categoryArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.transaction_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Transaction transaction = transactionArrayList.get(i);
        viewHolder.expenseCategory.setText(transaction.getCategory());
        viewHolder.expenseAmount.setText(transaction.getAmount());
    }

    @Override
    public int getItemCount() {
        return transactionArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView expenseCategory;
        private TextView expenseAmount;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            expenseCategory = itemView.findViewById(R.id.category_trans);
            expenseAmount = itemView.findViewById(R.id.amount_text);
        }
    }
}
