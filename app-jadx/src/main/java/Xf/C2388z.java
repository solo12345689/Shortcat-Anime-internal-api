package Xf;

import Vf.C2352v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2388z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2352v f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22013b;

    /* JADX INFO: renamed from: Xf.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function2 {
        a(Object obj) {
            super(2, obj, C2388z.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return j((Tf.e) obj, ((Number) obj2).intValue());
        }

        public final Boolean j(Tf.e p02, int i10) {
            AbstractC5504s.h(p02, "p0");
            return Boolean.valueOf(((C2388z) this.receiver).e(p02, i10));
        }
    }

    public C2388z(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        this.f22012a = new C2352v(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(Tf.e eVar, int i10) {
        boolean z10 = !eVar.p(i10) && eVar.n(i10).i();
        this.f22013b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f22013b;
    }

    public final void c(int i10) {
        this.f22012a.a(i10);
    }

    public final int d() {
        return this.f22012a.d();
    }
}
