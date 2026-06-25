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
public class i extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f20354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f20356d;

    public i(AbstractC7387B abstractC7387B) {
        int iG = C7420o.z(abstractC7387B.B(0)).G();
        this.f20353a = iG;
        if (iG != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20354b = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(1)).B());
        this.f20355c = Oh.a.f(AbstractC7428u.z(abstractC7387B.B(2)).B());
        if (abstractC7387B.size() == 4) {
            this.f20356d = j.l(abstractC7387B.B(3));
        }
    }

    public static i l(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f();
        c7402f.a(new C7420o(this.f20353a));
        c7402f.a(new C7419n0(this.f20354b));
        c7402f.a(new C7419n0(this.f20355c));
        j jVar = this.f20356d;
        if (jVar != null) {
            c7402f.a(new j(jVar.p(), this.f20356d.n()));
        }
        return new r0(c7402f);
    }

    public j n() {
        return this.f20356d;
    }

    public byte[] p() {
        return Oh.a.f(this.f20355c);
    }

    public byte[] r() {
        return Oh.a.f(this.f20354b);
    }
}
