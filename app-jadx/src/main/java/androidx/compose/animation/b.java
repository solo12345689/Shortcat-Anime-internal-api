package androidx.compose.animation;

import I0.B;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import Td.L;
import Ud.AbstractC2279u;
import androidx.compose.ui.layout.s;
import i1.AbstractC5026s;
import i1.C5021n;
import i1.EnumC5027t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f25612a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s[] f25613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f25614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f25615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25616d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s[] sVarArr, b bVar, int i10, int i11) {
            super(1);
            this.f25613a = sVarArr;
            this.f25614b = bVar;
            this.f25615c = i10;
            this.f25616d = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a aVar2;
            s[] sVarArr = this.f25613a;
            b bVar = this.f25614b;
            int i10 = this.f25615c;
            int i11 = this.f25616d;
            int length = sVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                s sVar = sVarArr[i12];
                if (sVar != null) {
                    long jA = bVar.a().g().a(AbstractC5026s.a(sVar.W0(), sVar.P0()), AbstractC5026s.a(i10, i11), EnumC5027t.f48573a);
                    aVar2 = aVar;
                    s.a.N(aVar2, sVar, C5021n.k(jA), C5021n.l(jA), 0.0f, 4, null);
                } else {
                    aVar2 = aVar;
                }
                i12++;
                aVar = aVar2;
            }
        }
    }

    public b(e eVar) {
        this.f25612a = eVar;
    }

    public final e a() {
        return this.f25612a;
    }

    @Override // I0.B
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1686l) list.get(0)).I(i10));
            int iO = AbstractC2279u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1686l) list.get(i11)).I(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // I0.B
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1686l) list.get(0)).q0(i10));
            int iO = AbstractC2279u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1686l) list.get(i11)).q0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l r21, java.util.List r22, long r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b.mo0measure3p2s80s(androidx.compose.ui.layout.l, java.util.List, long):I0.C");
    }

    @Override // I0.B
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1686l) list.get(0)).Z(i10));
            int iO = AbstractC2279u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1686l) list.get(i11)).Z(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // I0.B
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1686l) list.get(0)).l0(i10));
            int iO = AbstractC2279u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1686l) list.get(i11)).l0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
