package Rf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List missingFields, String str, Throwable th2) {
        super(str, th2);
        AbstractC5504s.h(missingFields, "missingFields");
        this.f15507a = missingFields;
    }

    public final List a() {
        return this.f15507a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(List missingFields, String serialName) {
        String str;
        AbstractC5504s.h(missingFields, "missingFields");
        AbstractC5504s.h(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
