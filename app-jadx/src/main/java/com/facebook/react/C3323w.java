package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.C0;
import com.facebook.react.devsupport.C3217d0;
import f7.InterfaceC4779a;
import h7.C4921i;
import kotlin.jvm.internal.AbstractC5504s;
import q7.InterfaceC6143a;

/* JADX INFO: renamed from: com.facebook.react.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3323w {

    /* JADX INFO: renamed from: a */
    private final Activity f38531a;

    /* JADX INFO: renamed from: b */
    private W f38532b;

    /* JADX INFO: renamed from: c */
    private final String f38533c;

    /* JADX INFO: renamed from: d */
    private Bundle f38534d;

    /* JADX INFO: renamed from: e */
    private C3217d0 f38535e;

    /* JADX INFO: renamed from: f */
    private N f38536f;

    /* JADX INFO: renamed from: g */
    private ReactHost f38537g;

    /* JADX INFO: renamed from: h */
    private InterfaceC4779a f38538h;

    /* JADX INFO: renamed from: i */
    private boolean f38539i;

    public C3323w(Activity activity, ReactHost reactHost, String str, Bundle bundle) {
        AbstractC5504s.h(activity, "activity");
        this.f38539i = C4921i.b();
        this.f38531a = activity;
        this.f38533c = str;
        this.f38534d = bundle;
        this.f38535e = new C3217d0();
        this.f38537g = reactHost;
    }

    private final c7.f d() {
        N n10;
        H hC;
        if (C4921i.a()) {
            ReactHost reactHost = this.f38537g;
            if ((reactHost != null ? reactHost.getDevSupportManager() : null) != null) {
                ReactHost reactHost2 = this.f38537g;
                if (reactHost2 != null) {
                    return reactHost2.getDevSupportManager();
                }
                return null;
            }
        }
        N n11 = this.f38536f;
        if (n11 != null && n11.g()) {
            N n12 = this.f38536f;
            if ((n12 != null ? n12.c() : null) != null && (n10 = this.f38536f) != null && (hC = n10.c()) != null) {
                return hC.C();
            }
        }
        return null;
    }

    public static final void t(C3323w c3323w) {
        N n10;
        H hC;
        N n11 = c3323w.f38536f;
        if (n11 == null || !n11.g()) {
            return;
        }
        N n12 = c3323w.f38536f;
        if ((n12 != null ? n12.c() : null) == null || (n10 = c3323w.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        hC.g0();
    }

    protected W b() {
        W w10 = new W(this.f38531a);
        w10.setIsFabric(this.f38539i);
        return w10;
    }

    public final ReactContext c() {
        if (!C4921i.a()) {
            return e().B();
        }
        ReactHost reactHost = this.f38537g;
        if (reactHost == null || reactHost == null) {
            return null;
        }
        return reactHost.getCurrentReactContext();
    }

    public final H e() {
        N n10 = this.f38536f;
        if (n10 == null) {
            throw new IllegalStateException("Cannot get ReactInstanceManager without a ReactNativeHost.");
        }
        H hC = n10.c();
        AbstractC5504s.g(hC, "getReactInstanceManager(...)");
        return hC;
    }

    public final W f() {
        if (!C4921i.a()) {
            return this.f38532b;
        }
        InterfaceC4779a interfaceC4779a = this.f38538h;
        if (interfaceC4779a != null) {
            return (W) (interfaceC4779a != null ? interfaceC4779a.a() : null);
        }
        return null;
    }

    public final void g(String appKey) {
        AbstractC5504s.h(appKey, "appKey");
        if (C4921i.a()) {
            ReactHost reactHost = this.f38537g;
            if (this.f38538h == null && reactHost != null) {
                this.f38538h = reactHost.createSurface(this.f38531a, appKey, this.f38534d);
            }
            InterfaceC4779a interfaceC4779a = this.f38538h;
            if (interfaceC4779a != null) {
                interfaceC4779a.start();
                return;
            }
            return;
        }
        if (this.f38532b != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        W wB = b();
        this.f38532b = wB;
        N n10 = this.f38536f;
        if (n10 == null || wB == null) {
            return;
        }
        wB.u(n10 != null ? n10.c() : null, appKey, this.f38534d);
    }

    public final void h(int i10, int i11, Intent intent, boolean z10) {
        N n10;
        H hC;
        ReactHost reactHost;
        if (C4921i.a() && (reactHost = this.f38537g) != null && z10) {
            if (reactHost != null) {
                reactHost.onActivityResult(this.f38531a, i10, i11, intent);
                return;
            }
            return;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || !z10 || (n10 = this.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        hC.R(this.f38531a, i10, i11, intent);
    }

    public final boolean i() {
        H hC;
        ReactHost reactHost;
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                reactHost.onBackPressed();
            }
            return true;
        }
        N n10 = this.f38536f;
        if (n10 == null || !n10.g()) {
            return false;
        }
        N n11 = this.f38536f;
        if (n11 != null && (hC = n11.c()) != null) {
            hC.S();
        }
        return true;
    }

    public final void j(Configuration configuration) {
        ReactHost reactHost;
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                Activity activity = this.f38531a;
                if (activity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                reactHost.onConfigurationChanged(activity);
                return;
            }
            return;
        }
        N n10 = this.f38536f;
        if (n10 == null || !n10.g()) {
            return;
        }
        H hE = e();
        Activity activity2 = this.f38531a;
        if (activity2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        hE.T(activity2, configuration);
    }

    public final void k() {
        N n10;
        H hC;
        ReactHost reactHost;
        x();
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                reactHost.onHostDestroy(this.f38531a);
                return;
            }
            return;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || (n10 = this.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        hC.V(this.f38531a);
    }

    public final void l() {
        N n10;
        H hC;
        ReactHost reactHost;
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                reactHost.onHostPause(this.f38531a);
                return;
            }
            return;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || (n10 = this.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        hC.X(this.f38531a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        N n10;
        H hC;
        ReactHost reactHost;
        if (!(this.f38531a instanceof InterfaceC6143a)) {
            throw new ClassCastException("Host Activity `" + this.f38531a.getClass().getSimpleName() + "` does not implement DefaultHardwareBackBtnHandler");
        }
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                Activity activity = this.f38531a;
                AbstractC5504s.f(activity, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler");
                reactHost.onHostResume(activity, (InterfaceC6143a) activity);
                return;
            }
            return;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || (n10 = this.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        Activity activity2 = this.f38531a;
        AbstractC5504s.f(activity2, "null cannot be cast to non-null type com.facebook.react.modules.core.DefaultHardwareBackBtnHandler");
        hC.Z(activity2, (InterfaceC6143a) activity2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.AbstractC5504s.h(r3, r0)
            r0 = 90
            if (r2 != r0) goto L34
            boolean r2 = h7.C4921i.a()
            r0 = 1
            if (r2 == 0) goto L1c
            com.facebook.react.ReactHost r2 = r1.f38537g
            if (r2 == 0) goto L19
            c7.f r2 = r2.getDevSupportManager()
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 != 0) goto L30
        L1c:
            com.facebook.react.N r2 = r1.f38536f
            if (r2 == 0) goto L34
            boolean r2 = r2.g()
            if (r2 != r0) goto L34
            com.facebook.react.N r2 = r1.f38536f
            if (r2 == 0) goto L34
            boolean r2 = r2.f()
            if (r2 != r0) goto L34
        L30:
            r3.startTracking()
            return r0
        L34:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C3323w.n(int, android.view.KeyEvent):boolean");
    }

    public final boolean o(int i10) {
        N n10;
        H hC;
        ReactHost reactHost;
        if (i10 != 4 && i10 != 90) {
            return false;
        }
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            c7.f devSupportManager = reactHost != null ? reactHost.getDevSupportManager() : null;
            if (devSupportManager == null || (devSupportManager instanceof C0)) {
                return false;
            }
            devSupportManager.F();
            return true;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || (n10 = this.f38536f) == null || !n10.f()) {
            return false;
        }
        N n12 = this.f38536f;
        if (n12 != null && (hC = n12.c()) != null) {
            hC.o0();
        }
        return true;
    }

    public final boolean p(Intent intent) {
        H hC;
        ReactHost reactHost;
        AbstractC5504s.h(intent, "intent");
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                reactHost.onNewIntent(intent);
            }
            return true;
        }
        N n10 = this.f38536f;
        if (n10 == null || !n10.g()) {
            return false;
        }
        N n11 = this.f38536f;
        if (n11 != null && (hC = n11.c()) != null) {
            hC.b0(intent);
        }
        return true;
    }

    public final void q() {
        N n10;
        H hC;
        ReactHost reactHost;
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                reactHost.onHostLeaveHint(this.f38531a);
                return;
            }
            return;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || (n10 = this.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        hC.c0(this.f38531a);
    }

    public final void r(boolean z10) {
        N n10;
        H hC;
        ReactHost reactHost;
        if (C4921i.a() && (reactHost = this.f38537g) != null) {
            if (reactHost != null) {
                reactHost.onWindowFocusChange(z10);
                return;
            }
            return;
        }
        N n11 = this.f38536f;
        if (n11 == null || !n11.g() || (n10 = this.f38536f) == null || (hC = n10.c()) == null) {
            return;
        }
        hC.d0(z10);
    }

    public final void s() {
        c7.f fVarD = d();
        if (fVarD == null) {
            return;
        }
        if (!(fVarD instanceof C0)) {
            fVarD.B();
            return;
        }
        if (!C4921i.a()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.v
                @Override // java.lang.Runnable
                public final void run() {
                    C3323w.t(this.f37879a);
                }
            });
            return;
        }
        ReactHost reactHost = this.f38537g;
        if (reactHost != null) {
            reactHost.reload("ReactDelegate.reload()");
        }
    }

    public final void u(W w10) {
        this.f38532b = w10;
    }

    public final void v(InterfaceC4779a interfaceC4779a) {
        this.f38538h = interfaceC4779a;
    }

    public final boolean w(int i10, KeyEvent keyEvent) {
        c7.f fVarD = d();
        if (fVarD != null && fVarD.o() && !(fVarD instanceof C0)) {
            if (i10 == 82) {
                fVarD.F();
                return true;
            }
            C3217d0 c3217d0 = this.f38535e;
            if (AbstractC5504s.c(c3217d0 != null ? Boolean.valueOf(c3217d0.b(i10, this.f38531a.getCurrentFocus())) : null, Boolean.TRUE)) {
                fVarD.B();
                return true;
            }
        }
        return false;
    }

    public final void x() {
        if (C4921i.a()) {
            InterfaceC4779a interfaceC4779a = this.f38538h;
            if (interfaceC4779a != null) {
                interfaceC4779a.stop();
            }
            this.f38538h = null;
            return;
        }
        W w10 = this.f38532b;
        if (w10 != null) {
            if (w10 != null) {
                w10.v();
            }
            this.f38532b = null;
        }
    }

    public C3323w(Activity activity, N n10, String str, Bundle bundle, boolean z10) {
        AbstractC5504s.h(activity, "activity");
        C4921i.b();
        this.f38539i = z10;
        this.f38531a = activity;
        this.f38533c = str;
        this.f38534d = bundle;
        this.f38535e = new C3217d0();
        this.f38536f = n10;
    }
}
