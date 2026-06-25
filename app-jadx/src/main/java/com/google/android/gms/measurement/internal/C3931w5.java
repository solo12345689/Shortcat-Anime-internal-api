package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import com.revenuecat.purchases.common.Constants;
import j9.C5344a;
import j9.InterfaceC5347d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3931w5 extends AbstractC3805f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC3890q5 f41729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5347d f41730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f41731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC3932x f41732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f41733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R5 f41734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f41735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC3932x f41736j;

    protected C3931w5(X2 x22) {
        super(x22);
        this.f41735i = new ArrayList();
        this.f41734h = new R5(x22.e());
        this.f41729c = new ServiceConnectionC3890q5(this);
        this.f41732f = new W4(this, x22);
        this.f41736j = new C3768a5(this, x22);
    }

    private final boolean R() {
        this.f40611a.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f41734h.a();
        this.f40611a.w();
        this.f41732f.b(((Long) AbstractC3789d2.f41191Z.b(null)).longValue());
    }

    private final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f41735i;
        long size = list.size();
        X2 x22 = this.f40611a;
        x22.w();
        if (size >= 1000) {
            x22.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f41736j.b(60000L);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        C3873o2 c3873o2W = this.f40611a.a().w();
        List list = this.f41735i;
        c3873o2W.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f40611a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f41735i.clear();
        this.f41736j.d();
    }

    private final B6 V(boolean z10) {
        Pair pairB;
        X2 x22 = this.f40611a;
        x22.c();
        C3813g2 c3813g2L = this.f40611a.L();
        String string = null;
        if (z10) {
            X2 x23 = x22.a().f40611a;
            if (x23.x().f40716e != null && (pairB = x23.x().f40716e.b()) != null && pairB != E2.f40713A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return c3813g2L.o(string);
    }

    public final void A() {
        h();
        j();
        ServiceConnectionC3890q5 serviceConnectionC3890q5 = this.f41729c;
        serviceConnectionC3890q5.b();
        try {
            V8.a.b().c(this.f40611a.d(), serviceConnectionC3890q5);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f41730d = null;
    }

    public final void B(InterfaceC3623y0 interfaceC3623y0, G g10, String str) {
        h();
        j();
        X2 x22 = this.f40611a;
        if (x22.C().X(12451000) == 0) {
            T(new Z4(this, g10, str, interfaceC3623y0));
        } else {
            x22.a().r().a("Not bundling data. Service unavailable or out of date");
            x22.C().d0(interfaceC3623y0, new byte[0]);
        }
    }

    final boolean C() {
        h();
        j();
        return !y() || this.f40611a.C().W() >= ((Integer) AbstractC3789d2.f41162K0.b(null)).intValue();
    }

    final boolean D() {
        h();
        j();
        return !y() || this.f40611a.C().W() >= 241200;
    }

    final /* synthetic */ void E() {
        InterfaceC5347d interfaceC5347d = this.f41730d;
        if (interfaceC5347d == null) {
            this.f40611a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            B6 b6V = V(false);
            AbstractC2115p.l(b6V);
            interfaceC5347d.u0(b6V);
            J();
        } catch (RemoteException e10) {
            this.f40611a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    final /* synthetic */ void F() {
        InterfaceC5347d interfaceC5347d = this.f41730d;
        if (interfaceC5347d == null) {
            this.f40611a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            B6 b6V = V(false);
            AbstractC2115p.l(b6V);
            interfaceC5347d.A0(b6V);
            J();
        } catch (RemoteException e10) {
            this.f40611a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    final /* synthetic */ void G(AtomicReference atomicReference, B6 b62, Bundle bundle) {
        InterfaceC5347d interfaceC5347d;
        synchronized (atomicReference) {
            try {
                interfaceC5347d = this.f41730d;
            } catch (RemoteException e10) {
                this.f40611a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC5347d == null) {
                this.f40611a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC2115p.l(b62);
            interfaceC5347d.t2(b62, bundle, new O4(this, atomicReference));
            J();
        }
    }

    final /* synthetic */ void H(AtomicReference atomicReference, B6 b62, j9.J j10) {
        InterfaceC5347d interfaceC5347d;
        synchronized (atomicReference) {
            try {
                interfaceC5347d = this.f41730d;
            } catch (RemoteException e10) {
                this.f40611a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC5347d == null) {
                this.f40611a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC2115p.l(b62);
            interfaceC5347d.C1(b62, j10, new P4(this, atomicReference));
            J();
        }
    }

    final /* synthetic */ void I(B6 b62, C3810g c3810g) {
        InterfaceC5347d interfaceC5347d = this.f41730d;
        if (interfaceC5347d == null) {
            this.f40611a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC5347d.E2(b62, c3810g);
            J();
        } catch (RemoteException e10) {
            this.f40611a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c3810g.f41301a), e10);
        }
    }

    final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f41730d != null) {
            this.f41730d = null;
            this.f40611a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    final /* synthetic */ ServiceConnectionC3890q5 M() {
        return this.f41729c;
    }

    final /* synthetic */ InterfaceC5347d N() {
        return this.f41730d;
    }

    final /* synthetic */ void O(InterfaceC5347d interfaceC5347d) {
        this.f41730d = null;
    }

    final /* synthetic */ ScheduledExecutorService P() {
        return this.f41733g;
    }

    final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f41733g = scheduledExecutorService;
    }

    public final boolean W() {
        h();
        j();
        return this.f41730d != null;
    }

    protected final void X() {
        h();
        j();
        T(new RunnableC3776b5(this, V(true)));
    }

    protected final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new RunnableC3784c5(this, V(false)));
        }
    }

    protected final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41667a.E();
            }
        });
    }

    protected final void a0() {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.r5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41578a.F();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void b0(j9.InterfaceC5347d r59, S8.a r60, com.google.android.gms.measurement.internal.B6 r61) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3931w5.b0(j9.d, S8.a, com.google.android.gms.measurement.internal.B6):void");
    }

    protected final void c0(G g10, String str) {
        AbstractC2115p.l(g10);
        h();
        j();
        R();
        T(new RunnableC3792d5(this, true, V(true), this.f40611a.E().p(g10), g10, str));
    }

    protected final void d0(C3826i c3826i) {
        AbstractC2115p.l(c3826i);
        h();
        j();
        this.f40611a.c();
        T(new RunnableC3800e5(this, true, V(true), this.f40611a.E().r(c3826i), new C3826i(c3826i), c3826i));
    }

    protected final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new RunnableC3808f5(this, atomicReference, null, str2, str3, V(false)));
    }

    protected final void f0(InterfaceC3623y0 interfaceC3623y0, String str, String str2) {
        h();
        j();
        T(new RunnableC3816g5(this, str, str2, V(false), interfaceC3623y0));
    }

    protected final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new RunnableC3824h5(this, atomicReference, null, str2, str3, V(false), z10));
    }

    protected final void h0(InterfaceC3623y0 interfaceC3623y0, String str, String str2, boolean z10) {
        h();
        j();
        T(new N4(this, str, str2, V(false), z10, interfaceC3623y0));
    }

    protected final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final B6 b6V = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41588a.G(atomicReference, b6V, bundle);
            }
        });
    }

    protected final void j0(final AtomicReference atomicReference, final j9.J j10) {
        h();
        j();
        final B6 b6V = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.t5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41617a.H(atomicReference, b6V, j10);
            }
        });
    }

    protected final void k0(final C3810g c3810g) {
        h();
        j();
        final B6 b6V = V(true);
        AbstractC2115p.l(b6V);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.u5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41657a.I(b6V, c3810g);
            }
        });
    }

    protected final C5344a l0() {
        h();
        j();
        InterfaceC5347d interfaceC5347d = this.f41730d;
        if (interfaceC5347d == null) {
            w();
            this.f40611a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        B6 b6V = V(false);
        AbstractC2115p.l(b6V);
        try {
            C5344a c5344aO2 = interfaceC5347d.O2(b6V);
            J();
            return c5344aO2;
        } catch (RemoteException e10) {
            this.f40611a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3805f2
    protected final boolean m() {
        return false;
    }

    protected final void o(v6 v6Var) {
        h();
        j();
        R();
        T(new Q4(this, V(true), this.f40611a.E().q(v6Var), v6Var));
    }

    protected final void p() {
        h();
        j();
        B6 b6V = V(false);
        R();
        this.f40611a.E().o();
        T(new R4(this, b6V));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new S4(this, atomicReference, V(false)));
    }

    public final void r(InterfaceC3623y0 interfaceC3623y0) {
        h();
        j();
        T(new T4(this, V(false), interfaceC3623y0));
    }

    protected final void s() {
        h();
        j();
        B6 b6V = V(true);
        R();
        this.f40611a.w().H(null, AbstractC3789d2.f41201c1);
        this.f40611a.E().u();
        T(new U4(this, b6V, true));
    }

    protected final void t() {
        h();
        j();
        T(new V4(this, V(true)));
    }

    protected final void u(E4 e42) {
        h();
        j();
        T(new X4(this, e42));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        E e10 = new E(bundle);
        R();
        T(new Y4(this, true, V(false), this.f40611a.w().H(null, AbstractC3789d2.f41201c1) && this.f40611a.E().s(e10), e10, bundle));
    }

    final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f41729c.d();
            return;
        }
        X2 x22 = this.f40611a;
        if (x22.w().m()) {
            return;
        }
        x22.c();
        List<ResolveInfo> listQueryIntentServices = x22.d().getPackageManager().queryIntentServices(new Intent().setClassName(x22.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            x22.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextD = x22.d();
        x22.c();
        intent.setComponent(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f41729c.a(intent);
    }

    final Boolean x() {
        return this.f41731e;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean y() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3931w5.y():boolean");
    }

    protected final void z(InterfaceC5347d interfaceC5347d) {
        h();
        AbstractC2115p.l(interfaceC5347d);
        this.f41730d = interfaceC5347d;
        J();
        L();
    }
}
