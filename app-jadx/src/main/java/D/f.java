package D;

import F.InterfaceC1535f;
import Td.L;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC1535f {

    /* JADX INFO: renamed from: a */
    private final B f3380a;

    public f(B b10) {
        this.f3380a = b10;
    }

    private final int f(q qVar) {
        List listI = qVar.i();
        int size = listI.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += ((l) listI.get(i10)).getSize();
        }
        return (size2 / listI.size()) + qVar.h();
    }

    @Override // F.InterfaceC1535f
    public int a() {
        l lVar = (l) AbstractC2279u.A0(this.f3380a.u().i());
        if (lVar != null) {
            return lVar.getIndex();
        }
        return 0;
    }

    @Override // F.InterfaceC1535f
    public float b(int i10) {
        Object obj;
        q qVarU = this.f3380a.u();
        if (qVarU.i().isEmpty()) {
            return 0.0f;
        }
        List listI = qVarU.i();
        int size = listI.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = listI.get(i11);
            if (((l) obj).getIndex() == i10) {
                break;
            }
            i11++;
        }
        return ((l) obj) == null ? (f(qVarU) * (i10 - d())) - g() : r4.getOffset();
    }

    @Override // F.InterfaceC1535f
    public void c(z.u uVar, int i10, int i11) {
        this.f3380a.L(i10, i11, true);
    }

    @Override // F.InterfaceC1535f
    public int d() {
        return this.f3380a.p();
    }

    @Override // F.InterfaceC1535f
    public Object e(Function2 function2, Zd.e eVar) {
        Object objD = z.x.d(this.f3380a, null, function2, eVar, 1, null);
        return objD == AbstractC2605b.f() ? objD : L.f17438a;
    }

    public int g() {
        return this.f3380a.q();
    }
}
