package Vf;

import Td.AbstractC2163n;
import Tf.l;
import Tf.m;
import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2354x extends C2337k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Tf.l f20251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f20252n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2354x(final String name, final int i10) {
        super(name, null, i10, 2, null);
        AbstractC5504s.h(name, "name");
        this.f20251m = l.b.f17533a;
        this.f20252n = AbstractC2163n.b(new InterfaceC5082a() { // from class: Vf.w
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C2354x.B(i10, name, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e[] B(int i10, String str, C2354x c2354x) {
        Tf.e[] eVarArr = new Tf.e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = Tf.k.e(str + com.amazon.a.a.o.c.a.b.f34706a + c2354x.l(i11), m.d.f17537a, new Tf.e[0], null, 8, null);
        }
        return eVarArr;
    }

    private final Tf.e[] C() {
        return (Tf.e[]) this.f20252n.getValue();
    }

    @Override // Vf.C2337k0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Tf.e)) {
            return false;
        }
        Tf.e eVar = (Tf.e) obj;
        return eVar.h() == l.b.f17533a && AbstractC5504s.c(o(), eVar.o()) && AbstractC5504s.c(AbstractC2325e0.a(this), AbstractC2325e0.a(eVar));
    }

    @Override // Vf.C2337k0, Tf.e
    public Tf.l h() {
        return this.f20251m;
    }

    @Override // Vf.C2337k0
    public int hashCode() {
        int iHashCode = o().hashCode();
        int iHashCode2 = 1;
        for (String str : Tf.i.b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // Vf.C2337k0, Tf.e
    public Tf.e n(int i10) {
        return C()[i10];
    }

    @Override // Vf.C2337k0
    public String toString() {
        return AbstractC2279u.w0(Tf.i.b(this), ", ", o() + '(', ")", 0, null, null, 56, null);
    }
}
