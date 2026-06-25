package pc;

import Ud.AbstractC2279u;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Enumerable;
import he.AbstractC4945a;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;
import pe.InterfaceC6018h;
import pe.InterfaceC6022l;
import ub.C6752d;

/* JADX INFO: renamed from: pc.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5960B extends AbstractC5990u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6014d f55882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f55883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6018h f55884c;

    public C5960B(InterfaceC6014d enumClass) {
        AbstractC5504s.h(enumClass, "enumClass");
        this.f55882a = enumClass;
        Object[] enumConstants = AbstractC4945a.b(enumClass).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Passed type is not an enum type");
        }
        Enum[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        this.f55883b = enumArr;
        InterfaceC6018h interfaceC6018hB = Ub.n.b(enumClass);
        if (interfaceC6018hB == null) {
            throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
        }
        this.f55884c = interfaceC6018hB;
        if (Enumerable.class.isAssignableFrom(AbstractC4945a.b(enumClass))) {
            return;
        }
        C6752d.c(Ub.f.a(), "Enum '" + enumClass + "' should inherit from " + kotlin.jvm.internal.O.b(Enumerable.class) + ".", null, 2, null);
    }

    private final Enum g(Object obj, Enum[] enumArr, String str) throws NoSuchFieldException {
        Enum r42;
        Field declaredField = AbstractC4945a.b(this.f55882a).getDeclaredField(str);
        if (declaredField == null) {
            throw new IllegalArgumentException(("Cannot find a property for " + str + " parameter").toString());
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        AbstractC5504s.e(type);
        Object objK = k(obj, type);
        int length = enumArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                r42 = null;
                break;
            }
            r42 = enumArr[i10];
            if (AbstractC5504s.c(declaredField.get(r42), objK)) {
                break;
            }
            i10++;
        }
        if (r42 != null) {
            return r42;
        }
        throw new IllegalArgumentException(("Couldn't convert '" + obj + "' to " + this.f55882a.v() + " where " + str + " is the enum parameter").toString());
    }

    private final Enum h(String str, Enum[] enumArr) throws cc.d {
        Enum r22;
        int length = enumArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                r22 = null;
                break;
            }
            r22 = enumArr[i10];
            if (AbstractC5504s.c(r22.name(), str)) {
                break;
            }
            i10++;
        }
        if (r22 != null) {
            return r22;
        }
        throw new cc.d(this.f55882a, enumArr, str);
    }

    private final Object k(Object obj, Class cls) {
        if (obj instanceof Dynamic) {
            return AbstractC5504s.c(cls, String.class) ? ((Dynamic) obj).asString() : Integer.valueOf(((Dynamic) obj).asInt());
        }
        if (AbstractC5504s.c(cls, String.class)) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Int");
        return (Integer) obj;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return ExpectedType.INSTANCE.b();
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum e(Object value, Ub.d dVar, boolean z10) throws cc.n {
        AbstractC5504s.h(value, "value");
        if (this.f55884c.getParameters().isEmpty()) {
            return h((String) value, this.f55883b);
        }
        if (this.f55884c.getParameters().size() != 1) {
            throw new cc.n(kotlin.jvm.internal.O.b(value.getClass()), this.f55882a, null, 4, null);
        }
        Enum[] enumArr = this.f55883b;
        String name = ((InterfaceC6022l) AbstractC2279u.m0(this.f55884c.getParameters())).getName();
        AbstractC5504s.e(name);
        return g(value, enumArr, name);
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Enum f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException, cc.n {
        AbstractC5504s.h(value, "value");
        if (this.f55884c.getParameters().isEmpty()) {
            String strAsString = value.asString();
            if (strAsString != null) {
                return h(strAsString, this.f55883b);
            }
            throw new DynamicCastException(kotlin.jvm.internal.O.b(String.class));
        }
        if (this.f55884c.getParameters().size() != 1) {
            throw new cc.n(Ub.y.a(value.getType()), this.f55882a, null, 4, null);
        }
        Enum[] enumArr = this.f55883b;
        String name = ((InterfaceC6022l) AbstractC2279u.m0(this.f55884c.getParameters())).getName();
        AbstractC5504s.e(name);
        return g(value, enumArr, name);
    }
}
