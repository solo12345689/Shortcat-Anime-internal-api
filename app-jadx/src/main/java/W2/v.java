package w2;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class v extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f62891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62892c;

    public v(o oVar, int i10, int i11) {
        super(b(i10, i11));
        this.f62891b = oVar;
        this.f62892c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static v c(IOException iOException, o oVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ErrorCodes.PROTOCOL_EXCEPTION : (message == null || !O9.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new u(iOException, oVar) : new v(iOException, oVar, i11, i10);
    }

    public v(String str, o oVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f62891b = oVar;
        this.f62892c = i11;
    }

    public v(IOException iOException, o oVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f62891b = oVar;
        this.f62892c = i11;
    }

    public v(String str, IOException iOException, o oVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f62891b = oVar;
        this.f62892c = i11;
    }
}
