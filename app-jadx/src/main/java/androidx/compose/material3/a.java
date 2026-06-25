package androidx.compose.material3;

import T.l;
import U.M;
import Y.AbstractC2394b1;
import Y.AbstractC2454w;
import Y.H;
import Y.InterfaceC2425m;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import x.InterfaceC6987G;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f26558a = H.j(b.f26563a);

    /* JADX INFO: renamed from: b */
    private static final AbstractC2394b1 f26559b = H.h(null, C0462a.f26562a, 1, null);

    /* JADX INFO: renamed from: c */
    private static final androidx.compose.material3.b f26560c;

    /* JADX INFO: renamed from: d */
    private static final androidx.compose.material3.b f26561d;

    /* JADX INFO: renamed from: androidx.compose.material3.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0462a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final C0462a f26562a = new C0462a();

        C0462a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final M invoke() {
            return new M(0L, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final b f26563a = new b();

        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        C5015h.a aVar = C5015h.f48547b;
        float fC = aVar.c();
        C6385r0.a aVar2 = C6385r0.f58985b;
        f26560c = new androidx.compose.material3.b(true, fC, aVar2.j(), (DefaultConstructorMarker) null);
        f26561d = new androidx.compose.material3.b(false, aVar.c(), aVar2.j(), (DefaultConstructorMarker) null);
    }

    public static final AbstractC2394b1 a() {
        return f26559b;
    }

    public static final InterfaceC6989I b(boolean z10, float f10, long j10) {
        return (C5015h.q(f10, C5015h.f48547b.c()) && C6385r0.s(j10, C6385r0.f58985b.j())) ? z10 ? f26560c : f26561d : new androidx.compose.material3.b(z10, f10, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InterfaceC6989I c(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = C5015h.f48547b.c();
        }
        if ((i10 & 4) != 0) {
            j10 = C6385r0.f58985b.j();
        }
        return b(z10, f10, j10);
    }

    public static final InterfaceC6987G d(boolean z10, float f10, long j10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        InterfaceC2425m interfaceC2425m2;
        InterfaceC6987G interfaceC6987GB;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            f10 = C5015h.f48547b.c();
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            j10 = C6385r0.f58985b.j();
        }
        long j11 = j10;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1315814667, i10, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        interfaceC2425m.V(-1280632857);
        if (((Boolean) interfaceC2425m.n(f26558a)).booleanValue()) {
            interfaceC2425m2 = interfaceC2425m;
            interfaceC6987GB = l.f(z11, f11, j11, interfaceC2425m2, i10 & 1022, 0);
        } else {
            interfaceC2425m2 = interfaceC2425m;
            interfaceC6987GB = b(z11, f11, j11);
        }
        interfaceC2425m2.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return interfaceC6987GB;
    }
}
