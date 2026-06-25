package v;

import I0.C;
import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import Td.L;
import Ud.AbstractC2279u;
import androidx.compose.ui.layout.s;
import i1.AbstractC5026s;
import i1.C5025r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6782c implements I0.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f61578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61579b;

    /* JADX INFO: renamed from: v.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f61580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(1);
            this.f61580a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List list = this.f61580a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                s.a.N(aVar, (androidx.compose.ui.layout.s) list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }
    }

    public C6782c(f fVar) {
        this.f61578a = fVar;
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

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((I0.A) list.get(i10)).v0(j10));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int iW0 = ((androidx.compose.ui.layout.s) obj).W0();
            int iO = AbstractC2279u.o(arrayList);
            if (1 <= iO) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    int iW02 = ((androidx.compose.ui.layout.s) obj3).W0();
                    if (iW0 < iW02) {
                        obj = obj3;
                        iW0 = iW02;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) obj;
        int iW03 = sVar != null ? sVar.W0() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int iP0 = ((androidx.compose.ui.layout.s) obj4).P0();
            int iO2 = AbstractC2279u.o(arrayList);
            if (1 <= iO2) {
                int i12 = 1;
                while (true) {
                    Object obj5 = arrayList.get(i12);
                    int iP02 = ((androidx.compose.ui.layout.s) obj5).P0();
                    if (iP0 < iP02) {
                        obj4 = obj5;
                        iP0 = iP02;
                    }
                    if (i12 == iO2) {
                        break;
                    }
                    i12++;
                }
            }
            obj2 = obj4;
        }
        androidx.compose.ui.layout.s sVar2 = (androidx.compose.ui.layout.s) obj2;
        int iP03 = sVar2 != null ? sVar2.P0() : 0;
        if (lVar.k0()) {
            this.f61579b = true;
            this.f61578a.a().setValue(C5025r.b(AbstractC5026s.a(iW03, iP03)));
        } else if (!this.f61579b) {
            this.f61578a.a().setValue(C5025r.b(AbstractC5026s.a(iW03, iP03)));
        }
        return androidx.compose.ui.layout.l.u0(lVar, iW03, iP03, null, new a(arrayList), 4, null);
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
