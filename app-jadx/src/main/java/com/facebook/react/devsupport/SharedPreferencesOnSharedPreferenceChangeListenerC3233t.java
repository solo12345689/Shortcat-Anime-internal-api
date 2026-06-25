package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.InterfaceC6274a;

/* JADX INFO: renamed from: com.facebook.react.devsupport.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3233t implements InterfaceC6274a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36820e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f36821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f36822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.f f36823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36824d;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC3233t(Context applicationContext, b bVar) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        this.f36821a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        AbstractC5504s.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f36822b = defaultSharedPreferences;
        this.f36823c = new x7.f(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f36824d = Y6.a.f22860b;
    }

    @Override // r7.InterfaceC6274a
    public boolean a() {
        return this.f36822b.getBoolean("inspector_debug", false);
    }

    @Override // r7.InterfaceC6274a
    public void b(boolean z10) {
        this.f36822b.edit().putBoolean("inspector_debug", z10).apply();
    }

    @Override // r7.InterfaceC6274a
    public void c(boolean z10) {
        this.f36822b.edit().putBoolean("hot_module_replacement", z10).apply();
    }

    @Override // r7.InterfaceC6274a
    public boolean d() {
        return this.f36822b.getBoolean("fps_debug", false);
    }

    @Override // r7.InterfaceC6274a
    public boolean e() {
        return this.f36822b.getBoolean("hot_module_replacement", true);
    }

    @Override // r7.InterfaceC6274a
    public boolean f() {
        return this.f36824d;
    }

    @Override // r7.InterfaceC6274a
    public boolean g() {
        return this.f36822b.getBoolean("js_minify_debug", false);
    }

    @Override // r7.InterfaceC6274a
    public boolean h() {
        return this.f36822b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // r7.InterfaceC6274a
    public void i(boolean z10) {
        this.f36822b.edit().putBoolean("fps_debug", z10).apply();
    }

    @Override // r7.InterfaceC6274a
    public x7.f j() {
        return this.f36823c;
    }

    @Override // r7.InterfaceC6274a
    public void k(boolean z10) {
        this.f36822b.edit().putBoolean("js_dev_mode_debug", z10).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        AbstractC5504s.h(sharedPreferences, "sharedPreferences");
        if (this.f36821a != null) {
            if (AbstractC5504s.c("fps_debug", str) || AbstractC5504s.c("js_dev_mode_debug", str) || AbstractC5504s.c("js_minify_debug", str)) {
                this.f36821a.a();
            }
        }
    }
}
