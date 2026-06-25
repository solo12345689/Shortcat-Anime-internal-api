package S3;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0271a f15906c = new C0271a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f15908b;

    /* JADX INFO: renamed from: S3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0271a {
        public /* synthetic */ C0271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            if (obj == null) {
                iVar.I1(i10);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.p1(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.b0(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.b0(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.m1(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.m1(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.m1(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.m1(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.Z0(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.m1(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] objArr) {
            AbstractC5504s.h(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        private C0271a() {
        }
    }

    public a(String query, Object[] objArr) {
        AbstractC5504s.h(query, "query");
        this.f15907a = query;
        this.f15908b = objArr;
    }

    @Override // S3.j
    public String a() {
        return this.f15907a;
    }

    @Override // S3.j
    public void b(i statement) {
        AbstractC5504s.h(statement, "statement");
        f15906c.b(statement, this.f15908b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String query) {
        this(query, null);
        AbstractC5504s.h(query, "query");
    }
}
