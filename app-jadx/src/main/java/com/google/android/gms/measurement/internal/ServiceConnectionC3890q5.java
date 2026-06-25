package com.google.android.gms.measurement.internal;

import R8.AbstractC2102c;
import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC3890q5 implements ServiceConnection, AbstractC2102c.a, AbstractC2102c.b {

    /* JADX INFO: renamed from: a */
    private volatile boolean f41524a;

    /* JADX INFO: renamed from: b */
    private volatile C3845k2 f41525b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3931w5 f41526c;

    protected ServiceConnectionC3890q5(C3931w5 c3931w5) {
        Objects.requireNonNull(c3931w5);
        this.f41526c = c3931w5;
    }

    public final void a(Intent intent) {
        C3931w5 c3931w5 = this.f41526c;
        c3931w5.h();
        Context contextD = c3931w5.f40611a.d();
        V8.a aVarB = V8.a.b();
        synchronized (this) {
            try {
                if (this.f41524a) {
                    this.f41526c.f40611a.a().w().a("Connection attempt already in progress");
                    return;
                }
                C3931w5 c3931w52 = this.f41526c;
                c3931w52.f40611a.a().w().a("Using local app measurement service");
                this.f41524a = true;
                aVarB.a(contextD, intent, c3931w52.M(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f41525b != null && (this.f41525b.A() || this.f41525b.c())) {
            this.f41525b.disconnect();
        }
        this.f41525b = null;
    }

    @Override // R8.AbstractC2102c.a
    public final void c(Bundle bundle) {
        this.f41526c.f40611a.b().o();
        synchronized (this) {
            try {
                AbstractC2115p.l(this.f41525b);
                this.f41526c.f40611a.b().t(new RunnableC3855l5(this, (InterfaceC5347d) this.f41525b.C()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f41525b = null;
                this.f41524a = false;
            }
        }
    }

    public final void d() {
        C3931w5 c3931w5 = this.f41526c;
        c3931w5.h();
        Context contextD = c3931w5.f40611a.d();
        synchronized (this) {
            try {
                if (this.f41524a) {
                    this.f41526c.f40611a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.f41525b != null && (this.f41525b.c() || this.f41525b.A())) {
                    this.f41526c.f40611a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.f41525b = new C3845k2(contextD, Looper.getMainLooper(), this, this);
                this.f41526c.f40611a.a().w().a("Connecting to remote service");
                this.f41524a = true;
                AbstractC2115p.l(this.f41525b);
                this.f41525b.o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // R8.AbstractC2102c.a
    public final void e(int i10) {
        X2 x22 = this.f41526c.f40611a;
        x22.b().o();
        x22.a().v().a("Service connection suspended");
        x22.b().t(new RunnableC3862m5(this));
    }

    final /* synthetic */ void f(boolean z10) {
        this.f41524a = false;
    }

    @Override // R8.AbstractC2102c.b
    public final void h(ConnectionResult connectionResult) {
        C3931w5 c3931w5 = this.f41526c;
        c3931w5.f40611a.b().o();
        C3887q2 c3887q2Y = c3931w5.f40611a.y();
        if (c3887q2Y != null) {
            c3887q2Y.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f41524a = false;
            this.f41525b = null;
        }
        this.f41526c.f40611a.b().t(new RunnableC3883p5(this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f41526c.f40611a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f41524a = false;
                this.f41526c.f40611a.a().o().a("Service connected with null binder");
                return;
            }
            InterfaceC5347d c3797e2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c3797e2 = iInterfaceQueryLocalInterface instanceof InterfaceC5347d ? (InterfaceC5347d) iInterfaceQueryLocalInterface : new C3797e2(iBinder);
                    this.f41526c.f40611a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f41526c.f40611a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f41526c.f40611a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (c3797e2 == null) {
                this.f41524a = false;
                try {
                    V8.a aVarB = V8.a.b();
                    C3931w5 c3931w5 = this.f41526c;
                    aVarB.c(c3931w5.f40611a.d(), c3931w5.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f41526c.f40611a.b().t(new RunnableC3832i5(this, c3797e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        X2 x22 = this.f41526c.f40611a;
        x22.b().o();
        x22.a().v().a("Service disconnected");
        x22.b().t(new RunnableC3840j5(this, componentName));
    }
}
