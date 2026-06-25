package a;

/* JADX INFO: renamed from: a.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2503b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23493a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f23493a + com.amazon.a.a.o.c.a.b.f34706a + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
