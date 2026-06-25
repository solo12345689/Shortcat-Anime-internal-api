package U;

import U.AbstractC2184v;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.ui.layout.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5010c;
import i1.C5009b;
import i1.C5015h;
import i1.EnumC5027t;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a */
    private static final float f17814a = C5015h.n(16);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ W.e f17815a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C.P f17816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W.e eVar, C.P p10) {
            super(1);
            this.f17815a = eVar;
            this.f17816b = p10;
        }

        public final void a(C.P p10) {
            this.f17815a.f(C.S.d(this.f17816b, p10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C.P) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f17817a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f17818b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5096o f17819c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f17820d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function2 f17821e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ W.e f17822f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Function2 f17823g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Function2 function2, InterfaceC5096o interfaceC5096o, Function2 function22, Function2 function23, W.e eVar, Function2 function24) {
            super(2);
            this.f17817a = i10;
            this.f17818b = function2;
            this.f17819c = interfaceC5096o;
            this.f17820d = function22;
            this.f17821e = function23;
            this.f17822f = eVar;
            this.f17823g = function24;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1979205334, i10, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
            }
            P.b(this.f17817a, this.f17818b, this.f17819c, this.f17820d, this.f17821e, this.f17822f, this.f17823g, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f17824a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f17825b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f17826c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f17827d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function2 f17828e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f17829f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f17830g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ long f17831h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ C.P f17832i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ InterfaceC5096o f17833j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f17834k;

        /* JADX INFO: renamed from: l */
        final /* synthetic */ int f17835l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i10, long j10, long j11, C.P p10, InterfaceC5096o interfaceC5096o, int i11, int i12) {
            super(2);
            this.f17824a = eVar;
            this.f17825b = function2;
            this.f17826c = function22;
            this.f17827d = function23;
            this.f17828e = function24;
            this.f17829f = i10;
            this.f17830g = j10;
            this.f17831h = j11;
            this.f17832i = p10;
            this.f17833j = interfaceC5096o;
            this.f17834k = i11;
            this.f17835l = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            P.a(this.f17824a, this.f17825b, this.f17826c, this.f17827d, this.f17828e, this.f17829f, this.f17830g, this.f17831h, this.f17832i, this.f17833j, interfaceC2425m, AbstractC2409g1.a(this.f17834k | 1), this.f17835l);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f17836a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f17837b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f17838c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f17839d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C.P f17840e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Function2 f17841f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC5096o f17842g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f17843a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ List f17844b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f17845c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ List f17846d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ C2183u f17847e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f17848f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ int f17849g;

            /* JADX INFO: renamed from: h */
            final /* synthetic */ C.P f17850h;

            /* JADX INFO: renamed from: i */
            final /* synthetic */ I0.P f17851i;

            /* JADX INFO: renamed from: j */
            final /* synthetic */ int f17852j;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f17853k;

            /* JADX INFO: renamed from: l */
            final /* synthetic */ Integer f17854l;

            /* JADX INFO: renamed from: m */
            final /* synthetic */ List f17855m;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ Integer f17856n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, List list2, List list3, List list4, C2183u c2183u, int i10, int i11, C.P p10, I0.P p11, int i12, int i13, Integer num, List list5, Integer num2) {
                super(1);
                this.f17843a = list;
                this.f17844b = list2;
                this.f17845c = list3;
                this.f17846d = list4;
                this.f17847e = c2183u;
                this.f17848f = i10;
                this.f17849g = i11;
                this.f17850h = p10;
                this.f17851i = p11;
                this.f17852j = i12;
                this.f17853k = i13;
                this.f17854l = num;
                this.f17855m = list5;
                this.f17856n = num2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return Td.L.f17438a;
            }

            public final void invoke(s.a aVar) {
                List list = this.f17843a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    s.a.N(aVar, (androidx.compose.ui.layout.s) list.get(i10), 0, 0, 0.0f, 4, null);
                }
                List list2 = this.f17844b;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    s.a.N(aVar, (androidx.compose.ui.layout.s) list2.get(i11), 0, 0, 0.0f, 4, null);
                }
                List list3 = this.f17845c;
                int i12 = this.f17848f;
                int i13 = this.f17849g;
                C.P p10 = this.f17850h;
                I0.P p11 = this.f17851i;
                int i14 = this.f17852j;
                int i15 = this.f17853k;
                int size3 = list3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    s.a.N(aVar, (androidx.compose.ui.layout.s) list3.get(i16), ((i12 - i13) / 2) + p10.d(p11, p11.getLayoutDirection()), i14 - i15, 0.0f, 4, null);
                }
                List list4 = this.f17846d;
                int i17 = this.f17852j;
                Integer num = this.f17854l;
                int size4 = list4.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    s.a.N(aVar, (androidx.compose.ui.layout.s) list4.get(i18), 0, i17 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                C2183u c2183u = this.f17847e;
                if (c2183u != null) {
                    List list5 = this.f17855m;
                    int i19 = this.f17852j;
                    Integer num2 = this.f17856n;
                    int size5 = list5.size();
                    for (int i20 = 0; i20 < size5; i20++) {
                        androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) list5.get(i20);
                        int iB = c2183u.b();
                        AbstractC5504s.e(num2);
                        s.a.N(aVar, sVar, iB, i19 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C.P f17857a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ I0.P f17858b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ List f17859c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f17860d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ List f17861e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ Integer f17862f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ InterfaceC5096o f17863g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C.P p10, I0.P p11, List list, int i10, List list2, Integer num, InterfaceC5096o interfaceC5096o) {
                super(2);
                this.f17857a = p10;
                this.f17858b = p11;
                this.f17859c = list;
                this.f17860d = i10;
                this.f17861e = list2;
                this.f17862f = num;
                this.f17863g = interfaceC5096o;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
                Integer num;
                if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(-1213360416, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                }
                C.A aC = C.S.c(this.f17857a, this.f17858b);
                this.f17863g.invoke(androidx.compose.foundation.layout.p.d(androidx.compose.foundation.layout.p.g(aC, this.f17858b.getLayoutDirection()), this.f17859c.isEmpty() ? aC.d() : this.f17858b.A(this.f17860d), androidx.compose.foundation.layout.p.f(aC, this.f17858b.getLayoutDirection()), (this.f17861e.isEmpty() || (num = this.f17862f) == null) ? aC.c() : this.f17858b.A(num.intValue())), interfaceC2425m, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Function2 f17864a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Function2 function2) {
                super(2);
                this.f17864a = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
                if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(-2146438447, i10, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.f17864a.invoke(interfaceC2425m, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function2 function2, Function2 function22, Function2 function23, int i10, C.P p10, Function2 function24, InterfaceC5096o interfaceC5096o) {
            super(2);
            this.f17836a = function2;
            this.f17837b = function22;
            this.f17838c = function23;
            this.f17839d = i10;
            this.f17840e = p10;
            this.f17841f = function24;
            this.f17842g = interfaceC5096o;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m43invoke0kLqBqw((I0.P) obj, ((C5009b) obj2).r());
        }

        /* JADX INFO: renamed from: invoke-0kLqBqw */
        public final I0.C m43invoke0kLqBqw(I0.P p10, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            int i10;
            C2183u c2183u;
            Object obj4;
            Integer numValueOf;
            int iA;
            int iA2;
            Object obj5;
            Object obj6;
            int iS0;
            int iS02;
            int iL = C5009b.l(j10);
            int iK = C5009b.k(j10);
            long jD = C5009b.d(j10, 0, 0, 0, 0, 10, null);
            List listM = p10.M(Q.TopBar, this.f17836a);
            ArrayList arrayList = new ArrayList(listM.size());
            int size = listM.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((I0.A) listM.get(i11)).v0(jD));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int iP0 = ((androidx.compose.ui.layout.s) obj).P0();
                int iO = AbstractC2279u.o(arrayList);
                if (1 <= iO) {
                    int i12 = 1;
                    while (true) {
                        Object obj7 = arrayList.get(i12);
                        int iP02 = ((androidx.compose.ui.layout.s) obj7).P0();
                        if (iP0 < iP02) {
                            obj = obj7;
                            iP0 = iP02;
                        }
                        if (i12 == iO) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            androidx.compose.ui.layout.s sVar = (androidx.compose.ui.layout.s) obj;
            int iP03 = sVar != null ? sVar.P0() : 0;
            List listM2 = p10.M(Q.Snackbar, this.f17837b);
            C.P p11 = this.f17840e;
            ArrayList arrayList2 = new ArrayList(listM2.size());
            int size2 = listM2.size();
            int i13 = 0;
            while (i13 < size2) {
                arrayList2.add(((I0.A) listM2.get(i13)).v0(AbstractC5010c.j(jD, (-p11.d(p10, p10.getLayoutDirection())) - p11.c(p10, p10.getLayoutDirection()), -p11.a(p10))));
                i13++;
                arrayList = arrayList;
                listM2 = listM2;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int iP04 = ((androidx.compose.ui.layout.s) obj2).P0();
                int iO2 = AbstractC2279u.o(arrayList2);
                if (1 <= iO2) {
                    Object obj8 = obj2;
                    int i14 = iP04;
                    int i15 = 1;
                    while (true) {
                        Object obj9 = arrayList2.get(i15);
                        int iP05 = ((androidx.compose.ui.layout.s) obj9).P0();
                        if (i14 < iP05) {
                            obj8 = obj9;
                            i14 = iP05;
                        }
                        if (i15 == iO2) {
                            break;
                        }
                        i15++;
                    }
                    obj2 = obj8;
                }
            }
            androidx.compose.ui.layout.s sVar2 = (androidx.compose.ui.layout.s) obj2;
            int iP06 = sVar2 != null ? sVar2.P0() : 0;
            if (arrayList2.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList2.get(0);
                int iW0 = ((androidx.compose.ui.layout.s) obj3).W0();
                int iO3 = AbstractC2279u.o(arrayList2);
                if (1 <= iO3) {
                    Object obj10 = obj3;
                    int i16 = iW0;
                    int i17 = 1;
                    while (true) {
                        Object obj11 = arrayList2.get(i17);
                        int iW02 = ((androidx.compose.ui.layout.s) obj11).W0();
                        if (i16 < iW02) {
                            obj10 = obj11;
                            i16 = iW02;
                        }
                        if (i17 == iO3) {
                            break;
                        }
                        i17++;
                    }
                    obj3 = obj10;
                }
            }
            androidx.compose.ui.layout.s sVar3 = (androidx.compose.ui.layout.s) obj3;
            int iW03 = sVar3 != null ? sVar3.W0() : 0;
            List listM3 = p10.M(Q.Fab, this.f17838c);
            C.P p12 = this.f17840e;
            int i18 = iW03;
            ArrayList arrayList4 = new ArrayList(listM3.size());
            int size3 = listM3.size();
            int i19 = 0;
            while (i19 < size3) {
                int i20 = iP06;
                List list = listM3;
                androidx.compose.ui.layout.s sVarV0 = ((I0.A) listM3.get(i19)).v0(AbstractC5010c.j(jD, (-p12.d(p10, p10.getLayoutDirection())) - p12.c(p10, p10.getLayoutDirection()), -p12.a(p10)));
                if (sVarV0.P0() == 0 || sVarV0.W0() == 0) {
                    sVarV0 = null;
                }
                if (sVarV0 != null) {
                    arrayList4.add(sVarV0);
                }
                i19++;
                iP06 = i20;
                listM3 = list;
            }
            int i21 = iP06;
            if (arrayList4.isEmpty()) {
                i10 = iP03;
                c2183u = null;
            } else {
                if (arrayList4.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList4.get(0);
                    int iW04 = ((androidx.compose.ui.layout.s) obj5).W0();
                    int iO4 = AbstractC2279u.o(arrayList4);
                    if (1 <= iO4) {
                        Object obj12 = obj5;
                        int i22 = iW04;
                        int i23 = 1;
                        while (true) {
                            Object obj13 = arrayList4.get(i23);
                            int iW05 = ((androidx.compose.ui.layout.s) obj13).W0();
                            if (i22 < iW05) {
                                obj12 = obj13;
                                i22 = iW05;
                            }
                            if (i23 == iO4) {
                                break;
                            }
                            i23++;
                        }
                        obj5 = obj12;
                    }
                }
                AbstractC5504s.e(obj5);
                int iW06 = ((androidx.compose.ui.layout.s) obj5).W0();
                if (arrayList4.isEmpty()) {
                    i10 = iP03;
                    obj6 = null;
                } else {
                    obj6 = arrayList4.get(0);
                    int iP07 = ((androidx.compose.ui.layout.s) obj6).P0();
                    int iO5 = AbstractC2279u.o(arrayList4);
                    if (1 <= iO5) {
                        Object obj14 = obj6;
                        int i24 = iP07;
                        int i25 = 1;
                        while (true) {
                            Object obj15 = arrayList4.get(i25);
                            i10 = iP03;
                            int iP08 = ((androidx.compose.ui.layout.s) obj15).P0();
                            if (i24 < iP08) {
                                i24 = iP08;
                                obj14 = obj15;
                            }
                            if (i25 == iO5) {
                                break;
                            }
                            i25++;
                            iP03 = i10;
                        }
                        obj6 = obj14;
                    } else {
                        i10 = iP03;
                    }
                }
                AbstractC5504s.e(obj6);
                int iP09 = ((androidx.compose.ui.layout.s) obj6).P0();
                int i26 = this.f17839d;
                AbstractC2184v.a aVar = AbstractC2184v.f18668a;
                if (!AbstractC2184v.e(i26, aVar.c())) {
                    if (!(AbstractC2184v.e(i26, aVar.a()) ? true : AbstractC2184v.e(i26, aVar.b()))) {
                        iS0 = (iL - iW06) / 2;
                    } else if (p10.getLayoutDirection() == EnumC5027t.f48573a) {
                        iS02 = p10.s0(P.f17814a);
                        iS0 = (iL - iS02) - iW06;
                    } else {
                        iS0 = p10.s0(P.f17814a);
                    }
                    c2183u = new C2183u(iS0, iW06, iP09);
                } else if (p10.getLayoutDirection() == EnumC5027t.f48573a) {
                    iS0 = p10.s0(P.f17814a);
                    c2183u = new C2183u(iS0, iW06, iP09);
                } else {
                    iS02 = p10.s0(P.f17814a);
                    iS0 = (iL - iS02) - iW06;
                    c2183u = new C2183u(iS0, iW06, iP09);
                }
            }
            List listM4 = p10.M(Q.BottomBar, g0.i.b(-2146438447, true, new c(this.f17841f)));
            ArrayList arrayList5 = new ArrayList(listM4.size());
            int size4 = listM4.size();
            for (int i27 = 0; i27 < size4; i27++) {
                arrayList5.add(((I0.A) listM4.get(i27)).v0(jD));
            }
            if (arrayList5.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList5.get(0);
                int iP010 = ((androidx.compose.ui.layout.s) obj4).P0();
                int iO6 = AbstractC2279u.o(arrayList5);
                if (1 <= iO6) {
                    int i28 = 1;
                    while (true) {
                        Object obj16 = arrayList5.get(i28);
                        int iP011 = ((androidx.compose.ui.layout.s) obj16).P0();
                        if (iP010 < iP011) {
                            iP010 = iP011;
                            obj4 = obj16;
                        }
                        if (i28 == iO6) {
                            break;
                        }
                        i28++;
                    }
                }
            }
            androidx.compose.ui.layout.s sVar4 = (androidx.compose.ui.layout.s) obj4;
            Integer numValueOf2 = sVar4 != null ? Integer.valueOf(sVar4.P0()) : null;
            if (c2183u != null) {
                int i29 = this.f17839d;
                C.P p13 = this.f17840e;
                if (numValueOf2 == null || AbstractC2184v.e(i29, AbstractC2184v.f18668a.b())) {
                    iA = c2183u.a() + p10.s0(P.f17814a);
                    iA2 = p13.a(p10);
                } else {
                    iA = numValueOf2.intValue() + c2183u.a();
                    iA2 = p10.s0(P.f17814a);
                }
                numValueOf = Integer.valueOf(iA + iA2);
            } else {
                numValueOf = null;
            }
            int iIntValue = i21 != 0 ? i21 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : this.f17840e.a(p10)) : 0;
            List listM5 = p10.M(Q.MainContent, g0.i.b(-1213360416, true, new b(this.f17840e, p10, arrayList3, i10, arrayList5, numValueOf2, this.f17842g)));
            ArrayList arrayList6 = new ArrayList(listM5.size());
            int size5 = listM5.size();
            for (int i30 = 0; i30 < size5; i30++) {
                arrayList6.add(((I0.A) listM5.get(i30)).v0(jD));
            }
            return androidx.compose.ui.layout.l.u0(p10, iL, iK, null, new a(arrayList6, arrayList3, arrayList2, arrayList5, c2183u, iL, i18, this.f17840e, p10, iK, iIntValue, numValueOf2, arrayList4, numValueOf), 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f17865a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f17866b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5096o f17867c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f17868d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function2 f17869e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C.P f17870f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Function2 f17871g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f17872h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, Function2 function2, InterfaceC5096o interfaceC5096o, Function2 function22, Function2 function23, C.P p10, Function2 function24, int i11) {
            super(2);
            this.f17865a = i10;
            this.f17866b = function2;
            this.f17867c = interfaceC5096o;
            this.f17868d = function22;
            this.f17869e = function23;
            this.f17870f = p10;
            this.f17871g = function24;
            this.f17872h = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            P.b(this.f17865a, this.f17866b, this.f17867c, this.f17868d, this.f17869e, this.f17870f, this.f17871g, interfaceC2425m, AbstractC2409g1.a(this.f17872h | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function2 r32, int r33, long r34, long r36, C.P r38, ie.InterfaceC5096o r39, Y.InterfaceC2425m r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.P.a(androidx.compose.ui.e, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, C.P, ie.o, Y.m, int, int):void");
    }

    public static final void b(int i10, Function2 function2, InterfaceC5096o interfaceC5096o, Function2 function22, Function2 function23, C.P p10, Function2 function24, InterfaceC2425m interfaceC2425m, int i11) {
        int i12;
        InterfaceC5096o interfaceC5096o2;
        Function2 function25;
        C.P p11;
        int i13;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC2425mG.c(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            interfaceC5096o2 = interfaceC5096o;
            i12 |= interfaceC2425mG.F(interfaceC5096o2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        } else {
            interfaceC5096o2 = interfaceC5096o;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(function22) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i11 & 24576) == 0) {
            function25 = function23;
            i12 |= interfaceC2425mG.F(function25) ? 16384 : 8192;
        } else {
            function25 = function23;
        }
        if ((196608 & i11) == 0) {
            p11 = p10;
            i12 |= interfaceC2425mG.U(p11) ? 131072 : 65536;
        } else {
            p11 = p10;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= interfaceC2425mG.F(function24) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-975511942, i12, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            boolean z10 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576) | ((i12 & 896) == 256);
            Object objD = interfaceC2425mG.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                i13 = 1;
                d dVar = new d(function2, function22, function25, i10, p11, function24, interfaceC5096o2);
                interfaceC2425mG.u(dVar);
                objD = dVar;
            } else {
                i13 = 1;
            }
            androidx.compose.ui.layout.B.a(null, (Function2) objD, interfaceC2425mG, 0, i13);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new e(i10, function2, interfaceC5096o, function22, function23, p10, function24, i11));
        }
    }
}
