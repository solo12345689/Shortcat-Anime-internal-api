package S5;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16010a = new ArrayList(2);

    private synchronized void d(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    @Override // S5.d
    public void a(String str, Object obj) {
        int size = this.f16010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f16010a.get(i10);
                if (dVar != null) {
                    dVar.a(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    public synchronized void b(d dVar) {
        this.f16010a.add(dVar);
    }

    public synchronized void c() {
        this.f16010a.clear();
    }

    @Override // S5.d
    public synchronized void g(String str, Throwable th2) {
        int size = this.f16010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f16010a.get(i10);
                if (dVar != null) {
                    dVar.g(str, th2);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // S5.d
    public synchronized void h(String str) {
        int size = this.f16010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f16010a.get(i10);
                if (dVar != null) {
                    dVar.h(str);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // S5.d
    public synchronized void n(String str, Object obj, Animatable animatable) {
        int size = this.f16010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f16010a.get(i10);
                if (dVar != null) {
                    dVar.n(str, obj, animatable);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // S5.d
    public synchronized void r(String str, Object obj) {
        int size = this.f16010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f16010a.get(i10);
                if (dVar != null) {
                    dVar.r(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onSubmit", e10);
            }
        }
    }

    @Override // S5.d
    public void s(String str, Throwable th2) {
        int size = this.f16010a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                d dVar = (d) this.f16010a.get(i10);
                if (dVar != null) {
                    dVar.s(str, th2);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }
}
