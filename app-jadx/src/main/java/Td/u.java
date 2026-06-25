package Td;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17466b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17467a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f17468a;

        public b(Throwable exception) {
            AbstractC5504s.h(exception, "exception");
            this.f17468a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC5504s.c(this.f17468a, ((b) obj).f17468a);
        }

        public int hashCode() {
            return this.f17468a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f17468a + ')';
        }
    }

    private /* synthetic */ u(Object obj) {
        this.f17467a = obj;
    }

    public static final /* synthetic */ u a(Object obj) {
        return new u(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof u) && AbstractC5504s.c(obj, ((u) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return AbstractC5504s.c(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f17468a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f17467a, obj);
    }

    public int hashCode() {
        return f(this.f17467a);
    }

    public final /* synthetic */ Object j() {
        return this.f17467a;
    }

    public String toString() {
        return i(this.f17467a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
