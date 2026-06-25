.class final Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->preloadExitOffering()V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LGf/O;",
        "LTd/L;",
        "<anonymous>",
        "(LGf/O;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$preloadExitOffering$1"
    f = "PaywallViewModel.kt"
    l = {
        0xe6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 1
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
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGf/O;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LY/C0;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :try_start_1
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$get_state$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)LJf/u;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;

    .line 50
    .line 51
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;->getOffering()Lcom/revenuecat/purchases/Offering;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getOffering()Lcom/revenuecat/purchases/Offering;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move-object p1, v3

    .line 75
    :goto_0
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Offering;->getPaywallComponents()Lcom/revenuecat/purchases/Offering$PaywallComponents;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Offering$PaywallComponents;->getData()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;->getExitOffers()Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;->getDismiss()Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;->getOfferingId()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    move-object v1, p1

    .line 106
    goto :goto_1

    .line 107
    :cond_4
    move-object v1, v3

    .line 108
    :goto_1
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 109
    .line 110
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$get_preloadedExitOffering$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)LY/C0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 117
    .line 118
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$getPurchases$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iput-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->L$1:Ljava/lang/Object;

    .line 125
    .line 126
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$preloadExitOffering$1;->label:I

    .line 127
    .line 128
    invoke-interface {v3, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitOfferings(LZd/e;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-ne v2, v0, :cond_5

    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_5
    move-object v0, p1

    .line 136
    move-object p1, v2

    .line 137
    :goto_2
    check-cast p1, Lcom/revenuecat/purchases/Offerings;

    .line 138
    .line 139
    invoke-virtual {p1, v1}, Lcom/revenuecat/purchases/Offerings;->get(Ljava/lang/String;)Lcom/revenuecat/purchases/Offering;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-nez v3, :cond_6

    .line 144
    .line 145
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v4, "Exit offering with ID \'"

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, "\' not found in available offerings. Exit offer will not be displayed."

    .line 161
    .line 162
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_6
    move-object p1, v0

    .line 173
    :cond_7
    invoke-interface {p1, v3}, LY/C0;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :goto_3
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 178
    .line 179
    const-string v1, "Failed to preload exit offering"

    .line 180
    .line 181
    invoke-virtual {v0, v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 185
    .line 186
    return-object p1
.end method
