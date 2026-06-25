package pc;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.graphics.Color;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pc.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5982l extends AbstractC5990u {

    /* JADX INFO: renamed from: pc.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55953a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55953a = iArr;
        }
    }

    private final Color g(double[] dArr) {
        Double dG0 = AbstractC2273n.g0(dArr, 3);
        Color colorValueOf = Color.valueOf((float) dArr[0], (float) dArr[1], (float) dArr[2], (float) (dG0 != null ? dG0.doubleValue() : 1.0d));
        AbstractC5504s.g(colorValueOf, "valueOf(...)");
        return colorValueOf;
    }

    private final Color h(int i10) {
        Color colorValueOf = Color.valueOf(i10);
        AbstractC5504s.g(colorValueOf, "valueOf(...)");
        return colorValueOf;
    }

    private final Color i(String str) {
        List list = (List) AbstractC5983m.f55954a.get(str);
        if (list != null) {
            Color colorValueOf = Color.valueOf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
            AbstractC5504s.g(colorValueOf, "valueOf(...)");
            return colorValueOf;
        }
        Color colorValueOf2 = Color.valueOf(Color.parseColor(str));
        AbstractC5504s.g(colorValueOf2, "valueOf(...)");
        return colorValueOf2;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(new SingleType(EnumC4666a.f45832e, null, 2, null), new SingleType(EnumC4666a.f45836i, null, 2, null), new SingleType(EnumC4666a.f45843p, new ExpectedType[]{new ExpectedType(EnumC4666a.f45831d)}));
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Color e(Object value, Ub.d dVar, boolean z10) throws UnexpectedException {
        AbstractC5504s.h(value, "value");
        if (value instanceof Integer) {
            return h(((Number) value).intValue());
        }
        if (value instanceof String) {
            return i((String) value);
        }
        if (value instanceof double[]) {
            return g((double[]) value);
        }
        throw new UnexpectedException("Unknown argument type: " + kotlin.jvm.internal.O.b(value.getClass()));
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Color f(Dynamic value, Ub.d dVar, boolean z10) throws DynamicCastException, UnexpectedException {
        AbstractC5504s.h(value, "value");
        int i10 = a.f55953a[value.getType().ordinal()];
        if (i10 == 1) {
            return h((int) value.asDouble());
        }
        if (i10 == 2) {
            String strAsString = value.asString();
            if (strAsString != null) {
                return i(strAsString);
            }
            throw new DynamicCastException(kotlin.jvm.internal.O.b(String.class));
        }
        if (i10 != 3) {
            throw new UnexpectedException("Unknown argument type: " + value.getType());
        }
        ReadableArray readableArrayAsArray = value.asArray();
        if (readableArrayAsArray == null) {
            throw new DynamicCastException(kotlin.jvm.internal.O.b(ReadableArray.class));
        }
        ArrayList<Object> arrayList = readableArrayAsArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(arrayList, 10));
        for (Object obj : arrayList) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Double");
            Double d10 = (Double) obj;
            d10.doubleValue();
            arrayList2.add(d10);
        }
        return g(AbstractC2279u.X0(arrayList2));
    }
}
