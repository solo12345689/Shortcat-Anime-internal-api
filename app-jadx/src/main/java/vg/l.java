package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7420o;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class l extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7420o f20362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Dg.a f20365d;

    public l(int i10, int i11, Dg.a aVar) {
        this.f20362a = new C7420o(0L);
        this.f20363b = i10;
        this.f20364c = i11;
        this.f20365d = aVar;
    }

    public static l n(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(this.f20362a);
        c7402f.a(new C7420o(this.f20363b));
        c7402f.a(new C7420o(this.f20364c));
        c7402f.a(this.f20365d);
        return new r0(c7402f);
    }

    public int l() {
        return this.f20363b;
    }

    public int p() {
        return this.f20364c;
    }

    public Dg.a r() {
        return this.f20365d;
    }

    private l(AbstractC7387B abstractC7387B) {
        this.f20362a = C7420o.z(abstractC7387B.B(0));
        this.f20363b = C7420o.z(abstractC7387B.B(1)).G();
        this.f20364c = C7420o.z(abstractC7387B.B(2)).G();
        this.f20365d = Dg.a.n(abstractC7387B.B(3));
    }
}
