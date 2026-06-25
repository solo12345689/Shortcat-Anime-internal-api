package t1;

import java.util.ArrayList;
import java.util.Arrays;
import u1.o;

/* JADX INFO: renamed from: t1.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6597j extends C6592e implements InterfaceC6596i {

    /* JADX INFO: renamed from: L0 */
    public C6592e[] f60493L0 = new C6592e[4];

    /* JADX INFO: renamed from: M0 */
    public int f60494M0 = 0;

    @Override // t1.InterfaceC6596i
    public void b() {
        this.f60494M0 = 0;
        Arrays.fill(this.f60493L0, (Object) null);
    }

    @Override // t1.InterfaceC6596i
    public void c(C6592e c6592e) {
        if (c6592e == this || c6592e == null) {
            return;
        }
        int i10 = this.f60494M0 + 1;
        C6592e[] c6592eArr = this.f60493L0;
        if (i10 > c6592eArr.length) {
            this.f60493L0 = (C6592e[]) Arrays.copyOf(c6592eArr, c6592eArr.length * 2);
        }
        C6592e[] c6592eArr2 = this.f60493L0;
        int i11 = this.f60494M0;
        c6592eArr2[i11] = c6592e;
        this.f60494M0 = i11 + 1;
    }

    public void n1(ArrayList arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f60494M0; i11++) {
            oVar.a(this.f60493L0[i11]);
        }
        for (int i12 = 0; i12 < this.f60494M0; i12++) {
            u1.i.a(this.f60493L0[i12], i10, arrayList, oVar);
        }
    }

    public int o1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f60494M0; i13++) {
            C6592e c6592e = this.f60493L0[i13];
            if (i10 == 0 && (i12 = c6592e.f60334I0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = c6592e.f60336J0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // t1.InterfaceC6596i
    public void a(C6593f c6593f) {
    }
}
