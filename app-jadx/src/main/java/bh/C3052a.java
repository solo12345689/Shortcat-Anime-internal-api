package bh;

import Fg.q;

/* JADX INFO: renamed from: bh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
class C3052a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f33346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final short[] f33348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f33349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f33350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f33351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f33352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f33353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f33354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f33355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f33356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f33357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f33358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f33359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f33360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final q f33361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AbstractC3054c f33362v;

    public C3052a(int i10, int i11, int i12, short[] sArr, q qVar, AbstractC3054c abstractC3054c) {
        this.f33343c = i10;
        this.f33341a = i11;
        this.f33342b = 1 << i11;
        this.f33344d = i12;
        int i13 = i12 * 64;
        this.f33349i = i13;
        this.f33350j = i13;
        this.f33351k = i13;
        this.f33352l = i13;
        this.f33353m = i13;
        this.f33354n = i13;
        this.f33355o = i13 / 8;
        this.f33356p = i13 / 8;
        int i14 = i13 / 8;
        this.f33357q = i14;
        this.f33358r = i13 / 8;
        int i15 = i13 / 8;
        this.f33359s = i15;
        this.f33360t = i13 / 8;
        int i16 = ((i11 * i10) * 8) / 8;
        this.f33347g = ((i11 * 64) / 8) + i16;
        int i17 = i16 + 16;
        this.f33346f = i17;
        this.f33345e = i14 + i17 + (i10 * 16) + i15;
        this.f33348h = sArr;
        this.f33361u = qVar;
        this.f33362v = abstractC3054c;
    }
}
