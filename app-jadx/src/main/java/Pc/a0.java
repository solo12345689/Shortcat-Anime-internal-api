package pc;

import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptArrayBuffer;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.jni.NativeArrayBuffer;
import expo.modules.kotlin.jni.worklets.Serializable;
import expo.modules.kotlin.jni.worklets.Worklet;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfFour;
import expo.modules.kotlin.types.EitherOfThree;
import expo.modules.kotlin.types.ValueOrUndefined;
import he.AbstractC4945a;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.C5366d;
import jc.InterfaceC5364b;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oc.C5852a;
import oc.C5853b;
import oc.C5854c;
import oc.C5855d;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;
import qb.InterfaceC6168b;
import rc.C6304a;
import rc.C6305b;
import sc.C6448a;
import sc.C6449b;
import sc.C6450c;
import tc.C6660a;
import tc.C6661b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements X {

    /* JADX INFO: renamed from: a */
    public static final a0 f55913a;

    /* JADX INFO: renamed from: b */
    private static final Map f55914b;

    /* JADX INFO: renamed from: c */
    private static final Map f55915c;

    /* JADX INFO: renamed from: d */
    private static final Map f55916d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55917a;

        public a(ExpectedType expectedType) {
            this.f55917a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55917a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (Integer) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return Integer.valueOf((int) value.asDouble());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55918a;

        public b(ExpectedType expectedType) {
            this.f55918a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55918a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (Long) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return Long.valueOf((long) value.asDouble());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55919a;

        public c(ExpectedType expectedType) {
            this.f55919a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55919a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (Double) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return Double.valueOf(value.asDouble());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55920a;

        public d(ExpectedType expectedType) {
            this.f55920a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55920a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (Float) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return Float.valueOf((float) value.asDouble());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55921a;

        public e(ExpectedType expectedType) {
            this.f55921a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55921a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (Boolean) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return Boolean.valueOf(value.asBoolean());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55922a;

        public f(ExpectedType expectedType) {
            this.f55922a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55922a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (String) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            String strAsString = value.asString();
            if (strAsString != null) {
                return strAsString;
            }
            throw new DynamicCastException(kotlin.jvm.internal.O.b(String.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55923a;

        public g(ExpectedType expectedType) {
            this.f55923a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55923a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (ReadableArray) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray != null) {
                return readableArrayAsArray;
            }
            throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55924a;

        public h(ExpectedType expectedType) {
            this.f55924a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55924a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (ReadableMap) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableMap readableMapAsMap = value.asMap();
            if (readableMapAsMap != null) {
                return readableMapAsMap;
            }
            throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableMap.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55925a;

        public i(ExpectedType expectedType) {
            this.f55925a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55925a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws cc.x {
            AbstractC5504s.h(value, "value");
            throw new cc.x(kotlin.jvm.internal.O.b(Object.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55926a;

        public j(ExpectedType expectedType) {
            this.f55926a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55926a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws cc.x {
            AbstractC5504s.h(value, "value");
            throw new cc.x(kotlin.jvm.internal.O.b(Object.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55927a;

        public k(ExpectedType expectedType) {
            this.f55927a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55927a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws cc.x {
            AbstractC5504s.h(value, "value");
            throw new cc.x(kotlin.jvm.internal.O.b(Object.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55928a;

        public l(ExpectedType expectedType) {
            this.f55928a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55928a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws cc.x {
            AbstractC5504s.h(value, "value");
            throw new cc.x(kotlin.jvm.internal.O.b(Object.class));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55929a;

        public m(ExpectedType expectedType) {
            this.f55929a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55929a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (int[]) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray == null) {
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
            }
            int size = readableArrayAsArray.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = readableArrayAsArray.getInt(i10);
            }
            return iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55930a;

        public n(ExpectedType expectedType) {
            this.f55930a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55930a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (long[]) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray == null) {
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
            }
            int size = readableArrayAsArray.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = (long) readableArrayAsArray.getDouble(i10);
            }
            return jArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55931a;

        public o(ExpectedType expectedType) {
            this.f55931a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55931a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (double[]) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray == null) {
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
            }
            int size = readableArrayAsArray.size();
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = readableArrayAsArray.getDouble(i10);
            }
            return dArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55932a;

        public p(ExpectedType expectedType) {
            this.f55932a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55932a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (float[]) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray == null) {
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
            }
            int size = readableArrayAsArray.size();
            float[] fArr = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                fArr[i10] = (float) readableArrayAsArray.getDouble(i10);
            }
            return fArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q extends AbstractC5990u {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ExpectedType f55933a;

        public q(ExpectedType expectedType) {
            this.f55933a = expectedType;
        }

        @Override // expo.modules.kotlin.types.b
        public ExpectedType c() {
            return this.f55933a;
        }

        @Override // pc.AbstractC5990u
        public Object e(Object value, Ub.d dVar, boolean z10) {
            AbstractC5504s.h(value, "value");
            return (boolean[]) value;
        }

        @Override // pc.AbstractC5990u
        public Object f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException {
            AbstractC5504s.h(value, "value");
            ReadableArray readableArrayAsArray = value.asArray();
            if (readableArrayAsArray == null) {
                throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
            }
            int size = readableArrayAsArray.size();
            boolean[] zArr = new boolean[size];
            for (int i10 = 0; i10 < size; i10++) {
                zArr[i10] = readableArrayAsArray.getBoolean(i10);
            }
            return zArr;
        }
    }

    static {
        a0 a0Var = new a0();
        f55913a = a0Var;
        f55914b = a0Var.b();
        f55915c = a0Var.c();
        f55916d = new LinkedHashMap();
    }

    private a0() {
    }

    private final Map b() {
        a aVar = new a(new ExpectedType(EnumC4666a.f45832e));
        b bVar = new b(new ExpectedType(EnumC4666a.f45833f));
        c cVar = new c(new ExpectedType(EnumC4666a.f45831d));
        d dVar = new d(new ExpectedType(EnumC4666a.f45834g));
        e eVar = new e(new ExpectedType(EnumC4666a.f45835h));
        C6660a c6660a = new C6660a();
        Map mapL = Ud.S.l(Td.z.a(kotlin.jvm.internal.O.b(Integer.TYPE), aVar), Td.z.a(kotlin.jvm.internal.O.b(Integer.class), aVar), Td.z.a(kotlin.jvm.internal.O.b(Long.TYPE), bVar), Td.z.a(kotlin.jvm.internal.O.b(Long.class), bVar), Td.z.a(kotlin.jvm.internal.O.b(Double.TYPE), cVar), Td.z.a(kotlin.jvm.internal.O.b(Double.class), cVar), Td.z.a(kotlin.jvm.internal.O.b(Float.TYPE), dVar), Td.z.a(kotlin.jvm.internal.O.b(Float.class), dVar), Td.z.a(kotlin.jvm.internal.O.b(Boolean.TYPE), eVar), Td.z.a(kotlin.jvm.internal.O.b(Boolean.class), eVar), Td.z.a(kotlin.jvm.internal.O.b(String.class), new f(new ExpectedType(EnumC4666a.f45836i))), Td.z.a(kotlin.jvm.internal.O.b(ReadableArray.class), new g(new ExpectedType(EnumC4666a.f45839l))), Td.z.a(kotlin.jvm.internal.O.b(ReadableMap.class), new h(new ExpectedType(EnumC4666a.f45840m))), Td.z.a(kotlin.jvm.internal.O.b(byte[].class), new C5980j()), Td.z.a(kotlin.jvm.internal.O.b(JavaScriptValue.class), new i(new ExpectedType(EnumC4666a.f45838k))), Td.z.a(kotlin.jvm.internal.O.b(JavaScriptObject.class), new j(new ExpectedType(EnumC4666a.f45837j))), Td.z.a(kotlin.jvm.internal.O.b(JavaScriptArrayBuffer.class), new k(new ExpectedType(EnumC4666a.f45853z))), Td.z.a(kotlin.jvm.internal.O.b(NativeArrayBuffer.class), new l(new ExpectedType(EnumC4666a.f45826A))), Td.z.a(kotlin.jvm.internal.O.b(Serializable.class), c6660a), Td.z.a(kotlin.jvm.internal.O.b(Worklet.class), new C6661b(c6660a)), Td.z.a(kotlin.jvm.internal.O.b(oc.h.class), new C5966H()), Td.z.a(kotlin.jvm.internal.O.b(oc.f.class), new C5964F()), Td.z.a(kotlin.jvm.internal.O.b(oc.g.class), new C5965G()), Td.z.a(kotlin.jvm.internal.O.b(oc.n.class), new f0()), Td.z.a(kotlin.jvm.internal.O.b(oc.o.class), new g0()), Td.z.a(kotlin.jvm.internal.O.b(oc.l.class), new d0()), Td.z.a(kotlin.jvm.internal.O.b(oc.m.class), new e0()), Td.z.a(kotlin.jvm.internal.O.b(C5854c.class), new C5961C()), Td.z.a(kotlin.jvm.internal.O.b(C5855d.class), new C5962D()), Td.z.a(kotlin.jvm.internal.O.b(C5852a.class), new C5978h()), Td.z.a(kotlin.jvm.internal.O.b(C5853b.class), new C5979i()), Td.z.a(kotlin.jvm.internal.O.b(oc.j.class), new c0()), Td.z.a(kotlin.jvm.internal.O.b(URL.class), new C6449b()), Td.z.a(kotlin.jvm.internal.O.b(Uri.class), new C6450c()), Td.z.a(kotlin.jvm.internal.O.b(URI.class), new C6448a()), Td.z.a(kotlin.jvm.internal.O.b(File.class), new C6304a()), Td.z.a(kotlin.jvm.internal.O.b(Ef.a.class), new C5989t()), Td.z.a(kotlin.jvm.internal.O.b(Object.class), new C5973c()), Td.z.a(kotlin.jvm.internal.O.b(Td.L.class), new i0()), Td.z.a(kotlin.jvm.internal.O.b(InterfaceC6168b.class), new T()));
        return Build.VERSION.SDK_INT >= 26 ? Ud.S.p(mapL, Ud.S.l(Td.z.a(kotlin.jvm.internal.O.b(Y.a()), new C6305b()), Td.z.a(kotlin.jvm.internal.O.b(Color.class), new C5982l()), Td.z.a(kotlin.jvm.internal.O.b(Z.a()), new r()))) : mapL;
    }

    private final Map c() {
        InterfaceC6014d interfaceC6014dB = kotlin.jvm.internal.O.b(int[].class);
        ExpectedType.Companion companion = ExpectedType.INSTANCE;
        return Ud.S.l(Td.z.a(interfaceC6014dB, new m(companion.e(EnumC4666a.f45832e))), Td.z.a(kotlin.jvm.internal.O.b(long[].class), new n(companion.e(EnumC4666a.f45833f))), Td.z.a(kotlin.jvm.internal.O.b(double[].class), new o(companion.e(EnumC4666a.f45831d))), Td.z.a(kotlin.jvm.internal.O.b(float[].class), new p(companion.e(EnumC4666a.f45834g))), Td.z.a(kotlin.jvm.internal.O.b(boolean[].class), new q(companion.e(EnumC4666a.f45835h))));
    }

    private final expo.modules.kotlin.types.b d(InterfaceC6027q interfaceC6027q) {
        return (expo.modules.kotlin.types.b) f55914b.get(interfaceC6027q.c());
    }

    private final expo.modules.kotlin.types.b e(InterfaceC6027q interfaceC6027q) {
        return (expo.modules.kotlin.types.b) f55915c.get(interfaceC6027q.c());
    }

    private final expo.modules.kotlin.types.b f(InterfaceC6027q interfaceC6027q, Class cls) {
        if (Either.class.isAssignableFrom(cls)) {
            return EitherOfFour.class.isAssignableFrom(cls) ? new C5991v(this, interfaceC6027q) : EitherOfThree.class.isAssignableFrom(cls) ? new C5992w(this, interfaceC6027q) : new C5993x(this, interfaceC6027q);
        }
        return null;
    }

    @Override // pc.X
    public expo.modules.kotlin.types.b a(InterfaceC6027q type) throws cc.r {
        AbstractC5504s.h(type, "type");
        expo.modules.kotlin.types.b bVarG = g(type);
        return type.b() ? new Q(bVarG) : bVarG;
    }

    public final expo.modules.kotlin.types.b g(InterfaceC6027q type) throws cc.r {
        AbstractC5504s.h(type, "type");
        expo.modules.kotlin.types.b bVarD = d(type);
        if (bVarD != null) {
            return bVarD;
        }
        InterfaceC6016f interfaceC6016fC = type.c();
        InterfaceC6014d interfaceC6014d = interfaceC6016fC instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC : null;
        if (interfaceC6014d == null) {
            throw new cc.r(type);
        }
        Class clsB = AbstractC4945a.b(interfaceC6014d);
        if (clsB.isArray() || Object[].class.isAssignableFrom(clsB)) {
            if (!AbstractC5976f.a(type, clsB)) {
                return new C5975e(this, type);
            }
            expo.modules.kotlin.types.b bVarE = e(type);
            if (bVarE != null) {
                return bVarE;
            }
            throw new cc.r(type);
        }
        if (List.class.isAssignableFrom(clsB)) {
            return new N(this, type);
        }
        if (Map.class.isAssignableFrom(clsB)) {
            return new O(this, type);
        }
        if (Pair.class.isAssignableFrom(clsB)) {
            return new S(this, type);
        }
        if (Set.class.isAssignableFrom(clsB)) {
            return new W(this, type);
        }
        if (clsB.isEnum()) {
            return new C5960B(interfaceC6014d);
        }
        Map map = f55916d;
        expo.modules.kotlin.types.b bVar = (expo.modules.kotlin.types.b) map.get(type);
        if (bVar != null) {
            return bVar;
        }
        if (InterfaceC5364b.class.isAssignableFrom(clsB)) {
            C5366d c5366d = new C5366d(this, type);
            map.put(type, c5366d);
            return c5366d;
        }
        if (View.class.isAssignableFrom(clsB)) {
            return new expo.modules.kotlin.views.u(type);
        }
        if (SharedRef.class.isAssignableFrom(clsB)) {
            return new nc.i(type);
        }
        if (SharedObject.class.isAssignableFrom(clsB)) {
            return new nc.f(type);
        }
        if (JavaScriptFunction.class.isAssignableFrom(clsB)) {
            return new C5970L(type);
        }
        if (ValueOrUndefined.class.isAssignableFrom(clsB)) {
            return new expo.modules.kotlin.types.d(this, type);
        }
        expo.modules.kotlin.types.b bVarF = f(type, clsB);
        if (bVarF != null) {
            return bVarF;
        }
        throw new cc.r(type);
    }
}
