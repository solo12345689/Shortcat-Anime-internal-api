package com.facebook.react;

import android.app.Application;
import com.horcrux.svg.SvgPackage;
import com.revenuecat.purchases.react.RNPurchasesPackage;
import com.revenuecat.purchases.react.ui.RevenueCatUIPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.C4541t;
import com.swmansion.worklets.WorkletsPackage;
import ib.C5054c;
import io.invertase.notifee.NotifeePackage;
import java.util.ArrayList;
import java.util.Arrays;
import ya.C7215c;
import z7.AbstractC7309a;

/* JADX INFO: renamed from: com.facebook.react.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3245j {

    /* JADX INFO: renamed from: a */
    private Application f36897a;

    /* JADX INFO: renamed from: b */
    private N f36898b;

    public C3245j(Application application) {
        this(application, null);
    }

    public ArrayList a() {
        return new ArrayList(Arrays.asList(new z7.r(null), new NotifeePackage(), new io.invertase.firebase.analytics.l(), new io.invertase.firebase.app.b(), new io.invertase.firebase.messaging.t(), new com.reactnativegooglesignin.m(), new org.reactnative.maskedview.b(), new io.sentry.react.r(), new com.shopify.reactnative.skia.g(), new C5054c(), new M4.a(), new Pa.e(), new com.reactnativekeyboardcontroller.b(), new com.margelo.nitro.mmkv.c(), new C7215c(), new gb.f(), new RNPurchasesPackage(), new RevenueCatUIPackage(), new ReanimatedPackage(), new com.th3rdwave.safeareacontext.e(), new C4541t(), new SvgPackage(), new WorkletsPackage(), new com.oblador.performance.f()));
    }

    public C3245j(Application application, AbstractC7309a abstractC7309a) {
        this.f36898b = null;
        this.f36897a = application;
    }
}
