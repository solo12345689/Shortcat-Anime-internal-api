package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f49172b;

    public F(String str) {
        Pattern patternCompile;
        this.f49171a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            AbstractC5204g2.r().h().getLogger().c(EnumC5215i3.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f49172b = patternCompile;
    }

    public String a() {
        return this.f49171a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f49172b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f49171a, ((F) obj).f49171a);
    }

    public int hashCode() {
        return Objects.hash(this.f49171a);
    }
}
