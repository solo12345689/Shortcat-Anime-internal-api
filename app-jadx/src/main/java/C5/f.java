package C5;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SoftReference f2868a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SoftReference f2869b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SoftReference f2870c = null;

    public void a() {
        SoftReference softReference = this.f2868a;
        if (softReference != null) {
            softReference.clear();
            this.f2868a = null;
        }
        SoftReference softReference2 = this.f2869b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f2869b = null;
        }
        SoftReference softReference3 = this.f2870c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f2870c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f2868a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f2868a = new SoftReference(obj);
        this.f2869b = new SoftReference(obj);
        this.f2870c = new SoftReference(obj);
    }
}
