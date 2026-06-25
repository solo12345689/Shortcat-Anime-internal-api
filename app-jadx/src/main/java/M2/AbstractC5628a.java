package m2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5628a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0826a f53047b = new C0826a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f53048a = new LinkedHashMap();

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0826a {
        public /* synthetic */ C0826a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0826a() {
        }
    }

    /* JADX INFO: renamed from: m2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5628a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f53049c = new b();

        private b() {
        }

        @Override // m2.AbstractC5628a
        public Object a(c key) {
            AbstractC5504s.h(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: m2.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f53048a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC5628a) && AbstractC5504s.c(this.f53048a, ((AbstractC5628a) obj).f53048a);
    }

    public int hashCode() {
        return this.f53048a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f53048a + ')';
    }
}
