package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n9.InterfaceC5757a;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3976n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f43497c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r0 f43498d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f43500b = new androidx.privacysandbox.ads.adservices.measurement.k();

    public C3976n(Context context) {
        this.f43499a = context;
    }

    public static /* synthetic */ n9.i a(Context context, Intent intent, boolean z10, n9.i iVar) {
        return (com.google.android.gms.common.util.l.e() && ((Integer) iVar.k()).intValue() == 402) ? e(context, intent, z10).h(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5757a() { // from class: com.google.firebase.messaging.l
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar2) {
                return Integer.valueOf(RCHTTPStatusCodes.FORBIDDEN);
            }
        }) : iVar;
    }

    public static /* synthetic */ Integer c(n9.i iVar) {
        return -1;
    }

    private static n9.i e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        r0 r0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return r0VarF.d(intent).h(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC5757a() { // from class: com.google.firebase.messaging.m
                @Override // n9.InterfaceC5757a
                public final Object a(n9.i iVar) {
                    return C3976n.c(iVar);
                }
            });
        }
        if (b0.b().e(context)) {
            m0.e(context, r0VarF, intent);
        } else {
            r0VarF.d(intent);
        }
        return n9.l.f(-1);
    }

    private static r0 f(Context context, String str) {
        r0 r0Var;
        synchronized (f43497c) {
            try {
                if (f43498d == null) {
                    f43498d = new r0(context, str);
                }
                r0Var = f43498d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0Var;
    }

    public n9.i g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f43499a, intent);
    }

    public n9.i h(final Context context, final Intent intent) {
        boolean z10 = com.google.android.gms.common.util.l.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? n9.l.d(this.f43500b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(b0.b().g(context, intent));
            }
        }).i(this.f43500b, new InterfaceC5757a() { // from class: com.google.firebase.messaging.k
            @Override // n9.InterfaceC5757a
            public final Object a(n9.i iVar) {
                return C3976n.a(context, intent, z11, iVar);
            }
        }) : e(context, intent, z11);
    }
}
