package tg;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6677b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6677b f61008a = new C6677b();

    private C6677b() {
    }

    public final InterfaceC6684i a(X sink) {
        AbstractC5504s.h(sink, "sink");
        return K.c(sink);
    }

    public final InterfaceC6685j b(Z source) {
        AbstractC5504s.h(source, "source");
        return K.d(source);
    }

    public final X c(File file) {
        AbstractC5504s.h(file, "file");
        return L.g(file, false, 1, null);
    }

    public final X d(OutputStream outputStream) {
        AbstractC5504s.h(outputStream, "outputStream");
        return K.g(outputStream);
    }

    public final Z e(InputStream inputStream) {
        AbstractC5504s.h(inputStream, "inputStream");
        return K.k(inputStream);
    }
}
