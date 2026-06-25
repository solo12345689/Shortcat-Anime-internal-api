package Vg;

import zg.AbstractC7387B;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7419n0;
import zg.C7420o;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class e extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f20283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f20284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Dg.a f20285f;

    public e(int i10, int i11, Mh.b bVar, Mh.i iVar, Mh.h hVar, Dg.a aVar) {
        this.f20280a = i10;
        this.f20281b = i11;
        this.f20282c = bVar.e();
        this.f20283d = iVar.h();
        this.f20284e = hVar.a();
        this.f20285f = aVar;
    }

    public static e r(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(this.f20280a));
        c7402f.a(new C7420o(this.f20281b));
        c7402f.a(new C7419n0(this.f20282c));
        c7402f.a(new C7419n0(this.f20283d));
        c7402f.a(new C7419n0(this.f20284e));
        c7402f.a(this.f20285f);
        return new r0(c7402f);
    }

    public Dg.a l() {
        return this.f20285f;
    }

    public Mh.b n() {
        return new Mh.b(this.f20282c);
    }

    public Mh.i p() {
        return new Mh.i(n(), this.f20283d);
    }

    public int s() {
        return this.f20281b;
    }

    public int t() {
        return this.f20280a;
    }

    public Mh.h u() {
        return new Mh.h(this.f20284e);
    }

    private e(AbstractC7387B abstractC7387B) {
        this.f20280a = ((C7420o) abstractC7387B.B(0)).G();
        this.f20281b = ((C7420o) abstractC7387B.B(1)).G();
        this.f20282c = ((AbstractC7428u) abstractC7387B.B(2)).B();
        this.f20283d = ((AbstractC7428u) abstractC7387B.B(3)).B();
        this.f20284e = ((AbstractC7428u) abstractC7387B.B(4)).B();
        this.f20285f = Dg.a.n(abstractC7387B.B(5));
    }
}
