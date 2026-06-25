package com.revenuecat.purchases;

import Wf.AbstractC2358b;
import Wf.u;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/JsonTools;", "", "<init>", "()V", "LWf/b;", "json", "LWf/b;", "getJson", "()LWf/b;", "getJson$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsonTools {
    public static final JsonTools INSTANCE = new JsonTools();
    private static final AbstractC2358b json = u.b(null, JsonTools$json$1.INSTANCE, 1, null);

    private JsonTools() {
    }

    public final AbstractC2358b getJson() {
        return json;
    }

    public static /* synthetic */ void getJson$annotations() {
    }
}
