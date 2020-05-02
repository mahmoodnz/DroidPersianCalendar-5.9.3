package com.qoqnouse.persiancalendar.view.preferences;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

import com.qoqnouse.persiancalendar.Constants;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.preference.EditTextPreference;

/**
 * Created by ebraminio on 2/16/16.
 */
public class NumericPreference extends EditTextPreference {

    public NumericPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public NumericPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public NumericPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NumericPreference(Context context) {
        super(context);
    }

    private Double mDouble;

    // http://stackoverflow.com/a/10848393
    @Override
    public void setText(String text) {
        final boolean wasBlocking = shouldDisableDependents();
        mDouble = parseDouble(text);
        persistString(mDouble != null ? mDouble.toString() : null);
        final boolean isBlocking = shouldDisableDependents();
        if (isBlocking != wasBlocking) notifyDependencyChange(isBlocking);
        LocalBroadcastManager.getInstance(getContext())
                .sendBroadcast(new Intent(Constants.LOCAL_INTENT_UPDATE_PREFERENCE));
    }

    @Override
    public String getText() {
        return mDouble != null ? mDouble.toString() : null;
    }

    private Double parseDouble(String text) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}
