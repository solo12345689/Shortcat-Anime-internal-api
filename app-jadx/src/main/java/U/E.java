package U;

import Y.AbstractC2394b1;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f17599a = Y.H.j(a.f17600a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f17600a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o0 f17601a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f17602b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, Function2 function2) {
            super(2);
            this.f17601a = o0Var;
            this.f17602b = function2;
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
                AbstractC2454w.U(-1066563262, i10, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
            }
            j0.a(this.f17601a.b(), this.f17602b, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2175l f17603a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ U f17604b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ o0 f17605c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f17606d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f17607e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f17608f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2175l c2175l, U u10, o0 o0Var, Function2 function2, int i10, int i11) {
            super(2);
            this.f17603a = c2175l;
            this.f17604b = u10;
            this.f17605c = o0Var;
            this.f17606d = function2;
            this.f17607e = i10;
            this.f17608f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            E.a(this.f17603a, this.f17604b, this.f17605c, this.f17606d, interfaceC2425m, AbstractC2409g1.a(this.f17607e | 1), this.f17608f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(U.C2175l r18, U.U r19, U.o0 r20, kotlin.jvm.functions.Function2 r21, Y.InterfaceC2425m r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.E.a(U.l, U.U, U.o0, kotlin.jvm.functions.Function2, Y.m, int, int):void");
    }

    public static final Q.J b(C2175l c2175l, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1866455512, i10, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)");
        }
        long jC = c2175l.C();
        boolean zD = interfaceC2425m.d(jC);
        Object objD = interfaceC2425m.D();
        if (zD || objD == InterfaceC2425m.f22370a.a()) {
            Q.J j10 = new Q.J(jC, C6385r0.q(jC, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            interfaceC2425m.u(j10);
            objD = j10;
        }
        Q.J j11 = (Q.J) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return j11;
    }
}
