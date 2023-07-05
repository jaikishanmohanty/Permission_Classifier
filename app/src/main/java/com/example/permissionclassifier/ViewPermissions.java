package com.example.permissionclassifier;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ViewPermissions extends AppCompatActivity {

    String packageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_permissions);
        TextView tvAppName = findViewById(R.id.tvAppNameView);
        ImageView icon = findViewById(R.id.appIconView);
        ListView safePermissionsListView = findViewById(R.id.safePermissionsListView);
        ListView unsafePermissionsListView = findViewById(R.id.unsafePermissionsListView);
        Button btnChange = findViewById(R.id.btnChange);

        Bundle extras = getIntent().getExtras();
        byte[] b = extras.getByteArray("icon");
        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
        icon.setImageBitmap(bmp);

        tvAppName.setText(extras.getString("name"));

        packageName = extras.getString("package");

        List<String> safePermissions = extras.getStringArrayList("safePermissions");
        List<String> unsafePermissions = extras.getStringArrayList("unsafePermissions");

        // Create and set the adapter for the safe permissions ListView
        ArrayAdapter<String> safePermissionsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, removeNumbering(safePermissions));
        safePermissionsListView.setAdapter(safePermissionsAdapter);

        // Create and set the adapter for the unsafe permissions ListView
        ArrayAdapter<String> unsafePermissionsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, removeNumbering(unsafePermissions));
        unsafePermissionsListView.setAdapter(unsafePermissionsAdapter);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                Uri uri = Uri.fromParts("package", packageName, null);
                intent.setData(uri);
                startActivity(intent);
            }
        });
    }

    private List<String> removeNumbering(List<String> permissions) {
        List<String> result = new ArrayList<>();
        for (String permission : permissions) {
            int dotIndex = permission.indexOf(". ");
            if (dotIndex != -1 && dotIndex + 2 < permission.length()) {
                result.add(permission.substring(dotIndex + 2));
            } else {
                result.add(permission);
            }
        }
        return result;
    }

}
