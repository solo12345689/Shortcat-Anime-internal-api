package androidx.compose.ui.layout;

import K0.J;
import Td.L;
import Y.AbstractC2460y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26871f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f26872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f26873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f26874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f26875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f26876e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {
        b() {
            super(2);
        }

        public final void a(J j10, AbstractC2460y abstractC2460y) {
            C.this.h().N(abstractC2460y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (AbstractC2460y) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {
        c() {
            super(2);
        }

        public final void a(J j10, Function2 function2) {
            j10.o(C.this.h().t(function2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Function2) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {
        d() {
            super(2);
        }

        public final void a(J j10, C c10) {
            C c11 = C.this;
            j jVarC0 = j10.C0();
            if (jVarC0 == null) {
                jVarC0 = new j(j10, C.this.f26872a);
                j10.c2(jVarC0);
            }
            c11.f26873b = jVarC0;
            C.this.h().E();
            C.this.h().O(C.this.f26872a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (C) obj2);
            return L.f17438a;
        }
    }

    public C(D d10) {
        this.f26872a = d10;
        this.f26874c = new d();
        this.f26875d = new b();
        this.f26876e = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j h() {
        j jVar = this.f26873b;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        h().B();
    }

    public final Function2 e() {
        return this.f26875d;
    }

    public final Function2 f() {
        return this.f26876e;
    }

    public final Function2 g() {
        return this.f26874c;
    }

    public final a i(Object obj, Function2 function2) {
        return h().J(obj, function2);
    }

    public C() {
        this(m.f26997a);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void dispose();

        default int g() {
            return 0;
        }

        default void a(Object obj, Function1 function1) {
        }

        default void b(int i10, long j10) {
        }
    }
}
