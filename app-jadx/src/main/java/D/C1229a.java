package D;

import F.I;
import Ud.AbstractC2279u;
import androidx.compose.foundation.lazy.layout.d;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1229a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3362b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d.b f3363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3364d;

    public C1229a(int i10) {
        this.f3361a = i10;
    }

    @Override // D.w
    public void a(I i10, int i11) {
        int i12 = this.f3361a;
        for (int i13 = 0; i13 < i12; i13++) {
            i10.a(i11 + i13);
        }
    }

    @Override // D.w
    public void c(v vVar, q qVar) {
        if (this.f3362b == -1 || qVar.i().isEmpty()) {
            return;
        }
        if (this.f3362b != (this.f3364d ? ((l) AbstractC2279u.y0(qVar.i())).getIndex() + 1 : ((l) AbstractC2279u.m0(qVar.i())).getIndex() - 1)) {
            this.f3362b = -1;
            d.b bVar = this.f3363c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f3363c = null;
        }
    }

    @Override // D.w
    public void d(v vVar, float f10, q qVar) {
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (qVar.i().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((l) AbstractC2279u.y0(qVar.i())).getIndex() + 1 : ((l) AbstractC2279u.m0(qVar.i())).getIndex() - 1;
        if (index < 0 || index >= qVar.g()) {
            return;
        }
        if (index != this.f3362b) {
            if (this.f3364d != z10 && (bVar3 = this.f3363c) != null) {
                bVar3.cancel();
            }
            this.f3364d = z10;
            this.f3362b = index;
            this.f3363c = vVar.a(index);
        }
        if (!z10) {
            if (qVar.f() - ((l) AbstractC2279u.m0(qVar.i())).getOffset() >= f10 || (bVar = this.f3363c) == null) {
                return;
            }
            bVar.a();
            return;
        }
        l lVar = (l) AbstractC2279u.y0(qVar.i());
        if (((lVar.getOffset() + lVar.getSize()) + qVar.h()) - qVar.d() >= (-f10) || (bVar2 = this.f3363c) == null) {
            return;
        }
        bVar2.a();
    }
}
