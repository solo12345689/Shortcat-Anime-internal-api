package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f43431a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f43432d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f43433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f43434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f43435c;

        private a(String str, String str2, long j10) {
            this.f43433a = str;
            this.f43434b = str2;
            this.f43435c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(DiagnosticsEntry.TIMESTAMP_KEY, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(DiagnosticsEntry.TIMESTAMP_KEY));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f43435c + f43432d || !str.equals(this.f43434b);
        }
    }

    public e0(Context context) {
        this.f43431a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(AbstractC7194b.i(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + com.amazon.a.a.o.b.f.f34696c + "*";
    }

    public synchronized void c() {
        this.f43431a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String strB = b(str, str2);
        SharedPreferences.Editor editorEdit = this.f43431a.edit();
        editorEdit.remove(strB);
        editorEdit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f43431a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f43431a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f43431a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
