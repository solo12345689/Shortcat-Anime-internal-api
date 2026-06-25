package Pd;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f13818b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f13819a;

    private SharedPreferences c() {
        if (this.f13819a == null) {
            this.f13819a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f13819a;
    }

    public static k d() {
        return f13818b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            m.g(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public void e(String str, boolean z10) {
        c().edit().putBoolean(str, z10).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
