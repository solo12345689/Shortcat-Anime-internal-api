package E;

import C.C1131b;
import Td.L;
import Ud.AbstractC2273n;
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
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3961a = new a();

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
        final /* synthetic */ List f3962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f3963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, C0 c02) {
            super(1);
            this.f3962a = list;
            this.f3963b = c02;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            List list = this.f3962a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((v) list.get(i10)).s(aVar);
            }
            F.J.a(this.f3963b);
        }
    }

    private static final void a(List list, Object[] objArr) {
        for (Object obj : objArr) {
            list.add(obj);
        }
    }

    private static final List b(List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C1131b.m mVar, C1131b.e eVar, boolean z11, InterfaceC5011d interfaceC5011d) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12 && i14 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += ((x) list.get(i16)).b().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (!z12) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int iL = i14;
                while (true) {
                    int i17 = size2 - 1;
                    v vVar = (v) list2.get(size2);
                    iL -= vVar.l();
                    vVar.k(iL, 0, i10, i11);
                    arrayList.add(vVar);
                    if (i17 < 0) {
                        break;
                    }
                    size2 = i17;
                }
            }
            int size3 = list.size();
            int iL2 = i14;
            for (int i18 = 0; i18 < size3; i18++) {
                x xVar = (x) list.get(i18);
                a(arrayList, xVar.f(iL2, i10, i11));
                iL2 += xVar.d();
            }
            int size4 = list3.size();
            for (int i19 = 0; i19 < size4; i19++) {
                v vVar2 = (v) list3.get(i19);
                vVar2.k(iL2, 0, i10, i11);
                arrayList.add(vVar2);
                iL2 += vVar2.l();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i20 = 0; i20 < size5; i20++) {
                iArr[i20] = ((x) list.get(c(i20, z11, size5))).c();
            }
            int[] iArr2 = new int[size5];
            for (int i21 = 0; i21 < size5; i21++) {
                iArr2[i21] = 0;
            }
            if (z10) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                mVar.c(interfaceC5011d, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                eVar.b(interfaceC5011d, i15, iArr, EnumC5027t.f48573a, iArr2);
            }
            C5868d c5868dA0 = AbstractC2273n.a0(iArr2);
            if (z11) {
                c5868dA0 = AbstractC5874j.u(c5868dA0);
            }
            int iF = c5868dA0.f();
            int i22 = c5868dA0.i();
            int iL3 = c5868dA0.l();
            if ((iL3 > 0 && iF <= i22) || (iL3 < 0 && i22 <= iF)) {
                while (true) {
                    int iC = iArr2[iF];
                    x xVar2 = (x) list.get(c(iF, z11, size5));
                    if (z11) {
                        iC = (i15 - iC) - xVar2.c();
                    }
                    a(arrayList, xVar2.f(iC, i10, i11));
                    if (iF == i22) {
                        break;
                    }
                    iF += iL3;
                }
            }
        }
        return arrayList;
    }

    private static final int c(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final E.u d(int r40, E.y r41, E.w r42, int r43, int r44, int r45, int r46, int r47, int r48, float r49, long r50, boolean r52, C.C1131b.m r53, C.C1131b.e r54, boolean r55, i1.InterfaceC5011d r56, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r57, int r58, java.util.List r59, Gf.O r60, Y.C0 r61, s0.Z0 r62, kotlin.jvm.functions.Function1 r63, ie.InterfaceC5096o r64) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.t.d(int, E.y, E.w, int, int, int, int, int, int, float, long, boolean, C.b$m, C.b$e, boolean, i1.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, Gf.O, Y.C0, s0.Z0, kotlin.jvm.functions.Function1, ie.o):E.u");
    }
}
