.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt;->rememberCountdownState(Ljava/util/Date;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;
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
    c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1"
    f = "CountdownComponentState.kt"
    l = {
        0x5c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $countdownTime$delegate:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field final synthetic $isCountingEnabled$delegate:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field final synthetic $lifecycleOwner:Landroidx/lifecycle/r;

.field final synthetic $targetDate:Ljava/util/Date;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/Date;Landroidx/lifecycle/r;LY/C0;LY/C0;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Landroidx/lifecycle/r;",
            "LY/C0;",
            "LY/C0;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$targetDate:Ljava/util/Date;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$lifecycleOwner:Landroidx/lifecycle/r;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$isCountingEnabled$delegate:LY/C0;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$countdownTime$delegate:LY/C0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6
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
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$targetDate:Ljava/util/Date;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$lifecycleOwner:Landroidx/lifecycle/r;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$isCountingEnabled$delegate:LY/C0;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$countdownTime$delegate:LY/C0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;-><init>(Ljava/util/Date;Landroidx/lifecycle/r;LY/C0;LY/C0;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->label:I

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
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LGf/O;

    .line 15
    .line 16
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v3, p1

    .line 34
    check-cast v3, LGf/O;

    .line 35
    .line 36
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1$1;

    .line 37
    .line 38
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$lifecycleOwner:Landroidx/lifecycle/r;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$isCountingEnabled$delegate:LY/C0;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-direct {v6, p1, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1$1;-><init>(Landroidx/lifecycle/r;LY/C0;LZd/e;)V

    .line 44
    .line 45
    .line 46
    const/4 v7, 0x3

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-static/range {v3 .. v8}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 50
    .line 51
    .line 52
    move-object v1, v3

    .line 53
    :cond_2
    :goto_0
    invoke-interface {v1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, LGf/F0;->n(LZd/i;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$isCountingEnabled$delegate:LY/C0;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt;->access$rememberCountdownState$lambda$5(LY/C0;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    new-instance p1, Ljava/util/Date;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$targetDate:Ljava/util/Date;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    sub-long/2addr v5, v3

    .line 87
    const-wide/16 v3, 0x0

    .line 88
    .line 89
    cmp-long p1, v5, v3

    .line 90
    .line 91
    if-gtz p1, :cond_3

    .line 92
    .line 93
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$countdownTime$delegate:LY/C0;

    .line 94
    .line 95
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;->getZERO()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt;->access$rememberCountdownState$lambda$3(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->$countdownTime$delegate:LY/C0;

    .line 106
    .line 107
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;

    .line 108
    .line 109
    invoke-virtual {v3, v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime$Companion;->fromInterval(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-static {p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt;->access$rememberCountdownState$lambda$3(LY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    sget-object p1, LEf/a;->b:LEf/a$a;

    .line 117
    .line 118
    sget-object p1, LEf/d;->e:LEf/d;

    .line 119
    .line 120
    invoke-static {v2, p1}, LEf/c;->s(ILEf/d;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    iput-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt$rememberCountdownState$1$1;->label:I

    .line 127
    .line 128
    invoke-static {v3, v4, p0}, LGf/Z;->b(JLZd/e;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_2

    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_5
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 136
    .line 137
    return-object p1
.end method
