package x2;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7048a {

    /* JADX INFO: renamed from: x2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0959a extends IOException {
        public C0959a(String str) {
            super(str);
        }

        public C0959a(Throwable th2) {
            super(th2);
        }

        public C0959a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: renamed from: x2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void b(InterfaceC7048a interfaceC7048a, i iVar);

        void d(InterfaceC7048a interfaceC7048a, i iVar, i iVar2);

        void e(InterfaceC7048a interfaceC7048a, i iVar);
    }

    File a(String str, long j10, long j11);

    l b(String str);

    void c(String str, m mVar);

    i d(String str, long j10, long j11);

    void e(i iVar);

    void f(i iVar);

    i g(String str, long j10, long j11);

    void h(File file, long j10);
}
