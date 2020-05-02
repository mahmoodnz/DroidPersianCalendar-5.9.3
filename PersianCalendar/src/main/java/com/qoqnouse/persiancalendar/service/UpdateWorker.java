//package com.qoqnouse.persiancalendar.service;
//
//import com.qoqnouse.persiancalendar.util.UpdateUtils;
//import com.qoqnouse.persiancalendar.util.Utils;
//
//import androidx.work.Worker;
//
//public class UpdateWorker extends Worker {
//    @Override
//    public Worker.Result doWork() {
//        Utils.setChangeDateWorker();
//        Utils.updateStoredPreference(getApplicationContext());
//        UpdateUtils.update(getApplicationContext(), true);
//        return Result.SUCCESS;
//    }
//}