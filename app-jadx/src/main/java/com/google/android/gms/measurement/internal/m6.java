package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import com.google.android.gms.internal.measurement.C3449e3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C3449e3 f41436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List f41437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List f41438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f41439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q6 f41440e;

    /* synthetic */ m6(q6 q6Var, byte[] bArr) {
        Objects.requireNonNull(q6Var);
        this.f41440e = q6Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.S2 s22) {
        return ((s22.H() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.S2 s22) {
        AbstractC2115p.l(s22);
        if (this.f41438c == null) {
            this.f41438c = new ArrayList();
        }
        if (this.f41437b == null) {
            this.f41437b = new ArrayList();
        }
        if (!this.f41438c.isEmpty() && b((com.google.android.gms.internal.measurement.S2) this.f41438c.get(0)) != b(s22)) {
            return false;
        }
        long jA = this.f41439d + ((long) s22.a());
        q6 q6Var = this.f41440e;
        if (!q6Var.B0().H(null, AbstractC3789d2.f41207e1)) {
            q6Var.B0();
            if (jA >= C3856m.o()) {
                return false;
            }
        } else if (!this.f41438c.isEmpty()) {
            q6Var.B0();
            if (jA >= C3856m.o()) {
                return false;
            }
        }
        this.f41439d = jA;
        this.f41438c.add(s22);
        this.f41437b.add(Long.valueOf(j10));
        int size = this.f41438c.size();
        q6Var.B0();
        return size < Math.max(1, ((Integer) AbstractC3789d2.f41223k.b(null)).intValue());
    }
}
