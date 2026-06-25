package Y;

import a0.C2506b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6546L;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6550P f22103a = C2506b.e(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6550P f22104b = C2506b.e(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(C2461y0 c2461y0, F0 f02) {
        return AbstractC5504s.c(f02.a(), c2461y0);
    }

    public final void b() {
        C2506b.c(this.f22103a);
        C2506b.c(this.f22104b);
    }

    public final boolean c(AbstractC2455w0 abstractC2455w0) {
        return C2506b.f(this.f22103a, abstractC2455w0);
    }

    public final F0 d(AbstractC2455w0 abstractC2455w0) {
        F0 f02 = (F0) C2506b.l(this.f22103a, abstractC2455w0);
        if (C2506b.i(this.f22103a)) {
            C2506b.c(this.f22104b);
        }
        return f02;
    }

    public final void e(final C2461y0 c2461y0) {
        Object objE = this.f22104b.e(c2461y0);
        if (objE != null) {
            if (!(objE instanceof C6546L)) {
                AbstractC5504s.f(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                android.support.v4.media.session.b.a(objE);
                C2506b.m(this.f22103a, null, new Function1() { // from class: Y.D0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(E0.f(c2461y0, (F0) obj));
                    }
                });
                return;
            }
            t.V v10 = (t.V) objE;
            Object[] objArr = v10.f60006a;
            int i10 = v10.f60007b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                AbstractC5504s.f(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                android.support.v4.media.session.b.a(obj);
                C2506b.m(this.f22103a, null, new Function1() { // from class: Y.D0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(E0.f(c2461y0, (F0) obj2));
                    }
                });
            }
        }
    }
}
