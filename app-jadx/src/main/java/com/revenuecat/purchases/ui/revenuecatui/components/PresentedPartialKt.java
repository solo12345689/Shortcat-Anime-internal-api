package com.revenuecat.purchases.ui.revenuecatui.components;

import Td.r;
import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import Wf.j;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aQ\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n0\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0013\u001a\u0004\u0018\u0001H\u0007\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u0001H\u0007H\u0002¢\u0006\u0002\u0010\u0015\u001a,\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00192\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u0017*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002\u001a \u0010\u0016\u001a\u00020\u0017*\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020 0\u001fH\u0002\u001a\u0014\u0010!\u001a\u00020\u0017*\u00020\u001d2\u0006\u0010\"\u001a\u00020 H\u0002\u001aB\u0010#\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b*\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001az\u0010$\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H&0\n0\t\u0012\u0004\u0012\u00020'0%\"\b\b\u0000\u0010\u0007*\u00020(\"\u000e\b\u0001\u0010&*\b\u0012\u0004\u0012\u0002H&0\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070)0\t2\b\b\u0002\u0010*\u001a\u00020\u00172$\u0010+\u001a \u0012\u0004\u0012\u0002H\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H&\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0-0%0,H\u0000\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006."}, d2 = {"applicableConditions", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;", "getApplicableConditions", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;)Ljava/util/Set;", "buildPresentedPartial", "T", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedOverride;", "windowSize", "offerEligibility", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;", "conditionContext", "Lcom/revenuecat/purchases/ui/revenuecatui/components/ConditionContext;", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/components/ScreenCondition;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;Lcom/revenuecat/purchases/ui/revenuecatui/components/ComponentViewState;Lcom/revenuecat/purchases/ui/revenuecatui/components/ConditionContext;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;", "combineOrReplace", "with", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedPartial;", "evaluate", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$PromoOfferRule;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$SelectedPackage;", "selectedPackageId", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Variable;", "customVariables", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "matchesValue", "variableValue", "shouldApply", "toPresentedOverrides", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "P", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "stripRules", "transform", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PresentedPartialKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ComponentOverride.EqualityOperator.values().length];
            try {
                iArr[ComponentOverride.EqualityOperator.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComponentOverride.EqualityOperator.NOT_EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ComponentOverride.ArrayOperator.values().length];
            try {
                iArr2[ComponentOverride.ArrayOperator.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ComponentOverride.ArrayOperator.NOT_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ScreenCondition.values().length];
            try {
                iArr3[ScreenCondition.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ScreenCondition.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ScreenCondition.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final /* synthetic */ PresentedPartial buildPresentedPartial(List list, ScreenCondition windowSize, OfferEligibility offerEligibility, ComponentViewState state, ConditionContext conditionContext) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(windowSize, "windowSize");
        AbstractC5504s.h(offerEligibility, "offerEligibility");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(conditionContext, "conditionContext");
        Iterator it = list.iterator();
        PresentedPartial presentedPartialCombineOrReplace = null;
        while (it.hasNext()) {
            PresentedOverride presentedOverride = (PresentedOverride) it.next();
            if (shouldApply(presentedOverride, windowSize, offerEligibility, state, conditionContext)) {
                presentedPartialCombineOrReplace = combineOrReplace(presentedPartialCombineOrReplace, presentedOverride.getProperties());
            }
        }
        return presentedPartialCombineOrReplace;
    }

    public static /* synthetic */ PresentedPartial buildPresentedPartial$default(List list, ScreenCondition screenCondition, OfferEligibility offerEligibility, ComponentViewState componentViewState, ConditionContext conditionContext, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            conditionContext = new ConditionContext(null, S.i());
        }
        return buildPresentedPartial(list, screenCondition, offerEligibility, componentViewState, conditionContext);
    }

    private static final <T extends PresentedPartial<T>> T combineOrReplace(PresentedPartial<T> presentedPartial, T t10) {
        T t11;
        return (presentedPartial == null || (t11 = (T) presentedPartial.combine(t10)) == null) ? t10 : t11;
    }

    private static final boolean evaluate(ComponentOverride.Condition condition, ScreenCondition screenCondition, OfferEligibility offerEligibility, ComponentViewState componentViewState, ConditionContext conditionContext) {
        if (AbstractC5504s.c(condition, ComponentOverride.Condition.Compact.INSTANCE) ? true : AbstractC5504s.c(condition, ComponentOverride.Condition.Medium.INSTANCE) ? true : AbstractC5504s.c(condition, ComponentOverride.Condition.Expanded.INSTANCE)) {
            return getApplicableConditions(screenCondition).contains(condition);
        }
        if (AbstractC5504s.c(condition, ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE)) {
            return offerEligibility.getHasMultipleDiscountedPhases();
        }
        if (AbstractC5504s.c(condition, ComponentOverride.Condition.IntroOffer.INSTANCE)) {
            return offerEligibility.isIntroOffer();
        }
        if (condition instanceof ComponentOverride.Condition.IntroOfferRule) {
            return evaluate((ComponentOverride.Condition.IntroOfferRule) condition, offerEligibility);
        }
        if (AbstractC5504s.c(condition, ComponentOverride.Condition.Selected.INSTANCE)) {
            return componentViewState == ComponentViewState.SELECTED;
        }
        if (AbstractC5504s.c(condition, ComponentOverride.Condition.PromoOffer.INSTANCE)) {
            return offerEligibility.isPromoOffer();
        }
        if (condition instanceof ComponentOverride.Condition.PromoOfferRule) {
            return evaluate((ComponentOverride.Condition.PromoOfferRule) condition, offerEligibility);
        }
        if (condition instanceof ComponentOverride.Condition.SelectedPackage) {
            return evaluate((ComponentOverride.Condition.SelectedPackage) condition, conditionContext.getSelectedPackageId());
        }
        if (condition instanceof ComponentOverride.Condition.Variable) {
            return evaluate((ComponentOverride.Condition.Variable) condition, conditionContext.getCustomVariables());
        }
        if (AbstractC5504s.c(condition, ComponentOverride.Condition.Unsupported.INSTANCE)) {
            return false;
        }
        throw new r();
    }

    private static final Set<ComponentOverride.Condition> getApplicableConditions(ScreenCondition screenCondition) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[screenCondition.ordinal()];
        if (i10 == 1) {
            return a0.c(ComponentOverride.Condition.Compact.INSTANCE);
        }
        if (i10 == 2) {
            return a0.h(ComponentOverride.Condition.Compact.INSTANCE, ComponentOverride.Condition.Medium.INSTANCE);
        }
        if (i10 == 3) {
            return a0.h(ComponentOverride.Condition.Compact.INSTANCE, ComponentOverride.Condition.Medium.INSTANCE, ComponentOverride.Condition.Expanded.INSTANCE);
        }
        throw new r();
    }

    private static final boolean matchesValue(ComponentOverride.Condition.Variable variable, CustomVariableValue customVariableValue) {
        return variable.getValue().d() ? (customVariableValue instanceof CustomVariableValue.String) && AbstractC5504s.c(((CustomVariableValue.String) customVariableValue).getValue(), variable.getValue().b()) : j.e(variable.getValue()) != null ? (customVariableValue instanceof CustomVariableValue.Boolean) && AbstractC5504s.c(Boolean.valueOf(((CustomVariableValue.Boolean) customVariableValue).getValue()), j.e(variable.getValue())) : j.h(variable.getValue()) != null && (customVariableValue instanceof CustomVariableValue.Number) && AbstractC5504s.a(((CustomVariableValue.Number) customVariableValue).getValue(), j.h(variable.getValue()));
    }

    private static final <T extends PresentedPartial<T>> boolean shouldApply(PresentedOverride<T> presentedOverride, ScreenCondition screenCondition, OfferEligibility offerEligibility, ComponentViewState componentViewState, ConditionContext conditionContext) {
        List conditions = presentedOverride.getConditions();
        if (conditions != null && conditions.isEmpty()) {
            return true;
        }
        Iterator it = conditions.iterator();
        while (it.hasNext()) {
            if (!evaluate((ComponentOverride.Condition) it.next(), screenCondition, offerEligibility, componentViewState, conditionContext)) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ Result toPresentedOverrides(List list, boolean z10, Function1 transform) {
        AbstractC5504s.h(list, "<this>");
        AbstractC5504s.h(transform, "transform");
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                List<ComponentOverride.Condition> conditions = ((ComponentOverride) obj).getConditions();
                if (conditions == null || !conditions.isEmpty()) {
                    for (ComponentOverride.Condition condition : conditions) {
                        if (condition.isRule() || (condition instanceof ComponentOverride.Condition.Unsupported)) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
        for (ComponentOverride componentOverride : list) {
            Result result = (Result) transform.invoke(componentOverride.getProperties());
            if (!(result instanceof Result.Success)) {
                if (result instanceof Result.Error) {
                    return new Result.Error(((NonEmptyList) ((Result.Error) result).getValue()).getHead());
                }
                throw new r();
            }
            arrayList2.add(new PresentedOverride(componentOverride.getConditions(), (PresentedPartial) ((Result.Success) result).getValue()));
        }
        return new Result.Success(arrayList2);
    }

    public static /* synthetic */ Result toPresentedOverrides$default(List list, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toPresentedOverrides(list, z10, function1);
    }

    private static final boolean evaluate(ComponentOverride.Condition.IntroOfferRule introOfferRule, OfferEligibility offerEligibility) {
        boolean zIsIntroOffer = offerEligibility.isIntroOffer();
        int i10 = WhenMappings.$EnumSwitchMapping$0[introOfferRule.getOperator().ordinal()];
        if (i10 == 1) {
            return zIsIntroOffer == introOfferRule.getValue();
        }
        if (i10 == 2) {
            return zIsIntroOffer != introOfferRule.getValue();
        }
        throw new r();
    }

    private static final boolean evaluate(ComponentOverride.Condition.PromoOfferRule promoOfferRule, OfferEligibility offerEligibility) {
        boolean zIsPromoOffer = offerEligibility.isPromoOffer();
        int i10 = WhenMappings.$EnumSwitchMapping$0[promoOfferRule.getOperator().ordinal()];
        if (i10 == 1) {
            return zIsPromoOffer == promoOfferRule.getValue();
        }
        if (i10 == 2) {
            return zIsPromoOffer != promoOfferRule.getValue();
        }
        throw new r();
    }

    private static final boolean evaluate(ComponentOverride.Condition.SelectedPackage selectedPackage, String str) {
        if (str == null) {
            return false;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$1[selectedPackage.getOperator().ordinal()];
        if (i10 == 1) {
            return selectedPackage.getPackages().contains(str);
        }
        if (i10 == 2) {
            return !selectedPackage.getPackages().contains(str);
        }
        throw new r();
    }

    private static final boolean evaluate(ComponentOverride.Condition.Variable variable, Map<String, ? extends CustomVariableValue> map) {
        CustomVariableValue customVariableValue = map.get(variable.getVariable());
        if (customVariableValue == null) {
            return variable.getOperator() == ComponentOverride.EqualityOperator.NOT_EQUALS;
        }
        boolean zMatchesValue = matchesValue(variable, customVariableValue);
        int i10 = WhenMappings.$EnumSwitchMapping$0[variable.getOperator().ordinal()];
        if (i10 == 1) {
            return zMatchesValue;
        }
        if (i10 == 2) {
            return !zMatchesValue;
        }
        throw new r();
    }
}
