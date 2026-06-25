package me;

import java.util.Random;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: me.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5665b extends AbstractC5664a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f53325c = new a();

    /* JADX INFO: renamed from: me.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // me.AbstractC5664a
    public Random g() {
        Object obj = this.f53325c.get();
        AbstractC5504s.g(obj, "get(...)");
        return (Random) obj;
    }
}
