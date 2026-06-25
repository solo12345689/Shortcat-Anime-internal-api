package Y;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import je.InterfaceC5371a;
import k0.InterfaceC5415e;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E1 implements InterfaceC5415e, Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: b */
    private int f22106b;

    /* JADX INFO: renamed from: d */
    private int f22108d;

    /* JADX INFO: renamed from: e */
    private int f22109e;

    /* JADX INFO: renamed from: g */
    private boolean f22111g;

    /* JADX INFO: renamed from: h */
    private int f22112h;

    /* JADX INFO: renamed from: j */
    private HashMap f22114j;

    /* JADX INFO: renamed from: k */
    private C6540F f22115k;

    /* JADX INFO: renamed from: a */
    private int[] f22105a = new int[0];

    /* JADX INFO: renamed from: c */
    private Object[] f22107c = new Object[0];

    /* JADX INFO: renamed from: f */
    private final Object f22110f = new Object();

    /* JADX INFO: renamed from: i */
    private ArrayList f22113i = new ArrayList();

    private final C2392b M(int i10) {
        int i11;
        if (this.f22111g) {
            AbstractC2454w.t("use active SlotWriter to crate an anchor for location instead");
        }
        if (i10 < 0 || i10 >= (i11 = this.f22106b)) {
            return null;
        }
        return G1.n(this.f22113i, i10, i11);
    }

    public final boolean A() {
        return this.f22111g;
    }

    public final boolean B(int i10, C2392b c2392b) {
        if (this.f22111g) {
            AbstractC2454w.t("Writer is active");
        }
        if (!(i10 >= 0 && i10 < this.f22106b)) {
            AbstractC2454w.t("Invalid group index");
        }
        if (I(c2392b)) {
            int iO = G1.o(this.f22105a, i10) + i10;
            int iA = c2392b.a();
            if (i10 <= iA && iA < iO) {
                return true;
            }
        }
        return false;
    }

    public final boolean D(C2392b c2392b, C2392b c2392b2) {
        int iA = c2392b.a();
        int iO = G1.o(this.f22105a, iA) + iA;
        int iA2 = c2392b2.a();
        return iA <= iA2 && iA2 < iO;
    }

    public final D1 F() {
        if (this.f22111g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f22109e++;
        return new D1(this);
    }

    public final H1 G() {
        if (this.f22111g) {
            AbstractC2454w.t("Cannot start a writer when another writer is pending");
        }
        if (!(this.f22109e <= 0)) {
            AbstractC2454w.t("Cannot start a writer when a reader is pending");
        }
        this.f22111g = true;
        this.f22112h++;
        return new H1(this);
    }

    public final boolean I(C2392b c2392b) {
        int iS;
        return c2392b.b() && (iS = G1.s(this.f22113i, c2392b.a(), this.f22106b)) >= 0 && AbstractC5504s.c(this.f22113i.get(iS), c2392b);
    }

    public final void K(int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, C6540F c6540f) {
        this.f22105a = iArr;
        this.f22106b = i10;
        this.f22107c = objArr;
        this.f22108d = i11;
        this.f22113i = arrayList;
        this.f22114j = map;
        this.f22115k = c6540f;
    }

    public final AbstractC2411h0 L(int i10) {
        C2392b c2392bM;
        HashMap map = this.f22114j;
        if (map == null || (c2392bM = M(i10)) == null) {
            return null;
        }
        return (AbstractC2411h0) map.get(c2392bM);
    }

    public final C2392b b(int i10) {
        if (this.f22111g) {
            AbstractC2454w.t("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f22106b) {
            z10 = true;
        }
        if (!z10) {
            V0.a("Parameter index is out of range");
        }
        ArrayList arrayList = this.f22113i;
        int iS = G1.s(arrayList, i10, this.f22106b);
        if (iS >= 0) {
            return (C2392b) arrayList.get(iS);
        }
        C2392b c2392b = new C2392b(i10);
        arrayList.add(-(iS + 1), c2392b);
        return c2392b;
    }

    public final int d(C2392b c2392b) {
        if (this.f22111g) {
            AbstractC2454w.t("Use active SlotWriter to determine anchor location instead");
        }
        if (!c2392b.b()) {
            V0.a("Anchor refers to a group that was removed");
        }
        return c2392b.a();
    }

    public final void e(D1 d12, HashMap map) {
        if (!(d12.z() == this && this.f22109e > 0)) {
            AbstractC2454w.t("Unexpected reader close()");
        }
        this.f22109e--;
        if (map != null) {
            synchronized (this.f22110f) {
                try {
                    HashMap map2 = this.f22114j;
                    if (map2 != null) {
                        map2.putAll(map);
                    } else {
                        this.f22114j = map;
                    }
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void f(H1 h12, int[] iArr, int i10, Object[] objArr, int i11, ArrayList arrayList, HashMap map, C6540F c6540f) {
        if (!(h12.c0() == this && this.f22111g)) {
            V0.a("Unexpected writer close()");
        }
        this.f22111g = false;
        K(iArr, i10, objArr, i11, arrayList, map, c6540f);
    }

    public final void i() {
        this.f22115k = new C6540F(0, 1, null);
    }

    public boolean isEmpty() {
        return this.f22106b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C2405f0(this, 0, this.f22106b);
    }

    public final void l() {
        this.f22114j = new HashMap();
    }

    public final boolean n() {
        return this.f22106b > 0 && (this.f22105a[1] & 67108864) != 0;
    }

    public final ArrayList p() {
        return this.f22113i;
    }

    public final C6540F r() {
        return this.f22115k;
    }

    public final int[] t() {
        return this.f22105a;
    }

    public final int u() {
        return this.f22106b;
    }

    public final Object[] v() {
        return this.f22107c;
    }

    public final int w() {
        return this.f22108d;
    }

    public final HashMap y() {
        return this.f22114j;
    }

    public final int z() {
        return this.f22112h;
    }
}
