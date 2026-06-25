package C;

import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5009b;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: C.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1133d {

    /* JADX INFO: renamed from: C.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ I0.B f2120a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5096o f2121b;

        /* JADX INFO: renamed from: C.d$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0027a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5096o f2122a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1135f f2123b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0027a(InterfaceC5096o interfaceC5096o, C1135f c1135f) {
                super(2);
                this.f2122a = interfaceC5096o;
                this.f2123b = c1135f;
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
                    AbstractC2454w.U(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f2122a.invoke(this.f2123b, interfaceC2425m, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I0.B b10, InterfaceC5096o interfaceC5096o) {
            super(2);
            this.f2120a = b10;
            this.f2121b = interfaceC5096o;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m1invoke0kLqBqw((I0.P) obj, ((C5009b) obj2).r());
        }

        /* JADX INFO: renamed from: invoke-0kLqBqw */
        public final I0.C m1invoke0kLqBqw(I0.P p10, long j10) {
            return this.f2120a.mo0measure3p2s80s(p10, p10.M(Td.L.f17438a, g0.i.b(-1945019079, true, new C0027a(this.f2121b, new C1135f(p10, j10, null)))), j10);
        }
    }

    /* JADX INFO: renamed from: C.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f2124a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l0.e f2125b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f2126c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5096o f2127d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f2128e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f2129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, l0.e eVar2, boolean z10, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f2124a = eVar;
            this.f2125b = eVar2;
            this.f2126c = z10;
            this.f2127d = interfaceC5096o;
            this.f2128e = i10;
            this.f2129f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1133d.a(this.f2124a, this.f2125b, this.f2126c, this.f2127d, interfaceC2425m, AbstractC2409g1.a(this.f2128e | 1), this.f2129f);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, l0.e eVar2, boolean z10, InterfaceC5096o interfaceC5096o, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(eVar2) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.a(z10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5096o) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (i14 != 0) {
                eVar2 = l0.e.f52304a.o();
            }
            if (i15 != 0) {
                z10 = false;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1781813501, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            I0.B bH = androidx.compose.foundation.layout.f.h(eVar2, z10);
            boolean zU = ((i12 & 7168) == 2048) | interfaceC2425mG.U(bH);
            Object objD = interfaceC2425mG.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(bH, interfaceC5096o);
                interfaceC2425mG.u(objD);
            }
            androidx.compose.ui.layout.B.a(eVar, (Function2) objD, interfaceC2425mG, i12 & 14, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        androidx.compose.ui.e eVar3 = eVar;
        l0.e eVar4 = eVar2;
        boolean z11 = z10;
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(eVar3, eVar4, z11, interfaceC5096o, i10, i11));
        }
    }
}
