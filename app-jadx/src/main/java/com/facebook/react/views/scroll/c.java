package com.facebook.react.views.scroll;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f37996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f37997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f38000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f38001f;

    public c(b interval, r virtualView, int i10, int i11, c cVar, c cVar2) {
        AbstractC5504s.h(interval, "interval");
        AbstractC5504s.h(virtualView, "virtualView");
        this.f37996a = interval;
        this.f37997b = virtualView;
        this.f37998c = i10;
        this.f37999d = i11;
        this.f38000e = cVar;
        this.f38001f = cVar2;
    }

    public final int a() {
        return this.f37999d;
    }

    public final b b() {
        return this.f37996a;
    }

    public final c c() {
        return this.f38000e;
    }

    public final int d() {
        return this.f37998c;
    }

    public final c e() {
        return this.f38001f;
    }

    public final r f() {
        return this.f37997b;
    }

    public final void g(int i10) {
        this.f37999d = i10;
    }

    public final void h(b bVar) {
        AbstractC5504s.h(bVar, "<set-?>");
        this.f37996a = bVar;
    }

    public final void i(c cVar) {
        this.f38000e = cVar;
    }

    public final void j(int i10) {
        this.f37998c = i10;
    }

    public final void k(c cVar) {
        this.f38001f = cVar;
    }

    public final void l(r rVar) {
        AbstractC5504s.h(rVar, "<set-?>");
        this.f37997b = rVar;
    }

    public /* synthetic */ c(b bVar, r rVar, int i10, int i11, c cVar, c cVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, rVar, (i12 & 4) != 0 ? bVar.a() : i10, (i12 & 8) != 0 ? 1 : i11, (i12 & 16) != 0 ? null : cVar, (i12 & 32) != 0 ? null : cVar2);
    }
}
