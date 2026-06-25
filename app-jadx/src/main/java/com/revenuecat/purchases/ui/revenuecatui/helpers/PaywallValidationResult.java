package com.revenuecat.purchases.ui.revenuecatui.helpers;

import app.notifee.core.event.LogEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0007\bR\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;", "", "errors", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "getErrors", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Components", "Legacy", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaywallValidationResult {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0012HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010\u001eJx\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0014HÖ\u0001J\t\u0010=\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;", "stack", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "stickyFooter", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "locales", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "zeroDecimalPlaceCountries", "", "", "variableConfig", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableDataProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "packages", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "initialSelectedTabIndex", "", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;Ljava/util/Set;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;Ljava/lang/Integer;)V", "getBackground", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;", "errors", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "getErrors", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "getInitialSelectedTabIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocales", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;", "getPackages", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;", "getStack", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "getStickyFooter", "getVariableConfig", "()Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableDataProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;", "getZeroDecimalPlaceCountries", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptySet;Ljava/util/Set;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$AvailablePackages;Ljava/lang/Integer;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Components;", "equals", "", "other", "", "hashCode", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Components implements PaywallValidationResult {
        public static final int $stable = 8;
        private final BackgroundStyles background;
        private final NonEmptyList<PaywallValidationError> errors;
        private final Integer initialSelectedTabIndex;
        private final NonEmptySet<LocaleId> locales;
        private final PaywallState.Loaded.Components.AvailablePackages packages;
        private final ComponentStyle stack;
        private final ComponentStyle stickyFooter;
        private final UiConfig.VariableConfig variableConfig;
        private final VariableDataProvider variableDataProvider;
        private final Set<String> zeroDecimalPlaceCountries;

        public Components(ComponentStyle stack, ComponentStyle componentStyle, BackgroundStyles background, NonEmptySet<LocaleId> locales, Set<String> zeroDecimalPlaceCountries, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, PaywallState.Loaded.Components.AvailablePackages packages, Integer num) {
            AbstractC5504s.h(stack, "stack");
            AbstractC5504s.h(background, "background");
            AbstractC5504s.h(locales, "locales");
            AbstractC5504s.h(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
            AbstractC5504s.h(variableConfig, "variableConfig");
            AbstractC5504s.h(variableDataProvider, "variableDataProvider");
            AbstractC5504s.h(packages, "packages");
            this.stack = stack;
            this.stickyFooter = componentStyle;
            this.background = background;
            this.locales = locales;
            this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
            this.variableConfig = variableConfig;
            this.variableDataProvider = variableDataProvider;
            this.packages = packages;
            this.initialSelectedTabIndex = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Components copy$default(Components components, ComponentStyle componentStyle, ComponentStyle componentStyle2, BackgroundStyles backgroundStyles, NonEmptySet nonEmptySet, Set set, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, PaywallState.Loaded.Components.AvailablePackages availablePackages, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                componentStyle = components.stack;
            }
            if ((i10 & 2) != 0) {
                componentStyle2 = components.stickyFooter;
            }
            if ((i10 & 4) != 0) {
                backgroundStyles = components.background;
            }
            if ((i10 & 8) != 0) {
                nonEmptySet = components.locales;
            }
            if ((i10 & 16) != 0) {
                set = components.zeroDecimalPlaceCountries;
            }
            if ((i10 & 32) != 0) {
                variableConfig = components.variableConfig;
            }
            if ((i10 & 64) != 0) {
                variableDataProvider = components.variableDataProvider;
            }
            if ((i10 & 128) != 0) {
                availablePackages = components.packages;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                num = components.initialSelectedTabIndex;
            }
            PaywallState.Loaded.Components.AvailablePackages availablePackages2 = availablePackages;
            Integer num2 = num;
            UiConfig.VariableConfig variableConfig2 = variableConfig;
            VariableDataProvider variableDataProvider2 = variableDataProvider;
            Set set2 = set;
            BackgroundStyles backgroundStyles2 = backgroundStyles;
            return components.copy(componentStyle, componentStyle2, backgroundStyles2, nonEmptySet, set2, variableConfig2, variableDataProvider2, availablePackages2, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ComponentStyle getStack() {
            return this.stack;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ComponentStyle getStickyFooter() {
            return this.stickyFooter;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final BackgroundStyles getBackground() {
            return this.background;
        }

        public final NonEmptySet<LocaleId> component4() {
            return this.locales;
        }

        public final Set<String> component5() {
            return this.zeroDecimalPlaceCountries;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final UiConfig.VariableConfig getVariableConfig() {
            return this.variableConfig;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final VariableDataProvider getVariableDataProvider() {
            return this.variableDataProvider;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final PaywallState.Loaded.Components.AvailablePackages getPackages() {
            return this.packages;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getInitialSelectedTabIndex() {
            return this.initialSelectedTabIndex;
        }

        public final Components copy(ComponentStyle stack, ComponentStyle stickyFooter, BackgroundStyles backgroundStyles, NonEmptySet<LocaleId> locales, Set<String> zeroDecimalPlaceCountries, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, PaywallState.Loaded.Components.AvailablePackages packages, Integer initialSelectedTabIndex) {
            AbstractC5504s.h(stack, "stack");
            AbstractC5504s.h(backgroundStyles, "background");
            AbstractC5504s.h(locales, "locales");
            AbstractC5504s.h(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
            AbstractC5504s.h(variableConfig, "variableConfig");
            AbstractC5504s.h(variableDataProvider, "variableDataProvider");
            AbstractC5504s.h(packages, "packages");
            return new Components(stack, stickyFooter, backgroundStyles, locales, zeroDecimalPlaceCountries, variableConfig, variableDataProvider, packages, initialSelectedTabIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Components)) {
                return false;
            }
            Components components = (Components) other;
            return AbstractC5504s.c(this.stack, components.stack) && AbstractC5504s.c(this.stickyFooter, components.stickyFooter) && AbstractC5504s.c(this.background, components.background) && AbstractC5504s.c(this.locales, components.locales) && AbstractC5504s.c(this.zeroDecimalPlaceCountries, components.zeroDecimalPlaceCountries) && AbstractC5504s.c(this.variableConfig, components.variableConfig) && AbstractC5504s.c(this.variableDataProvider, components.variableDataProvider) && AbstractC5504s.c(this.packages, components.packages) && AbstractC5504s.c(this.initialSelectedTabIndex, components.initialSelectedTabIndex);
        }

        public final BackgroundStyles getBackground() {
            return this.background;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult
        public NonEmptyList<PaywallValidationError> getErrors() {
            return this.errors;
        }

        public final Integer getInitialSelectedTabIndex() {
            return this.initialSelectedTabIndex;
        }

        public final NonEmptySet<LocaleId> getLocales() {
            return this.locales;
        }

        public final PaywallState.Loaded.Components.AvailablePackages getPackages() {
            return this.packages;
        }

        public final ComponentStyle getStack() {
            return this.stack;
        }

        public final ComponentStyle getStickyFooter() {
            return this.stickyFooter;
        }

        public final UiConfig.VariableConfig getVariableConfig() {
            return this.variableConfig;
        }

        public final VariableDataProvider getVariableDataProvider() {
            return this.variableDataProvider;
        }

        public final Set<String> getZeroDecimalPlaceCountries() {
            return this.zeroDecimalPlaceCountries;
        }

        public int hashCode() {
            int iHashCode = this.stack.hashCode() * 31;
            ComponentStyle componentStyle = this.stickyFooter;
            int iHashCode2 = (((((((((((((iHashCode + (componentStyle == null ? 0 : componentStyle.hashCode())) * 31) + this.background.hashCode()) * 31) + this.locales.hashCode()) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31) + this.variableConfig.hashCode()) * 31) + this.variableDataProvider.hashCode()) * 31) + this.packages.hashCode()) * 31;
            Integer num = this.initialSelectedTabIndex;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Components(stack=" + this.stack + ", stickyFooter=" + this.stickyFooter + ", background=" + this.background + ", locales=" + this.locales + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", variableConfig=" + this.variableConfig + ", variableDataProvider=" + this.variableDataProvider + ", packages=" + this.packages + ", initialSelectedTabIndex=" + this.initialSelectedTabIndex + ')';
        }
    }

    NonEmptyList<PaywallValidationError> getErrors();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003J/\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult$Legacy;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallValidationResult;", "displayablePaywall", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "template", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", LogEvent.LEVEL_ERROR, "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;)V", "errors", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;)V", "getDisplayablePaywall", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "getErrors", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "getTemplate", "()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;", "warning", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "getWarning", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Legacy implements PaywallValidationResult {
        public static final int $stable = 8;
        private final PaywallData displayablePaywall;
        private final NonEmptyList<PaywallValidationError> errors;
        private final PaywallTemplate template;

        /* JADX WARN: Multi-variable type inference failed */
        public Legacy(PaywallData displayablePaywall, PaywallTemplate template, NonEmptyList<? extends PaywallValidationError> nonEmptyList) {
            AbstractC5504s.h(displayablePaywall, "displayablePaywall");
            AbstractC5504s.h(template, "template");
            this.displayablePaywall = displayablePaywall;
            this.template = template;
            this.errors = nonEmptyList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Legacy copy$default(Legacy legacy, PaywallData paywallData, PaywallTemplate paywallTemplate, NonEmptyList nonEmptyList, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywallData = legacy.displayablePaywall;
            }
            if ((i10 & 2) != 0) {
                paywallTemplate = legacy.template;
            }
            if ((i10 & 4) != 0) {
                nonEmptyList = legacy.errors;
            }
            return legacy.copy(paywallData, paywallTemplate, nonEmptyList);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PaywallData getDisplayablePaywall() {
            return this.displayablePaywall;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PaywallTemplate getTemplate() {
            return this.template;
        }

        public final NonEmptyList<PaywallValidationError> component3() {
            return this.errors;
        }

        public final Legacy copy(PaywallData displayablePaywall, PaywallTemplate template, NonEmptyList<? extends PaywallValidationError> errors) {
            AbstractC5504s.h(displayablePaywall, "displayablePaywall");
            AbstractC5504s.h(template, "template");
            return new Legacy(displayablePaywall, template, errors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Legacy)) {
                return false;
            }
            Legacy legacy = (Legacy) other;
            return AbstractC5504s.c(this.displayablePaywall, legacy.displayablePaywall) && this.template == legacy.template && AbstractC5504s.c(this.errors, legacy.errors);
        }

        public final PaywallData getDisplayablePaywall() {
            return this.displayablePaywall;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult
        public NonEmptyList<PaywallValidationError> getErrors() {
            return this.errors;
        }

        public final PaywallTemplate getTemplate() {
            return this.template;
        }

        public final PaywallWarning getWarning() {
            PaywallValidationError paywallValidationError;
            NonEmptyList<PaywallValidationError> errors = getErrors();
            if (errors == null || (paywallValidationError = (PaywallValidationError) errors.getHead()) == null) {
                return null;
            }
            return PaywallWarning.INSTANCE.from(paywallValidationError);
        }

        public int hashCode() {
            int iHashCode = ((this.displayablePaywall.hashCode() * 31) + this.template.hashCode()) * 31;
            NonEmptyList<PaywallValidationError> nonEmptyList = this.errors;
            return iHashCode + (nonEmptyList == null ? 0 : nonEmptyList.hashCode());
        }

        public String toString() {
            return "Legacy(displayablePaywall=" + this.displayablePaywall + ", template=" + this.template + ", errors=" + this.errors + ')';
        }

        public /* synthetic */ Legacy(PaywallData paywallData, PaywallTemplate paywallTemplate, NonEmptyList nonEmptyList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(paywallData, paywallTemplate, (NonEmptyList<? extends PaywallValidationError>) ((i10 & 4) != 0 ? null : nonEmptyList));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Legacy(PaywallData displayablePaywall, PaywallTemplate template, PaywallValidationError error) {
            this(displayablePaywall, template, (NonEmptyList<? extends PaywallValidationError>) NonEmptyListKt.nonEmptyListOf(error, new PaywallValidationError[0]));
            AbstractC5504s.h(displayablePaywall, "displayablePaywall");
            AbstractC5504s.h(template, "template");
            AbstractC5504s.h(error, "error");
        }
    }
}
