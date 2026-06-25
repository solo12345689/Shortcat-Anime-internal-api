package tg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class L {

    /* JADX INFO: renamed from: a */
    private static final Logger f60962a = Logger.getLogger("okio.Okio");

    public static final X b(File file) {
        AbstractC5504s.h(file, "<this>");
        return K.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        AbstractC5504s.h(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? Df.r.W(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final X d(File file, boolean z10) {
        AbstractC5504s.h(file, "<this>");
        return K.g(new FileOutputStream(file, z10));
    }

    public static final X e(OutputStream outputStream) {
        AbstractC5504s.h(outputStream, "<this>");
        return new O(outputStream, new a0());
    }

    public static final X f(Socket socket) throws IOException {
        AbstractC5504s.h(socket, "<this>");
        Y y10 = new Y(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC5504s.g(outputStream, "getOutputStream(...)");
        return y10.z(new O(outputStream, y10));
    }

    public static /* synthetic */ X g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return K.f(file, z10);
    }

    public static final Z h(File file) {
        AbstractC5504s.h(file, "<this>");
        return new C6696v(new FileInputStream(file), a0.f61004e);
    }

    public static final Z i(InputStream inputStream) {
        AbstractC5504s.h(inputStream, "<this>");
        return new C6696v(inputStream, new a0());
    }

    public static final Z j(Socket socket) throws IOException {
        AbstractC5504s.h(socket, "<this>");
        Y y10 = new Y(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC5504s.g(inputStream, "getInputStream(...)");
        return y10.A(new C6696v(inputStream, y10));
    }
}
