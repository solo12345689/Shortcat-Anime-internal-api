package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC3233t;
import kotlin.jvm.internal.AbstractC5504s;
import r7.InterfaceC6274a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6274a f36825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3235v f36826b;

    public t0(Context applicationContext) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        this.f36825a = new SharedPreferencesOnSharedPreferenceChangeListenerC3233t(applicationContext, new a());
        this.f36826b = new C3235v(D(), applicationContext, D().j());
    }

    @Override // com.facebook.react.devsupport.C0, c7.f
    public InterfaceC6274a D() {
        return this.f36825a;
    }

    @Override // com.facebook.react.devsupport.C0, c7.f
    public void l() {
        this.f36826b.i();
    }

    @Override // com.facebook.react.devsupport.C0, c7.f
    public void y() {
        this.f36826b.x();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements SharedPreferencesOnSharedPreferenceChangeListenerC3233t.b {
        a() {
        }

        @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC3233t.b
        public void a() {
        }
    }
}
