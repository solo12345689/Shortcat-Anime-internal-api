package di;

import android.os.Looper;
import ci.f;
import ci.h;
import ci.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class d implements h {
    @Override // ci.h
    public boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @Override // ci.h
    public l b(ci.c cVar) {
        return new f(cVar, Looper.getMainLooper(), 10);
    }
}
