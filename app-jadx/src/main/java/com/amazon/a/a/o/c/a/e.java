package com.amazon.a.a.o.c.a;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f34721a;

    public e(String str) {
        this(Pattern.compile(str));
    }

    @Override // com.amazon.a.a.o.c.a.a
    public boolean a(String str) {
        return this.f34721a.matcher(str).matches();
    }

    public e(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Null pattern");
        }
        this.f34721a = pattern;
    }
}
