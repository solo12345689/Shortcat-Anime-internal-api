package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C6551a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3558q4 implements W3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f39942f = new C6551a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f39943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f39944b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f39946d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f39945c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f39947e = new ArrayList();

    private C3558q4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f39943a = sharedPreferences;
    }

    static C3558q4 c(Context context, String str, Runnable runnable) {
        final C3558q4 c3558q4;
        SharedPreferences sharedPreferencesA;
        if (O3.a() && !str.startsWith("direct_boot:") && !O3.c(context)) {
            return null;
        }
        synchronized (C3558q4.class) {
            Map map = f39942f;
            c3558q4 = (C3558q4) map.get(str);
            if (c3558q4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (O3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = AbstractC3500k0.a(context, str.substring(12), 0, AbstractC3464g0.f39759a);
                    } else {
                        sharedPreferencesA = AbstractC3500k0.a(context, str, 0, AbstractC3464g0.f39759a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c3558q4 = new C3558q4(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.p4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f39926a.e(sharedPreferences, str2);
                        }
                    };
                    c3558q4.f39944b = onSharedPreferenceChangeListener;
                    c3558q4.f39943a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c3558q4);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return c3558q4;
    }

    static synchronized void d() {
        try {
            Map map = f39942f;
            for (C3558q4 c3558q4 : map.values()) {
                c3558q4.f39943a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) O9.n.j(c3558q4.f39944b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final Object b(String str) {
        Map<String, ?> map = this.f39946d;
        if (map == null) {
            synchronized (this.f39945c) {
                try {
                    map = this.f39946d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f39943a.getAll();
                            this.f39946d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f39945c) {
            this.f39946d = null;
            AbstractC3540o4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f39947e.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
