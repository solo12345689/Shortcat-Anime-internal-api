package U;

import K0.InterfaceC1788g;
import R0.C2096e;
import Ud.AbstractC2279u;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2400d1;
import Y.InterfaceC2425m;
import Y.h2;
import Y.m2;
import ae.AbstractC2605b;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.InterfaceC2704i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import k1.AbstractC5436a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6338a1;
import s0.t1;
import w.AbstractC6877F;
import w.AbstractC6890b;
import w.AbstractC6906j;
import w.C6888a;
import w.InterfaceC6904i;
import w.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ W f17898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f17899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2186x f17901d;

        /* JADX INFO: renamed from: U.Z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0306a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ W f17902a;

            /* JADX INFO: renamed from: U.Z$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0307a extends AbstractC5506u implements InterfaceC5082a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ W f17903a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0307a(W w10) {
                    super(0);
                    this.f17903a = w10;
                }

                @Override // ie.InterfaceC5082a
                public final Boolean invoke() {
                    this.f17903a.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0306a(W w10) {
                super(1);
                this.f17902a = w10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((R0.C) obj);
                return Td.L.f17438a;
            }

            public final void invoke(R0.C c10) {
                R0.A.Z(c10, C2096e.f14950b.b());
                R0.A.j(c10, null, new C0307a(this.f17902a), 1, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ W f17904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2186x f17905b;

            /* JADX INFO: renamed from: U.Z$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0308a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ W f17906a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0308a(W w10) {
                    super(1);
                    this.f17906a = w10;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(C2185w c2185w) {
                    return Boolean.valueOf(AbstractC5504s.c(c2185w.c(), this.f17906a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(W w10, C2186x c2186x) {
                super(0);
                this.f17904a = w10;
                this.f17905b = c2186x;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m44invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m44invoke() {
                if (AbstractC5504s.c(this.f17904a, this.f17905b.a())) {
                    return;
                }
                AbstractC2279u.K(this.f17905b.b(), new C0308a(this.f17904a));
                InterfaceC2400d1 interfaceC2400d1C = this.f17905b.c();
                if (interfaceC2400d1C != null) {
                    interfaceC2400d1C.invalidate();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W w10, W w11, List list, C2186x c2186x) {
            super(3);
            this.f17898a = w10;
            this.f17899b = w11;
            this.f17900c = list;
            this.f17901d = c2186x;
        }

        public final void a(Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC2425m.F(function2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1654683077, i11, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            boolean zC = AbstractC5504s.c(this.f17898a, this.f17899b);
            int i12 = zC ? 150 : 75;
            int i13 = (!zC || AbstractC5436a.b(this.f17900c).size() == 1) ? 0 : 75;
            r0 r0VarI = AbstractC6906j.i(i12, i13, AbstractC6877F.e());
            boolean zU = interfaceC2425m.U(this.f17898a) | interfaceC2425m.F(this.f17901d);
            W w10 = this.f17898a;
            C2186x c2186x = this.f17901d;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new b(w10, c2186x);
                interfaceC2425m.u(objD);
            }
            h2 h2VarF = Z.f(r0VarI, zC, (InterfaceC5082a) objD, interfaceC2425m, 0, 0);
            h2 h2VarG = Z.g(AbstractC6906j.i(i12, i13, AbstractC6877F.d()), zC, interfaceC2425m, 0);
            androidx.compose.ui.e eVarB = androidx.compose.ui.graphics.f.b(androidx.compose.ui.e.f26613a, (131067 & 1) != 0 ? 1.0f : ((Number) h2VarG.getValue()).floatValue(), (131067 & 2) != 0 ? 1.0f : ((Number) h2VarG.getValue()).floatValue(), (131067 & 4) == 0 ? ((Number) h2VarF.getValue()).floatValue() : 1.0f, (131067 & 8) != 0 ? 0.0f : 0.0f, (131067 & 16) != 0 ? 0.0f : 0.0f, (131067 & 32) != 0 ? 0.0f : 0.0f, (131067 & 64) != 0 ? 0.0f : 0.0f, (131067 & 128) != 0 ? 0.0f : 0.0f, (131067 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0 ? 0.0f : 0.0f, (131067 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 8.0f : 0.0f, (131067 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? androidx.compose.ui.graphics.j.f26818b.a() : 0L, (131067 & 2048) != 0 ? t1.a() : null, (131067 & 4096) != 0 ? false : false, (131067 & 8192) != 0 ? null : null, (131067 & 16384) != 0 ? AbstractC6338a1.a() : 0L, (32768 & 131067) != 0 ? AbstractC6338a1.a() : 0L, (131067 & 65536) != 0 ? androidx.compose.ui.graphics.e.f26765b.a() : 0);
            boolean zU2 = interfaceC2425m.U(this.f17898a);
            W w11 = this.f17898a;
            Object objD2 = interfaceC2425m.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new C0306a(w11);
                interfaceC2425m.u(objD2);
            }
            androidx.compose.ui.e eVarF = R0.r.f(eVarB, false, (Function1) objD2, 1, null);
            I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            Y.I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF2 = androidx.compose.ui.c.f(interfaceC2425m, eVarF);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
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
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF2, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            function2.invoke(interfaceC2425m, Integer.valueOf(i11 & 14));
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Function2) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f17907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f17908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5096o interfaceC5096o, W w10) {
            super(2);
            this.f17907a = interfaceC5096o;
            this.f17908b = w10;
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
                AbstractC2454w.U(-1135367807, i10, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
            }
            InterfaceC5096o interfaceC5096o = this.f17907a;
            W w10 = this.f17908b;
            AbstractC5504s.e(w10);
            interfaceC5096o.invoke(w10, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ W f17909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f17910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f17911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17913e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(W w10, androidx.compose.ui.e eVar, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f17909a = w10;
            this.f17910b = eVar;
            this.f17911c = interfaceC5096o;
            this.f17912d = i10;
            this.f17913e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Z.a(this.f17909a, this.f17910b, this.f17911c, interfaceC2425m, AbstractC2409g1.a(this.f17912d | 1), this.f17913e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f17915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2704i f17916c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(W w10, InterfaceC2704i interfaceC2704i, Zd.e eVar) {
            super(2, eVar);
            this.f17915b = w10;
            this.f17916c = interfaceC2704i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new d(this.f17915b, this.f17916c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f17914a;
            if (i10 == 0) {
                Td.v.b(obj);
                W w10 = this.f17915b;
                if (w10 != null) {
                    long jH = Z.h(w10.a().getDuration(), this.f17915b.a().a() != null, this.f17916c);
                    this.f17914a = 1;
                    if (Gf.Z.a(jH, this) == objF) {
                        return objF;
                    }
                }
                return Td.L.f17438a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            this.f17915b.dismiss();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f17917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f17918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f17919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17921e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a0 a0Var, androidx.compose.ui.e eVar, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f17917a = a0Var;
            this.f17918b = eVar;
            this.f17919c = interfaceC5096o;
            this.f17920d = i10;
            this.f17921e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Z.b(this.f17917a, this.f17918b, this.f17919c, interfaceC2425m, AbstractC2409g1.a(this.f17920d | 1), this.f17921e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17922a;

        static {
            int[] iArr = new int[Y.values().length];
            try {
                iArr[Y.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Y.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17922a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f17923a = new g();

        g() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m45invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m45invoke() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6888a f17925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6904i f17927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f17928e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C6888a c6888a, boolean z10, InterfaceC6904i interfaceC6904i, InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            super(2, eVar);
            this.f17925b = c6888a;
            this.f17926c = z10;
            this.f17927d = interfaceC6904i;
            this.f17928e = interfaceC5082a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new h(this.f17925b, this.f17926c, this.f17927d, this.f17928e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h hVar;
            Object objF = AbstractC2605b.f();
            int i10 = this.f17924a;
            if (i10 == 0) {
                Td.v.b(obj);
                C6888a c6888a = this.f17925b;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.f17926c ? 1.0f : 0.0f);
                InterfaceC6904i interfaceC6904i = this.f17927d;
                this.f17924a = 1;
                hVar = this;
                if (C6888a.f(c6888a, fC, interfaceC6904i, null, null, hVar, 12, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                hVar = this;
            }
            hVar.f17928e.invoke();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6888a f17930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6904i f17932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C6888a c6888a, boolean z10, InterfaceC6904i interfaceC6904i, Zd.e eVar) {
            super(2, eVar);
            this.f17930b = c6888a;
            this.f17931c = z10;
            this.f17932d = interfaceC6904i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new i(this.f17930b, this.f17931c, this.f17932d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f17929a;
            if (i10 == 0) {
                Td.v.b(obj);
                C6888a c6888a = this.f17930b;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.f17931c ? 1.0f : 0.8f);
                InterfaceC6904i interfaceC6904i = this.f17932d;
                this.f17929a = 1;
                if (C6888a.f(c6888a, fC, interfaceC6904i, null, null, this, 12, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4 A[LOOP:2: B:73:0x01a2->B:74:0x01a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(U.W r16, androidx.compose.ui.e r17, ie.InterfaceC5096o r18, Y.InterfaceC2425m r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.Z.a(U.W, androidx.compose.ui.e, ie.o, Y.m, int, int):void");
    }

    public static final void b(a0 a0Var, androidx.compose.ui.e eVar, InterfaceC5096o interfaceC5096o, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        androidx.compose.ui.e eVar2;
        InterfaceC5096o interfaceC5096o2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(464178177);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5096o) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            eVar2 = eVar;
            interfaceC5096o2 = interfaceC5096o;
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (i14 != 0) {
                interfaceC5096o = C2180q.f18645a.a();
            }
            InterfaceC5096o interfaceC5096o3 = interfaceC5096o;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(464178177, i12, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            W wB = a0Var.b();
            InterfaceC2704i interfaceC2704i = (InterfaceC2704i) interfaceC2425mG.n(AbstractC2739w0.c());
            boolean zU = interfaceC2425mG.U(wB) | interfaceC2425mG.F(interfaceC2704i);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new d(wB, interfaceC2704i, null);
                interfaceC2425mG.u(objD);
            }
            AbstractC2393b0.e(wB, (Function2) objD, interfaceC2425mG, 0);
            androidx.compose.ui.e eVar3 = eVar;
            a(a0Var.b(), eVar3, interfaceC5096o3, interfaceC2425mG, i12 & 1008, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            eVar2 = eVar3;
            interfaceC5096o2 = interfaceC5096o3;
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new e(a0Var, eVar2, interfaceC5096o2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 f(InterfaceC6904i interfaceC6904i, boolean z10, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 4) != 0) {
            interfaceC5082a = g.f17923a;
        }
        InterfaceC5082a interfaceC5082a2 = interfaceC5082a;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1431889134, i10, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = AbstractC6890b.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            interfaceC2425m.u(objD);
        }
        C6888a c6888a = (C6888a) objD;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zF = interfaceC2425m.F(c6888a) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.a(z10)) || (i10 & 48) == 32) | interfaceC2425m.F(interfaceC6904i) | ((((i10 & 896) ^ 384) > 256 && interfaceC2425m.U(interfaceC5082a2)) || (i10 & 384) == 256);
        Object objD2 = interfaceC2425m.D();
        if (zF || objD2 == aVar.a()) {
            Object hVar = new h(c6888a, z10, interfaceC6904i, interfaceC5082a2, null);
            interfaceC2425m.u(hVar);
            objD2 = hVar;
        }
        AbstractC2393b0.e(boolValueOf, (Function2) objD2, interfaceC2425m, (i10 >> 3) & 14);
        h2 h2VarG = c6888a.g();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 g(InterfaceC6904i interfaceC6904i, boolean z10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1966809761, i10, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = AbstractC6890b.b(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            interfaceC2425m.u(objD);
        }
        C6888a c6888a = (C6888a) objD;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zF = interfaceC2425m.F(c6888a) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.a(z10)) || (i10 & 48) == 32) | interfaceC2425m.F(interfaceC6904i);
        Object objD2 = interfaceC2425m.D();
        if (zF || objD2 == aVar.a()) {
            objD2 = new i(c6888a, z10, interfaceC6904i, null);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.e(boolValueOf, (Function2) objD2, interfaceC2425m, (i10 >> 3) & 14);
        h2 h2VarG = c6888a.g();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarG;
    }

    public static final long h(Y y10, boolean z10, InterfaceC2704i interfaceC2704i) {
        long j10;
        int i10 = f.f17922a[y10.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new Td.r();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return interfaceC2704i == null ? j11 : interfaceC2704i.a(j11, true, true, z10);
    }
}
