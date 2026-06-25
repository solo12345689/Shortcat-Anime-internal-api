package E;

import F.InterfaceC1535f;
import Td.L;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import i1.C5021n;
import i1.C5025r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: E.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1284e implements InterfaceC1535f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f3879a;

    /* JADX INFO: renamed from: E.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f3881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, List list) {
            super(1);
            this.f3880a = z10;
            this.f3881b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf(this.f3880a ? ((InterfaceC1290k) this.f3881b.get(i10)).b() : ((InterfaceC1290k) this.f3881b.get(i10)).getColumn());
        }
    }

    public C1284e(I i10) {
        this.f3879a = i10;
    }

    private final int f(s sVar) {
        boolean z10 = sVar.a() == z.q.Vertical;
        List listI = sVar.i();
        a aVar = new a(z10, listI);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < listI.size()) {
            int iIntValue = ((Number) aVar.invoke(Integer.valueOf(i10))).intValue();
            if (iIntValue == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < listI.size() && ((Number) aVar.invoke(Integer.valueOf(i10))).intValue() == iIntValue) {
                    iMax = Math.max(iMax, z10 ? C5025r.f(((InterfaceC1290k) listI.get(i10)).a()) : C5025r.g(((InterfaceC1290k) listI.get(i10)).a()));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return (i11 / i12) + sVar.h();
    }

    @Override // F.InterfaceC1535f
    public int a() {
        InterfaceC1290k interfaceC1290k = (InterfaceC1290k) AbstractC2279u.A0(this.f3879a.s().i());
        if (interfaceC1290k != null) {
            return interfaceC1290k.getIndex();
        }
        return 0;
    }

    @Override // F.InterfaceC1535f
    public float b(int i10) {
        Object obj;
        s sVarS = this.f3879a.s();
        if (sVarS.i().isEmpty()) {
            return 0.0f;
        }
        List listI = sVarS.i();
        int size = listI.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = listI.get(i11);
            if (((InterfaceC1290k) obj).getIndex() == i10) {
                break;
            }
            i11++;
        }
        if (((InterfaceC1290k) obj) != null) {
            return sVarS.a() == z.q.Vertical ? C5021n.l(r5.c()) : C5021n.k(r5.c());
        }
        int iB = this.f3879a.B();
        return (f(sVarS) * (((i10 - d()) + ((iB - 1) * (i10 < d() ? -1 : 1))) / iB)) - g();
    }

    @Override // F.InterfaceC1535f
    public void c(z.u uVar, int i10, int i11) {
        this.f3879a.I(i10, i11, true);
    }

    @Override // F.InterfaceC1535f
    public int d() {
        return this.f3879a.o();
    }

    @Override // F.InterfaceC1535f
    public Object e(Function2 function2, Zd.e eVar) {
        Object objD = z.x.d(this.f3879a, null, function2, eVar, 1, null);
        return objD == AbstractC2605b.f() ? objD : L.f17438a;
    }

    public int g() {
        return this.f3879a.p();
    }
}
