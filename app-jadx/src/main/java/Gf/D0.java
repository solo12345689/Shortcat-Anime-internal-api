package Gf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C0 f7492a;

    public D0(String str, Throwable th2, C0 c02) {
        super(str);
        this.f7492a = c02;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final C0 a() {
        C0 c02 = this.f7492a;
        return c02 == null ? O0.f7527b : c02;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return AbstractC5504s.c(d02.getMessage(), getMessage()) && AbstractC5504s.c(d02.a(), a()) && AbstractC5504s.c(d02.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC5504s.e(message);
        int iHashCode = message.hashCode() * 31;
        C0 c0A = a();
        int iHashCode2 = (iHashCode + (c0A != null ? c0A.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + a();
    }
}
