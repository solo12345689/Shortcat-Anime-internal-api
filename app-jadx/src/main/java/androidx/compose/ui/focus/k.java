package androidx.compose.ui.focus;

import a0.C2507c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.InterfaceC6067m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b */
    public static final a f26678b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final k f26679c = new k();

    /* JADX INFO: renamed from: d */
    private static final k f26680d = new k();

    /* JADX INFO: renamed from: e */
    private static final k f26681e = new k();

    /* JADX INFO: renamed from: a */
    private final C2507c f26682a = new C2507c(new InterfaceC6067m[16], 0);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return k.f26680d;
        }

        public final k b() {
            return k.f26679c;
        }

        public final k c() {
            return k.f26681e;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f26683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f26683a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.q(this.f26683a));
        }
    }

    public static /* synthetic */ boolean h(k kVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = d.f26651b.b();
        }
        return kVar.g(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0068, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(kotlin.jvm.functions.Function1 r18) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k.d(kotlin.jvm.functions.Function1):boolean");
    }

    public final C2507c e() {
        return this.f26682a;
    }

    public final /* synthetic */ void f() {
        g(d.f26651b.b());
    }

    public final boolean g(int i10) {
        return d(new b(i10));
    }
}
