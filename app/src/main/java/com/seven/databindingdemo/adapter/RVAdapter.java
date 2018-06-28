package com.seven.databindingdemo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seven.databindingdemo.databinding.ItemListBinding;
import com.seven.databindingdemo.model.User;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<User> mUsers;

    public RVAdapter(List<User> users) {
        mUsers = users;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ItemHolder.create(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.bind(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsers == null ? 0 : mUsers.size();
    }
}

class ItemHolder extends RecyclerView.ViewHolder {

    private ItemListBinding mBinding;

    public static ItemHolder create(LayoutInflater inflater, ViewGroup parent) {
        ItemListBinding binding = ItemListBinding.inflate(inflater, parent, false);
        return new ItemHolder(binding);
    }

    private ItemHolder(ItemListBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    public ItemHolder(View itemView) {
        super(itemView);
    }

    public void bind(User user) {
        mBinding.setUser(user);
        mBinding.executePendingBindings();
    }
}
