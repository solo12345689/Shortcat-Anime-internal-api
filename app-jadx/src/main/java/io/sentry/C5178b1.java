package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5178b1 implements InterfaceC5197f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C5178b1 f50532a = new C5178b1();

    private C5178b1() {
    }

    public static C5178b1 g() {
        return f50532a;
    }

    @Override // io.sentry.InterfaceC5197f0
    public Object c(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC5197f0
    public C5265q2 d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC5197f0
    public Object e(Reader reader, Class cls, InterfaceC5267r0 interfaceC5267r0) {
        return null;
    }

    @Override // io.sentry.InterfaceC5197f0
    public String f(Map map) {
        return "";
    }

    @Override // io.sentry.InterfaceC5197f0
    public void a(Object obj, Writer writer) {
    }

    @Override // io.sentry.InterfaceC5197f0
    public void b(C5265q2 c5265q2, OutputStream outputStream) {
    }
}
