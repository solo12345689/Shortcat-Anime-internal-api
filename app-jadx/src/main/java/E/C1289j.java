package E;

import F.AbstractC1542m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: E.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1289j extends AbstractC1542m implements C {

    /* JADX INFO: renamed from: d */
    private static final b f3902d = new b(null);

    /* JADX INFO: renamed from: e */
    public static final int f3903e = 8;

    /* JADX INFO: renamed from: f */
    private static final Function2 f3904f = a.f3908a;

    /* JADX INFO: renamed from: a */
    private final H f3905a = new H(this);

    /* JADX INFO: renamed from: b */
    private final F.G f3906b = new F.G();

    /* JADX INFO: renamed from: c */
    private boolean f3907c;

    /* JADX INFO: renamed from: E.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final a f3908a = new a();

        a() {
            super(2);
        }

        public final long a(q qVar, int i10) {
            return G.a(1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C1282c.a(a((q) obj, ((Number) obj2).intValue()));
        }
    }

    /* JADX INFO: renamed from: E.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C1289j(Function1 function1) {
        function1.invoke(this);
    }

    @Override // E.C
    public void e(int i10, Function1 function1, Function2 function2, Function1 function12, ie.p pVar) {
        g().b(i10, new C1288i(function1, function2 == null ? f3904f : function2, function12, pVar));
        if (function2 != null) {
            this.f3907c = true;
        }
    }

    public final boolean j() {
        return this.f3907c;
    }

    @Override // F.AbstractC1542m
    /* JADX INFO: renamed from: k */
    public F.G g() {
        return this.f3906b;
    }

    public final H l() {
        return this.f3905a;
    }
}
