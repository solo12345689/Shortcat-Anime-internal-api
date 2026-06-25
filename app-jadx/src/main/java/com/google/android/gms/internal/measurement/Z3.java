package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Z3 implements W3 {

    /* JADX INFO: renamed from: d */
    private static Z3 f39694d;

    /* JADX INFO: renamed from: a */
    private final Context f39695a;

    /* JADX INFO: renamed from: b */
    private final ContentObserver f39696b;

    /* JADX INFO: renamed from: c */
    private boolean f39697c;

    private Z3() {
        this.f39697c = false;
        this.f39695a = null;
        this.f39696b = null;
    }

    static Z3 c(Context context) {
        Z3 z32;
        synchronized (Z3.class) {
            try {
                if (f39694d == null) {
                    f39694d = y1.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new Z3(context) : new Z3();
                }
                Z3 z33 = f39694d;
                if (z33 != null && z33.f39696b != null && !z33.f39697c) {
                    try {
                        context.getContentResolver().registerContentObserver(I3.f39382a, true, f39694d.f39696b);
                        ((Z3) O9.n.j(f39694d)).f39697c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                z32 = (Z3) O9.n.j(f39694d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z32;
    }

    static synchronized void e() {
        Context context;
        try {
            Z3 z32 = f39694d;
            if (z32 != null && (context = z32.f39695a) != null && z32.f39696b != null && z32.f39697c) {
                context.getContentResolver().unregisterContentObserver(f39694d.f39696b);
            }
            f39694d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.W3
    /* JADX INFO: renamed from: d */
    public final String b(final String str) {
        Context context = this.f39695a;
        if (context != null && !O3.b(context)) {
            try {
                return (String) W3.a(new V3() { // from class: com.google.android.gms.internal.measurement.Y3
                    @Override // com.google.android.gms.internal.measurement.V3
                    public final /* synthetic */ Object zza() {
                        return this.f39689a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String f(String str) {
        return H3.a(((Context) O9.n.j(this.f39695a)).getContentResolver(), str, null);
    }

    private Z3(Context context) {
        this.f39697c = false;
        this.f39695a = context;
        this.f39696b = new X3(this, null);
    }
}
