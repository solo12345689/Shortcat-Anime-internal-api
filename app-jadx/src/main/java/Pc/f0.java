package pc;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends AbstractC5977g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55944a = new a();

        a() {
            super(1, oc.n.class, "<init>", "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final oc.n invoke(JavaScriptTypedArray p02) {
            AbstractC5504s.h(p02, "p0");
            return new oc.n(p02);
        }
    }

    public f0() {
        super(a.f55944a);
    }
}
