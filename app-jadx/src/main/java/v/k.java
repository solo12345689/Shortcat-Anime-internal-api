package v;

import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.h2;
import Y.m2;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5498l;
import w.InterfaceC6878G;
import w.o0;
import w.p0;
import w.s0;
import w.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f61644a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f61645b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6878G f61646c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f61647d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5096o f61648e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f61649f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f61650g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, androidx.compose.ui.e eVar, InterfaceC6878G interfaceC6878G, String str, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f61644a = obj;
            this.f61645b = eVar;
            this.f61646c = interfaceC6878G;
            this.f61647d = str;
            this.f61648e = interfaceC5096o;
            this.f61649f = i10;
            this.f61650g = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            k.a(this.f61644a, this.f61645b, this.f61646c, this.f61647d, this.f61648e, interfaceC2425m, AbstractC2409g1.a(this.f61649f | 1), this.f61650g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o0 f61652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var) {
            super(1);
            this.f61652a = o0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!AbstractC5504s.c(obj, this.f61652a.o()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o0 f61653a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC6878G f61654b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f61655c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5096o f61656d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ h2 f61657a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(1);
                this.f61657a = h2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.graphics.g) obj);
                return L.f17438a;
            }

            public final void invoke(androidx.compose.ui.graphics.g gVar) {
                gVar.e(d.b(this.f61657a));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC6878G f61658a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6878G interfaceC6878G) {
                super(3);
                this.f61658a = interfaceC6878G;
            }

            public final InterfaceC6878G a(o0.b bVar, InterfaceC2425m interfaceC2425m, int i10) {
                interfaceC2425m.V(438406499);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(438406499, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
                }
                InterfaceC6878G interfaceC6878G = this.f61658a;
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                interfaceC2425m.O();
                return interfaceC6878G;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a((o0.b) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o0 o0Var, InterfaceC6878G interfaceC6878G, Object obj, InterfaceC5096o interfaceC5096o) {
            super(2);
            this.f61653a = o0Var;
            this.f61654b = interfaceC6878G;
            this.f61655c = obj;
            this.f61656d = interfaceC5096o;
        }

        public static final float b(h2 h2Var) {
            return ((Number) h2Var.getValue()).floatValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1426421288, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            o0 o0Var = this.f61653a;
            b bVar = new b(this.f61654b);
            Object obj = this.f61655c;
            s0 s0VarF = u0.f(C5498l.f52289a);
            Object objH = o0Var.h();
            interfaceC2425m.V(-438678252);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f10 = AbstractC5504s.c(objH, obj) ? 1.0f : 0.0f;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            Float fValueOf = Float.valueOf(f10);
            Object objO = o0Var.o();
            interfaceC2425m.V(-438678252);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f11 = AbstractC5504s.c(objO, obj) ? 1.0f : 0.0f;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            h2 h2VarC = p0.c(o0Var, fValueOf, Float.valueOf(f11), (InterfaceC6878G) bVar.invoke(o0Var.m(), interfaceC2425m, 0), s0VarF, "FloatAnimation", interfaceC2425m, 0);
            e.a aVar = androidx.compose.ui.e.f26613a;
            boolean zU = interfaceC2425m.U(h2VarC);
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(h2VarC);
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.f.a(aVar, (Function1) objD);
            InterfaceC5096o interfaceC5096o = this.f61656d;
            Object obj2 = this.f61655c;
            I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarA);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            interfaceC5096o.invoke(obj2, interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o0 f61659a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f61660b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6878G f61661c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function1 f61662d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5096o f61663e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f61664f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f61665g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0 o0Var, androidx.compose.ui.e eVar, InterfaceC6878G interfaceC6878G, Function1 function1, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f61659a = o0Var;
            this.f61660b = eVar;
            this.f61661c = interfaceC6878G;
            this.f61662d = function1;
            this.f61663e = interfaceC5096o;
            this.f61664f = i10;
            this.f61665g = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            k.b(this.f61659a, this.f61660b, this.f61661c, this.f61662d, this.f61663e, interfaceC2425m, AbstractC2409g1.a(this.f61664f | 1), this.f61665g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r16, androidx.compose.ui.e r17, w.InterfaceC6878G r18, java.lang.String r19, ie.InterfaceC5096o r20, Y.InterfaceC2425m r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.a(java.lang.Object, androidx.compose.ui.e, w.G, java.lang.String, ie.o, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(w.o0 r16, androidx.compose.ui.e r17, w.InterfaceC6878G r18, kotlin.jvm.functions.Function1 r19, ie.InterfaceC5096o r20, Y.InterfaceC2425m r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.b(w.o0, androidx.compose.ui.e, w.G, kotlin.jvm.functions.Function1, ie.o, Y.m, int, int):void");
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f61651a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
