package di;

import ci.g;
import ci.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: c */
    private static final a f45746c;

    /* JADX INFO: renamed from: a */
    public final g f45747a;

    /* JADX INFO: renamed from: b */
    public final h f45748b;

    static {
        f45746c = b.c() ? b.b() : null;
    }

    public a(g gVar, h hVar) {
        this.f45747a = gVar;
        this.f45748b = hVar;
    }

    public static boolean a() {
        return f45746c != null;
    }

    public static a b() {
        return f45746c;
    }
}
