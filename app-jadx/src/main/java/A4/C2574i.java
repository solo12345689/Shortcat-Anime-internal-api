package a4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2574i extends AbstractC2573h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC2575j f23786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2572g f23787e;

    public C2574i(Object value, String tag, EnumC2575j verificationMode, InterfaceC2572g logger) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(verificationMode, "verificationMode");
        AbstractC5504s.h(logger, "logger");
        this.f23784b = value;
        this.f23785c = tag;
        this.f23786d = verificationMode;
        this.f23787e = logger;
    }

    @Override // a4.AbstractC2573h
    public Object a() {
        return this.f23784b;
    }

    @Override // a4.AbstractC2573h
    public AbstractC2573h c(String message, Function1 condition) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(condition, "condition");
        return ((Boolean) condition.invoke(this.f23784b)).booleanValue() ? this : new C2571f(this.f23784b, this.f23785c, message, this.f23787e, this.f23786d);
    }
}
