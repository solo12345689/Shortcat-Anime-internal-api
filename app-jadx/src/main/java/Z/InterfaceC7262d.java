package z;

import w.AbstractC6906j;
import w.InterfaceC6904i;

/* JADX INFO: renamed from: z.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7262d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f65282a = a.f65283a;

    /* JADX INFO: renamed from: z.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f65283a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final InterfaceC6904i f65284b = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final InterfaceC7262d f65285c = new C0988a();

        /* JADX INFO: renamed from: z.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0988a implements InterfaceC7262d {
            C0988a() {
            }
        }

        private a() {
        }

        public final float a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if (f10 >= 0.0f && f13 <= f12) {
                return 0.0f;
            }
            if (f10 < 0.0f && f13 > f12) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
        }

        public final InterfaceC7262d b() {
            return f65285c;
        }

        public final InterfaceC6904i c() {
            return f65284b;
        }
    }

    default float a(float f10, float f11, float f12) {
        return f65282a.a(f10, f11, f12);
    }

    default InterfaceC6904i b() {
        return f65282a.c();
    }
}
