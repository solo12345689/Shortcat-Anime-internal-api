package Zd;

import Td.u;
import ae.AbstractC2605b;
import ae.EnumC2604a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements e, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f23276b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f23277c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f23278a;
    private volatile Object result;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(e delegate, Object obj) {
        AbstractC5504s.h(delegate, "delegate");
        this.f23278a = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        EnumC2604a enumC2604a = EnumC2604a.f23933b;
        if (obj == enumC2604a) {
            if (androidx.concurrent.futures.b.a(f23277c, this, enumC2604a, AbstractC2605b.f())) {
                return AbstractC2605b.f();
            }
            obj = this.result;
        }
        if (obj == EnumC2604a.f23934c) {
            return AbstractC2605b.f();
        }
        if (obj instanceof u.b) {
            throw ((u.b) obj).f17468a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        e eVar = this.f23278a;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // Zd.e
    public i getContext() {
        return this.f23278a.getContext();
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC2604a enumC2604a = EnumC2604a.f23933b;
            if (obj2 == enumC2604a) {
                if (androidx.concurrent.futures.b.a(f23277c, this, enumC2604a, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC2605b.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f23277c, this, AbstractC2605b.f(), EnumC2604a.f23934c)) {
                    this.f23278a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f23278a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(e delegate) {
        this(delegate, EnumC2604a.f23933b);
        AbstractC5504s.h(delegate, "delegate");
    }
}
