package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f37888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37889c;

    public c(int i10, RectF rectangle, int i11) {
        AbstractC5504s.h(rectangle, "rectangle");
        this.f37887a = i10;
        this.f37888b = rectangle;
        this.f37889c = i11;
    }

    public final int a() {
        return this.f37889c;
    }

    public final int b() {
        return this.f37887a;
    }

    public final RectF c() {
        return this.f37888b;
    }
}
