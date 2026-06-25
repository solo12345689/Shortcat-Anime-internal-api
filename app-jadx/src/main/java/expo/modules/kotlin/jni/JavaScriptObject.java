package expo.modules.kotlin.jni;

import Td.L;
import Ud.AbstractC2279u;
import be.AbstractC3048a;
import com.facebook.jni.HybridData;
import expo.modules.kotlin.jni.JavaScriptObject;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001JB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b\u001f\u0010 J*\u0010!\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0082 ¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0082 ¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b-\u0010,J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060.H\u0086 ¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bH\u0086 ¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120.H\u0086 ¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\bH\u0086 ¢\u0006\u0004\b5\u00102J\u0010\u00107\u001a\u000206H\u0086 ¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209H\u0086 ¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0<H\u0000¢\u0006\u0004\b=\u0010>J\u0018\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0019H\u0086 ¢\u0006\u0004\b@\u0010AJ-\u0010D\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bD\u0010EJ/\u0010F\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\nH\u0004¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0002H\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010L¨\u0006M"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "", "name", "", "value", "LTd/L;", "setBoolProperty", "(Ljava/lang/String;Z)V", "", "setDoubleProperty", "(Ljava/lang/String;D)V", "setStringProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lexpo/modules/kotlin/jni/JavaScriptValue;", "setJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;)V", "setJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;)V", "unsetProperty", "(Ljava/lang/String;)V", "", "options", "defineBoolProperty", "(Ljava/lang/String;ZI)V", "defineDoubleProperty", "(Ljava/lang/String;DI)V", "defineStringProperty", "(Ljava/lang/String;Ljava/lang/String;I)V", "defineJSValueProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptValue;I)V", "defineJSObjectProperty", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/JavaScriptObject;I)V", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "deallocator", "defineNativeDeallocator", "(Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "hasProperty", "(Ljava/lang/String;)Z", "getProperty", "(Ljava/lang/String;)Lexpo/modules/kotlin/jni/JavaScriptValue;", "j", "", "getPropertyNames", "()[Ljava/lang/String;", "isArray", "()Z", "getArray", "()[Lexpo/modules/kotlin/jni/JavaScriptValue;", "isArrayBuffer", "Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;", "getArrayBuffer", "()Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "createWeak", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lkotlin/Function0;", "c", "(Lie/a;)V", "size", "setExternalMemoryPressure", "(I)V", "", "Lexpo/modules/kotlin/jni/JavaScriptObject$a;", "f", "(Ljava/lang/String;ILjava/util/List;)V", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "finalize", "()V", "a", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class JavaScriptObject implements Destructible {
    private final HybridData mHybridData;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Enum {

        /* JADX INFO: renamed from: b */
        public static final a f46132b = new a("Configurable", 0, 1);

        /* JADX INFO: renamed from: c */
        public static final a f46133c = new a("Enumerable", 1, 2);

        /* JADX INFO: renamed from: d */
        public static final a f46134d = new a("Writable", 2, 4);

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ a[] f46135e;

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ EnumEntries f46136f;

        /* JADX INFO: renamed from: a */
        private final int f46137a;

        static {
            a[] aVarArrA = a();
            f46135e = aVarArrA;
            f46136f = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10, int i11) {
            super(str, i10);
            this.f46137a = i11;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f46132b, f46133c, f46134d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f46135e.clone();
        }

        public final int b() {
            return this.f46137a;
        }
    }

    public JavaScriptObject(HybridData mHybridData) {
        AbstractC5504s.h(mHybridData, "mHybridData");
        this.mHybridData = mHybridData;
    }

    private final native void defineBoolProperty(String name, boolean value, int options);

    private final native void defineDoubleProperty(String name, double value, int options);

    private final native void defineJSObjectProperty(String name, JavaScriptObject value, int options);

    private final native void defineJSValueProperty(String name, JavaScriptValue value, int options);

    private final native void defineNativeDeallocator(JNIFunctionBody deallocator);

    private final native void defineStringProperty(String name, String value, int options);

    public static final L e(InterfaceC5082a interfaceC5082a, Object[] it) {
        AbstractC5504s.h(it, "it");
        interfaceC5082a.invoke();
        return L.f17438a;
    }

    public static /* synthetic */ void h(JavaScriptObject javaScriptObject, String str, int i10, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i11 & 4) != 0) {
            list = AbstractC2279u.m();
        }
        javaScriptObject.f(str, i10, list);
    }

    public static /* synthetic */ void i(JavaScriptObject javaScriptObject, String str, String str2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defineProperty");
        }
        if ((i10 & 4) != 0) {
            list = AbstractC2279u.m();
        }
        javaScriptObject.g(str, str2, list);
    }

    private final native void setBoolProperty(String name, boolean value);

    private final native void setDoubleProperty(String name, double value);

    private final native void setJSObjectProperty(String name, JavaScriptObject value);

    private final native void setJSValueProperty(String name, JavaScriptValue value);

    private final native void setStringProperty(String name, String value);

    private final native void unsetProperty(String name);

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: a, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    public final void c(final InterfaceC5082a deallocator) {
        AbstractC5504s.h(deallocator, "deallocator");
        defineNativeDeallocator(new JNIFunctionBody() { // from class: ec.c
            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] objArr) {
                return JavaScriptObject.e(deallocator, objArr);
            }
        });
    }

    public final native JavaScriptWeakObject createWeak();

    public final void f(String name, int value, List options) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(options, "options");
        defineDoubleProperty(name, value, expo.modules.kotlin.jni.a.b(options));
    }

    protected final void finalize() {
        this.mHybridData.resetNative();
    }

    public final void g(String name, String value, List options) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(options, "options");
        defineStringProperty(name, value, expo.modules.kotlin.jni.a.b(options));
    }

    public final native JavaScriptValue[] getArray();

    public final native JavaScriptArrayBuffer getArrayBuffer();

    public final native JavaScriptValue getProperty(String name);

    public final native String[] getPropertyNames();

    public final native boolean hasProperty(String name);

    public final native boolean isArray();

    public final native boolean isArrayBuffer();

    public final JavaScriptValue j(String name) {
        AbstractC5504s.h(name, "name");
        if (hasProperty(name)) {
            return getProperty(name);
        }
        return null;
    }

    public final native void setExternalMemoryPressure(int size);
}
