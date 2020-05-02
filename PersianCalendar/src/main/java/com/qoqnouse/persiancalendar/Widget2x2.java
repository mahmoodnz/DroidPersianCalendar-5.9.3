package com.qoqnouse.persiancalendar;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import com.qoqnouse.persiancalendar.util.UpdateUtils;
import com.qoqnouse.persiancalendar.util.Utils;

public class Widget2x2 extends AppWidgetProvider {
    @Override
    public void onReceive(Context context, Intent intent) {
        Utils.startEitherServiceOrWorker(context);
        UpdateUtils.update(context, false);
    }
}
