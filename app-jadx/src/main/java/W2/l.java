package w2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class l extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62818a;

    public l(int i10) {
        this.f62818a = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof l) && ((l) cause).f62818a == 2008) {
                return true;
            }
        }
        return false;
    }

    public l(Throwable th2, int i10) {
        super(th2);
        this.f62818a = i10;
    }

    public l(String str, int i10) {
        super(str);
        this.f62818a = i10;
    }

    public l(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f62818a = i10;
    }
}
