package com.amazon.a.a.o;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34699a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f34700b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f34701c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f34702d = "Kiwi";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34703e;

    public c(String str) {
        this.f34703e = str;
    }

    private String d(String str) {
        return this.f34703e + ": " + str;
    }

    public void a(String str) {
        if (f34699a) {
            Log.d(f34702d, d(str));
        }
    }

    public void b(String str) {
        if (f34700b) {
            Log.e(f34702d, d(str));
        }
    }

    public void c(String str) {
        if (f34701c) {
            Log.e(f34702d, "TEST-" + d(str));
        }
    }

    public void a(String str, Throwable th2) {
        if (f34699a) {
            Log.d(f34702d, d(str), th2);
        }
    }

    public void b(String str, Throwable th2) {
        if (f34700b) {
            Log.e(f34702d, d(str), th2);
        }
    }

    public static void a() {
        f34701c = true;
    }

    public static boolean b() {
        return f34701c;
    }
}
