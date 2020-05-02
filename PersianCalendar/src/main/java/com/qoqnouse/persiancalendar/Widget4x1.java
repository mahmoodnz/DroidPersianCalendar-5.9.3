package com.qoqnouse.persiancalendar;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

import com.qoqnouse.persiancalendar.util.UpdateUtils;
import com.qoqnouse.persiancalendar.util.Utils;

/**
 * 4x1 widget provider, implementation is on {@code CalendarWidget}
 *
 * @author ebraminio
 */
public class Widget4x1 extends AppWidgetProvider {
    @Override
    public void onReceive(Context context, Intent intent) {
        Utils.startEitherServiceOrWorker(context);
        UpdateUtils.update(context, false);
    }
}
