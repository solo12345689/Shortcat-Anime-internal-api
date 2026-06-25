package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class SonyHomeBadger implements Zf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f53328a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AsyncQueryHandler f53329b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AsyncQueryHandler {
        a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues c(int i10, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i10));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    private static void d(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i10 > 0);
        context.sendBroadcast(intent);
    }

    private void e(Context context, ComponentName componentName, int i10) {
        if (i10 < 0) {
            return;
        }
        ContentValues contentValuesC = c(i10, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            g(context, contentValuesC);
            return;
        }
        if (this.f53329b == null) {
            this.f53329b = new a(context.getApplicationContext().getContentResolver());
        }
        f(contentValuesC);
    }

    private void f(ContentValues contentValues) {
        this.f53329b.startInsert(0, null, this.f53328a, contentValues);
    }

    private void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f53328a, contentValues);
    }

    private static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override // Zf.a
    public List a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // Zf.a
    public void b(Context context, ComponentName componentName, int i10) {
        if (h(context)) {
            e(context, componentName, i10);
        } else {
            d(context, componentName, i10);
        }
    }
}
