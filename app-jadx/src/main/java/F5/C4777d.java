package f5;

import S4.k;
import U4.v;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import o5.AbstractC5824a;

/* JADX INFO: renamed from: f5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4777d implements k {
    @Override // S4.k
    public S4.c a(S4.h hVar) {
        return S4.c.SOURCE;
    }

    @Override // S4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(v vVar, File file, S4.h hVar) throws Throwable {
        try {
            AbstractC5824a.f(((C4776c) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
