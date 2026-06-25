package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "variable", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VariableProcessor$processVariables$resultString$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ VariableProcessor.PackageContext $context;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Package $rcPackage;
    final /* synthetic */ VariableDataProvider $variableDataProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariableProcessor$processVariables$resultString$1(VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r32, Locale locale) {
        super(1);
        this.$variableDataProvider = variableDataProvider;
        this.$context = packageContext;
        this.$rcPackage = r32;
        this.$locale = locale;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String variable) {
        AbstractC5504s.h(variable, "variable");
        return VariableProcessor.INSTANCE.variableValue(this.$variableDataProvider, this.$context, variable, this.$rcPackage, this.$locale);
    }
}
