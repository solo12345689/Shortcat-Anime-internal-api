package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3490j implements InterfaceC3553q {

    /* JADX INFO: renamed from: a */
    private final Double f39800a;

    public C3490j(Double d10) {
        if (d10 == null) {
            this.f39800a = Double.valueOf(Double.NaN);
        } else {
            this.f39800a = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3490j) {
            return this.f39800a.equals(((C3490j) obj).f39800a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39800a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        Double d10 = this.f39800a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalA = AbstractC3481i.a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalA.scale() > 0 ? bigDecimalA.precision() : bigDecimalA.scale()) - 1);
        String str = decimalFormat.format(bigDecimalA);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalA.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        return this.f39800a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        Double d10 = this.f39800a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return new C3490j(this.f39800a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        if ("toString".equals(str)) {
            return new C3588u(k());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", k(), str));
    }

    public final String toString() {
        return k();
    }
}
