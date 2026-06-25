package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3788d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j9.u f41140a;

    C3788d1(j9.u uVar) {
        this.f41140a = uVar;
    }

    static C3788d1 c(String str) {
        return new C3788d1((TextUtils.isEmpty(str) || str.length() > 1) ? j9.u.UNINITIALIZED : E3.j(str.charAt(0)));
    }

    final j9.u a() {
        return this.f41140a;
    }

    final String b() {
        return String.valueOf(E3.m(this.f41140a));
    }
}
