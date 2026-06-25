package Y0;

import Y.h2;
import Y0.AbstractC2485u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2489y implements AbstractC2485u.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U f22736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f22737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0 f22738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D f22739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f22740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f22741f;

    public C2489y(U u10, Z z10, s0 s0Var, D d10, T t10) {
        this.f22736a = u10;
        this.f22737b = z10;
        this.f22738c = s0Var;
        this.f22739d = d10;
        this.f22740e = t10;
        this.f22741f = new Function1() { // from class: Y0.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2489y.e(this.f22733a, (q0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(C2489y c2489y, q0 q0Var) {
        return c2489y.f(q0.b(q0Var, null, null, 0, 0, null, 30, null)).getValue();
    }

    private final h2 f(final q0 q0Var) {
        return this.f22738c.b(q0Var, new Function1() { // from class: Y0.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2489y.g(this.f22734a, q0Var, (Function1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 g(C2489y c2489y, q0 q0Var, Function1 function1) {
        t0 t0VarA = c2489y.f22739d.a(q0Var, c2489y.f22736a, function1, c2489y.f22741f);
        if (t0VarA != null) {
            return t0VarA;
        }
        t0 t0VarA2 = c2489y.f22740e.a(q0Var, c2489y.f22736a, function1, c2489y.f22741f);
        if (t0VarA2 != null) {
            return t0VarA2;
        }
        throw new IllegalStateException("Could not load font");
    }

    @Override // Y0.AbstractC2485u.b
    public h2 b(AbstractC2485u abstractC2485u, L l10, int i10, int i11) {
        return f(new q0(this.f22737b.b(abstractC2485u), this.f22737b.c(l10), this.f22737b.a(i10), this.f22737b.d(i11), this.f22736a.a(), null));
    }

    public /* synthetic */ C2489y(U u10, Z z10, s0 s0Var, D d10, T t10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(u10, (i10 & 2) != 0 ? Z.f22642a.a() : z10, (i10 & 4) != 0 ? AbstractC2490z.b() : s0Var, (i10 & 8) != 0 ? new D(AbstractC2490z.a(), null, 2, 0 == true ? 1 : 0) : d10, (i10 & 16) != 0 ? new T() : t10);
    }
}
