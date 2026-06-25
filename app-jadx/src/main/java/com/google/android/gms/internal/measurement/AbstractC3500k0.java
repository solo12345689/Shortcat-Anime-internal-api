package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3500k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f39808a = new C3491j0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC3455f0 abstractC3455f0) {
        Z.a();
        SharedPreferencesC3482i0 sharedPreferencesC3482i0 = str.equals("") ? new SharedPreferencesC3482i0() : null;
        if (sharedPreferencesC3482i0 != null) {
            return sharedPreferencesC3482i0;
        }
        ThreadLocal threadLocal = f39808a;
        O9.n.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            f39808a.set(Boolean.TRUE);
            throw th2;
        }
    }
}
