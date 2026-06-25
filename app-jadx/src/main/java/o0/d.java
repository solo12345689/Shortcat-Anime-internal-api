package o0;

import K0.AbstractC1796k;
import K0.D;
import K0.H0;
import K0.I0;
import K0.InterfaceC1794j;
import K0.J0;
import androidx.compose.ui.e;
import i1.C5025r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e.c implements I0, InterfaceC1794j, f, D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f54197g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54198h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function2 f54199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f54200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f54201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f54202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f54203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54204f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: o0.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0843a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0843a f54205a = new C0843a();

            private C0843a() {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.b f54206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f54207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f54208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0.b bVar, d dVar, J j10) {
            super(1);
            this.f54206a = bVar;
            this.f54207b = dVar;
            this.f54208c = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(d dVar) {
            if (!dVar.isAttached()) {
                return H0.f10421b;
            }
            if (!(dVar.f54203e == null)) {
                H0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            Function1 function1 = dVar.f54200b;
            dVar.f54203e = function1 != null ? (f) function1.invoke(this.f54206a) : null;
            boolean z10 = dVar.f54203e != null;
            if (z10) {
                this.f54207b.K1().b(dVar);
            }
            J j10 = this.f54208c;
            j10.f52255a = j10.f52255a || z10;
            return H0.f10420a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0.b f54209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0.b bVar) {
            super(1);
            this.f54209a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(d dVar) {
            if (!dVar.getNode().isAttached()) {
                return H0.f10421b;
            }
            f fVar = dVar.f54203e;
            if (fVar != null) {
                fVar.w0(this.f54209a);
            }
            dVar.f54203e = null;
            dVar.f54202d = null;
            return H0.f10420a;
        }
    }

    /* JADX INFO: renamed from: o0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0844d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f54210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f54211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0.b f54212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0844d(N n10, d dVar, o0.b bVar) {
            super(1);
            this.f54210a = n10;
            this.f54211b = dVar;
            this.f54212c = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(I0 i02) {
            d dVar = (d) i02;
            if (!this.f54211b.K1().a(dVar) || !e.d(dVar, h.a(this.f54212c))) {
                return H0.f10420a;
            }
            this.f54210a.f52259a = i02;
            return H0.f10422c;
        }
    }

    public /* synthetic */ d(Function2 function2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function2, (i10 & 2) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0.c K1() {
        return AbstractC1796k.o(this).getDragAndDropManager();
    }

    @Override // K0.I0
    public Object B() {
        return this.f54201c;
    }

    public boolean E1(o0.b bVar) {
        J j10 = new J();
        e.f(this, new b(bVar, this, j10));
        return j10.f52255a;
    }

    @Override // K0.D
    public void I(long j10) {
        this.f54204f = j10;
    }

    public final long L1() {
        return this.f54204f;
    }

    @Override // o0.f
    public boolean Q0(o0.b bVar) {
        d dVar = this.f54202d;
        if (dVar != null) {
            return dVar.Q0(bVar);
        }
        f fVar = this.f54203e;
        if (fVar != null) {
            return fVar.Q0(bVar);
        }
        return false;
    }

    @Override // o0.f
    public void U(o0.b bVar) {
        f fVar = this.f54203e;
        if (fVar != null) {
            fVar.U(bVar);
            return;
        }
        d dVar = this.f54202d;
        if (dVar != null) {
            dVar.U(bVar);
        }
    }

    @Override // o0.f
    public void X0(o0.b bVar) {
        f fVar = this.f54203e;
        if (fVar != null) {
            fVar.X0(bVar);
            return;
        }
        d dVar = this.f54202d;
        if (dVar != null) {
            dVar.X0(bVar);
        }
    }

    @Override // o0.f
    public void c0(o0.b bVar) {
        f fVar = this.f54203e;
        if (fVar != null) {
            fVar.c0(bVar);
        }
        d dVar = this.f54202d;
        if (dVar != null) {
            dVar.c0(bVar);
        }
        this.f54202d = null;
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        this.f54203e = null;
        this.f54202d = null;
    }

    @Override // o0.f
    public void v0(o0.b bVar) {
        I0 i02;
        d dVar;
        d dVar2 = this.f54202d;
        if (dVar2 == null || !e.d(dVar2, h.a(bVar))) {
            if (getNode().isAttached()) {
                N n10 = new N();
                J0.f(this, new C0844d(n10, this, bVar));
                i02 = (I0) n10.f52259a;
            } else {
                i02 = null;
            }
            dVar = (d) i02;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            e.e(dVar, bVar);
            f fVar = this.f54203e;
            if (fVar != null) {
                fVar.c0(bVar);
            }
        } else if (dVar == null && dVar2 != null) {
            f fVar2 = this.f54203e;
            if (fVar2 != null) {
                e.e(fVar2, bVar);
            }
            dVar2.c0(bVar);
        } else if (!AbstractC5504s.c(dVar, dVar2)) {
            if (dVar != null) {
                e.e(dVar, bVar);
            }
            if (dVar2 != null) {
                dVar2.c0(bVar);
            }
        } else if (dVar != null) {
            dVar.v0(bVar);
        } else {
            f fVar3 = this.f54203e;
            if (fVar3 != null) {
                fVar3.v0(bVar);
            }
        }
        this.f54202d = dVar;
    }

    @Override // o0.f
    public void w0(o0.b bVar) {
        e.f(this, new c(bVar));
    }

    public d(Function2 function2, Function1 function1) {
        this.f54199a = function2;
        this.f54200b = function1;
        this.f54201c = a.C0843a.f54205a;
        this.f54204f = C5025r.f48570b.a();
    }
}
