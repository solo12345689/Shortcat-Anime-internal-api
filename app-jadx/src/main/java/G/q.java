package G;

import F.InterfaceC1535f;
import Td.L;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1535f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C f6894a;

        a(C c10) {
            this.f6894a = c10;
        }

        private final int f() {
            return this.f6894a.G() + this.f6894a.I();
        }

        @Override // F.InterfaceC1535f
        public int a() {
            return ((f) AbstractC2279u.y0(this.f6894a.C().i())).getIndex();
        }

        @Override // F.InterfaceC1535f
        public float b(int i10) {
            Object obj;
            List listI = this.f6894a.C().i();
            int size = listI.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = listI.get(i11);
                if (((f) obj).getIndex() == i10) {
                    break;
                }
                i11++;
            }
            return ((f) obj) == null ? ((i10 - this.f6894a.v()) * f()) - (this.f6894a.w() * this.f6894a.H()) : r3.getOffset();
        }

        @Override // F.InterfaceC1535f
        public void c(z.u uVar, int i10, int i11) {
            this.f6894a.i0(i10, i11 / this.f6894a.H(), true);
        }

        @Override // F.InterfaceC1535f
        public int d() {
            return this.f6894a.y();
        }

        @Override // F.InterfaceC1535f
        public Object e(Function2 function2, Zd.e eVar) {
            Object objD = z.x.d(this.f6894a, null, function2, eVar, 1, null);
            return objD == AbstractC2605b.f() ? objD : L.f17438a;
        }
    }

    public static final InterfaceC1535f a(C c10) {
        return new a(c10);
    }
}
