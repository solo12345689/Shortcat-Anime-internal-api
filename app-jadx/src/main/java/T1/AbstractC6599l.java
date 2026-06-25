package t1;

import java.util.HashSet;
import t1.C6592e;
import u1.C6718b;

/* JADX INFO: renamed from: t1.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6599l extends AbstractC6597j {

    /* JADX INFO: renamed from: N0 */
    private int f60496N0 = 0;

    /* JADX INFO: renamed from: O0 */
    private int f60497O0 = 0;

    /* JADX INFO: renamed from: P0 */
    private int f60498P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    private int f60499Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    private int f60500R0 = 0;

    /* JADX INFO: renamed from: S0 */
    private int f60501S0 = 0;

    /* JADX INFO: renamed from: T0 */
    private int f60502T0 = 0;

    /* JADX INFO: renamed from: U0 */
    private int f60503U0 = 0;

    /* JADX INFO: renamed from: V0 */
    private boolean f60504V0 = false;

    /* JADX INFO: renamed from: W0 */
    private int f60505W0 = 0;

    /* JADX INFO: renamed from: X0 */
    private int f60506X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    protected C6718b.a f60507Y0 = new C6718b.a();

    /* JADX INFO: renamed from: Z0 */
    C6718b.InterfaceC0913b f60508Z0 = null;

    protected boolean A1() {
        C6592e c6592e = this.f60354a0;
        C6718b.InterfaceC0913b interfaceC0913bF1 = c6592e != null ? ((C6593f) c6592e).F1() : null;
        if (interfaceC0913bF1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f60494M0; i10++) {
            C6592e c6592e2 = this.f60493L0[i10];
            if (c6592e2 != null && !(c6592e2 instanceof C6595h)) {
                C6592e.b bVarU = c6592e2.u(0);
                C6592e.b bVarU2 = c6592e2.u(1);
                C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || c6592e2.f60397w == 1 || bVarU2 != bVar || c6592e2.f60399x == 1) {
                    if (bVarU == bVar) {
                        bVarU = C6592e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = C6592e.b.WRAP_CONTENT;
                    }
                    C6718b.a aVar = this.f60507Y0;
                    aVar.f61129a = bVarU;
                    aVar.f61130b = bVarU2;
                    aVar.f61131c = c6592e2.V();
                    this.f60507Y0.f61132d = c6592e2.x();
                    interfaceC0913bF1.b(c6592e2, this.f60507Y0);
                    c6592e2.g1(this.f60507Y0.f61133e);
                    c6592e2.H0(this.f60507Y0.f61134f);
                    c6592e2.w0(this.f60507Y0.f61135g);
                }
            }
        }
        return true;
    }

    public boolean B1() {
        return this.f60504V0;
    }

    protected void C1(boolean z10) {
        this.f60504V0 = z10;
    }

    public void D1(int i10, int i11) {
        this.f60505W0 = i10;
        this.f60506X0 = i11;
    }

    public void E1(int i10) {
        this.f60498P0 = i10;
        this.f60496N0 = i10;
        this.f60499Q0 = i10;
        this.f60497O0 = i10;
        this.f60500R0 = i10;
        this.f60501S0 = i10;
    }

    public void F1(int i10) {
        this.f60497O0 = i10;
    }

    public void G1(int i10) {
        this.f60501S0 = i10;
    }

    public void H1(int i10) {
        this.f60498P0 = i10;
        this.f60502T0 = i10;
    }

    public void I1(int i10) {
        this.f60499Q0 = i10;
        this.f60503U0 = i10;
    }

    public void J1(int i10) {
        this.f60500R0 = i10;
        this.f60502T0 = i10;
        this.f60503U0 = i10;
    }

    public void K1(int i10) {
        this.f60496N0 = i10;
    }

    @Override // t1.AbstractC6597j, t1.InterfaceC6596i
    public void a(C6593f c6593f) {
        q1();
    }

    public void p1(boolean z10) {
        int i10 = this.f60500R0;
        if (i10 > 0 || this.f60501S0 > 0) {
            if (z10) {
                this.f60502T0 = this.f60501S0;
                this.f60503U0 = i10;
            } else {
                this.f60502T0 = i10;
                this.f60503U0 = this.f60501S0;
            }
        }
    }

    public void q1() {
        for (int i10 = 0; i10 < this.f60494M0; i10++) {
            C6592e c6592e = this.f60493L0[i10];
            if (c6592e != null) {
                c6592e.Q0(true);
            }
        }
    }

    public boolean r1(HashSet hashSet) {
        for (int i10 = 0; i10 < this.f60494M0; i10++) {
            if (hashSet.contains(this.f60493L0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int s1() {
        return this.f60506X0;
    }

    public int t1() {
        return this.f60505W0;
    }

    public int u1() {
        return this.f60497O0;
    }

    public int v1() {
        return this.f60502T0;
    }

    public int w1() {
        return this.f60503U0;
    }

    public int x1() {
        return this.f60496N0;
    }

    protected void z1(C6592e c6592e, C6592e.b bVar, int i10, C6592e.b bVar2, int i11) {
        while (this.f60508Z0 == null && L() != null) {
            this.f60508Z0 = ((C6593f) L()).F1();
        }
        C6718b.a aVar = this.f60507Y0;
        aVar.f61129a = bVar;
        aVar.f61130b = bVar2;
        aVar.f61131c = i10;
        aVar.f61132d = i11;
        this.f60508Z0.b(c6592e, aVar);
        c6592e.g1(this.f60507Y0.f61133e);
        c6592e.H0(this.f60507Y0.f61134f);
        c6592e.G0(this.f60507Y0.f61136h);
        c6592e.w0(this.f60507Y0.f61135g);
    }

    public void y1(int i10, int i11, int i12, int i13) {
    }
}
