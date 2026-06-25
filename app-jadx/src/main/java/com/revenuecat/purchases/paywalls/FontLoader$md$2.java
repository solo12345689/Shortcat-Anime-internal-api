package com.revenuecat.purchases.paywalls;

import ie.InterfaceC5082a;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FontLoader$md$2 extends AbstractC5506u implements InterfaceC5082a {
    public static final FontLoader$md$2 INSTANCE = new FontLoader$md$2();

    FontLoader$md$2() {
        super(0);
    }

    @Override // ie.InterfaceC5082a
    public final MessageDigest invoke() {
        return MessageDigest.getInstance("MD5");
    }
}
