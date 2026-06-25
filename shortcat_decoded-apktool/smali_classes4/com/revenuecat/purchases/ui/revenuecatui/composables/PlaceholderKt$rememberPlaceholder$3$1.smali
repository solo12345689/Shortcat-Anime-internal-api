.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt;->rememberPlaceholder-OadGlvw(ZJLs0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderHighlight;Lie/a;Lie/a;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;
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
    c = "com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$rememberPlaceholder$3$1"
    f = "Placeholder.kt"
    l = {
        0x78,
        0x7a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $inPreviewMode:Z

.field final synthetic $placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

.field final synthetic $visible:Z

.field label:I


# direct methods
.method constructor <init>(ZZLcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;LZd/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;",
            "LZd/e;",
            ")V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$visible:Z

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$inPreviewMode:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

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
    .locals 3
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
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$visible:Z

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$inPreviewMode:Z

    .line 6
    .line 7
    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;-><init>(ZZLcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;LZd/e;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->label:I

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
    goto :goto_2

    .line 28
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$visible:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$inPreviewMode:Z

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 40
    .line 41
    iput v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->label:I

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;->startAnimation$revenuecatui_defaultsBc8Release(LZd/e;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->$placeholder:Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;

    .line 51
    .line 52
    iput v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/PlaceholderKt$rememberPlaceholder$3$1;->label:I

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/Placeholder;->stopAnimation$revenuecatui_defaultsBc8Release(LZd/e;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_4

    .line 59
    .line 60
    :goto_1
    return-object v0

    .line 61
    :cond_4
    :goto_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 62
    .line 63
    return-object p1
.end method
