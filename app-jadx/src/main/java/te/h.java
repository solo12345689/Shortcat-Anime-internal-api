package te;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static void a(h hVar, Object[] args) {
            AbstractC5504s.h(args, "args");
            if (j.a(hVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + j.a(hVar) + " arguments, but " + args.length + " were provided.");
        }

        public static boolean b(h hVar) {
            return false;
        }
    }

    List a();

    Member b();

    boolean c();

    Object call(Object[] objArr);

    Type getReturnType();
}
