package Y4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o5.AbstractC5824a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements S4.d {
    @Override // S4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, S4.h hVar) throws Throwable {
        try {
            AbstractC5824a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e10);
            return false;
        }
    }
}
