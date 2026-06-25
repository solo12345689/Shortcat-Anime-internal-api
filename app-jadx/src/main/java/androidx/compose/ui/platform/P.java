package androidx.compose.ui.platform;

import Gf.C1627p;
import Td.C2160k;
import a1.C2529W;
import ae.AbstractC2605b;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ie.InterfaceC5082a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC2709j1, Gf.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f27337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2529W f27338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Gf.O f27339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f27340d = l0.o.a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27341a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27343c;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27341a = obj;
            this.f27343c |= Integer.MIN_VALUE;
            return P.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2700g1 f27344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f27345b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ P f27346a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P p10) {
                super(0);
                this.f27346a = p10;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m82invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m82invoke() {
                Gf.P.d(this.f27346a.f27339c, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2700g1 interfaceC2700g1, P p10) {
            super(1);
            this.f27344a = interfaceC2700g1;
            this.f27345b = p10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0 invoke(Gf.O o10) {
            return new R0(this.f27344a, new a(this.f27345b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27349c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ R0 f27351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ P f27352b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(R0 r02, P p10) {
                super(1);
                this.f27351a = r02;
                this.f27352b = p10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Td.L.f17438a;
            }

            public final void invoke(Throwable th2) {
                this.f27351a.d();
                this.f27352b.f27338b.f();
            }
        }

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R0 r02, Zd.e eVar) {
            return ((c) create(r02, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = P.this.new c(eVar);
            cVar.f27349c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f27348b;
            if (i10 == 0) {
                Td.v.b(obj);
                R0 r02 = (R0) this.f27349c;
                P p10 = P.this;
                this.f27349c = r02;
                this.f27347a = p10;
                this.f27348b = 1;
                C1627p c1627p = new C1627p(AbstractC2605b.c(this), 1);
                c1627p.C();
                p10.f27338b.e();
                c1627p.p(new a(r02, p10));
                Object objV = c1627p.v();
                if (objV == AbstractC2605b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objV == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            throw new C2160k();
        }
    }

    public P(View view, C2529W c2529w, Gf.O o10) {
        this.f27337a = view;
        this.f27338b = c2529w;
        this.f27339c = o10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2709j1
    public View a() {
        return this.f27337a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.InterfaceC2709j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(androidx.compose.ui.platform.InterfaceC2700g1 r6, Zd.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.P.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.P$a r0 = (androidx.compose.ui.platform.P.a) r0
            int r1 = r0.f27343c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27343c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.P$a r0 = new androidx.compose.ui.platform.P$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27341a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f27343c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            Td.v.b(r7)
            goto L4a
        L31:
            Td.v.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f27340d
            androidx.compose.ui.platform.P$b r2 = new androidx.compose.ui.platform.P$b
            r2.<init>(r6, r5)
            androidx.compose.ui.platform.P$c r6 = new androidx.compose.ui.platform.P$c
            r4 = 0
            r6.<init>(r4)
            r0.f27343c = r3
            java.lang.Object r6 = l0.o.d(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            Td.k r6 = new Td.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.P.b(androidx.compose.ui.platform.g1, Zd.e):java.lang.Object");
    }

    public final InputConnection e(EditorInfo editorInfo) {
        R0 r02 = (R0) l0.o.c(this.f27340d);
        if (r02 != null) {
            return r02.c(editorInfo);
        }
        return null;
    }

    public final boolean f() {
        R0 r02 = (R0) l0.o.c(this.f27340d);
        return r02 != null && r02.e();
    }

    @Override // Gf.O
    public Zd.i getCoroutineContext() {
        return this.f27339c.getCoroutineContext();
    }
}
