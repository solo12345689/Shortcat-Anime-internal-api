package com.facebook.react.common;

import be.AbstractC3048a;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class LifecycleState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LifecycleState f36550a = new LifecycleState("BEFORE_CREATE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LifecycleState f36551b = new LifecycleState("BEFORE_RESUME", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LifecycleState f36552c = new LifecycleState("RESUMED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ LifecycleState[] f36553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f36554e;

    static {
        LifecycleState[] lifecycleStateArrA = a();
        f36553d = lifecycleStateArrA;
        f36554e = AbstractC3048a.a(lifecycleStateArrA);
    }

    private LifecycleState(String str, int i10) {
    }

    private static final /* synthetic */ LifecycleState[] a() {
        return new LifecycleState[]{f36550a, f36551b, f36552c};
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) f36553d.clone();
    }
}
