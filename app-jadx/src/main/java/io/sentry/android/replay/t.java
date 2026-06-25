package io.sentry.android.replay;

import R0.B;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f50410a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final B f50411b = new B("SentryPrivacy", a.f50413a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f50412c = B.f14926e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50413a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            AbstractC5504s.h(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    private t() {
    }

    public final B a() {
        return f50411b;
    }
}
