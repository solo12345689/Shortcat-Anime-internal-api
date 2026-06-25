package b2;

import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2977i {

    /* JADX INFO: renamed from: b2.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends C2979k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f33071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f33072c;

        a(InterfaceC5082a interfaceC5082a, Function1 function1) {
            this.f33071b = interfaceC5082a;
            this.f33072c = function1;
        }

        @Override // b2.C2979k
        public float a() {
            return ((Number) this.f33071b.invoke()).floatValue();
        }

        @Override // b2.C2979k
        public void b(float f10) {
            this.f33072c.invoke(Float.valueOf(f10));
        }
    }

    private static final C2979k a(Function1 function1, InterfaceC5082a interfaceC5082a) {
        return new a(interfaceC5082a, function1);
    }

    public static final C2981m b(Function1 function1, InterfaceC5082a interfaceC5082a, float f10) {
        C2979k c2979kA = a(function1, interfaceC5082a);
        return Float.isNaN(f10) ? new C2981m(c2979kA) : new C2981m(c2979kA, f10);
    }
}
