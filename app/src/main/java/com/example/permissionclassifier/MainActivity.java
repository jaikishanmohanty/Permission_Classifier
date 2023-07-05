package com.example.permissionclassifier;


import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity implements OnAppClickListener {

    private RecyclerView mRecyclerView;
    private AppListAdapter adapter;
    private ArrayList<AppItem> apps;
    private Context context;
    private boolean showSystemApps = false;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mRecyclerView = findViewById(R.id.appList);
        apps = getInstalledPackages();

        adapter = new AppListAdapter(apps, getApplicationContext());
        mRecyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        adapter.setClickListener(this);
        context = this;

        final SwipeRefreshLayout pullToRefresh = findViewById(R.id.pullToRefresh);
        pullToRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                updateAppListAllApps();
                pullToRefresh.setRefreshing(false);
            }
        });

        ToggleButton toggleButton = findViewById(R.id.system_apps_toggle_button);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // showSystemApps = isChecked;
            // updateAppListAllApps();
            updateAppListInstalledApps();
        });
    }


    private void updateAppList() {
        if (showSystemApps) {
            updateAppListAllApps();
        } else {
            updateAppListInstalledApps();
        }
    }

    private void updateAppListAllApps() {
        // Update app list to show all apps (including system apps)
        apps.clear();
        apps.addAll(getInstalledPackages());
        adapter.notifyDataSetChanged();
    }












    protected ArrayList<AppItem> getInstalledPackages() {
        PackageManager packageManager = getPackageManager();
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
        List<ResolveInfo> resolveInfoList = getPackageManager().queryIntentActivities(intent, 0);
        ArrayList<AppItem> applist = new ArrayList<>();
        for (ResolveInfo resolveInfo : resolveInfoList) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            String packageName = activityInfo.applicationInfo.packageName;
            if ((activityInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                String label = (String) packageManager.getApplicationLabel(activityInfo.applicationInfo);
                Drawable icon = packageManager.getApplicationIcon(activityInfo.applicationInfo);
                AppItem item = new AppItem();
                item.setPackageName(packageName);
                item.setAppName(label);
                item.setAppIcon(icon);
                applist.add(item);
            }
        }
        return applist;
    }
    /*
    protected String getPermissionsByPackageName(String packageName) {
        StringBuilder builder = new StringBuilder();

        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(packageName, PackageManager.GET_PERMISSIONS);
            int counter = 1;
            for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                if ((packageInfo.requestedPermissionsFlags[i] & PackageInfo.REQUESTED_PERMISSION_GRANTED) != 0) {
                    String permission = packageInfo.requestedPermissions[i];
                    builder.append("" + counter + ". " + permission + "\n");
                    counter++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
*/

    //My Modified Permission Fetched only who is in sheet
    /*
    protected String getPermissionsByPackageName(String packageName, String appName) {
        StringBuilder builder = new StringBuilder();
        String []permissionSet = {"ACCESS_NETWORK_STATE","READ_NETWORK_USAGE_HISTORY","CONTENT_READ","MANAGE_USB","DEVICE_POWER","READ_WIFI_CREDENTIAL","VIBRATE","RESTART_PACKAGES","READ_PHONE_STATE","CHANGE_WIFI_MULTICAST_STATE","CHECK_LICENSE","ACCOUNT_MANAGER","ACCESS_COARSE_LOCATION","ACCESS_FINE_LOCATION","MODIFY_AUDIO_SETTINGS","RECORD_AUDIO","ACCESS_BLUETOOTH_SHARE","NEARBY_WIFI_DEVICES","GET_TASKS","CAMERA","SET_ALARM","READ_MY_DATA","CHANGE_NETWORK_STATE","USE_CREDENTIALS","BLUETOOTH_ADMIN","HIDE_OVERLAY_WINDOWS","READ_GSERVICES","WRITE_SETTINGS","BROADCAST_STICKY","KILL_BACKGROUND_PROCESSES","WAKE_LOCK","INSTALL_SHORTCUT","WRITE_EXTERNAL_STORAGE","FLASHLIGHT","NFC","MANAGE_EXTERNAL_STORAGE","BATTERY_STATS","READ_CONTACTS","WRITE_CALENDAR","MANAGE_ACCOUNTS","READ_CALENDAR","UNINSTALL_SHORTCUT","GET_PASSWORD","ACCESS_LOCATION_EXTRA_COMMANDS","WRITE_SETTINGS","CALL_PRIVILEGED","SET_DEBUG_APP","READ_HISTORY_BOOKMARKS","REORDER_TASKS","DUMP","SET_WALLPAPER","WRITE_HISTORY_BOOKMARKS","FOREGROUND_SERVICE","ADD_VOICEMAIL","WRITE_USER_DICTIONARY","BODY_SENSORS_BACKGROUND","CHANGE_WIMAX_STATE","WRITE_APN_SETTINGS","CLEAR_APP_CACHE","CALL_PHONE","WRITE_SMS","MANAGE_USB","EXPAND_STATUS_BAR","SET_ALWAYS_FINISH","SET_PROCESS_LIMIT","PERSISTENT_ACTIVITY","USE_SIP","ACCESS_MOCK_LOCATION","SET_ANIMATION_SCALE","MODIFY_PHONE_STATE","WRITE_CONTACTS","WRITE_PROFILE","READ_CALL_LOG","READ_CELL_BROADCASTS","READ_SYNC_SETTINGS","READ_USER_DICTIONARY","READ_PROFILE","READ_SMS","RECEIVE_MMS","RECEIVE_SMS","RECEIVE_WAP_PUSH","PROCESS_OUTGOING_CALLS","SIGNAL_PERSISTENT_PROCESSES","SEND_SMS","SET_PREFERRED_APPLICATIONS","SET_TIME_ZONE","WRITE_SYNC_SETTINGS","WRITE_CALL_LOG"};
        Set<String> requiredpermission = new HashSet<String>();
        Collections.addAll(requiredpermission, permissionSet);

//
//        String filePath = "C:\\Users\\Jaikishan Mohanty\\Downloads\\permission_checker-master\\permission_checker-master\\app\\src\\main\\res\\ExcelSheet\\MergedMapping.xls";
//        List<String> dataList = ReadExcelData.readExcel();
        System.out.println("Pacage Name : "+packageName);
        PackageManager pm = context.getPackageManager();
        String category = getCategory(pm, packageName);
        System.out.println("Category : "+category);
       // PermissionChecker permissionChecker = new PermissionChecker();
       // permissionChecker.checkPermission(category,permissionsList );
        // Process the data as needed




        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(packageName, PackageManager.GET_PERMISSIONS);

            int counter = 1;
            for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                String oldpermission = packageInfo.requestedPermissions[i];
                String permission = oldpermission.replaceAll(".*\\.(.*)", "$1");
                Log.i("Package", "getPermissionsByPackageName: "+appName);

                if ((packageInfo.requestedPermissionsFlags[i] & PackageInfo.REQUESTED_PERMISSION_GRANTED) != 0 && requiredpermission.contains(permission)) {
                    builder.append(counter++).append(". ").append(permission).append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return builder.toString();

    }
*/

    protected List<String> getPermissionsByPackageName(String packageName) {
        List<String> permissionsList = new ArrayList<>();
        String []permissionSet = {"ACCESS_NETWORK_STATE","READ_NETWORK_USAGE_HISTORY","CONTENT_READ","MANAGE_USB","DEVICE_POWER","READ_WIFI_CREDENTIAL","VIBRATE","RESTART_PACKAGES","READ_PHONE_STATE","CHANGE_WIFI_MULTICAST_STATE","CHECK_LICENSE","ACCOUNT_MANAGER","ACCESS_COARSE_LOCATION","ACCESS_FINE_LOCATION","MODIFY_AUDIO_SETTINGS","RECORD_AUDIO","ACCESS_BLUETOOTH_SHARE","NEARBY_WIFI_DEVICES","GET_TASKS","CAMERA","SET_ALARM","READ_MY_DATA","CHANGE_NETWORK_STATE","USE_CREDENTIALS","BLUETOOTH_ADMIN","HIDE_OVERLAY_WINDOWS","READ_GSERVICES","WRITE_SETTINGS","BROADCAST_STICKY","KILL_BACKGROUND_PROCESSES","WAKE_LOCK","INSTALL_SHORTCUT","WRITE_EXTERNAL_STORAGE","FLASHLIGHT","NFC","MANAGE_EXTERNAL_STORAGE","BATTERY_STATS","READ_CONTACTS","WRITE_CALENDAR","MANAGE_ACCOUNTS","READ_CALENDAR","UNINSTALL_SHORTCUT","GET_PASSWORD","ACCESS_LOCATION_EXTRA_COMMANDS","WRITE_SETTINGS","CALL_PRIVILEGED","SET_DEBUG_APP","READ_HISTORY_BOOKMARKS","REORDER_TASKS","DUMP","SET_WALLPAPER","WRITE_HISTORY_BOOKMARKS","FOREGROUND_SERVICE","ADD_VOICEMAIL","WRITE_USER_DICTIONARY","BODY_SENSORS_BACKGROUND","CHANGE_WIMAX_STATE","WRITE_APN_SETTINGS","CLEAR_APP_CACHE","CALL_PHONE","WRITE_SMS","MANAGE_USB","EXPAND_STATUS_BAR","SET_ALWAYS_FINISH","SET_PROCESS_LIMIT","PERSISTENT_ACTIVITY","USE_SIP","ACCESS_MOCK_LOCATION","SET_ANIMATION_SCALE","MODIFY_PHONE_STATE","WRITE_CONTACTS","WRITE_PROFILE","READ_CALL_LOG","READ_CELL_BROADCASTS","READ_SYNC_SETTINGS","READ_USER_DICTIONARY","READ_PROFILE","READ_SMS","RECEIVE_MMS","RECEIVE_SMS","RECEIVE_WAP_PUSH","PROCESS_OUTGOING_CALLS","SIGNAL_PERSISTENT_PROCESSES","SEND_SMS","SET_PREFERRED_APPLICATIONS","SET_TIME_ZONE","WRITE_SYNC_SETTINGS","WRITE_CALL_LOG"};
        Set<String> requiredpermission = new HashSet<String>();
        Collections.addAll(requiredpermission, permissionSet);

        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(packageName, PackageManager.GET_PERMISSIONS);
            int counter = 1;

            for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                String oldpermission = packageInfo.requestedPermissions[i];
                String newPermission = oldpermission.replaceAll(".*\\.(.*)", "$1");
                //  Log.i("Package", "getPermissionsByPackageName: "+appName);
                if ((packageInfo.requestedPermissionsFlags[i] & PackageInfo.REQUESTED_PERMISSION_GRANTED) != 0 && requiredpermission.contains(newPermission)) {
//                    builder.append(counter++).append(". ").append(permission).append("\n");
                    //   String permission = packageInfo.requestedPermissions[i];
                    permissionsList.add(counter + ". " + newPermission);
                    counter++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return permissionsList;

    }


    @Override
    public void onAppSelected(View view, int position) {
        AppItem app = apps.get(position);
        PackageManager pm = getPackageManager();
        String category = getCategory(pm, app.getPackageName());
        System.out.println("Category: " + category);
        List<String> permissions = getPermissionsByPackageName(app.getPackageName());
        System.out.println("Permissions: " + permissions);
        Map<String, List<String>> permissionResult = processPermissions(permissions, category);
        List<String> safePermissions = permissionResult.get("safePermissions");
        List<String> unsafePermissions = permissionResult.get("unsafePermissions");

        Intent i = new Intent(MainActivity.this, ViewPermissions.class);
        Bitmap bmp = DrawableToBitmap.drawableToBitmap(app.getAppIcon());
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        i.putExtra("icon", byteArray);
        i.putExtra("name", app.getAppName());
        i.putExtra("package", app.getPackageName());
        i.putStringArrayListExtra("safePermissions", new ArrayList<>(safePermissions));
        i.putStringArrayListExtra("unsafePermissions", new ArrayList<>(unsafePermissions));
        i.putExtra("rating", "safe");
        startActivity(i);
    }


    private void updateAppListInstalledApps() {
        List<AppInfo> appList = new ArrayList<>();

        PackageManager pm = context.getPackageManager();
        List<PackageInfo> packages = pm.getInstalledPackages(PackageManager.GET_PERMISSIONS);

        for (PackageInfo packageInfo : packages) {
            if ((packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 1) {
                // Skip system apps
                continue;
            }
            String name = packageInfo.applicationInfo.loadLabel(pm).toString();
            String packageName = packageInfo.packageName;
            String category = getCategory(pm, packageName);
            System.out.println("Appname: " + name + " Category : " + category);
            List<String> permissions = new ArrayList<>();
            if (packageInfo.requestedPermissions != null) {
                for (String permission : packageInfo.requestedPermissions) {
                    if (pm.checkPermission(permission, packageName) == PackageManager.PERMISSION_GRANTED) {
                        permissions.add(permission);
                    }
                }
            }

            appList.add(new AppInfo(name, packageName, category, permissions));
        }

//        appListAdapter.clear();
//        appListAdapter.addAll(appList);
        //       appListAdapter.notifyDataSetChanged();

        // Export permissions and category to Excel file
        try {
            ExcelExporter exporter = new ExcelExporter();
            exporter.exportToExcel(context, appList, "installedAppsCategory.xls");
            Toast.makeText(context, "Permissions and category exported successfully", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "Error exporting app permissions and category", Toast.LENGTH_SHORT).show();
        }
    }

    private String getCategory(PackageManager pm, String packageName) {
        try {
            ApplicationInfo info = pm.getApplicationInfo(packageName, 0);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                if (info.category != AppInfo.CATEGORY_UNDEFINED) {
//                    return String.valueOf(info.category);
//                }
//            }

            // Use Google Play Store API to fetch category
            String url = "https://play.google.com/store/apps/details?id=" + packageName;
            //   System.out.println("URL : "+url);
            String category = new GetCategoryTask().execute(url).get();

            return category;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Unknown";
    }

    private class GetCategoryTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            try {
                Document doc = Jsoup.connect(urls[0]).get();
                String category = doc.select("[itemprop=genre]").first().text();
                System.out.println("Itemprop Category : "+category);
                return category;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }


    private Map<String, List<String>> processPermissions(List<String> permissionsList, String category) {
        List<String> safePermissions = new ArrayList<>();
        List<String> unsafePermissions = new ArrayList<>();

        for (String permission : permissionsList) {
            boolean isSafe = PermissionSafetyChecker.isPermissionSafe(category, permission);

            if (isSafe) {
                safePermissions.add(permission);
            } else {
                unsafePermissions.add(permission);
            }
        }

        Map<String, List<String>> result = new HashMap<>();
        result.put("safePermissions", safePermissions);
        result.put("unsafePermissions", unsafePermissions);


        LayoutInflater inflater = LayoutInflater.from(this);

        ViewGroup parentView = findViewById(android.R.id.content);
        View rootView = inflater.inflate(R.layout.activity_view_permissions, parentView, false);



        return result;
    }






}
