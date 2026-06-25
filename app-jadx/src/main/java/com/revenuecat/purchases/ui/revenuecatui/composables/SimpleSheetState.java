package com.revenuecat.purchases.ui.revenuecatui.composables;

import Y.C0;
import Y.b2;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0003R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;", "", "<init>", "()V", "", "backgroundBlur", "Lkotlin/Function0;", "LTd/L;", "content", "onDismiss", "show", "(ZLkotlin/jvm/functions/Function2;Lie/a;)V", "hide", "<set-?>", "backgroundBlur$delegate", "LY/C0;", "getBackgroundBlur", "()Z", "setBackgroundBlur", "(Z)V", "content$delegate", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "visible$delegate", "getVisible", "setVisible", "visible", "Lie/a;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleSheetState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: backgroundBlur$delegate, reason: from kotlin metadata */
    private final C0 backgroundBlur;

    /* JADX INFO: renamed from: content$delegate, reason: from kotlin metadata */
    private final C0 content;
    private InterfaceC5082a onDismiss;

    /* JADX INFO: renamed from: visible$delegate, reason: from kotlin metadata */
    private final C0 visible;

    public SimpleSheetState() {
        Boolean bool = Boolean.FALSE;
        this.backgroundBlur = b2.e(bool, null, 2, null);
        this.content = b2.e(ComposableSingletons$SimpleBottomSheetScaffoldKt.INSTANCE.m569getLambda1$revenuecatui_defaultsBc8Release(), null, 2, null);
        this.visible = b2.e(bool, null, 2, null);
    }

    private final void setBackgroundBlur(boolean z10) {
        this.backgroundBlur.setValue(Boolean.valueOf(z10));
    }

    private final void setContent(Function2 function2) {
        this.content.setValue(function2);
    }

    private final void setVisible(boolean z10) {
        this.visible.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void show$default(SimpleSheetState simpleSheetState, boolean z10, Function2 function2, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC5082a = null;
        }
        simpleSheetState.show(z10, function2, interfaceC5082a);
    }

    public final /* synthetic */ boolean getBackgroundBlur() {
        return ((Boolean) this.backgroundBlur.getValue()).booleanValue();
    }

    public final /* synthetic */ Function2 getContent() {
        return (Function2) this.content.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible.getValue()).booleanValue();
    }

    public final void hide() {
        setBackgroundBlur(false);
        setVisible(false);
        InterfaceC5082a interfaceC5082a = this.onDismiss;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
        this.onDismiss = null;
    }

    public final void show(boolean backgroundBlur, Function2 content, InterfaceC5082a onDismiss) {
        AbstractC5504s.h(content, "content");
        setBackgroundBlur(backgroundBlur);
        setContent(content);
        this.onDismiss = onDismiss;
        setVisible(true);
    }
}
