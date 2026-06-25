package r8;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import z8.InterfaceC7327d;

/* JADX INFO: renamed from: r8.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6295u implements Closeable {

    /* JADX INFO: renamed from: r8.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        a a(Context context);

        AbstractC6295u build();
    }

    AbstractC6295u() {
    }

    abstract InterfaceC7327d a();

    abstract C6294t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
