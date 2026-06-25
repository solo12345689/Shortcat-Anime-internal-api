package W6;

import Td.r;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20781a = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20782a;

        static {
            int[] iArr = new int[W6.a.values().length];
            try {
                iArr[W6.a.f20778b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W6.a.f20777a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20782a = iArr;
        }
    }

    private b() {
    }

    public static final void a(String name, W6.a logLevel) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(logLevel, "logLevel");
        if (Y6.a.f22864f) {
            f20781a.c(name, logLevel);
        }
    }

    public static /* synthetic */ void b(String str, W6.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = W6.a.f20777a;
        }
        a(str, aVar);
    }

    private final void c(String str, W6.a aVar) {
        if (Y6.a.f22860b) {
            int i10 = a.f20782a[aVar.ordinal()];
            if (i10 == 1) {
                throw new AssertionException(str + " is being executed when app is fully running on the NEW Architecture.");
            }
            if (i10 != 2) {
                throw new r();
            }
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(str + " is being executed when app is fully running on the NEW Architecture."));
        }
    }
}
