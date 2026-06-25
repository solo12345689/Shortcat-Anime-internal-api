package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2866u {
    public static final void a(r rVar, AbstractC2857k.b current, AbstractC2857k.b next) {
        AbstractC5504s.h(current, "current");
        AbstractC5504s.h(next, "next");
        if (current == AbstractC2857k.b.f30236b && next == AbstractC2857k.b.f30235a) {
            throw new IllegalStateException(("State must be at least '" + AbstractC2857k.b.f30237c + "' to be moved to '" + next + "' in component " + rVar).toString());
        }
        AbstractC2857k.b bVar = AbstractC2857k.b.f30235a;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + rVar).toString());
    }
}
