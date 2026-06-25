package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7420o;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7420o f20351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dg.a f20352b;

    public h(Dg.a aVar) {
        this.f20351a = new C7420o(0L);
        this.f20352b = aVar;
    }

    public static final h l(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(this.f20351a);
        c7402f.a(this.f20352b);
        return new r0(c7402f);
    }

    public Dg.a n() {
        return this.f20352b;
    }

    private h(AbstractC7387B abstractC7387B) {
        this.f20351a = C7420o.z(abstractC7387B.B(0));
        this.f20352b = Dg.a.n(abstractC7387B.B(1));
    }
}
