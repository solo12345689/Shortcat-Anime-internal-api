package com.revenuecat.purchases.hybridcommon.mappers;

import Gf.C1608f0;
import Gf.K;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGf/K;", "invoke", "()LGf/K;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class MappersHelpersKt$mapperDispatcher$2 extends AbstractC5506u implements InterfaceC5082a {
    public static final MappersHelpersKt$mapperDispatcher$2 INSTANCE = new MappersHelpersKt$mapperDispatcher$2();

    MappersHelpersKt$mapperDispatcher$2() {
        super(0);
    }

    @Override // ie.InterfaceC5082a
    public final K invoke() {
        K overrideMapperDispatcher = MappersHelpersKt.getOverrideMapperDispatcher();
        return overrideMapperDispatcher == null ? C1608f0.a() : overrideMapperDispatcher;
    }
}
