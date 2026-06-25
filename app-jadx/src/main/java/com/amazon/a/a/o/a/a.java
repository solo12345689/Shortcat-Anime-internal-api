package com.amazon.a.a.o.a;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f34606a = true;

    public static void a() {
        a(Looper.getMainLooper().getThread().getId());
    }

    public static void b(Object obj, String str) {
        a(obj != null, str);
    }

    public static void c(Object obj, String str) {
        a(obj == null, str);
    }

    public static void b(boolean z10, String str) {
        if (z10) {
            a(str);
        }
    }

    public static void a(long j10) {
        if (Thread.currentThread().getId() != j10) {
            a("Executing thread must be thread: " + j10 + ", was: " + Thread.currentThread().getId());
        }
    }

    public static void a(String str) {
        throw new b(str);
    }

    public static void a(String str, Throwable th2) {
        throw new b(str, th2);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            a("Argument: " + str + " cannot be null");
        }
    }

    public static void a(Object obj, Object obj2, String str) {
        a(a(obj, obj2), str);
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void a(boolean z10, String str) {
        if (z10) {
            return;
        }
        a(str);
    }
}
