package A6;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends I5.b {
    @Override // I5.b
    public void f(I5.c cVar) {
        if (cVar.isFinished()) {
            C5.a aVar = (C5.a) cVar.a();
            try {
                g((aVar == null || !(aVar.C() instanceof E6.d)) ? null : ((E6.d) aVar.C()).G1());
            } finally {
                C5.a.m(aVar);
            }
        }
    }

    protected abstract void g(Bitmap bitmap);
}
