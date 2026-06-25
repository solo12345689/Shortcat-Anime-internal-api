package Yd;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: Yd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0392a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f22926a;

        C0392a(InterfaceC5082a interfaceC5082a) {
            this.f22926a = interfaceC5082a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f22926a.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC5082a block) {
        AbstractC5504s.h(block, "block");
        C0392a c0392a = new C0392a(block);
        if (z11) {
            c0392a.setDaemon(true);
        }
        if (i10 > 0) {
            c0392a.setPriority(i10);
        }
        if (str != null) {
            c0392a.setName(str);
        }
        if (classLoader != null) {
            c0392a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0392a.start();
        }
        return c0392a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, InterfaceC5082a interfaceC5082a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            classLoader = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        String str2 = str;
        return a(z10, z11, classLoader, str2, i12, interfaceC5082a);
    }
}
