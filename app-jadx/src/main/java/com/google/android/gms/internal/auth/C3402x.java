package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.x */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3402x implements InterfaceC3393u {

    /* JADX INFO: renamed from: c */
    private static C3402x f39315c;

    /* JADX INFO: renamed from: a */
    private final Context f39316a;

    /* JADX INFO: renamed from: b */
    private final ContentObserver f39317b;

    private C3402x() {
        this.f39316a = null;
        this.f39317b = null;
    }

    static C3402x b(Context context) {
        C3402x c3402x;
        synchronized (C3402x.class) {
            try {
                if (f39315c == null) {
                    f39315c = y1.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C3402x(context) : new C3402x();
                }
                c3402x = f39315c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3402x;
    }

    static synchronized void e() {
        Context context;
        try {
            C3402x c3402x = f39315c;
            if (c3402x != null && (context = c3402x.f39316a) != null && c3402x.f39317b != null) {
                context.getContentResolver().unregisterContentObserver(f39315c.f39317b);
            }
            f39315c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC3393u
    /* JADX INFO: renamed from: c */
    public final String a(final String str) {
        Context context = this.f39316a;
        if (context != null && !AbstractC3370m.a(context)) {
            try {
                return (String) AbstractC3387s.a(new InterfaceC3390t() { // from class: com.google.android.gms.internal.auth.v
                    @Override // com.google.android.gms.internal.auth.InterfaceC3390t
                    public final Object zza() {
                        return this.f39310a.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return AbstractC3367l.a(this.f39316a.getContentResolver(), str, null);
    }

    private C3402x(Context context) {
        this.f39316a = context;
        C3399w c3399w = new C3399w(this, null);
        this.f39317b = c3399w;
        context.getContentResolver().registerContentObserver(AbstractC3367l.f39257a, true, c3399w);
    }
}
