package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.f0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC5197f0 {
    void a(Object obj, Writer writer);

    void b(C5265q2 c5265q2, OutputStream outputStream);

    Object c(Reader reader, Class cls);

    C5265q2 d(InputStream inputStream);

    Object e(Reader reader, Class cls, InterfaceC5267r0 interfaceC5267r0);

    String f(Map map);
}
