package Cf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f3079a;

    public a(i sequence) {
        AbstractC5504s.h(sequence, "sequence");
        this.f3079a = new AtomicReference(sequence);
    }

    @Override // Cf.i
    public Iterator iterator() {
        i iVar = (i) this.f3079a.getAndSet(null);
        if (iVar != null) {
            return iVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
