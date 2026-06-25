package Bf;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f1901a = new ConcurrentHashMap();

    public static final Void a(String message) {
        AbstractC5504s.h(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
