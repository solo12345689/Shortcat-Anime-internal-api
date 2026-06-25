package G;

import C.C1131b;
import F.J;
import Gf.O;
import Td.L;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.C2272m;
import Y.C0;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import oe.AbstractC5874j;
import oe.C5868d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f6906b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, C0 c02) {
            super(1);
            this.f6905a = list;
            this.f6906b = c02;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List list = this.f6905a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C1591e) list.get(i10)).g(aVar);
            }
            J.a(this.f6906b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6907a = new b();

        b() {
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
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F.u f6908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f6909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f6910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f6911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z.q f6912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.b f6913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.c f6914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6916i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F.u uVar, long j10, r rVar, long j11, z.q qVar, e.b bVar, e.c cVar, boolean z10, int i10) {
            super(1);
            this.f6908a = uVar;
            this.f6909b = j10;
            this.f6910c = rVar;
            this.f6911d = j11;
            this.f6912e = qVar;
            this.f6913f = bVar;
            this.f6914g = cVar;
            this.f6915h = z10;
            this.f6916i = i10;
        }

        public final C1591e a(int i10) {
            F.u uVar = this.f6908a;
            return s.g(uVar, i10, this.f6909b, this.f6910c, this.f6911d, this.f6912e, this.f6913f, this.f6914g, uVar.getLayoutDirection(), this.f6915h, this.f6916i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F.u f6917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f6918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f6919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f6920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z.q f6921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.b f6922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.c f6923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6925i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(F.u uVar, long j10, r rVar, long j11, z.q qVar, e.b bVar, e.c cVar, boolean z10, int i10) {
            super(1);
            this.f6917a = uVar;
            this.f6918b = j10;
            this.f6919c = rVar;
            this.f6920d = j11;
            this.f6921e = qVar;
            this.f6922f = bVar;
            this.f6923g = cVar;
            this.f6924h = z10;
            this.f6925i = i10;
        }

        public final C1591e a(int i10) {
            F.u uVar = this.f6917a;
            return s.g(uVar, i10, this.f6918b, this.f6919c, this.f6920d, this.f6921e, this.f6922f, this.f6923g, uVar.getLayoutDirection(), this.f6924h, this.f6925i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    private static final C1591e b(int i10, List list, int i11, int i12, int i13, A.k kVar, int i14) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            C1591e c1591e = (C1591e) obj2;
            float f10 = -Math.abs(A.l.a(i10, i11, i12, i13, c1591e.getOffset(), c1591e.getIndex(), kVar, i14));
            int iO = AbstractC2279u.o(list);
            if (1 <= iO) {
                int i15 = 1;
                while (true) {
                    Object obj3 = list.get(i15);
                    C1591e c1591e2 = (C1591e) obj3;
                    float f11 = -Math.abs(A.l.a(i10, i11, i12, i13, c1591e2.getOffset(), c1591e2.getIndex(), kVar, i14));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        obj2 = obj3;
                    }
                    if (i15 == iO) {
                        break;
                    }
                    i15++;
                }
            }
            obj = obj2;
        }
        return (C1591e) obj;
    }

    private static final List c(F.u uVar, List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, z.q qVar, boolean z10, InterfaceC5011d interfaceC5011d, int i15, int i16) {
        int i17 = i14;
        int i18 = i16 + i15;
        int i19 = qVar == z.q.Vertical ? i11 : i10;
        boolean z11 = i12 < Math.min(i19, i13);
        if (z11 && i17 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i17).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z11) {
            int size = list2.size();
            int i20 = i17;
            for (int i21 = 0; i21 < size; i21++) {
                C1591e c1591e = (C1591e) list2.get(i21);
                i20 -= i18;
                c1591e.h(i20, i10, i11);
                arrayList.add(c1591e);
            }
            int size2 = list.size();
            for (int i22 = 0; i22 < size2; i22++) {
                C1591e c1591e2 = (C1591e) list.get(i22);
                c1591e2.h(i17, i10, i11);
                arrayList.add(c1591e2);
                i17 += i18;
            }
            int size3 = list3.size();
            for (int i23 = 0; i23 < size3; i23++) {
                C1591e c1591e3 = (C1591e) list3.get(i23);
                c1591e3.h(i17, i10, i11);
                arrayList.add(c1591e3);
                i17 += i18;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i24 = 0; i24 < size4; i24++) {
                iArr[i24] = i16;
            }
            int[] iArr2 = new int[size4];
            for (int i25 = 0; i25 < size4; i25++) {
                iArr2[i25] = 0;
            }
            C1131b.f fVarD = C1131b.a.f2102a.d(uVar.A(i15));
            if (qVar == z.q.Vertical) {
                fVarD.c(interfaceC5011d, i19, iArr, iArr2);
            } else {
                fVarD.b(interfaceC5011d, i19, iArr, EnumC5027t.f48573a, iArr2);
            }
            C5868d c5868dA0 = AbstractC2273n.a0(iArr2);
            if (z10) {
                c5868dA0 = AbstractC5874j.u(c5868dA0);
            }
            int iF = c5868dA0.f();
            int i26 = c5868dA0.i();
            int iL = c5868dA0.l();
            if ((iL > 0 && iF <= i26) || (iL < 0 && i26 <= iF)) {
                while (true) {
                    int iF2 = iArr2[iF];
                    C1591e c1591e4 = (C1591e) list.get(d(iF, z10, size4));
                    if (z10) {
                        iF2 = (i19 - iF2) - c1591e4.f();
                    }
                    c1591e4.h(iF2, i10, i11);
                    arrayList.add(c1591e4);
                    if (iF == i26) {
                        break;
                    }
                    iF += iL;
                }
            }
        }
        return arrayList;
    }

    private static final int d(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List e(int i10, int i11, int i12, List list, Function1 function1) {
        int iMin = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i13)));
                if (i13 == iMin) {
                    break;
                }
                i13++;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iIntValue = ((Number) list.get(i14)).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC2279u.m() : arrayList;
    }

    private static final List f(int i10, int i11, List list, Function1 function1) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i12)));
                if (i12 == iMax) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = ((Number) list.get(i13)).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC2279u.m() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1591e g(F.u uVar, int i10, long j10, r rVar, long j11, z.q qVar, e.b bVar, e.c cVar, EnumC5027t enumC5027t, boolean z10, int i11) {
        return new C1591e(i10, i11, uVar.g0(i10, j10), j11, rVar.d(i10), qVar, bVar, cVar, enumC5027t, z10, null);
    }

    public static final u h(F.u uVar, int i10, r rVar, int i11, int i12, int i13, int i14, int i15, int i16, long j10, z.q qVar, e.c cVar, e.b bVar, boolean z10, long j11, int i17, int i18, List list, A.k kVar, C0 c02, O o10, InterfaceC5096o interfaceC5096o) {
        int i19;
        int iMax;
        int i20;
        int i21;
        int i22;
        List arrayList;
        List arrayList2;
        List arrayList3;
        int index;
        int i23;
        int i24;
        int i25;
        int i26;
        A.k kVar2;
        int i27;
        int i28;
        int i29;
        if (i12 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int iE = AbstractC5874j.e(i17 + i14, 0);
        if (i10 <= 0) {
            return new u(AbstractC2279u.m(), i17, i14, i13, qVar, -i12, i11 + i13, false, i18, null, null, 0.0f, 0, false, kVar, (I0.C) interfaceC5096o.invoke(Integer.valueOf(C5009b.n(j10)), Integer.valueOf(C5009b.m(j10)), b.f6907a), false, null, null, o10, 393216, null);
        }
        z.q qVar2 = qVar;
        z.q qVar3 = z.q.Vertical;
        long jB = AbstractC5010c.b(0, qVar2 == qVar3 ? C5009b.l(j10) : i17, 0, qVar2 != qVar3 ? C5009b.k(j10) : i17, 5, null);
        int i30 = i15;
        int i31 = i16;
        while (i30 > 0 && i31 > 0) {
            i30--;
            i31 -= iE;
        }
        int i32 = i31 * (-1);
        if (i30 >= i10) {
            i30 = i10 - 1;
            i32 = 0;
        }
        C2272m c2272m = new C2272m();
        int i33 = -i12;
        int i34 = (i14 < 0 ? i14 : 0) + i33;
        int i35 = i32 + i34;
        int iMax2 = 0;
        while (i35 < 0 && i30 > 0) {
            int i36 = i30 - 1;
            C1591e c1591eG = g(uVar, i36, jB, rVar, j11, qVar2, bVar, cVar, uVar.getLayoutDirection(), z10, i17);
            c2272m.add(0, c1591eG);
            iMax2 = Math.max(iMax2, c1591eG.b());
            i35 += iE;
            i34 = i34;
            i30 = i36;
            qVar2 = qVar;
        }
        int i37 = i34;
        int i38 = iMax2;
        if (i35 < i37) {
            i35 = i37;
        }
        int i39 = i35 - i37;
        int i40 = i11 + i13;
        int i41 = i30;
        int iE2 = AbstractC5874j.e(i40, 0);
        int i42 = -i39;
        int i43 = i41;
        int i44 = 0;
        boolean z11 = false;
        while (i44 < c2272m.size()) {
            if (i42 >= iE2) {
                c2272m.remove(i44);
                z11 = true;
            } else {
                i43++;
                i42 += iE;
                i44++;
            }
        }
        int iMax3 = i38;
        int i45 = i43;
        boolean z12 = z11;
        int i46 = i39;
        while (i45 < i10 && (i42 < iE2 || i42 <= 0 || c2272m.isEmpty())) {
            int i47 = iE2;
            int i48 = i45;
            C1591e c1591eG2 = g(uVar, i48, jB, rVar, j11, qVar, bVar, cVar, uVar.getLayoutDirection(), z10, i17);
            int i49 = i46;
            int i50 = i10 - 1;
            i42 += i48 == i50 ? i17 : iE;
            if (i42 > i37 || i48 == i50) {
                iMax3 = Math.max(iMax3, c1591eG2.b());
                c2272m.add(c1591eG2);
                i29 = i41;
                i46 = i49;
            } else {
                i29 = i48 + 1;
                i46 = i49 - iE;
                z12 = true;
            }
            i45 = i48 + 1;
            i41 = i29;
            iE2 = i47;
        }
        int i51 = i46;
        if (i42 < i11) {
            int i52 = i11 - i42;
            i20 = i51 - i52;
            i42 += i52;
            iMax = iMax3;
            i21 = i41;
            while (i20 < i12 && i21 > 0) {
                int i53 = i21 - 1;
                C1591e c1591eG3 = g(uVar, i53, jB, rVar, j11, qVar, bVar, cVar, uVar.getLayoutDirection(), z10, i17);
                c2272m.add(0, c1591eG3);
                iMax = Math.max(iMax, c1591eG3.b());
                i20 += iE;
                i45 = i45;
                i21 = i53;
            }
            i19 = i45;
            if (i20 < 0) {
                i42 += i20;
                i20 = 0;
            }
        } else {
            i19 = i45;
            iMax = iMax3;
            i20 = i51;
            i21 = i41;
        }
        if (i20 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i54 = iMax;
        int i55 = -i20;
        C1591e c1591e = (C1591e) c2272m.first();
        if (i12 > 0 || i14 < 0) {
            int size = c2272m.size();
            i22 = i55;
            int i56 = 0;
            while (i56 < size && i20 != 0 && iE <= i20 && i56 != AbstractC2279u.o(c2272m)) {
                i20 -= iE;
                i56++;
                c1591e = (C1591e) c2272m.get(i56);
            }
        } else {
            i22 = i55;
        }
        int i57 = i20;
        C1591e c1591e2 = c1591e;
        List listF = f(i21, i18, list, new d(uVar, jB, rVar, j11, qVar, bVar, cVar, z10, i17));
        int size2 = listF.size();
        int iMax4 = i54;
        int i58 = 0;
        while (i58 < size2) {
            iMax4 = Math.max(iMax4, ((C1591e) listF.get(i58)).b());
            i58++;
            listF = listF;
        }
        List list2 = listF;
        List listE = e(((C1591e) c2272m.last()).getIndex(), i10, i18, list, new c(uVar, jB, rVar, j11, qVar, bVar, cVar, z10, i17));
        int size3 = listE.size();
        for (int i59 = 0; i59 < size3; i59++) {
            iMax4 = Math.max(iMax4, ((C1591e) listE.get(i59)).b());
        }
        boolean z13 = AbstractC5504s.c(c1591e2, c2272m.first()) && list2.isEmpty() && listE.isEmpty();
        z.q qVar4 = z.q.Vertical;
        int iG = AbstractC5010c.g(j10, qVar == qVar4 ? iMax4 : i42);
        if (qVar == qVar4) {
            iMax4 = i42;
        }
        int iF = AbstractC5010c.f(j10, iMax4);
        int i60 = i19;
        int i61 = i42;
        List listC = c(uVar, c2272m, list2, listE, iG, iF, i61, i11, i22, qVar, z10, uVar, i14, i17);
        if (z13) {
            arrayList = listC;
        } else {
            arrayList = new ArrayList(listC.size());
            int size4 = listC.size();
            int i62 = 0;
            while (i62 < size4) {
                Object obj = listC.get(i62);
                C1591e c1591e3 = (C1591e) obj;
                C1591e c1591e4 = c1591e2;
                int i63 = i60;
                if (c1591e3.getIndex() >= ((C1591e) c2272m.first()).getIndex() && c1591e3.getIndex() <= ((C1591e) c2272m.last()).getIndex()) {
                    arrayList.add(obj);
                }
                i62++;
                i60 = i63;
                c1591e2 = c1591e4;
            }
        }
        C1591e c1591e5 = c1591e2;
        int i64 = i60;
        if (list2.isEmpty()) {
            arrayList2 = AbstractC2279u.m();
        } else {
            arrayList2 = new ArrayList(listC.size());
            int size5 = listC.size();
            for (int i65 = 0; i65 < size5; i65++) {
                Object obj2 = listC.get(i65);
                if (((C1591e) obj2).getIndex() < ((C1591e) c2272m.first()).getIndex()) {
                    arrayList2.add(obj2);
                }
            }
        }
        List list3 = arrayList2;
        if (listE.isEmpty()) {
            arrayList3 = AbstractC2279u.m();
        } else {
            arrayList3 = new ArrayList(listC.size());
            int size6 = listC.size();
            for (int i66 = 0; i66 < size6; i66++) {
                Object obj3 = listC.get(i66);
                if (((C1591e) obj3).getIndex() > ((C1591e) c2272m.last()).getIndex()) {
                    arrayList3.add(obj3);
                }
            }
        }
        List list4 = arrayList3;
        C1591e c1591eB = b(qVar == z.q.Vertical ? iF : iG, arrayList, i12, i13, iE, kVar, i10);
        List list5 = arrayList;
        if (c1591eB != null) {
            index = c1591eB.getIndex();
            i23 = i10;
            i24 = i11;
            i25 = i12;
            i26 = i17;
            i27 = iE;
            i28 = i13;
            kVar2 = kVar;
        } else {
            index = 0;
            i23 = i10;
            i24 = i11;
            i25 = i12;
            i26 = i17;
            kVar2 = kVar;
            i27 = iE;
            i28 = i13;
        }
        return new u(list5, i17, i14, i13, qVar, i33, i40, z10, i18, c1591e5, c1591eB, i27 == 0 ? 0.0f : AbstractC5874j.l((kVar2.a(i24, i26, i25, i28, index, i23) - (c1591eB != null ? c1591eB.getOffset() : 0)) / i27, -0.5f, 0.5f), i57, i64 < i23 || i61 > i24, kVar, (I0.C) interfaceC5096o.invoke(Integer.valueOf(iG), Integer.valueOf(iF), new a(listC, c02)), z12, list3, list4, o10);
    }
}
