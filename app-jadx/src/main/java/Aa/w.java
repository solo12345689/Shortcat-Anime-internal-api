package aa;

import ma.InterfaceC5655b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class w implements InterfaceC5655b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f23903c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f23904a = f23903c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile InterfaceC5655b f23905b;

    public w(InterfaceC5655b interfaceC5655b) {
        this.f23905b = interfaceC5655b;
    }

    @Override // ma.InterfaceC5655b
    public Object get() {
        Object obj;
        Object obj2 = this.f23904a;
        Object obj3 = f23903c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f23904a;
                if (obj == obj3) {
                    obj = this.f23905b.get();
                    this.f23904a = obj;
                    this.f23905b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
