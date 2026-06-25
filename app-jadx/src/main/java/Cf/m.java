package Cf;

import ae.AbstractC2605b;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f3114a;

        public a(Function2 function2) {
            this.f3114a = function2;
        }

        @Override // Cf.i
        public Iterator iterator() {
            return m.a(this.f3114a);
        }
    }

    public static Iterator a(Function2 block) {
        AbstractC5504s.h(block, "block");
        j jVar = new j();
        jVar.k(AbstractC2605b.a(block, jVar, jVar));
        return jVar;
    }

    public static i b(Function2 block) {
        AbstractC5504s.h(block, "block");
        return new a(block);
    }
}
