package Pd;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static o f13821b = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f13822a;

    private SharedPreferences a() {
        if (this.f13822a == null) {
            this.f13822a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f13822a;
    }

    public static o b() {
        return f13821b;
    }

    public String c(String str, String str2) {
        return a().getString(str, str2);
    }

    public SharedPreferences.Editor d(String str) {
        return a().edit().remove(str);
    }

    public void e(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }
}
