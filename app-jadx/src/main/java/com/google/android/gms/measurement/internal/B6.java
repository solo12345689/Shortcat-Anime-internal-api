package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B6 extends S8.a {
    public static final Parcelable.Creator<B6> CREATOR = new C6();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f40641A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f40642B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f40643C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f40644D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f40645E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f40652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f40653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f40655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f40656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f40657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f40658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f40659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f40660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f40661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f40662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f40663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f40664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f40665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f40666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f40667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f40668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f40669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f40670y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f40671z;

    B6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        AbstractC2115p.f(str);
        this.f40646a = str;
        this.f40647b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f40648c = str3;
        this.f40655j = j10;
        this.f40649d = str4;
        this.f40650e = j11;
        this.f40651f = j12;
        this.f40652g = str5;
        this.f40653h = z10;
        this.f40654i = z11;
        this.f40656k = str6;
        this.f40657l = j13;
        this.f40658m = i10;
        this.f40659n = z12;
        this.f40660o = z13;
        this.f40661p = bool;
        this.f40662q = j14;
        this.f40663r = list;
        this.f40664s = str7;
        this.f40665t = str8;
        this.f40666u = str9;
        this.f40667v = z14;
        this.f40668w = j15;
        this.f40669x = i11;
        this.f40670y = str10;
        this.f40671z = i12;
        this.f40641A = j16;
        this.f40642B = str11;
        this.f40643C = str12;
        this.f40644D = j17;
        this.f40645E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f40646a;
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 2, str, false);
        S8.c.q(parcel, 3, this.f40647b, false);
        S8.c.q(parcel, 4, this.f40648c, false);
        S8.c.q(parcel, 5, this.f40649d, false);
        S8.c.n(parcel, 6, this.f40650e);
        S8.c.n(parcel, 7, this.f40651f);
        S8.c.q(parcel, 8, this.f40652g, false);
        S8.c.c(parcel, 9, this.f40653h);
        S8.c.c(parcel, 10, this.f40654i);
        S8.c.n(parcel, 11, this.f40655j);
        S8.c.q(parcel, 12, this.f40656k, false);
        S8.c.n(parcel, 14, this.f40657l);
        S8.c.j(parcel, 15, this.f40658m);
        S8.c.c(parcel, 16, this.f40659n);
        S8.c.c(parcel, 18, this.f40660o);
        S8.c.d(parcel, 21, this.f40661p, false);
        S8.c.n(parcel, 22, this.f40662q);
        S8.c.r(parcel, 23, this.f40663r, false);
        S8.c.q(parcel, 25, this.f40664s, false);
        S8.c.q(parcel, 26, this.f40665t, false);
        S8.c.q(parcel, 27, this.f40666u, false);
        S8.c.c(parcel, 28, this.f40667v);
        S8.c.n(parcel, 29, this.f40668w);
        S8.c.j(parcel, 30, this.f40669x);
        S8.c.q(parcel, 31, this.f40670y, false);
        S8.c.j(parcel, 32, this.f40671z);
        S8.c.n(parcel, 34, this.f40641A);
        S8.c.q(parcel, 35, this.f40642B, false);
        S8.c.q(parcel, 36, this.f40643C, false);
        S8.c.n(parcel, 37, this.f40644D);
        S8.c.j(parcel, 38, this.f40645E);
        S8.c.b(parcel, iA);
    }

    B6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f40646a = str;
        this.f40647b = str2;
        this.f40648c = str3;
        this.f40655j = j12;
        this.f40649d = str4;
        this.f40650e = j10;
        this.f40651f = j11;
        this.f40652g = str5;
        this.f40653h = z10;
        this.f40654i = z11;
        this.f40656k = str6;
        this.f40657l = j13;
        this.f40658m = i10;
        this.f40659n = z12;
        this.f40660o = z13;
        this.f40661p = bool;
        this.f40662q = j14;
        this.f40663r = list;
        this.f40664s = str7;
        this.f40665t = str8;
        this.f40666u = str9;
        this.f40667v = z14;
        this.f40668w = j15;
        this.f40669x = i11;
        this.f40670y = str10;
        this.f40671z = i12;
        this.f40641A = j16;
        this.f40642B = str11;
        this.f40643C = str12;
        this.f40644D = j17;
        this.f40645E = i13;
    }
}
