package Gf;

import Gf.AbstractC1633s0;
import Zd.i;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Gf.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1633s0 extends K implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7609c = new a(null);

    /* JADX INFO: renamed from: Gf.s0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Zd.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC1633s0 d(i.b bVar) {
            if (bVar instanceof AbstractC1633s0) {
                return (AbstractC1633s0) bVar;
            }
            return null;
        }

        private a() {
            super(K.f7520b, new Function1() { // from class: Gf.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC1633s0.a.d((i.b) obj);
                }
            });
        }
    }

    public abstract Executor b2();
}
