package Ee;

import Oe.InterfaceC1981b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Ee.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1529h implements InterfaceC1981b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5936b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.f f5937a;

    /* JADX INFO: renamed from: Ee.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1529h a(Object value, Xe.f fVar) {
            AbstractC5504s.h(value, "value");
            return AbstractC1527f.l(value.getClass()) ? new v(fVar, (Enum) value) : value instanceof Annotation ? new i(fVar, (Annotation) value) : value instanceof Object[] ? new l(fVar, (Object[]) value) : value instanceof Class ? new r(fVar, (Class) value) : new x(fVar, value);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC1529h(Xe.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // Oe.InterfaceC1981b
    public Xe.f getName() {
        return this.f5937a;
    }

    private AbstractC1529h(Xe.f fVar) {
        this.f5937a = fVar;
    }
}
