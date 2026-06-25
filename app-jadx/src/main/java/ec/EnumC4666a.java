package ec;

import be.AbstractC3048a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptArrayBuffer;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.jni.NativeArrayBuffer;
import expo.modules.kotlin.jni.worklets.Worklet;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: ec.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4666a extends Enum {

    /* JADX INFO: renamed from: A */
    public static final EnumC4666a f45826A;

    /* JADX INFO: renamed from: B */
    public static final EnumC4666a f45827B;

    /* JADX INFO: renamed from: C */
    private static final /* synthetic */ EnumC4666a[] f45828C;

    /* JADX INFO: renamed from: D */
    private static final /* synthetic */ EnumEntries f45829D;

    /* JADX INFO: renamed from: c */
    public static final EnumC4666a f45830c = new EnumC4666a("NONE", 0, O.b(Void.class), 0);

    /* JADX INFO: renamed from: d */
    public static final EnumC4666a f45831d = new EnumC4666a("DOUBLE", 1, O.b(Double.TYPE), 0, 2, null);

    /* JADX INFO: renamed from: e */
    public static final EnumC4666a f45832e;

    /* JADX INFO: renamed from: f */
    public static final EnumC4666a f45833f;

    /* JADX INFO: renamed from: g */
    public static final EnumC4666a f45834g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4666a f45835h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4666a f45836i;

    /* JADX INFO: renamed from: j */
    public static final EnumC4666a f45837j;

    /* JADX INFO: renamed from: k */
    public static final EnumC4666a f45838k;

    /* JADX INFO: renamed from: l */
    public static final EnumC4666a f45839l;

    /* JADX INFO: renamed from: m */
    public static final EnumC4666a f45840m;

    /* JADX INFO: renamed from: n */
    public static final EnumC4666a f45841n;

    /* JADX INFO: renamed from: o */
    public static final EnumC4666a f45842o;

    /* JADX INFO: renamed from: p */
    public static final EnumC4666a f45843p;

    /* JADX INFO: renamed from: q */
    public static final EnumC4666a f45844q;

    /* JADX INFO: renamed from: r */
    public static final EnumC4666a f45845r;

    /* JADX INFO: renamed from: s */
    public static final EnumC4666a f45846s;

    /* JADX INFO: renamed from: t */
    public static final EnumC4666a f45847t;

    /* JADX INFO: renamed from: u */
    public static final EnumC4666a f45848u;

    /* JADX INFO: renamed from: v */
    public static final EnumC4666a f45849v;

    /* JADX INFO: renamed from: w */
    public static final EnumC4666a f45850w;

    /* JADX INFO: renamed from: x */
    public static final EnumC4666a f45851x;

    /* JADX INFO: renamed from: y */
    public static final EnumC4666a f45852y;

    /* JADX INFO: renamed from: z */
    public static final EnumC4666a f45853z;

    /* JADX INFO: renamed from: a */
    private final InterfaceC6014d f45854a;

    /* JADX INFO: renamed from: b */
    private final int f45855b;

    static {
        Class cls = Integer.TYPE;
        f45832e = new EnumC4666a("INT", 2, O.b(cls), 0, 2, null);
        f45833f = new EnumC4666a("LONG", 3, O.b(Long.TYPE), 0, 2, null);
        f45834g = new EnumC4666a("FLOAT", 4, O.b(Float.TYPE), 0, 2, null);
        f45835h = new EnumC4666a("BOOLEAN", 5, O.b(Boolean.TYPE), 0, 2, null);
        f45836i = new EnumC4666a("STRING", 6, O.b(String.class), 0, 2, null);
        f45837j = new EnumC4666a("JS_OBJECT", 7, O.b(JavaScriptObject.class), 0, 2, null);
        f45838k = new EnumC4666a("JS_VALUE", 8, O.b(JavaScriptValue.class), 0, 2, null);
        f45839l = new EnumC4666a("READABLE_ARRAY", 9, O.b(ReadableArray.class), 0, 2, null);
        f45840m = new EnumC4666a("READABLE_MAP", 10, O.b(ReadableMap.class), 0, 2, null);
        f45841n = new EnumC4666a("UINT8_TYPED_ARRAY", 11, O.b(byte[].class), 0, 2, null);
        f45842o = new EnumC4666a("TYPED_ARRAY", 12, O.b(oc.j.class), 0, 2, null);
        f45843p = new EnumC4666a("PRIMITIVE_ARRAY", 13, O.b(Object[].class), 0, 2, null);
        f45844q = new EnumC4666a("ARRAY", 14, O.b(Object[].class), 0, 2, null);
        f45845r = new EnumC4666a("LIST", 15, O.b(List.class), 0, 2, null);
        f45846s = new EnumC4666a("MAP", 16, O.b(Map.class), 0, 2, null);
        f45847t = new EnumC4666a("VIEW_TAG", 17, O.b(cls), 0, 2, null);
        f45848u = new EnumC4666a("SHARED_OBJECT_ID", 18, O.b(cls), 0, 2, null);
        f45849v = new EnumC4666a("JS_FUNCTION", 19, O.b(JavaScriptFunction.class), 0, 2, null);
        f45850w = new EnumC4666a("ANY", 20, O.b(Object.class), 0, 2, null);
        f45851x = new EnumC4666a("NULLABLE", 21, O.b(Object.class), 0, 2, null);
        f45852y = new EnumC4666a("VALUE_OR_UNDEFINED", 22, O.b(ValueOrUndefined.class), 0, 2, null);
        f45853z = new EnumC4666a("JS_ARRAY_BUFFER", 23, O.b(JavaScriptArrayBuffer.class), 0, 2, null);
        f45826A = new EnumC4666a("NATIVE_ARRAY_BUFFER", 24, O.b(NativeArrayBuffer.class), 0, 2, null);
        f45827B = new EnumC4666a("SERIALIZABLE", 25, O.b(Worklet.class), 0, 2, null);
        EnumC4666a[] enumC4666aArrA = a();
        f45828C = enumC4666aArrA;
        f45829D = AbstractC3048a.a(enumC4666aArrA);
    }

    private EnumC4666a(String str, int i10, InterfaceC6014d interfaceC6014d, int i11) {
        super(str, i10);
        this.f45854a = interfaceC6014d;
        this.f45855b = i11;
    }

    private static final /* synthetic */ EnumC4666a[] a() {
        return new EnumC4666a[]{f45830c, f45831d, f45832e, f45833f, f45834g, f45835h, f45836i, f45837j, f45838k, f45839l, f45840m, f45841n, f45842o, f45843p, f45844q, f45845r, f45846s, f45847t, f45848u, f45849v, f45850w, f45851x, f45852y, f45853z, f45826A, f45827B};
    }

    public static EnumC4666a valueOf(String str) {
        return (EnumC4666a) Enum.valueOf(EnumC4666a.class, str);
    }

    public static EnumC4666a[] values() {
        return (EnumC4666a[]) f45828C.clone();
    }

    public final InterfaceC6014d b() {
        return this.f45854a;
    }

    public final int c() {
        return this.f45855b;
    }

    /* synthetic */ EnumC4666a(String str, int i10, InterfaceC6014d interfaceC6014d, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, interfaceC6014d, (i12 & 2) != 0 ? AbstractC4667b.b() : i11);
    }
}
