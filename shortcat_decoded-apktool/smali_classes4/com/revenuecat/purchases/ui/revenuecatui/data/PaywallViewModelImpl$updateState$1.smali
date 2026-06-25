.class final Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->updateState()V
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
    c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$updateState$1"
    f = "PaywallViewModel.kt"
    l = {
        0x253,
        0x25b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

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
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

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
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;LZd/e;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->label:I

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
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :catch_0
    move-exception p1

    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 34
    .line 35
    :try_start_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :try_start_2
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$getOptions$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;->getOfferingSelection$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$OfferingType;->getOfferingType()Lcom/revenuecat/purchases/Offering;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_5

    .line 63
    :cond_3
    instance-of v1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 64
    .line 65
    if-eqz v1, :cond_8

    .line 66
    .line 67
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 68
    .line 69
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$getPurchases$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->label:I

    .line 76
    .line 77
    invoke-interface {v1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitOfferings(LZd/e;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-ne v1, v0, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    move-object v0, p1

    .line 85
    move-object p1, v1

    .line 86
    :goto_0
    check-cast p1, Lcom/revenuecat/purchases/Offerings;

    .line 87
    .line 88
    move-object v1, v0

    .line 89
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;->getPresentedOfferingContext()Lcom/revenuecat/purchases/PresentedOfferingContext;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;->getOfferingId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/Offerings;->get(Ljava/lang/String;)Lcom/revenuecat/purchases/Offering;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Offerings;->getCurrent()Lcom/revenuecat/purchases/Offering;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move-object p1, v0

    .line 113
    :goto_1
    if-eqz v1, :cond_a

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    invoke-virtual {p1, v1}, Lcom/revenuecat/purchases/Offering;->copy(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/Offering;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    goto :goto_2

    .line 122
    :cond_6
    const/4 v0, 0x0

    .line 123
    :goto_2
    if-nez v0, :cond_7

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_7
    move-object p1, v0

    .line 127
    goto :goto_5

    .line 128
    :cond_8
    instance-of p1, p1, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$None;

    .line 129
    .line 130
    if-eqz p1, :cond_c

    .line 131
    .line 132
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 133
    .line 134
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$getPurchases$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->label:I

    .line 139
    .line 140
    invoke-interface {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitOfferings(LZd/e;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-ne p1, v0, :cond_9

    .line 145
    .line 146
    :goto_3
    return-object v0

    .line 147
    :cond_9
    :goto_4
    check-cast p1, Lcom/revenuecat/purchases/Offerings;

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Offerings;->getCurrent()Lcom/revenuecat/purchases/Offering;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :cond_a
    :goto_5
    if-nez p1, :cond_b

    .line 154
    .line 155
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 156
    .line 157
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$get_state$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)LJf/u;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;

    .line 162
    .line 163
    const-string v1, "The RevenueCat dashboard does not have a current offering configured."

    .line 164
    .line 165
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {p1, v0}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_b
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 173
    .line 174
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$get_state$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)LJf/u;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 179
    .line 180
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$get_colorScheme$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)LJf/u;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, LU/l;

    .line 189
    .line 190
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 191
    .line 192
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$getPurchases$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getStorefrontCountryCode()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 201
    .line 202
    invoke-static {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$getOptions$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;->getMode$revenuecatui_defaultsBc8Release()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-static {v1, p1, v2, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$calculateState(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;Lcom/revenuecat/purchases/Offering;LU/l;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-interface {v0, p1}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_c
    new-instance p1, LTd/r;

    .line 219
    .line 220
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 221
    .line 222
    .line 223
    throw p1
    :try_end_2
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_2 .. :try_end_2} :catch_0

    .line 224
    :goto_6
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl$updateState$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;

    .line 225
    .line 226
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;->access$get_state$p(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModelImpl;)LJf/u;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;

    .line 231
    .line 232
    new-instance v2, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v3, "Error "

    .line 238
    .line 239
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/revenuecat/purchases/PurchasesException;->getCode()Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v3}, Lcom/revenuecat/purchases/PurchasesErrorCode;->getCode()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v3, ": "

    .line 254
    .line 255
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/revenuecat/purchases/PurchasesException;->getCode()Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p1}, Lcom/revenuecat/purchases/PurchasesErrorCode;->getDescription()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-direct {v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Error;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-interface {v0, v1}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :goto_7
    sget-object p1, LTd/L;->a:LTd/L;

    .line 280
    .line 281
    return-object p1
.end method
