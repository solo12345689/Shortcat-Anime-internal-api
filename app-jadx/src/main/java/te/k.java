package te;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import te.h;
import te.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f60941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f60942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f60943c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends k implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f60944d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method unboxMethod, Object obj) {
            super(unboxMethod, AbstractC2279u.m(), null);
            AbstractC5504s.h(unboxMethod, "unboxMethod");
            this.f60944d = obj;
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            e(args);
            return d(this.f60944d, args);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method unboxMethod) {
            super(unboxMethod, AbstractC2279u.e(unboxMethod.getDeclaringClass()), null);
            AbstractC5504s.h(unboxMethod, "unboxMethod");
        }

        @Override // te.h
        public Object call(Object[] args) {
            AbstractC5504s.h(args, "args");
            e(args);
            Object obj = args[0];
            i.d dVar = i.f60926e;
            return d(obj, args.length <= 1 ? new Object[0] : AbstractC2273n.t(args, 1, args.length));
        }
    }

    public /* synthetic */ k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // te.h
    public final List a() {
        return this.f60942b;
    }

    @Override // te.h
    public boolean c() {
        return h.a.b(this);
    }

    protected final Object d(Object obj, Object[] args) {
        AbstractC5504s.h(args, "args");
        return this.f60941a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void e(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // te.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // te.h
    public final Type getReturnType() {
        return this.f60943c;
    }

    private k(Method method, List list) {
        this.f60941a = method;
        this.f60942b = list;
        Class<?> returnType = method.getReturnType();
        AbstractC5504s.g(returnType, "getReturnType(...)");
        this.f60943c = returnType;
    }
}
