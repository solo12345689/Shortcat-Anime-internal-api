package df;

import Td.L;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.H;

/* JADX INFO: renamed from: df.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4603l extends AbstractC4598g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45159b = new a(null);

    /* JADX INFO: renamed from: df.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC4603l a(String message) {
            AbstractC5504s.h(message, "message");
            return new b(message);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: df.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC4603l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f45160c;

        public b(String message) {
            AbstractC5504s.h(message, "message");
            this.f45160c = message;
        }

        @Override // df.AbstractC4598g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public sf.i a(H module) {
            AbstractC5504s.h(module, "module");
            return sf.l.d(sf.k.f59652H0, this.f45160c);
        }

        @Override // df.AbstractC4598g
        public String toString() {
            return this.f45160c;
        }
    }

    public AbstractC4603l() {
        super(L.f17438a);
    }

    @Override // df.AbstractC4598g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public L b() {
        throw new UnsupportedOperationException();
    }
}
