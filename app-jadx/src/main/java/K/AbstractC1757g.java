package K;

import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import y.AbstractC7179a;
import y.AbstractC7188j;
import y.C7187i;

/* JADX INFO: renamed from: K.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1757g {

    /* JADX INFO: renamed from: K.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7187i f10040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7187i c7187i) {
            super(0);
            this.f10040a = c7187i;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m13invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m13invoke() {
            AbstractC7188j.a(this.f10040a);
        }
    }

    /* JADX INFO: renamed from: K.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q.F f10041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f10042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Q.F f10, Function2 function2, int i10) {
            super(2);
            this.f10041a = f10;
            this.f10042b = function2;
            this.f10043c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1757g.a(this.f10041a, this.f10042b, interfaceC2425m, AbstractC2409g1.a(this.f10043c | 1));
        }
    }

    public static final void a(Q.F f10, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        Function2 function22;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            function22 = function2;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = new C7187i(null, 1, null);
                interfaceC2425mG.u(objD);
            }
            C7187i c7187i = (C7187i) objD;
            Object objD2 = interfaceC2425mG.D();
            if (objD2 == aVar.a()) {
                objD2 = new a(c7187i);
                interfaceC2425mG.u(objD2);
            }
            function22 = function2;
            AbstractC7179a.b(c7187i, (InterfaceC5082a) objD2, Q.H.a(f10, c7187i), null, f10.E(), function22, interfaceC2425mG, ((i11 << 12) & 458752) | 54, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(f10, function22, i10));
        }
    }
}
