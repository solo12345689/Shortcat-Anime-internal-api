package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import i9.C5045a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3632z1 {

    /* JADX INFO: renamed from: j */
    private static volatile C3632z1 f40118j;

    /* JADX INFO: renamed from: a */
    private final String f40119a = "FA";

    /* JADX INFO: renamed from: b */
    protected final com.google.android.gms.common.util.d f40120b = com.google.android.gms.common.util.g.d();

    /* JADX INFO: renamed from: c */
    protected final ExecutorService f40121c;

    /* JADX INFO: renamed from: d */
    private final C5045a f40122d;

    /* JADX INFO: renamed from: e */
    private final List f40123e;

    /* JADX INFO: renamed from: f */
    private int f40124f;

    /* JADX INFO: renamed from: g */
    private boolean f40125g;

    /* JADX INFO: renamed from: h */
    private final String f40126h;

    /* JADX INFO: renamed from: i */
    private volatile InterfaceC3598v0 f40127i;

    protected C3632z1(Context context, Bundle bundle) {
        AbstractC3554q0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3483i1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f40121c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f40122d = new C5045a(this);
        this.f40123e = new ArrayList();
        try {
            if (j9.H.a(context, "google_app_id", j9.o.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C3632z1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f40126h = null;
                    this.f40125g = true;
                    Log.w(this.f40119a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f40126h = "fa";
        j(new V0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f40119a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C3624y1(this));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void j(AbstractRunnableC3546p1 abstractRunnableC3546p1) {
        this.f40121c.execute(abstractRunnableC3546p1);
    }

    /* JADX INFO: renamed from: q */
    public final void k(Exception exc, boolean z10, boolean z11) {
        C3632z1 c3632z1;
        Exception exc2;
        this.f40125g |= z10;
        if (z10) {
            Log.w(this.f40119a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c3632z1 = this;
            exc2 = exc;
            c3632z1.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            c3632z1 = this;
            exc2 = exc;
        }
        Log.w(c3632z1.f40119a, "Error with data collection. Data lost.", exc2);
    }

    private final void r(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        j(new C3537o1(this, l10, str, str2, bundle, z10, z11));
    }

    public static C3632z1 s(Context context, Bundle bundle) {
        AbstractC2115p.l(context);
        if (f40118j == null) {
            synchronized (C3632z1.class) {
                try {
                    if (f40118j == null) {
                        f40118j = new C3632z1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f40118j;
    }

    public final List A(String str, String str2) {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new O0(this, str, str2, binderC3571s0));
        List list = (List) BinderC3571s0.H3(binderC3571s0.G3(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void B(String str) {
        j(new P0(this, str));
    }

    public final void C(J0 j02, String str, String str2) {
        j(new Q0(this, j02, str, str2));
    }

    public final void D(Boolean bool) {
        j(new R0(this, bool));
    }

    public final void E(Bundle bundle) {
        j(new S0(this, bundle));
    }

    public final void F() {
        j(new T0(this));
    }

    public final void G(long j10) {
        j(new U0(this, j10));
    }

    public final void H(String str) {
        j(new W0(this, str));
    }

    public final void I(String str) {
        j(new X0(this, str));
    }

    public final void J(Runnable runnable) {
        j(new Z0(this, runnable));
    }

    public final String K() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3411a1(this, binderC3571s0));
        return binderC3571s0.e(500L);
    }

    public final String L() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3420b1(this, binderC3571s0));
        return binderC3571s0.e(50L);
    }

    public final long M() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3429c1(this, binderC3571s0));
        Long lH = binderC3571s0.h(500L);
        if (lH != null) {
            return lH.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f40120b.a()).nextLong();
        int i10 = this.f40124f + 1;
        this.f40124f = i10;
        return jNextLong + ((long) i10);
    }

    public final String a() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3438d1(this, binderC3571s0));
        return binderC3571s0.e(500L);
    }

    public final String b() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3456f1(this, binderC3571s0));
        return binderC3571s0.e(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3465g1(this, str, str2, z10, binderC3571s0));
        Bundle bundleG3 = binderC3571s0.G3(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
        if (bundleG3 == null || bundleG3.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleG3.size());
        for (String str3 : bundleG3.keySet()) {
            Object obj = bundleG3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        j(new C3474h1(this, false, 5, str, obj, null, null));
    }

    public final int e(String str) {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3492j1(this, str, binderC3571s0));
        Integer num = (Integer) BinderC3571s0.H3(binderC3571s0.G3(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String f() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3501k1(this, binderC3571s0));
        return binderC3571s0.e(120000L);
    }

    public final Long g() {
        BinderC3571s0 binderC3571s0 = new BinderC3571s0();
        j(new C3510l1(this, binderC3571s0));
        return binderC3571s0.h(120000L);
    }

    public final void h(boolean z10) {
        j(new C3519m1(this, z10));
    }

    public final void i(Bundle bundle) {
        j(new C3528n1(this, bundle));
    }

    final /* synthetic */ String l() {
        return this.f40119a;
    }

    final /* synthetic */ boolean m() {
        return this.f40125g;
    }

    final /* synthetic */ InterfaceC3598v0 n() {
        return this.f40127i;
    }

    final /* synthetic */ void o(InterfaceC3598v0 interfaceC3598v0) {
        this.f40127i = interfaceC3598v0;
    }

    public final C5045a t() {
        return this.f40122d;
    }

    protected final InterfaceC3598v0 u(Context context, boolean z10) {
        try {
            return AbstractBinderC3589u0.asInterface(DynamiteModule.d(context, z10 ? DynamiteModule.f39026e : DynamiteModule.f39024c, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            k(e10, true, false);
            return null;
        }
    }

    public final void v(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void w(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void x(String str, String str2, Object obj, boolean z10) {
        j(new L0(this, str, str2, obj, z10));
    }

    public final void y(Bundle bundle) {
        j(new M0(this, bundle));
    }

    public final void z(String str, String str2, Bundle bundle) {
        j(new N0(this, str, str2, bundle));
    }
}
