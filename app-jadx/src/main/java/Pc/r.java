package pc;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import ec.EnumC4666a;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC5990u {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55956a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55956a = iArr;
        }
    }

    private final LocalDate i(long j10) {
        LocalDate localDate = Instant.ofEpochMilli(j10).atZone(ZoneId.systemDefault()).toLocalDate();
        AbstractC5504s.g(localDate, "toLocalDate(...)");
        return localDate;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(new SingleType(EnumC4666a.f45832e, null, 2, null), new SingleType(EnumC4666a.f45836i, null, 2, null));
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public LocalDate e(Object value, Ub.d dVar, boolean z10) throws UnexpectedException {
        AbstractC5504s.h(value, "value");
        if (value instanceof String) {
            LocalDate localDate = LocalDate.parse((CharSequence) value, DateTimeFormatter.ISO_DATE_TIME);
            AbstractC5504s.g(localDate, "parse(...)");
            return localDate;
        }
        if (value instanceof Long) {
            return i(((Number) value).longValue());
        }
        throw new UnexpectedException("Unknown argument type: " + kotlin.jvm.internal.O.b(value.getClass()));
    }

    @Override // pc.AbstractC5990u
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public LocalDate f(Dynamic value, Ub.d dVar, boolean z10) throws UnexpectedException {
        AbstractC5504s.h(value, "value");
        int i10 = a.f55956a[value.getType().ordinal()];
        if (i10 == 1) {
            LocalDate localDate = LocalDate.parse(value.asString(), DateTimeFormatter.ISO_DATE_TIME);
            AbstractC5504s.g(localDate, "parse(...)");
            return localDate;
        }
        if (i10 == 2) {
            return i((long) value.asDouble());
        }
        throw new UnexpectedException("Unknown argument type: " + value.getType());
    }
}
