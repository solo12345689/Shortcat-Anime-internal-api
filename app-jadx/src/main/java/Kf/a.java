package Kf;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f11078a;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f11078a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
