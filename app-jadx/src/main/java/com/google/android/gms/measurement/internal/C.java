package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f40672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f40673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f40674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f40675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f40676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f40677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f40678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f40679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f40680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f40681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f40682k;

    C(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        AbstractC2115p.f(str);
        AbstractC2115p.f(str2);
        AbstractC2115p.a(j10 >= 0);
        AbstractC2115p.a(j11 >= 0);
        AbstractC2115p.a(j12 >= 0);
        AbstractC2115p.a(j14 >= 0);
        this.f40672a = str;
        this.f40673b = str2;
        this.f40674c = j10;
        this.f40675d = j11;
        this.f40676e = j12;
        this.f40677f = j13;
        this.f40678g = j14;
        this.f40679h = l10;
        this.f40680i = l11;
        this.f40681j = l12;
        this.f40682k = bool;
    }

    final C a(long j10) {
        return new C(this.f40672a, this.f40673b, this.f40674c, this.f40675d, this.f40676e, j10, this.f40678g, this.f40679h, this.f40680i, this.f40681j, this.f40682k);
    }

    final C b(long j10, long j11) {
        return new C(this.f40672a, this.f40673b, this.f40674c, this.f40675d, this.f40676e, this.f40677f, j10, Long.valueOf(j11), this.f40680i, this.f40681j, this.f40682k);
    }

    final C c(Long l10, Long l11, Boolean bool) {
        return new C(this.f40672a, this.f40673b, this.f40674c, this.f40675d, this.f40676e, this.f40677f, this.f40678g, this.f40679h, l10, l11, bool);
    }
}
