package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class v extends io.invertase.firebase.common.b {
    v(Context context, String str) {
        super(context, str);
    }

    public /* synthetic */ Void n(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).c(str, bundle);
        return null;
    }

    public /* synthetic */ Void o() {
        FirebaseAnalytics.getInstance(a()).d();
        return null;
    }

    public /* synthetic */ Void p(Boolean bool) {
        FirebaseAnalytics.getInstance(a()).e(bool.booleanValue());
        return null;
    }

    public /* synthetic */ Void q(Bundle bundle) {
        boolean z10 = bundle.getBoolean("analytics_storage");
        boolean z11 = bundle.getBoolean("ad_storage");
        boolean z12 = bundle.getBoolean("ad_user_data");
        boolean z13 = bundle.getBoolean("ad_personalization");
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        enumMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, z10 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_STORAGE, z11 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_USER_DATA, z12 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, z13 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        FirebaseAnalytics.getInstance(a()).f(enumMap);
        return null;
    }

    public /* synthetic */ Void r(Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).g(bundle);
        return null;
    }

    public /* synthetic */ Void s(long j10) {
        FirebaseAnalytics.getInstance(a()).h(j10);
        return null;
    }

    public /* synthetic */ Void t(String str) {
        FirebaseAnalytics.getInstance(a()).i(str);
        return null;
    }

    public /* synthetic */ Void u(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(a());
        for (String str : setKeySet) {
            firebaseAnalytics.j(str, (String) bundle.get(str));
        }
        return null;
    }

    public /* synthetic */ Void v(String str, String str2) {
        FirebaseAnalytics.getInstance(a()).j(str, str2);
        return null;
    }

    n9.i A(final Bundle bundle) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48941a.r(bundle);
            }
        });
    }

    n9.i B(final long j10) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48943a.s(j10);
            }
        });
    }

    n9.i C(final String str) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48933a.t(str);
            }
        });
    }

    n9.i D(final Bundle bundle) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48926a.u(bundle);
            }
        });
    }

    n9.i E(final String str, final String str2) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48938a.v(str, str2);
            }
        });
    }

    n9.i l() {
        return FirebaseAnalytics.getInstance(a()).a();
    }

    n9.i m() {
        return FirebaseAnalytics.getInstance(a()).b();
    }

    n9.i w(final String str, final Bundle bundle) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48935a.n(str, bundle);
            }
        });
    }

    n9.i x() {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48928a.o();
            }
        });
    }

    n9.i y(final Boolean bool) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48931a.p(bool);
            }
        });
    }

    n9.i z(final Bundle bundle) {
        return n9.l.c(new Callable() { // from class: io.invertase.firebase.analytics.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f48929a.q(bundle);
            }
        });
    }
}
