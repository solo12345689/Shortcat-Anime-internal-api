package com.facebook.react.views.view;

import ke.AbstractC5466a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38485a = new b();

    private b() {
    }

    private final int a(double d10) {
        return Math.max(0, Math.min(255, AbstractC5466a.c(d10)));
    }

    public static final int b(double d10, double d11, double d12, double d13) {
        b bVar = f38485a;
        return (bVar.a(d10) << 16) | (bVar.a(d13 * ((double) 255)) << 24) | (bVar.a(d11) << 8) | bVar.a(d12);
    }
}
