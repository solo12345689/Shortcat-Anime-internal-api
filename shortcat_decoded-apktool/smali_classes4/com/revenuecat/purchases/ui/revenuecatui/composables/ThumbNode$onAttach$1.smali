.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;->onAttach()V
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
    c = "com.revenuecat.purchases.ui.revenuecatui.composables.ThumbNode$onAttach$1"
    f = "Switch.kt"
    l = {
        0x14d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

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
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;LZd/e;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->label:I

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
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
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
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lkotlin/jvm/internal/L;

    .line 28
    .line 29
    invoke-direct {p1}, Lkotlin/jvm/internal/L;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;->getInteractionSource()LB/k;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, LB/k;->b()LJf/e;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;

    .line 43
    .line 44
    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    .line 45
    .line 46
    invoke-direct {v3, p1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;-><init>(Lkotlin/jvm/internal/L;Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;)V

    .line 47
    .line 48
    .line 49
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->label:I

    .line 50
    .line 51
    invoke-interface {v1, v3, p0}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 59
    .line 60
    return-object p1
.end method
