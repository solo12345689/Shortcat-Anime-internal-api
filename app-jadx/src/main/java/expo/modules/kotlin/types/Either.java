package expo.modules.kotlin.types;

import Td.A;
import Td.r;
import Ub.g;
import com.facebook.react.bridge.Dynamic;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import pc.AbstractC5988s;
import pc.C5963E;
import pc.C5984n;
import pc.h0;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u0019\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/types/Either;", "", "FirstType", "SecondType", "bareValue", "", "Lpc/s;", "deferredValue", "", "Lpe/q;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "d", "(I)Z", "a", "(I)Ljava/lang/Object;", "Lpe/d;", "type", "e", "(Lpe/d;)Z", "f", "b", "(Lpe/d;)Ljava/lang/Object;", "c", "Ljava/lang/Object;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Either<FirstType, SecondType> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object bareValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List deferredValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List types;

    public Either(Object bareValue, List deferredValue, List types) {
        AbstractC5504s.h(bareValue, "bareValue");
        AbstractC5504s.h(deferredValue, "deferredValue");
        AbstractC5504s.h(types, "types");
        this.bareValue = bareValue;
        this.deferredValue = deferredValue;
        this.types = types;
    }

    public final Object a(int index) {
        AbstractC5988s abstractC5988s = (AbstractC5988s) this.deferredValue.get(index);
        if (abstractC5988s instanceof C5984n) {
            return ((C5984n) abstractC5988s).a();
        }
        if (AbstractC5504s.c(abstractC5988s, C5963E.f55887a)) {
            throw new A("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "'");
        }
        if (!(abstractC5988s instanceof h0)) {
            throw new r();
        }
        try {
            Object objA = ((h0) abstractC5988s).a();
            this.deferredValue.set(index, new C5984n(objA));
            return objA;
        } catch (Throwable th2) {
            this.deferredValue.set(index, C5963E.f55887a);
            if (!(this.bareValue instanceof Dynamic)) {
                throw new A("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "' - " + th2.getMessage());
            }
            Object obj = this.bareValue;
            throw new A("Cannot cast '[" + obj + "] " + g.a((Dynamic) obj) + "' to '" + this.types.get(index) + "' - " + th2.getMessage());
        }
    }

    public final Object b(InterfaceC6014d type) {
        AbstractC5504s.h(type, "type");
        Object objA = a(0);
        AbstractC5504s.f(objA, "null cannot be cast to non-null type FirstType of expo.modules.kotlin.types.Either");
        return objA;
    }

    public final Object c(InterfaceC6014d type) {
        AbstractC5504s.h(type, "type");
        Object objA = a(1);
        AbstractC5504s.f(objA, "null cannot be cast to non-null type SecondType of expo.modules.kotlin.types.Either");
        return objA;
    }

    public final boolean d(int index) {
        AbstractC5988s abstractC5988s = (AbstractC5988s) this.deferredValue.get(index);
        if (abstractC5988s instanceof C5984n) {
            return true;
        }
        if (AbstractC5504s.c(abstractC5988s, C5963E.f55887a)) {
            return false;
        }
        if (!(abstractC5988s instanceof h0)) {
            throw new r();
        }
        try {
            this.deferredValue.set(index, new C5984n(((h0) abstractC5988s).a()));
            return true;
        } catch (Throwable unused) {
            this.deferredValue.set(index, C5963E.f55887a);
            return false;
        }
    }

    public final boolean e(InterfaceC6014d type) {
        AbstractC5504s.h(type, "type");
        return d(0);
    }

    public final boolean f(InterfaceC6014d type) {
        AbstractC5504s.h(type, "type");
        return d(1);
    }
}
