package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3486i4 {

    /* JADX INFO: renamed from: a */
    final Uri f39789a;

    /* JADX INFO: renamed from: b */
    final String f39790b;

    /* JADX INFO: renamed from: c */
    final String f39791c;

    /* JADX INFO: renamed from: d */
    final boolean f39792d;

    /* JADX INFO: renamed from: e */
    final boolean f39793e;

    private C3486i4(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, O9.f fVar) {
        this.f39789a = uri;
        this.f39790b = "";
        this.f39791c = "";
        this.f39792d = z10;
        this.f39793e = z12;
    }

    public final C3486i4 a() {
        String str = this.f39790b;
        if (str.isEmpty()) {
            return new C3486i4(null, this.f39789a, str, this.f39791c, true, false, this.f39793e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C3486i4 b() {
        return new C3486i4(null, this.f39789a, this.f39790b, this.f39791c, this.f39792d, false, true, false, null);
    }

    public final AbstractC3540o4 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = AbstractC3540o4.f39908j;
        return new C3450e4(this, str, lValueOf, true);
    }

    public final AbstractC3540o4 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i10 = AbstractC3540o4.f39908j;
        return new C3459f4(this, str, boolValueOf, true);
    }

    public final AbstractC3540o4 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = AbstractC3540o4.f39908j;
        return new C3468g4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC3540o4 f(String str, String str2) {
        int i10 = AbstractC3540o4.f39908j;
        return new C3477h4(this, str, str2, true);
    }

    public C3486i4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
