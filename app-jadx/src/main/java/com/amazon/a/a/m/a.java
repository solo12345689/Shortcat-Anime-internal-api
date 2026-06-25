package com.amazon.a.a.m;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.amazon.a.a.e.a<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f34455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f34456c;

    public a(Object obj, Date date) {
        this.f34455b = obj;
        this.f34456c = date;
    }

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        return this.f34456c;
    }

    public final Object h() {
        return this.f34455b;
    }
}
