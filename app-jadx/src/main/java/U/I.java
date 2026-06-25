package U;

import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import androidx.compose.ui.layout.AbstractC2679h;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import java.util.List;
import java.util.NoSuchElementException;
import k1.AbstractC5437b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6231m;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class I implements I0.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f17746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C.A f17749d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17750a = new a();

        a() {
            super(2);
        }

        public final Integer a(InterfaceC1686l interfaceC1686l, int i10) {
            return Integer.valueOf(interfaceC1686l.I(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC1686l) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17751a = new b();

        b() {
            super(2);
        }

        public final Integer a(InterfaceC1686l interfaceC1686l, int i10) {
            return Integer.valueOf(interfaceC1686l.q0(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC1686l) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f17752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17758g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17759h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17760i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17761j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f17762k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ I f17763l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f17764m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, androidx.compose.ui.layout.s sVar, androidx.compose.ui.layout.s sVar2, androidx.compose.ui.layout.s sVar3, androidx.compose.ui.layout.s sVar4, androidx.compose.ui.layout.s sVar5, androidx.compose.ui.layout.s sVar6, androidx.compose.ui.layout.s sVar7, androidx.compose.ui.layout.s sVar8, androidx.compose.ui.layout.s sVar9, I i12, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.f17752a = i10;
            this.f17753b = i11;
            this.f17754c = sVar;
            this.f17755d = sVar2;
            this.f17756e = sVar3;
            this.f17757f = sVar4;
            this.f17758g = sVar5;
            this.f17759h = sVar6;
            this.f17760i = sVar7;
            this.f17761j = sVar8;
            this.f17762k = sVar9;
            this.f17763l = i12;
            this.f17764m = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            H.l(aVar, this.f17752a, this.f17753b, this.f17754c, this.f17755d, this.f17756e, this.f17757f, this.f17758g, this.f17759h, this.f17760i, this.f17761j, this.f17762k, this.f17763l.f17748c, this.f17763l.f17747b, this.f17764m.getDensity(), this.f17764m.getLayoutDirection(), this.f17763l.f17749d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17765a = new d();

        d() {
            super(2);
        }

        public final Integer a(InterfaceC1686l interfaceC1686l, int i10) {
            return Integer.valueOf(interfaceC1686l.Z(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC1686l) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f17766a = new e();

        e() {
            super(2);
        }

        public final Integer a(InterfaceC1686l interfaceC1686l, int i10) {
            return Integer.valueOf(interfaceC1686l.l0(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC1686l) obj, ((Number) obj2).intValue());
        }
    }

    public I(Function1 function1, boolean z10, float f10, C.A a10) {
        this.f17746a = function1;
        this.f17747b = z10;
        this.f17748c = f10;
        this.f17749d = a10;
    }

    private final int d(InterfaceC1687m interfaceC1687m, List list, int i10, Function2 function2) {
        Object obj;
        int iN;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i11;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i12);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj), "Leading")) {
                break;
            }
            i12++;
        }
        InterfaceC1686l interfaceC1686l = (InterfaceC1686l) obj;
        if (interfaceC1686l != null) {
            iN = H.n(i10, interfaceC1686l.q0(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(interfaceC1686l, Integer.valueOf(i10))).intValue();
        } else {
            iN = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i13);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj2), "Trailing")) {
                break;
            }
            i13++;
        }
        InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) obj2;
        if (interfaceC1686l2 != null) {
            iN = H.n(iN, interfaceC1686l2.q0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(interfaceC1686l2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj3), "Label")) {
                break;
            }
            i14++;
        }
        Object obj8 = (InterfaceC1686l) obj3;
        int iIntValue4 = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(AbstractC5437b.c(iN, i10, this.f17748c)))).intValue() : 0;
        int size4 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i15);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj4), "Prefix")) {
                break;
            }
            i15++;
        }
        InterfaceC1686l interfaceC1686l3 = (InterfaceC1686l) obj4;
        if (interfaceC1686l3 != null) {
            iIntValue3 = ((Number) function2.invoke(interfaceC1686l3, Integer.valueOf(iN))).intValue();
            iN = H.n(iN, interfaceC1686l3.q0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i16);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj5), "Suffix")) {
                break;
            }
            i16++;
        }
        InterfaceC1686l interfaceC1686l4 = (InterfaceC1686l) obj5;
        if (interfaceC1686l4 != null) {
            int iIntValue5 = ((Number) function2.invoke(interfaceC1686l4, Integer.valueOf(iN))).intValue();
            iN = H.n(iN, interfaceC1686l4.q0(Integer.MAX_VALUE));
            i11 = iIntValue5;
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        for (int i17 = 0; i17 < size6; i17++) {
            Object obj9 = list.get(i17);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj9), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj9, Integer.valueOf(iN))).intValue();
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i18);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj6), "Hint")) {
                        break;
                    }
                    i18++;
                }
                Object obj10 = (InterfaceC1686l) obj6;
                int iIntValue7 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(iN))).intValue() : 0;
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i19);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i19++;
                }
                Object obj12 = (InterfaceC1686l) obj7;
                return H.h(iIntValue, iIntValue2, iIntValue3, i11, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) function2.invoke(obj12, Integer.valueOf(i10))).intValue() : 0, this.f17748c, W.j.s(), interfaceC1687m.getDensity(), this.f17749d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int e(InterfaceC1687m interfaceC1687m, List list, int i10, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC1686l interfaceC1686l = (InterfaceC1686l) obj2;
                int iIntValue2 = interfaceC1686l != null ? ((Number) function2.invoke(interfaceC1686l, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) obj3;
                int iIntValue3 = interfaceC1686l2 != null ? ((Number) function2.invoke(interfaceC1686l2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC1686l interfaceC1686l3 = (InterfaceC1686l) obj4;
                int iIntValue4 = interfaceC1686l3 != null ? ((Number) function2.invoke(interfaceC1686l3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj5), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC1686l interfaceC1686l4 = (InterfaceC1686l) obj5;
                int iIntValue5 = interfaceC1686l4 != null ? ((Number) function2.invoke(interfaceC1686l4, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj6), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC1686l interfaceC1686l5 = (InterfaceC1686l) obj6;
                int iIntValue6 = interfaceC1686l5 != null ? ((Number) function2.invoke(interfaceC1686l5, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i17);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i17++;
                }
                InterfaceC1686l interfaceC1686l6 = (InterfaceC1686l) obj;
                return H.i(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC1686l6 != null ? ((Number) function2.invoke(interfaceC1686l6, Integer.valueOf(i10))).intValue() : 0, this.f17748c, W.j.s(), interfaceC1687m.getDensity(), this.f17749d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // I0.B
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return d(interfaceC1687m, list, i10, a.f17750a);
    }

    @Override // I0.B
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return e(interfaceC1687m, list, i10, b.f17751a);
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        androidx.compose.ui.layout.s sVar;
        Object obj5;
        Object obj6;
        Object obj7;
        I i10 = this;
        androidx.compose.ui.layout.l lVar2 = lVar;
        int iS0 = lVar2.s0(i10.f17749d.c());
        long jD = C5009b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj), "Leading")) {
                break;
            }
            i11++;
        }
        I0.A a10 = (I0.A) obj;
        androidx.compose.ui.layout.s sVarV0 = a10 != null ? a10.v0(jD) : null;
        int iV = W.j.v(sVarV0);
        int iMax = Math.max(0, W.j.t(sVarV0));
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        I0.A a11 = (I0.A) obj2;
        androidx.compose.ui.layout.s sVarV02 = a11 != null ? a11.v0(AbstractC5010c.k(jD, -iV, 0, 2, null)) : null;
        int iV2 = iV + W.j.v(sVarV02);
        int iMax2 = Math.max(iMax, W.j.t(sVarV02));
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i13);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj3), "Prefix")) {
                break;
            }
            i13++;
        }
        I0.A a12 = (I0.A) obj3;
        androidx.compose.ui.layout.s sVarV03 = a12 != null ? a12.v0(AbstractC5010c.k(jD, -iV2, 0, 2, null)) : null;
        int iV3 = iV2 + W.j.v(sVarV03);
        int iMax3 = Math.max(iMax2, W.j.t(sVarV03));
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i14);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj4), "Suffix")) {
                break;
            }
            i14++;
        }
        I0.A a13 = (I0.A) obj4;
        androidx.compose.ui.layout.s sVarV04 = a13 != null ? a13.v0(AbstractC5010c.k(jD, -iV3, 0, 2, null)) : null;
        int iV4 = iV3 + W.j.v(sVarV04);
        int iMax4 = Math.max(iMax3, W.j.t(sVarV04));
        int iS02 = lVar2.s0(i10.f17749d.b(lVar2.getLayoutDirection())) + lVar2.s0(i10.f17749d.a(lVar2.getLayoutDirection()));
        int i15 = -iV4;
        int i16 = -iS0;
        long j11 = AbstractC5010c.j(jD, AbstractC5437b.c(i15 - iS02, -iS02, i10.f17748c), i16);
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                sVar = sVarV0;
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            int i18 = i17;
            sVar = sVarV0;
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj5), "Label")) {
                break;
            }
            i17 = i18 + 1;
            sVarV0 = sVar;
        }
        I0.A a14 = (I0.A) obj5;
        androidx.compose.ui.layout.s sVarV05 = a14 != null ? a14.v0(j11) : null;
        i10.f17746a.invoke(C6230l.c(sVarV05 != null ? AbstractC6231m.a(sVarV05.W0(), sVarV05.P0()) : C6230l.f58350b.b()));
        int size6 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i19);
            int i20 = size6;
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj6), "Supporting")) {
                break;
            }
            i19++;
            size6 = i20;
        }
        I0.A a15 = (I0.A) obj6;
        int iZ = a15 != null ? a15.Z(C5009b.n(j10)) : 0;
        int iMax5 = Math.max(W.j.t(sVarV05) / 2, lVar2.s0(i10.f17749d.d()));
        long jD2 = C5009b.d(AbstractC5010c.j(j10, i15, (i16 - iMax5) - iZ), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        androidx.compose.ui.layout.s sVar2 = sVarV03;
        int i21 = 0;
        while (i21 < size7) {
            int i22 = size7;
            I0.A a16 = (I0.A) list.get(i21);
            androidx.compose.ui.layout.s sVar3 = sVarV04;
            androidx.compose.ui.layout.s sVar4 = sVarV02;
            if (AbstractC5504s.c(AbstractC2679h.a(a16), "TextField")) {
                androidx.compose.ui.layout.s sVarV06 = a16.v0(jD2);
                long jD3 = C5009b.d(jD2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i23);
                    int i24 = size8;
                    int i25 = i23;
                    if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj7), "Hint")) {
                        break;
                    }
                    i23 = i25 + 1;
                    size8 = i24;
                }
                I0.A a17 = (I0.A) obj7;
                androidx.compose.ui.layout.s sVarV07 = a17 != null ? a17.v0(jD3) : null;
                int iMax6 = Math.max(iMax4, Math.max(W.j.t(sVarV06), W.j.t(sVarV07)) + iMax5 + iS0);
                int i26 = H.i(W.j.v(sVar), W.j.v(sVar4), W.j.v(sVar2), W.j.v(sVar3), sVarV06.W0(), W.j.v(sVarV05), W.j.v(sVarV07), i10.f17748c, j10, lVar2.getDensity(), i10.f17749d);
                int i27 = i26;
                androidx.compose.ui.layout.s sVarV08 = a15 != null ? a15.v0(C5009b.d(AbstractC5010c.k(jD, 0, -iMax6, 1, null), 0, i26, 0, 0, 9, null)) : null;
                int iT = W.j.t(sVarV08);
                int iH = H.h(W.j.t(sVar), W.j.t(sVar4), W.j.t(sVar2), W.j.t(sVar3), sVarV06.P0(), W.j.t(sVarV05), W.j.t(sVarV07), W.j.t(sVarV08), i10.f17748c, j10, lVar2.getDensity(), i10.f17749d);
                int i28 = iH - iT;
                int size9 = list.size();
                int i29 = 0;
                while (i29 < size9) {
                    I0.A a18 = (I0.A) list.get(i29);
                    if (AbstractC5504s.c(AbstractC2679h.a(a18), "Container")) {
                        int i30 = i27;
                        return androidx.compose.ui.layout.l.u0(lVar, i30, iH, null, new c(iH, i30, sVar, sVar4, sVar2, sVar3, sVarV06, sVarV05, sVarV07, a18.v0(AbstractC5010c.a(i27 != Integer.MAX_VALUE ? i27 : 0, i27, i28 != Integer.MAX_VALUE ? i28 : 0, i28)), sVarV08, i10, lVar2), 4, null);
                    }
                    i29++;
                    i10 = this;
                    lVar2 = lVar;
                    i27 = i27;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i21++;
            i10 = this;
            lVar2 = lVar;
            sVarV02 = sVar4;
            size7 = i22;
            sVarV04 = sVar3;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // I0.B
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return d(interfaceC1687m, list, i10, d.f17765a);
    }

    @Override // I0.B
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return e(interfaceC1687m, list, i10, e.f17766a);
    }
}
