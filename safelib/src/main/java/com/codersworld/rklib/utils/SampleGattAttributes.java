package com.codersworld.rklib.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;

import java.util.UUID;


public class SampleGattAttributes {


    public static final UUID bltServerUUID = UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb");
    public static final UUID readDataUUID = UUID.fromString("000036f6-0000-1000-8000-00805f9b34fb");
    public static final UUID CLIENT_CHARACTERISTIC_CONFIG = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID writeDataUUID = UUID.fromString("000036f5-0000-1000-8000-00805f9b34fb");

    public final static String ACTION_GATT_CONNECTED = "com.dhanuka.safeobuddy.BluetoothLock..ACTION_GATT_CONNECTED";// 连接
    public final static String ACTION_GATT_DISCONNECTED = "com.dhanuka.safeobuddy.BluetoothLock..ACTION_GATT_DISCONNECTED";// 断开
    public final static String ACTION_GATT_SERVICES_DISCOVERED = "com.dhanuka.safeobuddy.BluetoothLock..ACTION_GATT_SERVICES_DISCOVERED";// 发现服务
    public static final String ACTION_SCAN_DEVICE = "com.dhanuka.safeobuddy.BluetoothLock..ACTION_SCAN_DEVICE";//扫描设备
    public static final String ACTION_BLE_REAL_DATA = "com.dhanuka.safeobuddy.BluetoothLock..ACTION_BLE_REAL_DATA";//通知数据

    /**
     * 马蹄锁
     */

    public static byte[] key = {71,56,57,9,84,62,66,10,97,81,29,8,53,63,31,75};

//    public static byte[] key = {32,87,47,82,54,75,63,71,48,80,65,88,17,99,45,43};
    public static byte[] password = {0x30, 0x30, 0x30, 0x30, 0x30, 0x30};
    public static byte[] password1 = {0x31, 0x31, 0x31, 0x31, 0x31, 0x31};
    /**
     * 意图过滤器
     * @return 意图过滤对象
     */
    public static IntentFilter makeGattUpdateIntentFilter() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_GATT_CONNECTED);
        intentFilter.addAction(ACTION_GATT_DISCONNECTED);
        intentFilter.addAction(ACTION_GATT_SERVICES_DISCOVERED);
        intentFilter.addAction(ACTION_SCAN_DEVICE);
        intentFilter.addAction(ACTION_BLE_REAL_DATA);
        intentFilter.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);
        return intentFilter;
    }
}
