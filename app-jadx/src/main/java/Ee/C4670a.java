package ee;

import de.AbstractC4586a;
import me.AbstractC5666c;
import ne.C5785a;

/* JADX INFO: renamed from: ee.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C4670a extends AbstractC4586a {

    /* JADX INFO: renamed from: ee.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0728a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0728a f45971a = new C0728a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f45972b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f45972b = num;
        }

        private C0728a() {
        }
    }

    private final boolean d(int i10) {
        Integer num = C0728a.f45972b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ce.AbstractC3096a
    public AbstractC5666c b() {
        return d(34) ? new C5785a() : super.b();
    }
}
