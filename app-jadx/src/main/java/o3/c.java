package O3;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(ReadableByteChannel input, FileChannel output) throws IOException {
        AbstractC5504s.h(input, "input");
        AbstractC5504s.h(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
