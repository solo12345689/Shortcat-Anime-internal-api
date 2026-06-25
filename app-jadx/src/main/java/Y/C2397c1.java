package Y;

import Td.C2160k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y.c1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2397c1 {

    /* JADX INFO: renamed from: i */
    public static final int f22274i = 8;

    /* JADX INFO: renamed from: a */
    private final D f22275a;

    /* JADX INFO: renamed from: b */
    private final boolean f22276b;

    /* JADX INFO: renamed from: c */
    private final T1 f22277c;

    /* JADX INFO: renamed from: d */
    private final C0 f22278d;

    /* JADX INFO: renamed from: e */
    private final Function1 f22279e;

    /* JADX INFO: renamed from: f */
    private final boolean f22280f;

    /* JADX INFO: renamed from: g */
    private final Object f22281g;

    /* JADX INFO: renamed from: h */
    private boolean f22282h = true;

    public C2397c1(D d10, Object obj, boolean z10, T1 t12, C0 c02, Function1 function1, boolean z11) {
        this.f22275a = d10;
        this.f22276b = z10;
        this.f22277c = t12;
        this.f22278d = c02;
        this.f22279e = function1;
        this.f22280f = z11;
        this.f22281g = obj;
    }

    public final boolean a() {
        return this.f22282h;
    }

    public final D b() {
        return this.f22275a;
    }

    public final Function1 c() {
        return this.f22279e;
    }

    public final Object d() {
        if (this.f22276b) {
            return null;
        }
        C0 c02 = this.f22278d;
        if (c02 != null) {
            return c02.getValue();
        }
        Object obj = this.f22281g;
        if (obj != null) {
            return obj;
        }
        AbstractC2454w.u("Unexpected form of a provided value");
        throw new C2160k();
    }

    public final T1 e() {
        return this.f22277c;
    }

    public final C0 f() {
        return this.f22278d;
    }

    public final Object g() {
        return this.f22281g;
    }

    public final C2397c1 h() {
        this.f22282h = false;
        return this;
    }

    public final boolean i() {
        return this.f22280f;
    }

    public final boolean j() {
        return (this.f22276b || g() != null) && !this.f22280f;
    }
}
