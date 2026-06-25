package l1;

import i1.C5015h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.InterfaceC5537s;
import p1.AbstractC5915c;

/* JADX INFO: renamed from: l1.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5538t implements InterfaceC5537s.a, InterfaceC5537s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5539u f52512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5539u f52513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5539u f52514d;

    public /* synthetic */ C5538t(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    public final AbstractC5915c a() {
        if (this.f52513c.b() && this.f52514d.b()) {
            return this.f52512b.a();
        }
        p1.f fVar = new p1.f(new char[0]);
        if (!this.f52513c.b()) {
            fVar.V("min", this.f52513c.a());
        }
        if (!this.f52514d.b()) {
            fVar.V("max", this.f52514d.a());
        }
        fVar.V("value", this.f52512b.a());
        return fVar;
    }

    private C5538t(C5015h c5015h, String str) {
        this.f52512b = new C5539u(c5015h, str, "base", null);
        this.f52513c = new C5539u(0 == true ? 1 : 0, 0 == true ? 1 : 0, "min", 0 == true ? 1 : 0);
        this.f52514d = new C5539u(0 == true ? 1 : 0, 0 == true ? 1 : 0, "max", 0 == true ? 1 : 0);
    }

    private C5538t(float f10) {
        this(C5015h.h(f10), (String) null);
    }

    public C5538t(String str) {
        this((C5015h) null, str);
    }
}
