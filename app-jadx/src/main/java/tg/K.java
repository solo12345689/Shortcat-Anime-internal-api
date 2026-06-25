package tg;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes5.dex */
public abstract class K {
    public static final X a(File file) {
        return L.b(file);
    }

    public static final X b() {
        return M.a();
    }

    public static final InterfaceC6684i c(X x10) {
        return M.b(x10);
    }

    public static final InterfaceC6685j d(Z z10) {
        return M.c(z10);
    }

    public static final boolean e(AssertionError assertionError) {
        return L.c(assertionError);
    }

    public static final X f(File file, boolean z10) {
        return L.d(file, z10);
    }

    public static final X g(OutputStream outputStream) {
        return L.e(outputStream);
    }

    public static final X h(Socket socket) {
        return L.f(socket);
    }

    public static final Z j(File file) {
        return L.h(file);
    }

    public static final Z k(InputStream inputStream) {
        return L.i(inputStream);
    }

    public static final Z l(Socket socket) {
        return L.j(socket);
    }
}
