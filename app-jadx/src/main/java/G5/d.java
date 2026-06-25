package G5;

import java.io.IOException;
import java.io.InputStream;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static long a(InputStream inputStream, long j10) throws IOException {
        k.g(inputStream);
        k.b(Boolean.valueOf(j10 >= 0));
        long j11 = j10;
        while (j11 > 0) {
            long jSkip = inputStream.skip(j11);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j10 - j11;
                }
                jSkip = 1;
            }
            j11 -= jSkip;
        }
        return j10;
    }
}
