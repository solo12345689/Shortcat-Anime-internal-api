package d6;

import a6.InterfaceC2580a;
import b6.InterfaceC3025b;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: d6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4568a {
    void a();

    void b(int i10, int i11, InterfaceC5082a interfaceC5082a);

    C5.a c(int i10, int i11, int i12);

    void d();

    void e(b bVar, InterfaceC3025b interfaceC3025b, InterfaceC2580a interfaceC2580a, int i10, InterfaceC5082a interfaceC5082a);

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0708a {
        public static C5.a b(InterfaceC4568a interfaceC4568a, int i10, int i11, int i12) {
            return null;
        }

        public static void e(InterfaceC4568a interfaceC4568a, b bitmapFramePreparer, InterfaceC3025b bitmapFrameCache, InterfaceC2580a animationBackend, int i10, InterfaceC5082a interfaceC5082a) {
            AbstractC5504s.h(bitmapFramePreparer, "bitmapFramePreparer");
            AbstractC5504s.h(bitmapFrameCache, "bitmapFrameCache");
            AbstractC5504s.h(animationBackend, "animationBackend");
        }

        public static /* synthetic */ void f(InterfaceC4568a interfaceC4568a, b bVar, InterfaceC3025b interfaceC3025b, InterfaceC2580a interfaceC2580a, int i10, InterfaceC5082a interfaceC5082a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i11 & 16) != 0) {
                interfaceC5082a = null;
            }
            interfaceC4568a.e(bVar, interfaceC3025b, interfaceC2580a, i10, interfaceC5082a);
        }

        public static void a(InterfaceC4568a interfaceC4568a) {
        }

        public static void c(InterfaceC4568a interfaceC4568a) {
        }

        public static void d(InterfaceC4568a interfaceC4568a, int i10, int i11, InterfaceC5082a interfaceC5082a) {
        }
    }
}
