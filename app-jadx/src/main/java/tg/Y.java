package tg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class Y extends C6681f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f61000o;

    public Y(Socket socket) {
        AbstractC5504s.h(socket, "socket");
        this.f61000o = socket;
    }

    @Override // tg.C6681f
    protected void B() {
        try {
            this.f61000o.close();
        } catch (AssertionError e10) {
            if (!K.e(e10)) {
                throw e10;
            }
            L.f60962a.log(Level.WARNING, "Failed to close timed out socket " + this.f61000o, (Throwable) e10);
        } catch (Exception e11) {
            L.f60962a.log(Level.WARNING, "Failed to close timed out socket " + this.f61000o, (Throwable) e11);
        }
    }

    @Override // tg.C6681f
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
