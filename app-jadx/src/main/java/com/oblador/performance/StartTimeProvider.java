package com.oblador.performance;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class StartTimeProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f43978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f43979b;

    public static long a() {
        return f43979b;
    }

    public static long b() {
        return f43978a;
    }

    private static void c() {
        if (f43979b == 0) {
            f43979b = SystemClock.uptimeMillis();
        }
    }

    private static void d() {
        if (f43978a == 0) {
            f43978a = f43979b - Process.getElapsedCpuTime();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        c();
        d();
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
