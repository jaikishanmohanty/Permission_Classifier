package com.example.permissionclassifier;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PermissionsAdapter extends ArrayAdapter<String> {
    private List<String> permissions;

    public PermissionsAdapter(Context context, List<String> permissions) {
        super(context, android.R.layout.simple_list_item_1, permissions);
        this.permissions = permissions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String permission = permissions.get(position);
        holder.permissionTextView.setText(permission);

        return convertView;
    }

    private static class ViewHolder {
        TextView permissionTextView;

        ViewHolder(View itemView) {
            permissionTextView = itemView.findViewById(android.R.id.text1);
        }
    }
}