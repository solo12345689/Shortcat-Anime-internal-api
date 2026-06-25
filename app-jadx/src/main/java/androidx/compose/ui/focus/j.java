package androidx.compose.ui.focus;

import Td.L;
import androidx.compose.ui.focus.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6057c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26665a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f26666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f26667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f26668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f26669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f26670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f26671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f26672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f26673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Function1 f26674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Function1 f26675k;

    public j() {
        k.a aVar = k.f26678b;
        this.f26666b = aVar.b();
        this.f26667c = aVar.b();
        this.f26668d = aVar.b();
        this.f26669e = aVar.b();
        this.f26670f = aVar.b();
        this.f26671g = aVar.b();
        this.f26672h = aVar.b();
        this.f26673i = aVar.b();
        this.f26674j = a.f26676a;
        this.f26675k = b.f26677a;
    }

    @Override // androidx.compose.ui.focus.i
    public k a() {
        return this.f26670f;
    }

    @Override // androidx.compose.ui.focus.i
    public k b() {
        return this.f26672h;
    }

    @Override // androidx.compose.ui.focus.i
    public k c() {
        return this.f26671g;
    }

    @Override // androidx.compose.ui.focus.i
    public k d() {
        return this.f26668d;
    }

    @Override // androidx.compose.ui.focus.i
    public k e() {
        return this.f26673i;
    }

    @Override // androidx.compose.ui.focus.i
    public k f() {
        return this.f26669e;
    }

    @Override // androidx.compose.ui.focus.i
    public void g(boolean z10) {
        this.f26665a = z10;
    }

    @Override // androidx.compose.ui.focus.i
    public void h(Function1 function1) {
        this.f26674j = function1;
    }

    @Override // androidx.compose.ui.focus.i
    public boolean i() {
        return this.f26665a;
    }

    @Override // androidx.compose.ui.focus.i
    public k j() {
        return this.f26667c;
    }

    @Override // androidx.compose.ui.focus.i
    public Function1 k() {
        return this.f26674j;
    }

    @Override // androidx.compose.ui.focus.i
    public k l() {
        return this.f26666b;
    }

    @Override // androidx.compose.ui.focus.i
    public Function1 m() {
        return this.f26675k;
    }

    @Override // androidx.compose.ui.focus.i
    public void n(Function1 function1) {
        this.f26675k = function1;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26676a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6057c) obj);
            return L.f17438a;
        }

        public final void a(InterfaceC6057c interfaceC6057c) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26677a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6057c) obj);
            return L.f17438a;
        }

        public final void a(InterfaceC6057c interfaceC6057c) {
        }
    }
}
