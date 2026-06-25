package y5;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: y5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7204b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f64819a = Logger.getLogger(AbstractC7204b.class.getName());

    public static void a(Closeable closeable, boolean z10) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f64819a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
