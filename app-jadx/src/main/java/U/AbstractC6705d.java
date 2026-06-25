package u;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: u.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6705d {
    public static final void a(String message) {
        AbstractC5504s.h(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        AbstractC5504s.h(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void c(String message) {
        AbstractC5504s.h(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void d(String message) {
        AbstractC5504s.h(message, "message");
        throw new NoSuchElementException(message);
    }
}
