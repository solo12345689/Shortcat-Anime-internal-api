package U;

import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import androidx.compose.ui.layout.AbstractC2679h;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.C5009b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i0 implements I0.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C.A f18389c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18390a = new a();

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
        public static final b f18391a = new b();

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
        final /* synthetic */ androidx.compose.ui.layout.s f18392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18399h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18400i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18401j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f18402k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ i0 f18403l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f18404m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.l f18405n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.layout.s sVar, int i10, int i11, androidx.compose.ui.layout.s sVar2, androidx.compose.ui.layout.s sVar3, androidx.compose.ui.layout.s sVar4, androidx.compose.ui.layout.s sVar5, androidx.compose.ui.layout.s sVar6, androidx.compose.ui.layout.s sVar7, androidx.compose.ui.layout.s sVar8, androidx.compose.ui.layout.s sVar9, i0 i0Var, int i12, androidx.compose.ui.layout.l lVar) {
            super(1);
            this.f18392a = sVar;
            this.f18393b = i10;
            this.f18394c = i11;
            this.f18395d = sVar2;
            this.f18396e = sVar3;
            this.f18397f = sVar4;
            this.f18398g = sVar5;
            this.f18399h = sVar6;
            this.f18400i = sVar7;
            this.f18401j = sVar8;
            this.f18402k = sVar9;
            this.f18403l = i0Var;
            this.f18404m = i12;
            this.f18405n = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return Td.L.f17438a;
        }

        public final void invoke(s.a aVar) {
            androidx.compose.ui.layout.s sVar = this.f18392a;
            if (sVar == null) {
                h0.j(aVar, this.f18393b, this.f18394c, this.f18395d, this.f18396e, this.f18397f, this.f18398g, this.f18399h, this.f18400i, this.f18401j, this.f18402k, this.f18403l.f18387a, this.f18405n.getDensity(), this.f18403l.f18389c);
                return;
            }
            int i10 = this.f18393b;
            int i11 = this.f18394c;
            androidx.compose.ui.layout.s sVar2 = this.f18395d;
            androidx.compose.ui.layout.s sVar3 = this.f18396e;
            androidx.compose.ui.layout.s sVar4 = this.f18397f;
            androidx.compose.ui.layout.s sVar5 = this.f18398g;
            androidx.compose.ui.layout.s sVar6 = this.f18399h;
            androidx.compose.ui.layout.s sVar7 = this.f18400i;
            androidx.compose.ui.layout.s sVar8 = this.f18401j;
            androidx.compose.ui.layout.s sVar9 = this.f18402k;
            boolean z10 = this.f18403l.f18387a;
            int i12 = this.f18404m;
            h0.i(aVar, i10, i11, sVar2, sVar, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, z10, i12, i12 + this.f18392a.P0(), this.f18403l.f18388b, this.f18405n.getDensity());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f18406a = new d();

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
        public static final e f18407a = new e();

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

    public i0(boolean z10, float f10, C.A a10) {
        this.f18387a = z10;
        this.f18388b = f10;
        this.f18389c = a10;
    }

    private final int d(InterfaceC1687m interfaceC1687m, List list, int i10, Function2 function2) {
        Object obj;
        int i11;
        int iL;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj), "Leading")) {
                break;
            }
            i13++;
        }
        InterfaceC1686l interfaceC1686l = (InterfaceC1686l) obj;
        if (interfaceC1686l != null) {
            i11 = i10;
            iL = h0.l(i11, interfaceC1686l.q0(Integer.MAX_VALUE));
            iIntValue = ((Number) function2.invoke(interfaceC1686l, Integer.valueOf(i11))).intValue();
        } else {
            i11 = i10;
            iL = i11;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        InterfaceC1686l interfaceC1686l2 = (InterfaceC1686l) obj2;
        if (interfaceC1686l2 != null) {
            iL = h0.l(iL, interfaceC1686l2.q0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) function2.invoke(interfaceC1686l2, Integer.valueOf(i11))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj3), "Label")) {
                break;
            }
            i15++;
        }
        Object obj8 = (InterfaceC1686l) obj3;
        int iIntValue4 = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(iL))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj4), "Prefix")) {
                break;
            }
            i16++;
        }
        InterfaceC1686l interfaceC1686l3 = (InterfaceC1686l) obj4;
        if (interfaceC1686l3 != null) {
            iIntValue3 = ((Number) function2.invoke(interfaceC1686l3, Integer.valueOf(iL))).intValue();
            iL = h0.l(iL, interfaceC1686l3.q0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj5), "Suffix")) {
                break;
            }
            i17++;
        }
        InterfaceC1686l interfaceC1686l4 = (InterfaceC1686l) obj5;
        if (interfaceC1686l4 != null) {
            int iIntValue5 = ((Number) function2.invoke(interfaceC1686l4, Integer.valueOf(iL))).intValue();
            iL = h0.l(iL, interfaceC1686l4.q0(Integer.MAX_VALUE));
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj9 = list.get(i18);
            if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj9), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                Object obj10 = (InterfaceC1686l) obj6;
                int iIntValue7 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i20);
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj7), "Supporting")) {
                        break;
                    }
                    i20++;
                }
                Object obj11 = (InterfaceC1686l) obj7;
                return h0.g(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i12, iIntValue7, obj11 != null ? ((Number) function2.invoke(obj11, Integer.valueOf(i11))).intValue() : 0, this.f18388b, W.j.s(), interfaceC1687m.getDensity(), this.f18389c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int e(List list, int i10, Function2 function2) {
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
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj4), "Prefix")) {
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
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj5), "Suffix")) {
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
                    if (AbstractC5504s.c(W.j.l((InterfaceC1686l) obj6), "Leading")) {
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
                return h0.h(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, interfaceC1686l6 != null ? ((Number) function2.invoke(interfaceC1686l6, Integer.valueOf(i10))).intValue() : 0, W.j.s());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // I0.B
    public int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return d(interfaceC1687m, list, i10, a.f18390a);
    }

    @Override // I0.B
    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return e(list, i10, b.f18391a);
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        Object obj;
        Object obj2;
        long j11;
        androidx.compose.ui.layout.s sVarV0;
        Object obj3;
        Object obj4;
        int i10;
        androidx.compose.ui.layout.s sVar;
        androidx.compose.ui.layout.s sVar2;
        long j12;
        androidx.compose.ui.layout.s sVarV02;
        androidx.compose.ui.layout.s sVar3;
        Object obj5;
        androidx.compose.ui.layout.s sVar4;
        Object obj6;
        androidx.compose.ui.layout.s sVar5;
        Object obj7;
        i0 i0Var = this;
        androidx.compose.ui.layout.l lVar2 = lVar;
        List list2 = list;
        int iS0 = lVar2.s0(i0Var.f18389c.d());
        int iS02 = lVar2.s0(i0Var.f18389c.c());
        long jD = C5009b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i11);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj), "Leading")) {
                break;
            }
            i11++;
        }
        I0.A a10 = (I0.A) obj;
        androidx.compose.ui.layout.s sVarV03 = a10 != null ? a10.v0(jD) : null;
        int iV = W.j.v(sVarV03);
        int iMax = Math.max(0, W.j.t(sVarV03));
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i12);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        I0.A a11 = (I0.A) obj2;
        if (a11 != null) {
            j11 = jD;
            sVarV0 = a11.v0(AbstractC5010c.k(j11, -iV, 0, 2, null));
        } else {
            j11 = jD;
            sVarV0 = null;
        }
        int iV2 = iV + W.j.v(sVarV0);
        int iMax2 = Math.max(iMax, W.j.t(sVarV0));
        int size3 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i13);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj3), "Prefix")) {
                break;
            }
            i13++;
        }
        I0.A a12 = (I0.A) obj3;
        androidx.compose.ui.layout.s sVarV04 = a12 != null ? a12.v0(AbstractC5010c.k(j11, -iV2, 0, 2, null)) : null;
        int iV3 = iV2 + W.j.v(sVarV04);
        int iMax3 = Math.max(iMax2, W.j.t(sVarV04));
        int size4 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i14);
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj4), "Suffix")) {
                break;
            }
            i14++;
        }
        I0.A a13 = (I0.A) obj4;
        if (a13 != null) {
            sVar = sVarV0;
            i10 = iV3;
            sVar2 = sVarV03;
            j12 = j11;
            sVarV02 = a13.v0(AbstractC5010c.k(j11, -iV3, 0, 2, null));
        } else {
            i10 = iV3;
            sVar = sVarV0;
            sVar2 = sVarV03;
            j12 = j11;
            sVarV02 = null;
        }
        int iV4 = W.j.v(sVarV02) + i10;
        int iMax4 = Math.max(iMax3, W.j.t(sVarV02));
        int i15 = -iV4;
        long j13 = AbstractC5010c.j(j12, i15, -iS02);
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                sVar3 = sVarV02;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i16);
            int i17 = i16;
            sVar3 = sVarV02;
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj5), "Label")) {
                break;
            }
            i16 = i17 + 1;
            sVarV02 = sVar3;
        }
        I0.A a14 = (I0.A) obj5;
        androidx.compose.ui.layout.s sVarV05 = a14 != null ? a14.v0(j13) : null;
        int size6 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                sVar4 = sVarV05;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i18);
            sVar4 = sVarV05;
            if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj6), "Supporting")) {
                break;
            }
            i18++;
            sVarV05 = sVar4;
        }
        I0.A a15 = (I0.A) obj6;
        int iZ = a15 != null ? a15.Z(C5009b.n(j10)) : 0;
        int iT = W.j.t(sVar4) + iS0;
        long j14 = j12;
        long j15 = AbstractC5010c.j(C5009b.d(j10, 0, 0, 0, 0, 11, null), i15, ((-iT) - iS02) - iZ);
        int size7 = list2.size();
        int i19 = 0;
        while (i19 < size7) {
            I0.A a16 = (I0.A) list2.get(i19);
            int i20 = size7;
            int i21 = iT;
            if (AbstractC5504s.c(AbstractC2679h.a(a16), "TextField")) {
                androidx.compose.ui.layout.s sVarV06 = a16.v0(j15);
                long jD2 = C5009b.d(j15, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        sVar5 = sVarV06;
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i22);
                    sVar5 = sVarV06;
                    int i23 = size8;
                    if (AbstractC5504s.c(AbstractC2679h.a((I0.A) obj7), "Hint")) {
                        break;
                    }
                    i22++;
                    size8 = i23;
                    sVarV06 = sVar5;
                }
                I0.A a17 = (I0.A) obj7;
                androidx.compose.ui.layout.s sVarV07 = a17 != null ? a17.v0(jD2) : null;
                int iMax5 = Math.max(iMax4, Math.max(W.j.t(sVar5), W.j.t(sVarV07)) + i21 + iS02);
                int iH = h0.h(W.j.v(sVar2), W.j.v(sVar), W.j.v(sVarV04), W.j.v(sVar3), sVar5.W0(), W.j.v(sVar4), W.j.v(sVarV07), j10);
                int i24 = iH;
                androidx.compose.ui.layout.s sVarV08 = a15 != null ? a15.v0(C5009b.d(AbstractC5010c.k(j14, 0, -iMax5, 1, null), 0, iH, 0, 0, 9, null)) : null;
                int iT2 = W.j.t(sVarV08);
                int iG = h0.g(sVar5.P0(), W.j.t(sVar4), W.j.t(sVar2), W.j.t(sVar), W.j.t(sVarV04), W.j.t(sVar3), W.j.t(sVarV07), W.j.t(sVarV08), i0Var.f18388b, j10, lVar2.getDensity(), i0Var.f18389c);
                int i25 = iG - iT2;
                int size9 = list2.size();
                int i26 = 0;
                while (i26 < size9) {
                    I0.A a18 = (I0.A) list2.get(i26);
                    int i27 = iG;
                    if (AbstractC5504s.c(AbstractC2679h.a(a18), "Container")) {
                        int i28 = i24;
                        return androidx.compose.ui.layout.l.u0(lVar, i28, i27, null, new c(sVar4, i28, i27, sVar5, sVarV07, sVar2, sVar, sVarV04, sVar3, a18.v0(AbstractC5010c.a(i24 != Integer.MAX_VALUE ? i24 : 0, i24, i25 != Integer.MAX_VALUE ? i25 : 0, i25)), sVarV08, i0Var, iS0, lVar2), 4, null);
                    }
                    i26++;
                    i24 = i24;
                    iG = i27;
                    i0Var = this;
                    lVar2 = lVar;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i19++;
            i0Var = this;
            lVar2 = lVar;
            iT = i21;
            j15 = j15;
            size7 = i20;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // I0.B
    public int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return d(interfaceC1687m, list, i10, d.f18406a);
    }

    @Override // I0.B
    public int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        return e(list, i10, e.f18407a);
    }
}
