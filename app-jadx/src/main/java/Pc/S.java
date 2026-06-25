package pc;

import Ud.AbstractC2279u;
import cc.C3093a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class S extends AbstractC5990u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f55905b;

    public S(X converterProvider, InterfaceC6027q pairType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(pairType, "pairType");
        this.f55904a = pairType;
        C6029s c6029s = (C6029s) AbstractC2279u.p0(pairType.e(), 0);
        InterfaceC6027q interfaceC6027qC = c6029s != null ? c6029s.c() : null;
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
        }
        expo.modules.kotlin.types.b bVarA = converterProvider.a(interfaceC6027qC);
        C6029s c6029s2 = (C6029s) AbstractC2279u.p0(pairType.e(), 1);
        InterfaceC6027q interfaceC6027qC2 = c6029s2 != null ? c6029s2.c() : null;
        if (interfaceC6027qC2 == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
        }
        this.f55905b = AbstractC2279u.p(bVarA, converterProvider.a(interfaceC6027qC2));
    }

    private final Object i(Ub.d dVar, ReadableArray readableArray, int i10, boolean z10) {
        CodedException unexpectedException;
        Dynamic dynamic = readableArray.getDynamic(i10);
        try {
            Object objA = ((expo.modules.kotlin.types.b) this.f55905b.get(i10)).a(dynamic, dVar, z10);
            dynamic.recycle();
            return objA;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof CodedException) {
                    unexpectedException = (CodedException) th2;
                } else if (th2 instanceof AbstractC6300a) {
                    String strA = ((AbstractC6300a) th2).a();
                    AbstractC5504s.g(strA, "getCode(...)");
                    unexpectedException = new CodedException(strA, ((AbstractC6300a) th2).getMessage(), ((AbstractC6300a) th2).getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                InterfaceC6027q interfaceC6027q = this.f55904a;
                InterfaceC6027q interfaceC6027qC = ((C6029s) this.f55904a.e().get(i10)).c();
                AbstractC5504s.e(interfaceC6027qC);
                throw new C3093a(interfaceC6027q, interfaceC6027qC, dynamic.getType(), unexpectedException);
            } catch (Throwable th3) {
                dynamic.recycle();
                throw th3;
            }
        }
    }

    private final Pair l(ReadableArray readableArray, Ub.d dVar, boolean z10) {
        return new Pair(i(dVar, readableArray, 0, z10), i(dVar, readableArray, 1, z10));
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(new SingleType(EnumC4666a.f45839l, null, 2, null));
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair e(Object value, Ub.d dVar, boolean z10) {
        AbstractC5504s.h(value, "value");
        return value instanceof ReadableArray ? l((ReadableArray) value, dVar, z10) : (Pair) value;
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Pair f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
        AbstractC5504s.h(value, "value");
        ReadableArray readableArrayAsArray = value.asArray();
        if (readableArrayAsArray != null) {
            return l(readableArrayAsArray, dVar, z10);
        }
        throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
    }
}
