package ua;

import aa.C2595c;
import aa.InterfaceC2596d;
import aa.q;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        String a(Object obj);
    }

    public static C2595c b(String str, String str2) {
        return C2595c.l(f.a(str, str2), f.class);
    }

    public static C2595c c(final String str, final a aVar) {
        return C2595c.m(f.class).b(q.k(Context.class)).f(new aa.g() { // from class: ua.g
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return f.a(str, aVar.a((Context) interfaceC2596d.a(Context.class)));
            }
        }).d();
    }
}
