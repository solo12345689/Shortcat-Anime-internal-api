package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JZ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/EmailInputState;", "", "", "email", "Lkotlin/Function1;", "LTd/L;", "onEmailChange", "", "onFocusChanged", "showError", "enabled", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/EmailInputState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "Lkotlin/jvm/functions/Function1;", "getOnEmailChange", "getOnFocusChanged", "Z", "getShowError", "getEnabled", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EmailInputState {
    private final String email;
    private final boolean enabled;
    private final Function1 onEmailChange;
    private final Function1 onFocusChanged;
    private final boolean showError;

    public EmailInputState(String email, Function1 onEmailChange, Function1 onFocusChanged, boolean z10, boolean z11) {
        AbstractC5504s.h(email, "email");
        AbstractC5504s.h(onEmailChange, "onEmailChange");
        AbstractC5504s.h(onFocusChanged, "onFocusChanged");
        this.email = email;
        this.onEmailChange = onEmailChange;
        this.onFocusChanged = onFocusChanged;
        this.showError = z10;
        this.enabled = z11;
    }

    public static /* synthetic */ EmailInputState copy$default(EmailInputState emailInputState, String str, Function1 function1, Function1 function12, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emailInputState.email;
        }
        if ((i10 & 2) != 0) {
            function1 = emailInputState.onEmailChange;
        }
        if ((i10 & 4) != 0) {
            function12 = emailInputState.onFocusChanged;
        }
        if ((i10 & 8) != 0) {
            z10 = emailInputState.showError;
        }
        if ((i10 & 16) != 0) {
            z11 = emailInputState.enabled;
        }
        boolean z12 = z11;
        Function1 function13 = function12;
        return emailInputState.copy(str, function1, function13, z10, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Function1 getOnEmailChange() {
        return this.onEmailChange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Function1 getOnFocusChanged() {
        return this.onFocusChanged;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final EmailInputState copy(String email, Function1 onEmailChange, Function1 onFocusChanged, boolean showError, boolean enabled) {
        AbstractC5504s.h(email, "email");
        AbstractC5504s.h(onEmailChange, "onEmailChange");
        AbstractC5504s.h(onFocusChanged, "onFocusChanged");
        return new EmailInputState(email, onEmailChange, onFocusChanged, showError, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailInputState)) {
            return false;
        }
        EmailInputState emailInputState = (EmailInputState) other;
        return AbstractC5504s.c(this.email, emailInputState.email) && AbstractC5504s.c(this.onEmailChange, emailInputState.onEmailChange) && AbstractC5504s.c(this.onFocusChanged, emailInputState.onFocusChanged) && this.showError == emailInputState.showError && this.enabled == emailInputState.enabled;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Function1 getOnEmailChange() {
        return this.onEmailChange;
    }

    public final Function1 getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        return (((((((this.email.hashCode() * 31) + this.onEmailChange.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.showError)) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "EmailInputState(email=" + this.email + ", onEmailChange=" + this.onEmailChange + ", onFocusChanged=" + this.onFocusChanged + ", showError=" + this.showError + ", enabled=" + this.enabled + ')';
    }
}
