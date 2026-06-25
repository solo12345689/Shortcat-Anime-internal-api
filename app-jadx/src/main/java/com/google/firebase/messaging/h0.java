package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f43454d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f43455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d0 f43456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f43457c;

    private h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f43457c = executor;
        this.f43455a = sharedPreferences;
    }

    public static synchronized h0 b(Context context, Executor executor) {
        h0 h0Var;
        try {
            WeakReference weakReference = f43454d;
            h0Var = weakReference != null ? (h0) weakReference.get() : null;
            if (h0Var == null) {
                h0Var = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                h0Var.d();
                f43454d = new WeakReference(h0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h0Var;
    }

    private synchronized void d() {
        this.f43456b = d0.d(this.f43455a, "topic_operation_queue", com.amazon.a.a.o.b.f.f34694a, this.f43457c);
    }

    synchronized boolean a(g0 g0Var) {
        return this.f43456b.b(g0Var.e());
    }

    synchronized g0 c() {
        return g0.a(this.f43456b.f());
    }

    synchronized boolean e(g0 g0Var) {
        return this.f43456b.g(g0Var.e());
    }
}
