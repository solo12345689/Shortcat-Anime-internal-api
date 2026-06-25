package D;

import C.C1131b;
import F.J;
import Td.L;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Y.C0;
import androidx.compose.ui.layout.s;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import oe.C5868d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3449a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f3450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f3451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0 f3453d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, t tVar, boolean z10, C0 c02) {
            super(1);
            this.f3450a = list;
            this.f3451b = tVar;
            this.f3452c = z10;
            this.f3453d = c02;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List list = this.f3450a;
            t tVar = this.f3451b;
            boolean z10 = this.f3452c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t tVar2 = (t) list.get(i10);
                if (tVar2 != tVar) {
                    tVar2.p(aVar, z10);
                }
            }
            t tVar3 = this.f3451b;
            if (tVar3 != null) {
                tVar3.p(aVar, this.f3452c);
            }
            J.a(this.f3453d);
        }
    }

    private static final List a(List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C1131b.m mVar, C1131b.e eVar, boolean z11, InterfaceC5011d interfaceC5011d) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12 && i14 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z12) {
            int size = list2.size();
            int iL = i14;
            for (int i16 = 0; i16 < size; i16++) {
                t tVar = (t) list2.get(i16);
                iL -= tVar.l();
                tVar.q(iL, i10, i11);
                arrayList.add(tVar);
            }
            int size2 = list.size();
            int iL2 = i14;
            for (int i17 = 0; i17 < size2; i17++) {
                t tVar2 = (t) list.get(i17);
                tVar2.q(iL2, i10, i11);
                arrayList.add(tVar2);
                iL2 += tVar2.l();
            }
            int size3 = list3.size();
            for (int i18 = 0; i18 < size3; i18++) {
                t tVar3 = (t) list3.get(i18);
                tVar3.q(iL2, i10, i11);
                arrayList.add(tVar3);
                iL2 += tVar3.l();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i19 = 0; i19 < size4; i19++) {
                iArr[i19] = ((t) list.get(b(i19, z11, size4))).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i20 = 0; i20 < size4; i20++) {
                iArr2[i20] = 0;
            }
            if (z10) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.c(interfaceC5011d, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                eVar.b(interfaceC5011d, i15, iArr, EnumC5027t.f48573a, iArr2);
            }
            C5868d c5868dA0 = AbstractC2273n.a0(iArr2);
            if (z11) {
                c5868dA0 = AbstractC5874j.u(c5868dA0);
            }
            int iF = c5868dA0.f();
            int i21 = c5868dA0.i();
            int iL3 = c5868dA0.l();
            if ((iL3 > 0 && iF <= i21) || (iL3 < 0 && i21 <= iF)) {
                while (true) {
                    int size5 = iArr2[iF];
                    t tVar4 = (t) list.get(b(iF, z11, size4));
                    if (z11) {
                        size5 = (i15 - size5) - tVar4.getSize();
                    }
                    tVar4.q(size5, i10, i11);
                    arrayList.add(tVar4);
                    if (iF == i21) {
                        break;
                    }
                    iF += iL3;
                }
            }
        }
        return arrayList;
    }

    private static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List c(List list, u uVar, int i10, int i11, List list2, float f10, boolean z10, q qVar) {
        ArrayList arrayList;
        l lVar;
        t tVar;
        Object obj;
        int iL;
        Object obj2;
        int index;
        int iMin;
        t tVar2;
        Object obj3;
        int i12 = i10 - 1;
        int iMin2 = Math.min(((t) AbstractC2279u.y0(list)).getIndex() + i11, i12);
        int index2 = ((t) AbstractC2279u.y0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i13 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u.e(uVar, i13, 0L, 2, null));
                if (i13 == iMin2) {
                    break;
                }
                i13++;
            }
        } else {
            arrayList = null;
        }
        if (z10 && qVar != null && !qVar.i().isEmpty()) {
            List listI = qVar.i();
            int size = listI.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lVar = null;
                    break;
                }
                if (((l) listI.get(size)).getIndex() > iMin2 && (size == 0 || ((l) listI.get(size - 1)).getIndex() <= iMin2)) {
                    break;
                }
            }
            lVar = (l) listI.get(size);
            l lVar2 = (l) AbstractC2279u.y0(qVar.i());
            if (lVar != null && (index = lVar.getIndex()) <= (iMin = Math.min(lVar2.getIndex(), i12))) {
                int i14 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i15);
                            if (((t) obj3).getIndex() == i14) {
                                break;
                            }
                            i15++;
                        }
                        tVar2 = (t) obj3;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(u.e(uVar, i14, 0L, 2, null));
                    }
                    if (i14 == iMin) {
                        break;
                    }
                    i14++;
                }
            }
            float fD = ((qVar.d() - lVar2.getOffset()) - lVar2.getSize()) - f10;
            if (fD > 0.0f) {
                int index3 = lVar2.getIndex() + 1;
                int i16 = 0;
                while (index3 < i10 && i16 < fD) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i17);
                            if (((t) obj2).getIndex() == index3) {
                                break;
                            }
                            i17++;
                        }
                        tVar = (t) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i18);
                            if (((t) obj).getIndex() == index3) {
                                break;
                            }
                            i18++;
                        }
                        tVar = (t) obj;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        index3++;
                        iL = tVar.l();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(u.e(uVar, index3, 0L, 2, null));
                        index3++;
                        iL = ((t) AbstractC2279u.y0(arrayList)).l();
                    }
                    i16 += iL;
                }
            }
        }
        if (arrayList != null && ((t) AbstractC2279u.y0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((t) AbstractC2279u.y0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i19 = 0; i19 < size5; i19++) {
            int iIntValue = ((Number) list2.get(i19)).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u.e(uVar, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? AbstractC2279u.m() : arrayList;
    }

    private static final List d(int i10, u uVar, int i11, List list) {
        u uVar2;
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            int i13 = i12;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                uVar2 = uVar;
                arrayList.add(u.e(uVar2, i13, 0L, 2, null));
                if (i13 == iMax) {
                    break;
                }
                i13--;
                uVar = uVar2;
            }
        } else {
            uVar2 = uVar;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i14 = size - 1;
                int iIntValue = ((Number) list.get(size)).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(u.e(uVar2, iIntValue, 0L, 2, null));
                }
                if (i14 < 0) {
                    break;
                }
                size = i14;
            }
        }
        return arrayList == null ? AbstractC2279u.m() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final D.s e(int r39, D.u r40, int r41, int r42, int r43, int r44, int r45, int r46, float r47, long r48, boolean r50, java.util.List r51, C.C1131b.m r52, C.C1131b.e r53, boolean r54, i1.InterfaceC5011d r55, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r56, int r57, java.util.List r58, boolean r59, boolean r60, D.q r61, Gf.O r62, Y.C0 r63, s0.Z0 r64, ie.InterfaceC5096o r65) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.r.e(int, D.u, int, int, int, int, int, int, float, long, boolean, java.util.List, C.b$m, C.b$e, boolean, i1.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, D.q, Gf.O, Y.C0, s0.Z0, ie.o):D.s");
    }
}
