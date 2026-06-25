package K5;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10878a = new a();

    private a() {
    }

    @Override // K5.b
    public void a(J5.a tag, String message, Object... args) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(args, "args");
    }

    @Override // K5.b
    public void b(J5.a tag, String message) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(message, "message");
    }

    @Override // K5.b
    public boolean c(J5.a tag) {
        AbstractC5504s.h(tag, "tag");
        return false;
    }
}
