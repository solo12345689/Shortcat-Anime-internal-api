package a4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a4.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2573h {

    /* JADX INFO: renamed from: a */
    public static final a f23783a = new a(null);

    /* JADX INFO: renamed from: a4.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC2573h b(a aVar, Object obj, String str, EnumC2575j enumC2575j, InterfaceC2572g interfaceC2572g, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                enumC2575j = C2568c.f23766a.a();
            }
            if ((i10 & 4) != 0) {
                interfaceC2572g = C2566a.f23761a;
            }
            return aVar.a(obj, str, enumC2575j, interfaceC2572g);
        }

        public final AbstractC2573h a(Object obj, String tag, EnumC2575j verificationMode, InterfaceC2572g logger) {
            AbstractC5504s.h(obj, "<this>");
            AbstractC5504s.h(tag, "tag");
            AbstractC5504s.h(verificationMode, "verificationMode");
            AbstractC5504s.h(logger, "logger");
            return new C2574i(obj, tag, verificationMode, logger);
        }

        private a() {
        }
    }

    public abstract Object a();

    protected final String b(Object value, String message) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(message, "message");
        return message + " value: " + value;
    }

    public abstract AbstractC2573h c(String str, Function1 function1);
}
