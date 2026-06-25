package a4;

import Td.r;
import Ud.AbstractC2273n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a4.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2571f extends AbstractC2573h {

    /* JADX INFO: renamed from: b */
    private final Object f23776b;

    /* JADX INFO: renamed from: c */
    private final String f23777c;

    /* JADX INFO: renamed from: d */
    private final String f23778d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2572g f23779e;

    /* JADX INFO: renamed from: f */
    private final EnumC2575j f23780f;

    /* JADX INFO: renamed from: g */
    private final C2577l f23781g;

    /* JADX INFO: renamed from: a4.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23782a;

        static {
            int[] iArr = new int[EnumC2575j.values().length];
            try {
                iArr[EnumC2575j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2575j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2575j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23782a = iArr;
        }
    }

    public C2571f(Object value, String tag, String message, InterfaceC2572g logger, EnumC2575j verificationMode) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(verificationMode, "verificationMode");
        this.f23776b = value;
        this.f23777c = tag;
        this.f23778d = message;
        this.f23779e = logger;
        this.f23780f = verificationMode;
        C2577l c2577l = new C2577l(b(value, message));
        StackTraceElement[] stackTrace = c2577l.getStackTrace();
        AbstractC5504s.g(stackTrace, "stackTrace");
        c2577l.setStackTrace((StackTraceElement[]) AbstractC2273n.T(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f23781g = c2577l;
    }

    @Override // a4.AbstractC2573h
    public Object a() throws C2577l {
        int i10 = a.f23782a[this.f23780f.ordinal()];
        if (i10 == 1) {
            throw this.f23781g;
        }
        if (i10 == 2) {
            this.f23779e.a(this.f23777c, b(this.f23776b, this.f23778d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new r();
    }

    @Override // a4.AbstractC2573h
    public AbstractC2573h c(String message, Function1 condition) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(condition, "condition");
        return this;
    }
}
