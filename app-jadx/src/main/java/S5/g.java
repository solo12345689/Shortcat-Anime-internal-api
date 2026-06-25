package s5;

import s5.InterfaceC6430a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements InterfaceC6430a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f59245a;

    private g() {
    }

    public static synchronized g b() {
        try {
            if (f59245a == null) {
                f59245a = new g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f59245a;
    }

    @Override // s5.InterfaceC6430a
    public void a(InterfaceC6430a.EnumC0896a enumC0896a, Class cls, String str, Throwable th2) {
    }
}
