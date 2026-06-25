package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7420o;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7420o f20359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Dg.a f20361c;

    public k(int i10, Dg.a aVar) {
        this.f20359a = new C7420o(0L);
        this.f20360b = i10;
        this.f20361c = aVar;
    }

    public static k n(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(this.f20359a);
        c7402f.a(new C7420o(this.f20360b));
        c7402f.a(this.f20361c);
        return new r0(c7402f);
    }

    public int l() {
        return this.f20360b;
    }

    public Dg.a p() {
        return this.f20361c;
    }

    private k(AbstractC7387B abstractC7387B) {
        this.f20359a = C7420o.z(abstractC7387B.B(0));
        this.f20360b = C7420o.z(abstractC7387B.B(1)).G();
        this.f20361c = Dg.a.n(abstractC7387B.B(2));
    }
}
