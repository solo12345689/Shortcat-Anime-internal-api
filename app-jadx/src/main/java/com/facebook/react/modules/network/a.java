package com.facebook.react.modules.network;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0621a f37058a = new C0621a(null);

    /* JADX INFO: renamed from: com.facebook.react.modules.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0621a {
        public /* synthetic */ C0621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String name) {
            AbstractC5504s.h(name, "name");
            StringBuilder sb2 = new StringBuilder(name.length());
            int length = name.length();
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (AbstractC5504s.i(cCharAt, 32) <= 0 || AbstractC5504s.i(cCharAt, 127) >= 0) {
                    z10 = true;
                } else {
                    sb2.append(cCharAt);
                }
            }
            if (!z10) {
                return name;
            }
            String string = sb2.toString();
            AbstractC5504s.g(string, "toString(...)");
            return string;
        }

        private C0621a() {
        }
    }
}
