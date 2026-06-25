package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C3431c3;
import com.google.android.gms.internal.measurement.C3440d3;
import com.google.android.gms.internal.measurement.C3449e3;
import com.google.android.gms.internal.measurement.C3458f3;
import com.google.android.gms.internal.measurement.C3476h3;
import com.google.android.gms.internal.measurement.C3592u3;
import com.google.android.gms.internal.measurement.C3601v3;
import com.google.android.gms.internal.measurement.w7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class CallableC3874o3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f41476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f41477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC3950z3 f41478c;

    CallableC3874o3(BinderC3950z3 binderC3950z3, G g10, String str) {
        this.f41476a = g10;
        this.f41477b = str;
        Objects.requireNonNull(binderC3950z3);
        this.f41478c = binderC3950z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        C4 c42;
        C3928w2 c3928w2J0;
        byte[] bArr;
        q6 q6Var;
        x6 x6Var;
        q6 q6Var2;
        C3928w2 c3928w2;
        X2 x22;
        C3440d3 c3440d3;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        com.google.android.gms.internal.measurement.Z2 z22;
        C cA;
        long j10;
        byte[] bArr2;
        BinderC3950z3 binderC3950z3 = this.f41478c;
        binderC3950z3.L3().E();
        C4 c4J0 = binderC3950z3.L3().J0();
        c4J0.h();
        X2 x23 = c4J0.f40611a;
        X2.q();
        G g10 = this.f41476a;
        AbstractC2115p.l(g10);
        String str2 = this.f41477b;
        AbstractC2115p.f(str2);
        String str3 = g10.f40764a;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            c4J0.f40611a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        q6 q6Var3 = c4J0.f41010b;
        com.google.android.gms.internal.measurement.Z2 z2J = C3431c3.J();
        q6Var3.F0().r0();
        try {
            c3928w2J0 = q6Var3.F0().J0(str2);
        } catch (Throwable th2) {
            th = th2;
            c42 = c4J0;
        }
        if (c3928w2J0 != null) {
            if (c3928w2J0.d()) {
                C3440d3 c3440d3H0 = C3449e3.h0();
                c3440d3H0.V(1);
                c3440d3H0.v("android");
                if (!TextUtils.isEmpty(c3928w2J0.o0())) {
                    c3440d3H0.G(c3928w2J0.o0());
                }
                if (!TextUtils.isEmpty(c3928w2J0.H0())) {
                    c3440d3H0.E((String) AbstractC2115p.l(c3928w2J0.H0()));
                }
                if (!TextUtils.isEmpty(c3928w2J0.D0())) {
                    c3440d3H0.H((String) AbstractC2115p.l(c3928w2J0.D0()));
                }
                if (c3928w2J0.F0() != -2147483648L) {
                    c3440d3H0.w0((int) c3928w2J0.F0());
                }
                c3440d3H0.I(c3928w2J0.J0());
                c3440d3H0.F0(c3928w2J0.b());
                String strR0 = c3928w2J0.r0();
                if (!TextUtils.isEmpty(strR0)) {
                    c3440d3H0.q0(strR0);
                }
                c3440d3H0.M0(c3928w2J0.X());
                E3 e3G = c4J0.f41010b.g(str2);
                c3440d3H0.T(c3928w2J0.L0());
                if (x23.g() && c4J0.f40611a.w().k(c3440d3H0.F()) && e3G.o(j9.v.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    c3440d3H0.z0(null);
                }
                c3440d3H0.H0(e3G.k());
                if (e3G.o(j9.v.AD_STORAGE) && c3928w2J0.P()) {
                    Pair pairM = q6Var3.L0().m(c3928w2J0.o0(), e3G);
                    if (c3928w2J0.P() && !TextUtils.isEmpty((CharSequence) pairM.first)) {
                        try {
                            c3440d3H0.L(C4.m((String) pairM.first, Long.toString(g10.f40767d)));
                            Object obj2 = pairM.second;
                            if (obj2 != null) {
                                c3440d3H0.O(((Boolean) obj2).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            c4J0.f40611a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            q6Var = c4J0.f41010b;
                            q6Var.F0().t0();
                            return bArr;
                        }
                    }
                }
                X2 x24 = c4J0.f40611a;
                x24.K().l();
                c3440d3H0.A(Build.MODEL);
                x24.K().l();
                c3440d3H0.y(Build.VERSION.RELEASE);
                c3440d3H0.D((int) x24.K().o());
                c3440d3H0.C(x24.K().p());
                try {
                    if (e3G.o(j9.v.ANALYTICS_STORAGE) && c3928w2J0.p0() != null) {
                        c3440d3H0.R(C4.m((String) AbstractC2115p.l(c3928w2J0.p0()), Long.toString(g10.f40767d)));
                    }
                    if (!TextUtils.isEmpty(c3928w2J0.x0())) {
                        c3440d3H0.u0((String) AbstractC2115p.l(c3928w2J0.x0()));
                    }
                    String strO0 = c3928w2J0.o0();
                    q6 q6Var4 = c4J0.f41010b;
                    List listC0 = q6Var4.F0().C0(strO0);
                    Iterator it = listC0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            x6Var = null;
                            break;
                        }
                        x6Var = (x6) it.next();
                        if ("_lte".equals(x6Var.f41775c)) {
                            break;
                        }
                    }
                    if (x6Var == null || x6Var.f41777e == null) {
                        x6 x6Var2 = new x6(strO0, "auto", "_lte", c4J0.f40611a.e().a(), 0L);
                        listC0.add(x6Var2);
                        q6Var4.F0().A0(x6Var2);
                    }
                    C3601v3[] c3601v3Arr = new C3601v3[listC0.size()];
                    for (int i10 = 0; i10 < listC0.size(); i10++) {
                        C3592u3 c3592u3N = C3601v3.N();
                        c3592u3N.u(((x6) listC0.get(i10)).f41775c);
                        c3592u3N.t(((x6) listC0.get(i10)).f41776d);
                        q6Var4.K0().G(c3592u3N, ((x6) listC0.get(i10)).f41777e);
                        c3601v3Arr[i10] = (C3601v3) c3592u3N.q();
                    }
                    c3440d3H0.d1(Arrays.asList(c3601v3Arr));
                    q6 q6Var5 = c4J0.f41010b;
                    q6Var5.n(c3928w2J0, c3440d3H0);
                    q6Var5.o(c3928w2J0, c3440d3H0);
                    C3893r2 c3893r2A = C3893r2.a(g10);
                    X2 x25 = c4J0.f40611a;
                    z6 z6VarC = x25.C();
                    Bundle bundle2 = c3893r2A.f41573d;
                    z6VarC.w(bundle2, q6Var4.F0().G(str2));
                    x25.C().u(c3893r2A, x25.w().w(str2));
                    bundle2.putLong("_c", 1L);
                    x25.a().v().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    String str4 = g10.f40766c;
                    bundle2.putString("_o", str4);
                    if (x25.C().P(c3440d3H0.F(), c3928w2J0.l0())) {
                        x25.C().A(bundle2, "_dbg", 1L);
                        x25.C().A(bundle2, "_r", 1L);
                    }
                    C3911u c3911uF0 = q6Var4.F0();
                    String str5 = g10.f40764a;
                    C cV0 = c3911uF0.v0(str2, str5);
                    if (cV0 == null) {
                        c3928w2 = c3928w2J0;
                        x22 = x25;
                        c3440d3 = c3440d3H0;
                        q6Var2 = q6Var5;
                        obj = null;
                        bundle = bundle2;
                        str = str4;
                        cA = new C(str2, str5, 0L, 0L, 0L, g10.f40767d, 0L, null, null, null, null);
                        z10 = true;
                        j10 = 0;
                        z22 = z2J;
                    } else {
                        q6Var2 = q6Var5;
                        c3928w2 = c3928w2J0;
                        x22 = x25;
                        c3440d3 = c3440d3H0;
                        bundle = bundle2;
                        str = str4;
                        z10 = true;
                        obj = null;
                        z22 = z2J;
                        long j11 = cV0.f40677f;
                        cA = cV0.a(g10.f40767d);
                        j10 = j11;
                    }
                    C c10 = cA;
                    q6Var4.F0().w0(c10);
                    X2 x26 = c4J0.f40611a;
                    long j12 = g10.f40767d;
                    boolean z11 = z10;
                    C3928w2 c3928w22 = c3928w2;
                    C3440d3 c3440d32 = c3440d3;
                    q6 q6Var6 = q6Var2;
                    try {
                        B b10 = new B(x26, str, str2, str5, j12, j10, bundle);
                        com.google.android.gms.internal.measurement.R2 r2M = com.google.android.gms.internal.measurement.S2.M();
                        r2M.J(b10.f40628d);
                        r2M.G(b10.f40626b);
                        r2M.L(b10.f40629e);
                        E e11 = b10.f40630f;
                        D d10 = new D(e11);
                        while (d10.hasNext()) {
                            String next = d10.next();
                            com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
                            v2O.u(next);
                            Object objC = e11.c(next);
                            if (objC != null) {
                                q6Var4.K0().H(v2O, objC);
                                r2M.B(v2O);
                            }
                        }
                        c3440d32.T0(r2M);
                        C3458f3 c3458f3C = C3476h3.C();
                        com.google.android.gms.internal.measurement.T2 t2C = com.google.android.gms.internal.measurement.U2.C();
                        t2C.u(c10.f40674c);
                        t2C.t(str5);
                        c3458f3C.t(t2C);
                        c3440d32.D0(c3458f3C);
                        c3440d32.s0(q6Var4.I0().m(c3928w22.o0(), Collections.EMPTY_LIST, c3440d32.X0(), Long.valueOf(r2M.I()), Long.valueOf(r2M.I()), false));
                        if (r2M.H()) {
                            c3440d32.i1(r2M.I());
                            c3440d32.k1(r2M.I());
                        }
                        long jB0 = c3928w22.B0();
                        if (jB0 != 0) {
                            c3440d32.t(jB0);
                        }
                        long jZ0 = c3928w22.z0();
                        if (jZ0 != 0) {
                            c3440d32.l1(jZ0);
                        } else if (jB0 != 0) {
                            c3440d32.l1(jB0);
                        }
                        String strT0 = c3928w22.t0();
                        w7.a();
                        if (x22.w().H(str2, AbstractC3789d2.f41168N0) && strT0 != null) {
                            c3440d32.I0(strT0);
                        }
                        c3928w22.l();
                        c3440d32.U((int) c3928w22.g());
                        x22.w().A();
                        c3440d32.J(133005L);
                        c3440d32.f1(x22.e().a());
                        c3440d32.r0(z11);
                        q6Var6.x(c3440d32.F(), c3440d32);
                        z22.y(c3440d32);
                        c3928w22.A0(c3440d32.h1());
                        c3928w22.C0(c3440d32.j1());
                        q6Var4.F0().K0(c3928w22, false, false);
                        q6Var4.F0().s0();
                        q6Var4.F0().t0();
                        try {
                            return q6Var4.K0().V(((C3431c3) z22.q()).b());
                        } catch (IOException e12) {
                            c4J0.f40611a.a().o().c("Data loss. Failed to bundle and serialize. appId", C3887q2.x(str2), e12);
                            return obj;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c42 = c4J0;
                    }
                } catch (SecurityException e13) {
                    c42 = c4J0;
                    try {
                        c42.f40611a.a().v().b("app instance id encryption failed", e13.getMessage());
                        bArr = new byte[0];
                        q6Var = c42.f41010b;
                        q6Var.F0().t0();
                        return bArr;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } else {
                c4J0.f40611a.a().v().b("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            c42.f41010b.F0().t0();
            throw th;
        }
        c4J0.f40611a.a().v().b("Log and bundle not available. package_name", str2);
        bArr2 = new byte[0];
        q6Var3.F0().t0();
        return bArr2;
    }
}
