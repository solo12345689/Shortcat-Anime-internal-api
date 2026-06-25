package Cg;

import java.util.Enumeration;
import zg.AbstractC7387B;
import zg.AbstractC7388C;
import zg.AbstractC7394b;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7401e0;
import zg.C7402f;
import zg.C7419n0;
import zg.C7420o;
import zg.G;
import zg.InterfaceC7400e;
import zg.r;
import zg.r0;
import zg.u0;

/* JADX INFO: loaded from: classes5.dex */
public class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C7420o f3299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dg.a f3300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC7428u f3301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC7388C f3302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC7394b f3303e;

    public b(Dg.a aVar, InterfaceC7400e interfaceC7400e) {
        this(aVar, interfaceC7400e, (AbstractC7388C) null, (byte[]) null);
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC7387B.A(obj));
        }
        return null;
    }

    private static int t(C7420o c7420o) {
        int iG = c7420o.G();
        if (iG < 0 || iG > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return iG;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f(5);
        c7402f.a(this.f3299a);
        c7402f.a(this.f3300b);
        c7402f.a(this.f3301c);
        AbstractC7388C abstractC7388C = this.f3302d;
        if (abstractC7388C != null) {
            c7402f.a(new u0(false, 0, abstractC7388C));
        }
        AbstractC7394b abstractC7394b = this.f3303e;
        if (abstractC7394b != null) {
            c7402f.a(new u0(false, 1, abstractC7394b));
        }
        return new r0(c7402f);
    }

    public AbstractC7388C l() {
        return this.f3302d;
    }

    public AbstractC7428u p() {
        return new C7419n0(this.f3301c.B());
    }

    public Dg.a r() {
        return this.f3300b;
    }

    public AbstractC7394b s() {
        return this.f3303e;
    }

    public InterfaceC7400e u() {
        return AbstractC7432y.v(this.f3301c.B());
    }

    public b(Dg.a aVar, InterfaceC7400e interfaceC7400e, AbstractC7388C abstractC7388C) {
        this(aVar, interfaceC7400e, abstractC7388C, (byte[]) null);
    }

    public b(Dg.a aVar, InterfaceC7400e interfaceC7400e, AbstractC7388C abstractC7388C, byte[] bArr) {
        this(aVar, interfaceC7400e.e().i("DER"), abstractC7388C, bArr);
    }

    public b(Dg.a aVar, byte[] bArr, AbstractC7388C abstractC7388C) {
        this(aVar, bArr, abstractC7388C, (byte[]) null);
    }

    public b(Dg.a aVar, byte[] bArr, AbstractC7388C abstractC7388C, byte[] bArr2) {
        this.f3299a = new C7420o(bArr2 != null ? Oh.b.f13169b : Oh.b.f13168a);
        this.f3300b = aVar;
        this.f3301c = new C7419n0(bArr);
        this.f3302d = abstractC7388C;
        this.f3303e = bArr2 == null ? null : new C7401e0(bArr2);
    }

    private b(AbstractC7387B abstractC7387B) {
        Enumeration enumerationD = abstractC7387B.D();
        C7420o c7420oZ = C7420o.z(enumerationD.nextElement());
        this.f3299a = c7420oZ;
        int iT = t(c7420oZ);
        this.f3300b = Dg.a.n(enumerationD.nextElement());
        this.f3301c = AbstractC7428u.z(enumerationD.nextElement());
        int i10 = -1;
        while (enumerationD.hasMoreElements()) {
            G g10 = (G) enumerationD.nextElement();
            int iK = g10.K();
            if (iK <= i10) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (iK == 0) {
                this.f3302d = AbstractC7388C.z(g10, false);
            } else {
                if (iK != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iT < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f3303e = AbstractC7394b.B(g10, false);
            }
            i10 = iK;
        }
    }
}
