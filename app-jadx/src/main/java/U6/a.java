package U6;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19358a = new a();

    private a() {
    }

    public static final boolean a() {
        return false;
    }

    public static final Class b(String className) {
        AbstractC5504s.h(className, "className");
        if (a()) {
            return Class.forName(className);
        }
        return null;
    }
}
