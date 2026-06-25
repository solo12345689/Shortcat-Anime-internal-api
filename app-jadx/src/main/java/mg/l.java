package mg;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53681a = a.f53683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f53682b = new a.C0836a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f53683a = new a();

        /* JADX INFO: renamed from: mg.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0836a implements l {
            @Override // mg.l
            public void a(int i10, b errorCode) {
                AbstractC5504s.h(errorCode, "errorCode");
            }

            @Override // mg.l
            public boolean b(int i10, List requestHeaders) {
                AbstractC5504s.h(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // mg.l
            public boolean c(int i10, List responseHeaders, boolean z10) {
                AbstractC5504s.h(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // mg.l
            public boolean d(int i10, InterfaceC6685j source, int i11, boolean z10) {
                AbstractC5504s.h(source, "source");
                source.skip(i11);
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i10, b bVar);

    boolean b(int i10, List list);

    boolean c(int i10, List list, boolean z10);

    boolean d(int i10, InterfaceC6685j interfaceC6685j, int i11, boolean z10);
}
