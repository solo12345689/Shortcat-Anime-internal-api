package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Td.L;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b&\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;", "", "", com.amazon.a.a.o.b.f34645c, "Lkotlin/Function1;", "LTd/L;", "onDescriptionChange", "", "enabled", "showDone", "Lkotlin/Function0;", "onSubmit", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZZLie/a;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Z", "component4", "component5", "()Lie/a;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZZLie/a;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/DescriptionInputState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Lkotlin/jvm/functions/Function1;", "getOnDescriptionChange", "Z", "getEnabled", "getShowDone", "Lie/a;", "getOnSubmit", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DescriptionInputState {
    private final String description;
    private final boolean enabled;
    private final Function1 onDescriptionChange;
    private final InterfaceC5082a onSubmit;
    private final boolean showDone;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m731invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m731invoke();
            return L.f17438a;
        }
    }

    public DescriptionInputState(String description, Function1 onDescriptionChange, boolean z10, boolean z11, InterfaceC5082a onSubmit) {
        AbstractC5504s.h(description, "description");
        AbstractC5504s.h(onDescriptionChange, "onDescriptionChange");
        AbstractC5504s.h(onSubmit, "onSubmit");
        this.description = description;
        this.onDescriptionChange = onDescriptionChange;
        this.enabled = z10;
        this.showDone = z11;
        this.onSubmit = onSubmit;
    }

    public static /* synthetic */ DescriptionInputState copy$default(DescriptionInputState descriptionInputState, String str, Function1 function1, boolean z10, boolean z11, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = descriptionInputState.description;
        }
        if ((i10 & 2) != 0) {
            function1 = descriptionInputState.onDescriptionChange;
        }
        if ((i10 & 4) != 0) {
            z10 = descriptionInputState.enabled;
        }
        if ((i10 & 8) != 0) {
            z11 = descriptionInputState.showDone;
        }
        if ((i10 & 16) != 0) {
            interfaceC5082a = descriptionInputState.onSubmit;
        }
        InterfaceC5082a interfaceC5082a2 = interfaceC5082a;
        boolean z12 = z10;
        return descriptionInputState.copy(str, function1, z12, z11, interfaceC5082a2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Function1 getOnDescriptionChange() {
        return this.onDescriptionChange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowDone() {
        return this.showDone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InterfaceC5082a getOnSubmit() {
        return this.onSubmit;
    }

    public final DescriptionInputState copy(String description, Function1 onDescriptionChange, boolean enabled, boolean showDone, InterfaceC5082a onSubmit) {
        AbstractC5504s.h(description, "description");
        AbstractC5504s.h(onDescriptionChange, "onDescriptionChange");
        AbstractC5504s.h(onSubmit, "onSubmit");
        return new DescriptionInputState(description, onDescriptionChange, enabled, showDone, onSubmit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DescriptionInputState)) {
            return false;
        }
        DescriptionInputState descriptionInputState = (DescriptionInputState) other;
        return AbstractC5504s.c(this.description, descriptionInputState.description) && AbstractC5504s.c(this.onDescriptionChange, descriptionInputState.onDescriptionChange) && this.enabled == descriptionInputState.enabled && this.showDone == descriptionInputState.showDone && AbstractC5504s.c(this.onSubmit, descriptionInputState.onSubmit);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Function1 getOnDescriptionChange() {
        return this.onDescriptionChange;
    }

    public final InterfaceC5082a getOnSubmit() {
        return this.onSubmit;
    }

    public final boolean getShowDone() {
        return this.showDone;
    }

    public int hashCode() {
        return (((((((this.description.hashCode() * 31) + this.onDescriptionChange.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.showDone)) * 31) + this.onSubmit.hashCode();
    }

    public String toString() {
        return "DescriptionInputState(description=" + this.description + ", onDescriptionChange=" + this.onDescriptionChange + ", enabled=" + this.enabled + ", showDone=" + this.showDone + ", onSubmit=" + this.onSubmit + ')';
    }

    public /* synthetic */ DescriptionInputState(String str, Function1 function1, boolean z10, boolean z11, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? AnonymousClass1.INSTANCE : interfaceC5082a);
    }
}
