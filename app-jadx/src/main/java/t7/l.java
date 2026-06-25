package T7;

import com.facebook.soloader.E;
import com.facebook.soloader.F;
import com.facebook.soloader.InterfaceC3327b;
import com.facebook.soloader.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l implements h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // T7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (F f10 : eArr) {
            if (f10 instanceof InterfaceC3327b) {
                p.b("SoLoader", "Waiting on SoSource " + f10.c());
                ((InterfaceC3327b) f10).a();
            }
        }
        return true;
    }
}
