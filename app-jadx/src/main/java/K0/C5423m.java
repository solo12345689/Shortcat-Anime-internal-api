package k0;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: k0.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5423m extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final List f51980a;

    public C5423m(List list) {
        this.f51980a = list;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Composition stack when thrown:");
        AbstractC5504s.g(sb2, "append(...)");
        sb2.append('\n');
        AbstractC5504s.g(sb2, "append(...)");
        AbstractC5414d.a(sb2, this.f51980a);
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
