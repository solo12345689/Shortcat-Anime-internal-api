package i1;

import android.content.Context;
import j1.C5327b;
import j1.InterfaceC5326a;

/* JADX INFO: renamed from: i1.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5008a {
    public static final InterfaceC5011d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        InterfaceC5326a interfaceC5326aB = C5327b.f51588a.b(f10);
        if (interfaceC5326aB == null) {
            interfaceC5326aB = new C5028u(f10);
        }
        return new C5014g(f11, f10, interfaceC5326aB);
    }
}
