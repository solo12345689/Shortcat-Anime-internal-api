package pc;

import Ud.AbstractC2279u;
import cc.C3093a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import he.AbstractC4945a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;
import pe.C6029s;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;
import rb.AbstractC6300a;

/* JADX INFO: renamed from: pc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5975e extends AbstractC5990u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6027q f55941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.kotlin.types.b f55942b;

    public C5975e(X converterProvider, InterfaceC6027q arrayType) {
        AbstractC5504s.h(converterProvider, "converterProvider");
        AbstractC5504s.h(arrayType, "arrayType");
        this.f55941a = arrayType;
        C6029s c6029s = (C6029s) AbstractC2279u.o0(arrayType.e());
        InterfaceC6027q interfaceC6027qC = c6029s != null ? c6029s.c() : null;
        if (interfaceC6027qC == null) {
            throw new IllegalArgumentException("The array type should contain the type of the elements.");
        }
        this.f55942b = converterProvider.a(interfaceC6027qC);
    }

    private final Object[] k(int i10) {
        InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(this.f55941a.e())).c();
        AbstractC5504s.e(interfaceC6027qC);
        InterfaceC6016f interfaceC6016fC = interfaceC6027qC.c();
        AbstractC5504s.f(interfaceC6016fC, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC4945a.b((InterfaceC6014d) interfaceC6016fC), i10);
        AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) objNewInstance;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return this.f55942b.b();
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.a(this.f55942b.c());
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object[] e(Object value, Ub.d dVar, boolean z10) throws C3093a {
        CodedException unexpectedException;
        AbstractC5504s.h(value, "value");
        if (this.f55942b.b() && !z10) {
            return (Object[]) value;
        }
        Object[] objArr = (Object[]) value;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            try {
                arrayList.add(this.f55942b.a(obj, dVar, z10));
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
                InterfaceC6027q interfaceC6027q = this.f55941a;
                InterfaceC6027q interfaceC6027qC = ((C6029s) AbstractC2279u.m0(this.f55941a.e())).c();
                AbstractC5504s.e(interfaceC6027qC);
                AbstractC5504s.e(obj);
                throw new C3093a(interfaceC6027q, interfaceC6027qC, kotlin.jvm.internal.O.b(obj.getClass()), unexpectedException);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object[] f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
        AbstractC5504s.h(value, "value");
        ReadableArray readableArrayAsArray = value.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
        }
        Object[] objArrK = k(readableArrayAsArray.size());
        int size = readableArrayAsArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Dynamic dynamic = readableArrayAsArray.getDynamic(i10);
            try {
                Object objA = this.f55942b.a(dynamic, dVar, z10);
                dynamic.recycle();
                objArrK[i10] = objA;
            } finally {
            }
        }
        return objArrK;
    }
}
