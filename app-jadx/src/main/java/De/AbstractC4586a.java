package de;

import Ud.AbstractC2273n;
import ce.AbstractC3096a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4586a extends AbstractC3096a {

    /* JADX INFO: renamed from: de.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0710a {

        /* JADX INFO: renamed from: a */
        public static final C0710a f45149a = new C0710a();

        /* JADX INFO: renamed from: b */
        public static final Integer f45150b;

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
            f45150b = num;
        }

        private C0710a() {
        }
    }

    private final boolean d(int i10) {
        Integer num = C0710a.f45150b;
        return num == null || num.intValue() >= i10;
    }

    @Override // ce.AbstractC3096a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(cause, "cause");
        AbstractC5504s.h(exception, "exception");
        if (d(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // ce.AbstractC3096a
    public List c(Throwable exception) {
        AbstractC5504s.h(exception, "exception");
        if (!d(19)) {
            return super.c(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        AbstractC5504s.g(suppressed, "getSuppressed(...)");
        return AbstractC2273n.e(suppressed);
    }
}
