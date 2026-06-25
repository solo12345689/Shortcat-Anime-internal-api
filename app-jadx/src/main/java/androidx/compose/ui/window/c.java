package androidx.compose.ui.window;

import I0.A;
import I0.B;
import I0.C;
import Td.L;
import Ud.AbstractC2279u;
import androidx.compose.ui.layout.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f27819a = new c();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27820a = new a();

        public a() {
            super(1);
        }

        public final void invoke(s.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.s f27821a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.s sVar) {
            super(1);
            this.f27821a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.W(aVar, this.f27821a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0483c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f27822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0483c(List list) {
            super(1);
            this.f27822a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            int iO = AbstractC2279u.o(this.f27822a);
            if (iO < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                s.a aVar2 = aVar;
                s.a.W(aVar2, (androidx.compose.ui.layout.s) this.f27822a.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == iO) {
                    return;
                }
                i10++;
                aVar = aVar2;
            }
        }
    }

    @Override // I0.B
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
        int size = list.size();
        if (size == 0) {
            return androidx.compose.ui.layout.l.u0(lVar, 0, 0, null, a.f27820a, 4, null);
        }
        if (size == 1) {
            androidx.compose.ui.layout.s sVarV0 = ((A) list.get(0)).v0(j10);
            return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new b(sVarV0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            androidx.compose.ui.layout.s sVarV02 = ((A) list.get(i10)).v0(j10);
            iMax = Math.max(iMax, sVarV02.W0());
            iMax2 = Math.max(iMax2, sVarV02.P0());
            arrayList.add(sVarV02);
        }
        return androidx.compose.ui.layout.l.u0(lVar, iMax, iMax2, null, new C0483c(arrayList), 4, null);
    }
}
