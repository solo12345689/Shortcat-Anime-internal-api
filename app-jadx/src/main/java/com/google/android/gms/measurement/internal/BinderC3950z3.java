package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C3418b;
import com.google.android.gms.internal.measurement.C3431c3;
import com.google.android.gms.internal.measurement.C3440d3;
import com.google.android.gms.internal.measurement.C3446e0;
import com.google.android.gms.internal.measurement.C3523m5;
import j9.AbstractBinderC5346c;
import j9.C5344a;
import j9.InterfaceC5350g;
import j9.InterfaceC5353j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3950z3 extends AbstractBinderC5346c {

    /* JADX INFO: renamed from: a */
    private final q6 f41808a;

    /* JADX INFO: renamed from: b */
    private Boolean f41809b;

    /* JADX INFO: renamed from: c */
    private String f41810c;

    public BinderC3950z3(q6 q6Var, String str) {
        AbstractC2115p.l(q6Var);
        this.f41808a = q6Var;
        this.f41810c = null;
    }

    private final void M3(G g10, B6 b62) {
        q6 q6Var = this.f41808a;
        q6Var.E();
        q6Var.k(g10, b62);
    }

    private final void N3(B6 b62, boolean z10) {
        AbstractC2115p.l(b62);
        String str = b62.f40646a;
        AbstractC2115p.f(str);
        O3(str, false);
        this.f41808a.N0().o(b62.f40647b);
    }

    private final void O3(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f41808a.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f41809b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f41810c)) {
                        q6 q6Var = this.f41808a;
                        if (!com.google.android.gms.common.util.q.a(q6Var.d(), Binder.getCallingUid()) && !com.google.android.gms.common.e.a(q6Var.d()).c(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.f41809b = Boolean.valueOf(z11);
                }
                if (this.f41809b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f41808a.a().o().b("Measurement Service called with invalid calling package. appId", C3887q2.x(str));
                throw e10;
            }
        }
        if (this.f41810c == null && com.google.android.gms.common.d.k(this.f41808a.d(), Binder.getCallingUid(), str)) {
            this.f41810c = str;
        }
        if (str.equals(this.f41810c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // j9.InterfaceC5347d
    public final void A0(final B6 b62) {
        AbstractC2115p.f(b62.f40646a);
        AbstractC2115p.l(b62.f40664s);
        e(new Runnable() { // from class: com.google.android.gms.measurement.internal.s3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41585a.G3(b62);
            }
        });
    }

    @Override // j9.InterfaceC5347d
    public final void C1(B6 b62, final j9.J j10, final InterfaceC5353j interfaceC5353j) {
        N3(b62, false);
        final String str = (String) AbstractC2115p.l(b62.f40646a);
        this.f41808a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.u3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41651a.I3(str, j10, interfaceC5353j);
            }
        });
    }

    @Override // j9.InterfaceC5347d
    public final void C3(B6 b62) {
        AbstractC2115p.f(b62.f40646a);
        AbstractC2115p.l(b62.f40664s);
        e(new RunnableC3846k3(this, b62));
    }

    @Override // j9.InterfaceC5347d
    public final List E1(B6 b62, boolean z10) {
        N3(b62, false);
        String str = b62.f40646a;
        AbstractC2115p.l(str);
        try {
            List<x6> list = (List) this.f41808a.b().r(new Y2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.N(x6Var.f41775c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f41808a.a().o().c("Failed to get user properties. appId", C3887q2.x(b62.f40646a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f41808a.a().o().c("Failed to get user properties. appId", C3887q2.x(b62.f40646a), e);
            return null;
        }
    }

    @Override // j9.InterfaceC5347d
    public final void E2(final B6 b62, final C3810g c3810g) {
        N3(b62, false);
        R3(new Runnable() { // from class: com.google.android.gms.measurement.internal.w3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41724a.J3(b62, c3810g);
            }
        });
    }

    @Override // j9.InterfaceC5347d
    public final byte[] G0(G g10, String str) {
        AbstractC2115p.f(str);
        AbstractC2115p.l(g10);
        O3(str, true);
        q6 q6Var = this.f41808a;
        C3873o2 c3873o2V = q6Var.a().v();
        C3837j2 c3837j2M0 = q6Var.M0();
        String str2 = g10.f40764a;
        c3873o2V.b("Log and bundle. event", c3837j2M0.a(str2));
        long jB = q6Var.e().b() / 1000000;
        try {
            byte[] bArr = (byte[]) q6Var.b().s(new CallableC3874o3(this, g10, str)).get();
            if (bArr == null) {
                q6Var.a().o().b("Log and bundle returned null. appId", C3887q2.x(str));
                bArr = new byte[0];
            }
            q6Var.a().v().d("Log and bundle processed. event, size, time_ms", q6Var.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((q6Var.e().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            q6 q6Var2 = this.f41808a;
            q6Var2.a().o().d("Failed to log and bundle. appId, event, error", C3887q2.x(str), q6Var2.M0().a(g10.f40764a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            q6 q6Var22 = this.f41808a;
            q6Var22.a().o().d("Failed to log and bundle. appId, event, error", C3887q2.x(str), q6Var22.M0().a(g10.f40764a), e);
            return null;
        }
    }

    final /* synthetic */ void G3(B6 b62) {
        q6 q6Var = this.f41808a;
        q6Var.E();
        q6Var.Q0(b62);
    }

    final /* synthetic */ void H3(B6 b62, Bundle bundle, InterfaceC5350g interfaceC5350g, String str) {
        q6 q6Var = this.f41808a;
        q6Var.E();
        try {
            interfaceC5350g.o1(q6Var.q0(b62, bundle));
        } catch (RemoteException e10) {
            this.f41808a.a().o().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    @Override // j9.InterfaceC5347d
    public final void I0(C3826i c3826i) {
        AbstractC2115p.l(c3826i);
        AbstractC2115p.l(c3826i.f41353c);
        AbstractC2115p.f(c3826i.f41351a);
        O3(c3826i.f41351a, true);
        R3(new RunnableC3790d3(this, new C3826i(c3826i)));
    }

    final /* synthetic */ void I3(String str, j9.J j10, InterfaceC5353j interfaceC5353j) {
        q6 q6Var = this.f41808a;
        q6Var.E();
        q6Var.b().h();
        q6Var.O0();
        List<t6> listO = q6Var.F0().o(str, j10, ((Integer) AbstractC3789d2.f41143B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (t6 t6Var : listO) {
            if (q6Var.t(str, t6Var.e())) {
                int i10 = t6Var.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) AbstractC3789d2.f41255z.b(null)).intValue()) {
                        if (q6Var.e().a() >= t6Var.h() + Math.min(((Long) AbstractC3789d2.f41251x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) AbstractC3789d2.f41253y.b(null)).longValue())) {
                        }
                    }
                    q6Var.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(t6Var.c()), Long.valueOf(t6Var.h()));
                }
                X5 x5B = t6Var.b();
                try {
                    com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) u6.W(C3431c3.J(), x5B.f41050b);
                    for (int i11 = 0; i11 < z22.u(); i11++) {
                        C3440d3 c3440d3 = (C3440d3) z22.v(i11).p();
                        c3440d3.f1(q6Var.e().a());
                        z22.x(i11, c3440d3);
                    }
                    x5B.f41050b = ((C3431c3) z22.q()).b();
                    if (Log.isLoggable(q6Var.a().z(), 2)) {
                        x5B.f41055g = q6Var.K0().K((C3431c3) z22.q());
                    }
                    arrayList.add(x5B);
                } catch (C3523m5 unused) {
                    q6Var.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                q6Var.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(t6Var.c()), t6Var.e());
            }
        }
        Z5 z52 = new Z5(arrayList);
        try {
            interfaceC5353j.Z2(z52);
            this.f41808a.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(z52.f41084a.size()));
        } catch (RemoteException e10) {
            this.f41808a.a().o().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    final /* synthetic */ void J3(B6 b62, C3810g c3810g) {
        q6 q6Var = this.f41808a;
        q6Var.E();
        q6Var.r0((String) AbstractC2115p.l(b62.f40646a), c3810g);
    }

    @Override // j9.InterfaceC5347d
    public final List K(String str, String str2, String str3, boolean z10) {
        O3(str, true);
        try {
            List<x6> list = (List) this.f41808a.b().r(new CallableC3806f3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.N(x6Var.f41775c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f41808a.a().o().c("Failed to get user properties as. appId", C3887q2.x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f41808a.a().o().c("Failed to get user properties as. appId", C3887q2.x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    final /* synthetic */ void K3(Bundle bundle, String str, B6 b62) {
        q6 q6Var = this.f41808a;
        boolean zH = q6Var.B0().H(null, AbstractC3789d2.f41186W0);
        if (bundle.isEmpty() && zH) {
            C3911u c3911uF0 = this.f41808a.F0();
            c3911uF0.h();
            c3911uF0.j();
            try {
                c3911uF0.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c3911uF0.f40611a.a().o().b("Error clearing default event params", e10);
                return;
            }
        }
        C3911u c3911uF02 = q6Var.F0();
        c3911uF02.h();
        c3911uF02.j();
        byte[] bArrB = c3911uF02.f41010b.K0().J(new B(c3911uF02.f40611a, "", str, "dep", 0L, 0L, bundle)).b();
        X2 x22 = c3911uF02.f40611a;
        x22.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrB);
        try {
            if (c3911uF02.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                x22.a().o().b("Failed to insert default event parameters (got -1). appId", C3887q2.x(str));
            }
        } catch (SQLiteException e11) {
            c3911uF02.f40611a.a().o().c("Error storing default event parameters. appId", C3887q2.x(str), e11);
        }
        q6 q6Var2 = this.f41808a;
        C3911u c3911uF03 = q6Var2.F0();
        long j10 = b62.f40644D;
        if (c3911uF03.H(str, j10)) {
            q6Var2.F0().I(str, Long.valueOf(j10), null, bundle);
        }
    }

    final /* synthetic */ q6 L3() {
        return this.f41808a;
    }

    @Override // j9.InterfaceC5347d
    public final void M(C3826i c3826i, B6 b62) {
        AbstractC2115p.l(c3826i);
        AbstractC2115p.l(c3826i.f41353c);
        N3(b62, false);
        C3826i c3826i2 = new C3826i(c3826i);
        c3826i2.f41351a = b62.f40646a;
        R3(new RunnableC3782c3(this, c3826i2, b62));
    }

    @Override // j9.InterfaceC5347d
    public final C5344a O2(B6 b62) {
        N3(b62, false);
        AbstractC2115p.f(b62.f40646a);
        try {
            return (C5344a) this.f41808a.b().s(new CallableC3853l3(this, b62)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f41808a.a().o().c("Failed to get consent. appId", C3887q2.x(b62.f40646a), e10);
            return new C5344a(null);
        }
    }

    @Override // j9.InterfaceC5347d
    public final void P0(v6 v6Var, B6 b62) {
        AbstractC2115p.l(v6Var);
        N3(b62, false);
        R3(new RunnableC3881p3(this, v6Var, b62));
    }

    @Override // j9.InterfaceC5347d
    public final void P2(final Bundle bundle, final B6 b62) {
        N3(b62, false);
        final String str = b62.f40646a;
        AbstractC2115p.l(str);
        R3(new Runnable() { // from class: com.google.android.gms.measurement.internal.x3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41745a.K3(bundle, str, b62);
            }
        });
    }

    final void P3(G g10, B6 b62) {
        q6 q6Var = this.f41808a;
        P2 p2D0 = q6Var.D0();
        String str = b62.f40646a;
        C3446e0 c3446e0 = TextUtils.isEmpty(str) ? null : (C3446e0) p2D0.f40903j.d(str);
        if (c3446e0 == null) {
            this.f41808a.a().w().b("EES not loaded for", b62.f40646a);
            M3(g10, b62);
            return;
        }
        try {
            Map mapZ = q6Var.K0().Z(g10.f40765b.l(), true);
            String str2 = g10.f40764a;
            String strA = j9.w.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (c3446e0.b(new C3418b(str2, g10.f40767d, mapZ))) {
                if (c3446e0.c()) {
                    q6 q6Var2 = this.f41808a;
                    q6Var2.a().w().b("EES edited event", g10.f40764a);
                    M3(q6Var2.K0().m(c3446e0.e().c()), b62);
                } else {
                    M3(g10, b62);
                }
                if (c3446e0.d()) {
                    for (C3418b c3418b : c3446e0.e().f()) {
                        q6 q6Var3 = this.f41808a;
                        q6Var3.a().w().b("EES logging created event", c3418b.b());
                        M3(q6Var3.K0().m(c3418b), b62);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.D0 unused) {
            this.f41808a.a().o().c("EES error. appId, eventName", b62.f40647b, g10.f40764a);
        }
        this.f41808a.a().w().b("EES was not applied to event", g10.f40764a);
        M3(g10, b62);
    }

    final G Q3(G g10, B6 b62) {
        E e10;
        if ("_cmp".equals(g10.f40764a) && (e10 = g10.f40765b) != null && e10.i() != 0) {
            String strF = e10.f("_cis");
            if ("referrer broadcast".equals(strF) || "referrer API".equals(strF)) {
                this.f41808a.a().u().b("Event has been filtered ", g10.toString());
                return new G("_cmpx", e10, g10.f40766c, g10.f40767d);
            }
        }
        return g10;
    }

    @Override // j9.InterfaceC5347d
    public final void R1(G g10, String str, String str2) {
        AbstractC2115p.l(g10);
        AbstractC2115p.f(str);
        O3(str, true);
        R3(new RunnableC3867n3(this, g10, str));
    }

    final void R3(Runnable runnable) {
        AbstractC2115p.l(runnable);
        q6 q6Var = this.f41808a;
        if (q6Var.b().p()) {
            runnable.run();
        } else {
            q6Var.b().t(runnable);
        }
    }

    @Override // j9.InterfaceC5347d
    public final void W2(B6 b62) {
        N3(b62, false);
        R3(new Z2(this, b62));
    }

    @Override // j9.InterfaceC5347d
    public final void a2(long j10, String str, String str2, String str3) {
        R3(new RunnableC3774b3(this, str2, str3, str, j10));
    }

    @Override // j9.InterfaceC5347d
    public final void b2(B6 b62) {
        String str = b62.f40646a;
        AbstractC2115p.f(str);
        O3(str, false);
        R3(new RunnableC3838j3(this, b62));
    }

    final void e(Runnable runnable) {
        AbstractC2115p.l(runnable);
        q6 q6Var = this.f41808a;
        if (q6Var.b().p()) {
            runnable.run();
        } else {
            q6Var.b().v(runnable);
        }
    }

    @Override // j9.InterfaceC5347d
    public final void e3(B6 b62) {
        N3(b62, false);
        R3(new RunnableC3766a3(this, b62));
    }

    final /* synthetic */ void h(B6 b62) {
        q6 q6Var = this.f41808a;
        q6Var.E();
        q6Var.P0(b62);
    }

    @Override // j9.InterfaceC5347d
    public final List j3(String str, String str2, boolean z10, B6 b62) {
        N3(b62, false);
        String str3 = b62.f40646a;
        AbstractC2115p.l(str3);
        try {
            List<x6> list = (List) this.f41808a.b().r(new CallableC3798e3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.N(x6Var.f41775c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f41808a.a().o().c("Failed to query user properties. appId", C3887q2.x(b62.f40646a), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f41808a.a().o().c("Failed to query user properties. appId", C3887q2.x(b62.f40646a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // j9.InterfaceC5347d
    public final List l0(String str, String str2, String str3) {
        O3(str, true);
        try {
            return (List) this.f41808a.b().r(new CallableC3822h3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f41808a.a().o().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // j9.InterfaceC5347d
    public final List p3(String str, String str2, B6 b62) {
        N3(b62, false);
        String str3 = b62.f40646a;
        AbstractC2115p.l(str3);
        try {
            return (List) this.f41808a.b().r(new CallableC3814g3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f41808a.a().o().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // j9.InterfaceC5347d
    public final void t2(final B6 b62, final Bundle bundle, final InterfaceC5350g interfaceC5350g) {
        N3(b62, false);
        final String str = (String) AbstractC2115p.l(b62.f40646a);
        this.f41808a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.t3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41610a.H3(b62, bundle, interfaceC5350g, str);
            }
        });
    }

    @Override // j9.InterfaceC5347d
    public final void u0(final B6 b62) {
        AbstractC2115p.f(b62.f40646a);
        AbstractC2115p.l(b62.f40664s);
        e(new Runnable() { // from class: com.google.android.gms.measurement.internal.y3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f41789a.h(b62);
            }
        });
    }

    @Override // j9.InterfaceC5347d
    public final List w0(B6 b62, Bundle bundle) {
        N3(b62, false);
        AbstractC2115p.l(b62.f40646a);
        q6 q6Var = this.f41808a;
        if (!q6Var.B0().H(null, AbstractC3789d2.f41192Z0)) {
            try {
                return (List) this.f41808a.b().r(new CallableC3894r3(this, b62, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f41808a.a().o().c("Failed to get trigger URIs. appId", C3887q2.x(b62.f40646a), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) q6Var.b().s(new CallableC3888q3(this, b62, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f41808a.a().o().c("Failed to get trigger URIs. appId", C3887q2.x(b62.f40646a), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // j9.InterfaceC5347d
    public final String w1(B6 b62) {
        N3(b62, false);
        return this.f41808a.p0(b62);
    }

    @Override // j9.InterfaceC5347d
    public final void x0(G g10, B6 b62) {
        AbstractC2115p.l(g10);
        N3(b62, false);
        R3(new RunnableC3860m3(this, g10, b62));
    }

    @Override // j9.InterfaceC5347d
    public final void y0(B6 b62) {
        N3(b62, false);
        R3(new RunnableC3830i3(this, b62));
    }
}
