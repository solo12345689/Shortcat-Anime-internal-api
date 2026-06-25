package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import m9.C5649a;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f43494a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f43495b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C5649a f43496c;

    private static void b(Context context) {
        if (f43496c == null) {
            C5649a c5649a = new C5649a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f43496c = c5649a;
            c5649a.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f43495b) {
            try {
                if (f43496c != null && d(intent)) {
                    f(intent, false);
                    f43496c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void e(Context context, r0 r0Var, final Intent intent) {
        synchronized (f43495b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f43496c.a(f43494a);
                }
                r0Var.d(intent).c(new InterfaceC5760d() { // from class: com.google.firebase.messaging.l0
                    @Override // n9.InterfaceC5760d
                    public final void a(n9.i iVar) {
                        m0.c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void f(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName g(Context context, Intent intent) {
        synchronized (f43495b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f43496c.a(f43494a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
