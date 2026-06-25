package u7;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6742b extends K6.b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f61408D = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ReadableMap f61409B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final EnumC6741a f61410C;

    /* JADX INFO: renamed from: u7.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C6742b b(a aVar, K6.c cVar, ReadableMap readableMap, EnumC6741a enumC6741a, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                enumC6741a = EnumC6741a.f61402a;
            }
            return aVar.a(cVar, readableMap, enumC6741a);
        }

        public final C6742b a(K6.c builder, ReadableMap readableMap, EnumC6741a cacheControl) {
            AbstractC5504s.h(builder, "builder");
            AbstractC5504s.h(cacheControl, "cacheControl");
            return new C6742b(builder, readableMap, cacheControl, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C6742b(K6.c cVar, ReadableMap readableMap, EnumC6741a enumC6741a, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, readableMap, enumC6741a);
    }

    public final EnumC6741a A() {
        return this.f61410C;
    }

    public final ReadableMap B() {
        return this.f61409B;
    }

    private C6742b(K6.c cVar, ReadableMap readableMap, EnumC6741a enumC6741a) {
        super(cVar);
        this.f61409B = readableMap;
        this.f61410C = enumC6741a;
    }
}
