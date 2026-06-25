package pc;

import Ud.AbstractC2279u;
import cc.C3093a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6027q;
import rb.AbstractC6300a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class W extends AbstractC5990u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55911b;

    public W(X converterProvider, InterfaceC6027q setType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(setType, "setType");
        this.f55910a = setType;
        InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(setType.e())).c();
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("The set type should contain the type of elements.");
        }
        this.f55911b = converterProvider.a(interfaceC6027qC);
    }

    private final Set k(ReadableArray readableArray, Ub.d dVar, boolean z10) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Dynamic dynamic = readableArray.getDynamic(i10);
            try {
                Object objA = this.f55911b.a(dynamic, dVar, z10);
                dynamic.recycle();
                arrayList.add(objA);
            } finally {
            }
        }
        return AbstractC2279u.f1(arrayList);
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.c(this.f55911b.c());
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set e(Object value, Ub.d dVar, boolean z10) throws C3093a {
        CodedException unexpectedException;
        AbstractC5504s.h(value, "value");
        if (this.f55911b.b() && !z10) {
            return AbstractC2279u.f1((List) value);
        }
        List list = (List) value;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        for (Object obj : list) {
            try {
                arrayList.add(this.f55911b.a(obj, dVar, z10));
            } catch (Throwable th2) {
                if (th2 instanceof CodedException) {
                    unexpectedException = (CodedException) th2;
                } else if (th2 instanceof AbstractC6300a) {
                    AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                    String strA = abstractC6300a.a();
                    AbstractC5504s.g(strA, "getCode(...)");
                    unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                InterfaceC6027q interfaceC6027q = this.f55910a;
                InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(this.f55910a.e())).c();
                AbstractC5504s.e(interfaceC6027qC);
                AbstractC5504s.e(obj);
                throw new C3093a(interfaceC6027q, interfaceC6027qC, kotlin.jvm.internal.O.b(obj.getClass()), unexpectedException);
            }
        }
        return AbstractC2279u.f1(arrayList);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
        AbstractC5504s.h(value, "value");
        ReadableArray readableArrayAsArray = value.asArray();
        if (readableArrayAsArray != null) {
            return k(readableArrayAsArray, dVar, z10);
        }
        throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
    }
}
