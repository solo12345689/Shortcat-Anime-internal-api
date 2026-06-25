package expo.modules.kotlin.exception;

import cc.AbstractC3094b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC3094b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0732a f46120c = new C0732a(null);

    /* JADX INFO: renamed from: expo.modules.kotlin.exception.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0732a {
        public /* synthetic */ C0732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            int i11 = i10 % 100;
            String str = "th";
            if (11 > i11 || i11 >= 14) {
                int i12 = i10 % 10;
                if (i12 == 1) {
                    str = "st";
                } else if (i12 == 2) {
                    str = "nd";
                } else if (i12 == 3) {
                    str = "rd";
                }
            }
            return i10 + str;
        }

        private C0732a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC6027q argDesiredType, int i10, String providedType, CodedException cause) {
        super("The " + f46120c.a(i10 + 1) + " argument cannot be cast to type " + argDesiredType + " (received " + providedType + ")", cause);
        AbstractC5504s.h(argDesiredType, "argDesiredType");
        AbstractC5504s.h(providedType, "providedType");
        AbstractC5504s.h(cause, "cause");
    }
}
