package dg;

import Ud.AbstractC2273n;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45567a = a.f45569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f45568b = new a.C0719a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f45569a = new a();

        /* JADX INFO: renamed from: dg.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0719a implements q {
            @Override // dg.q
            public List a(String hostname) throws UnknownHostException {
                AbstractC5504s.h(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    AbstractC5504s.g(allByName, "getAllByName(hostname)");
                    return AbstractC2273n.V0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List a(String str);
}
