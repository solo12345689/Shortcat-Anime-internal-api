package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v6 extends S8.a {
    public static final Parcelable.Creator<v6> CREATOR = new w6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f41671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f41674g;

    v6(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f41668a = i10;
        this.f41669b = str;
        this.f41670c = j10;
        this.f41671d = l10;
        this.f41674g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f41672e = str2;
        this.f41673f = str3;
    }

    public final Object c() {
        Long l10 = this.f41671d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f41674g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f41672e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w6.a(this, parcel, i10);
    }

    v6(x6 x6Var) {
        this(x6Var.f41775c, x6Var.f41776d, x6Var.f41777e, x6Var.f41774b);
    }

    v6(String str, long j10, Object obj, String str2) {
        AbstractC2115p.f(str);
        this.f41668a = 2;
        this.f41669b = str;
        this.f41670c = j10;
        this.f41673f = str2;
        if (obj == null) {
            this.f41671d = null;
            this.f41674g = null;
            this.f41672e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f41671d = (Long) obj;
            this.f41674g = null;
            this.f41672e = null;
        } else if (obj instanceof String) {
            this.f41671d = null;
            this.f41674g = null;
            this.f41672e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f41671d = null;
                this.f41674g = (Double) obj;
                this.f41672e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
