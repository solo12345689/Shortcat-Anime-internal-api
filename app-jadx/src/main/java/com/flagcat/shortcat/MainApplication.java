package com.flagcat.shortcat;

import Td.AbstractC2163n;
import U6.d;
import Y6.a;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.C3245j;
import com.facebook.react.L;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.flagcat.shortcat.MainApplication;
import ib.C5052a;
import ib.C5059h;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/flagcat/shortcat/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "LTd/L;", "onCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/facebook/react/ReactHost;", "a", "Lkotlin/Lazy;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MainApplication extends Application implements ReactApplication {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy reactHost = AbstractC2163n.b(new InterfaceC5082a() { // from class: W7.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return MainApplication.b(this.f20783a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost b(MainApplication mainApplication) {
        Context applicationContext = mainApplication.getApplicationContext();
        AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
        ArrayList arrayListA = new C3245j(mainApplication).a();
        AbstractC5504s.g(arrayListA, "apply(...)");
        return C5059h.a(applicationContext, arrayListA, (252 & 4) != 0 ? ".expo/.virtual-metro-entry" : null, (252 & 8) != 0 ? "index.android.bundle" : null, (252 & 16) != 0 ? null : null, (252 & 32) != 0 ? null : null, (252 & 64) != 0 ? a.f22860b : false, (252 & 128) != 0 ? null : null);
    }

    @Override // com.facebook.react.ReactApplication
    public ReactHost getReactHost() {
        return (ReactHost) this.reactHost.getValue();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C5052a.c(this, newConfig);
    }

    @Override // android.app.Application
    public void onCreate() {
        d dVarValueOf;
        super.onCreate();
        DefaultNewArchitectureEntryPoint defaultNewArchitectureEntryPoint = DefaultNewArchitectureEntryPoint.INSTANCE;
        try {
            String upperCase = "stable".toUpperCase(Locale.ROOT);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            dVarValueOf = d.valueOf(upperCase);
        } catch (IllegalArgumentException unused) {
            dVarValueOf = d.f19367c;
        }
        defaultNewArchitectureEntryPoint.setReleaseLevel(dVarValueOf);
        L.a(this);
        C5052a.b(this);
    }
}
