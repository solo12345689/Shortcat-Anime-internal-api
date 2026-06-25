package K2;

import d3.InterfaceC4565a;
import e3.C4644b;
import f3.C4769b;
import h3.C4900a;
import i3.h;
import k3.C5442c;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10845a = new C0169a();

    /* JADX INFO: renamed from: K2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0169a implements a {
        C0169a() {
        }

        @Override // K2.a
        public InterfaceC4565a a(C6109x c6109x) {
            String str = c6109x.f57022o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C4644b();
                    case "application/x-icy":
                        return new C4900a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new C4769b();
                    case "application/x-scte35":
                        return new C5442c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // K2.a
        public boolean b(C6109x c6109x) {
            String str = c6109x.f57022o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    InterfaceC4565a a(C6109x c6109x);

    boolean b(C6109x c6109x);
}
