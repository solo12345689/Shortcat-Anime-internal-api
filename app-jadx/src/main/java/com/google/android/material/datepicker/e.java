package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o9.AbstractC5846i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class e {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strD = d(j10);
        if (z10) {
            strD = String.format(context.getString(AbstractC5846i.f54864v), strD);
        }
        return z11 ? String.format(context.getString(AbstractC5846i.f54863u), strD) : z12 ? String.format(context.getString(AbstractC5846i.f54860r), strD) : strD;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return t.d(locale).format(new Date(j10));
    }

    static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    static String e(Context context, int i10) {
        return t.g().get(1) == i10 ? String.format(context.getString(AbstractC5846i.f54861s), Integer.valueOf(i10)) : String.format(context.getString(AbstractC5846i.f54862t), Integer.valueOf(i10));
    }

    static String f(long j10) {
        return t.k(Locale.getDefault()).format(new Date(j10));
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return t.l(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar calendarG = t.g();
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j10);
        return calendarG.get(1) == calendarI.get(1);
    }
}
