package H7;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8035a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: H7.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class C0103a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8036a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Map.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f8036a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(Dynamic dynamic) {
            ReadableMap readableMapAsMap;
            f fVarA;
            if (dynamic == null) {
                return null;
            }
            if (C0103a.f8036a[dynamic.getType().ordinal()] != 1 || (readableMapAsMap = dynamic.asMap()) == null || (fVarA = f.f8038c.a(readableMapAsMap)) == null) {
                return null;
            }
            return new b(fVarA);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f8037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f lengthPercentage) {
            super(null);
            AbstractC5504s.h(lengthPercentage, "lengthPercentage");
            this.f8037b = lengthPercentage;
        }

        public final f a() {
            return this.f8037b;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
