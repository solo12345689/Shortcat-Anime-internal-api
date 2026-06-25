.class final Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->rememberPaywallActionHandler(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)Lkotlin/jvm/functions/Function2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;",
        "action",
        "LTd/L;",
        "<anonymous>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$rememberPaywallActionHandler$1$1"
    f = "InternalPaywall.kt"
    l = {
        0x114,
        0x119
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroid/app/Activity;Landroid/content/Context;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
            "Landroid/app/Activity;",
            "Landroid/content/Context;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$activity:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$context:Landroid/content/Context;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LZd/e;",
            ")",
            "LZd/e;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$activity:Landroid/app/Activity;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$context:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Landroid/app/Activity;Landroid/content/Context;LZd/e;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->invoke(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External;

    .line 35
    .line 36
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$RestorePurchases;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 41
    .line 42
    iput v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->label:I

    .line 43
    .line 44
    invoke-interface {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;->handleRestorePurchases(LZd/e;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_a

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$PurchasePackage;

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$activity:Landroid/app/Activity;

    .line 56
    .line 57
    if-nez v1, :cond_4

    .line 58
    .line 59
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 60
    .line 61
    const-string v0, "Activity is null, not initiating package purchase"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_4
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 69
    .line 70
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$PurchasePackage;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$PurchasePackage;->getRcPackage()Lcom/revenuecat/purchases/Package;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$PurchasePackage;->getResolvedOffer()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->label:I

    .line 81
    .line 82
    invoke-interface {v3, v1, v4, p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;->handlePackagePurchase(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_a

    .line 87
    .line 88
    :goto_1
    return-object v0

    .line 89
    :cond_5
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 95
    .line 96
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;

    .line 97
    .line 98
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;->getWebCheckoutUrl(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 105
    .line 106
    const-string v0, "Web checkout URL cannot be found, not launching web checkout."

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 113
    .line 114
    invoke-interface {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;->invalidateCustomerInfoCache()V

    .line 115
    .line 116
    .line 117
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$context:Landroid/content/Context;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;->getOpenMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v2, v0, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->access$handleUrlDestination(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;->getAutoDismiss()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_a

    .line 131
    .line 132
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 133
    .line 134
    const-string v0, "Auto-dismissing paywall after launching web checkout."

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 140
    .line 141
    invoke-static {p1, v1, v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel$DefaultImpls;->closePaywall$default(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateBack;

    .line 146
    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$viewModel:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;

    .line 150
    .line 151
    invoke-static {p1, v1, v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel$DefaultImpls;->closePaywall$default(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_8
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;

    .line 156
    .line 157
    if-eqz v0, :cond_a

    .line 158
    .line 159
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;

    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;->getDestination()Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$CustomerCenter;

    .line 166
    .line 167
    if-eqz v0, :cond_9

    .line 168
    .line 169
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 170
    .line 171
    const-string v0, "Customer Center is not yet implemented on Android."

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$Url;

    .line 178
    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt$rememberPaywallActionHandler$1$1;->$context:Landroid/content/Context;

    .line 182
    .line 183
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$Url;

    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$Url;->getUrl()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$Url;->getMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {v0, v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/InternalPaywallKt;->access$handleUrlDestination(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V

    .line 194
    .line 195
    .line 196
    :cond_a
    :goto_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 197
    .line 198
    return-object p1
.end method
