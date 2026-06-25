package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f43424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43426c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f43428e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque f43427d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43429f = false;

    private d0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f43424a = sharedPreferences;
        this.f43425b = str;
        this.f43426c = str2;
        this.f43428e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f43429f) {
            j();
        }
        return z10;
    }

    static d0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        d0 d0Var = new d0(sharedPreferences, str, str2, executor);
        d0Var.e();
        return d0Var;
    }

    private void e() {
        synchronized (this.f43427d) {
            try {
                this.f43427d.clear();
                String string = this.f43424a.getString(this.f43425b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f43426c)) {
                    String[] strArrSplit = string.split(this.f43426c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f43427d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f43427d) {
            this.f43424a.edit().putString(this.f43425b, h()).commit();
        }
    }

    private void j() {
        this.f43428e.execute(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f43419a.i();
            }
        });
    }

    public boolean b(String str) {
        boolean zC;
        if (TextUtils.isEmpty(str) || str.contains(this.f43426c)) {
            return false;
        }
        synchronized (this.f43427d) {
            zC = c(this.f43427d.add(str));
        }
        return zC;
    }

    public String f() {
        String str;
        synchronized (this.f43427d) {
            str = (String) this.f43427d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean zC;
        synchronized (this.f43427d) {
            zC = c(this.f43427d.remove(obj));
        }
        return zC;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f43427d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f43426c);
        }
        return sb2.toString();
    }
}
