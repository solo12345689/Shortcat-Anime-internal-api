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
public class f extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Mh.a f20288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Dg.a f20289d;

    public f(int i10, int i11, Mh.a aVar, Dg.a aVar2) {
        this.f20286a = i10;
        this.f20287b = i11;
        this.f20288c = new Mh.a(aVar.c());
        this.f20289d = aVar2;
    }

    public static f p(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(this.f20286a));
        c7402f.a(new C7420o(this.f20287b));
        c7402f.a(new C7419n0(this.f20288c.c()));
        c7402f.a(this.f20289d);
        return new r0(c7402f);
    }

    public Dg.a l() {
        return this.f20289d;
    }

    public Mh.a n() {
        return this.f20288c;
    }

    public int r() {
        return this.f20286a;
    }

    public int s() {
        return this.f20287b;
    }

    private f(AbstractC7387B abstractC7387B) {
        this.f20286a = ((C7420o) abstractC7387B.B(0)).G();
        this.f20287b = ((C7420o) abstractC7387B.B(1)).G();
        this.f20288c = new Mh.a(((AbstractC7428u) abstractC7387B.B(2)).B());
        this.f20289d = Dg.a.n(abstractC7387B.B(3));
    }
}
