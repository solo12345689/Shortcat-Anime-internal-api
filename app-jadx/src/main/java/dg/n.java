package dg;

import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45556a = a.f45558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f45557b = new a.C0718a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f45558a = new a();

        /* JADX INFO: renamed from: dg.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0718a implements n {
            @Override // dg.n
            public List b(u url) {
                AbstractC5504s.h(url, "url");
                return AbstractC2279u.m();
            }

            @Override // dg.n
            public void d(u url, List cookies) {
                AbstractC5504s.h(url, "url");
                AbstractC5504s.h(cookies, "cookies");
            }
        }

        private a() {
        }
    }

    List b(u uVar);

    void d(u uVar, List list);
}
