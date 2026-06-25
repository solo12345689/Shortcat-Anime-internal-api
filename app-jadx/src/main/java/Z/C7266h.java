package z;

import Gf.AbstractC1613i;
import Gf.O;
import Td.L;
import ae.AbstractC2605b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import w.AbstractC6908l;
import w.C6902h;
import w.C6907k;
import w.InterfaceC6921z;
import w.m0;

/* JADX INFO: renamed from: z.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7266h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC6921z f65332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.k f65333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65334c;

    /* JADX INFO: renamed from: z.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f65335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f65336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f65337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f65338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7266h f65339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u f65340f;

        /* JADX INFO: renamed from: z.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0990a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f65341a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f65342b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f65343c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C7266h f65344d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0990a(K k10, u uVar, K k11, C7266h c7266h) {
                super(1);
                this.f65341a = k10;
                this.f65342b = uVar;
                this.f65343c = k11;
                this.f65344d = c7266h;
            }

            public final void a(C6902h c6902h) {
                float fFloatValue = ((Number) c6902h.e()).floatValue() - this.f65341a.f52256a;
                float fA = this.f65342b.a(fFloatValue);
                this.f65341a.f52256a = ((Number) c6902h.e()).floatValue();
                this.f65343c.f52256a = ((Number) c6902h.f()).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    c6902h.a();
                }
                C7266h c7266h = this.f65344d;
                c7266h.g(c7266h.e() + 1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C6902h) obj);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, C7266h c7266h, u uVar, Zd.e eVar) {
            super(2, eVar);
            this.f65338d = f10;
            this.f65339e = c7266h;
            this.f65340f = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f65338d, this.f65339e, this.f65340f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float f10;
            C6907k c6907k;
            K k10;
            InterfaceC6921z interfaceC6921zD;
            C0990a c0990a;
            Object objF = AbstractC2605b.f();
            int i10 = this.f65337c;
            if (i10 == 0) {
                Td.v.b(obj);
                if (Math.abs(this.f65338d) > 1.0f) {
                    K k11 = new K();
                    k11.f52256a = this.f65338d;
                    K k12 = new K();
                    C6907k c6907kC = AbstractC6908l.c(0.0f, this.f65338d, 0L, 0L, false, 28, null);
                    try {
                        interfaceC6921zD = this.f65339e.d();
                        c0990a = new C0990a(k12, this.f65340f, k11, this.f65339e);
                        this.f65335a = k11;
                        this.f65336b = c6907kC;
                        this.f65337c = 1;
                        c6907k = c6907kC;
                    } catch (CancellationException unused) {
                        c6907k = c6907kC;
                    }
                    try {
                    } catch (CancellationException unused2) {
                        k10 = k11;
                        k10.f52256a = ((Number) c6907k.p()).floatValue();
                    }
                    if (m0.h(c6907k, interfaceC6921zD, false, c0990a, this, 2, null) == objF) {
                        return objF;
                    }
                    k10 = k11;
                    f10 = k10.f52256a;
                } else {
                    f10 = this.f65338d;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6907k = (C6907k) this.f65336b;
                k10 = (K) this.f65335a;
                try {
                    Td.v.b(obj);
                } catch (CancellationException unused3) {
                    k10.f52256a = ((Number) c6907k.p()).floatValue();
                }
                f10 = k10.f52256a;
            }
            return kotlin.coroutines.jvm.internal.b.c(f10);
        }
    }

    public C7266h(InterfaceC6921z interfaceC6921z, l0.k kVar) {
        this.f65332a = interfaceC6921z;
        this.f65333b = kVar;
    }

    @Override // z.n
    public Object a(u uVar, float f10, Zd.e eVar) {
        this.f65334c = 0;
        return AbstractC1613i.g(this.f65333b, new a(f10, this, uVar, null), eVar);
    }

    public final InterfaceC6921z d() {
        return this.f65332a;
    }

    public final int e() {
        return this.f65334c;
    }

    public final void f(InterfaceC6921z interfaceC6921z) {
        this.f65332a = interfaceC6921z;
    }

    public final void g(int i10) {
        this.f65334c = i10;
    }

    public /* synthetic */ C7266h(InterfaceC6921z interfaceC6921z, l0.k kVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6921z, (i10 & 2) != 0 ? androidx.compose.foundation.gestures.d.e() : kVar);
    }
}
