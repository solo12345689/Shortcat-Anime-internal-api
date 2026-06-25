.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LJf/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LB/j;",
        "interaction",
        "LTd/L;",
        "emit",
        "(LB/j;LZd/e;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $pressCount:Lkotlin/jvm/internal/L;

.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->$pressCount:Lkotlin/jvm/internal/L;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final emit(LB/j;LZd/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB/j;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    instance-of p2, p1, LB/o$b;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->$pressCount:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    .line 3
    :cond_0
    instance-of p2, p1, LB/o$c;

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->$pressCount:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    .line 4
    :cond_1
    instance-of p1, p1, LB/o$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->$pressCount:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    .line 5
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->$pressCount:Lkotlin/jvm/internal/L;

    iget p1, p1, Lkotlin/jvm/internal/L;->a:I

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 6
    :goto_1
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;->access$isPressed$p(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;)Z

    move-result p1

    if-eq p1, v0, :cond_4

    .line 7
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    invoke-static {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;->access$setPressed$p(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;Z)V

    .line 8
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode;

    invoke-static {p1}, LK0/H;->b(LK0/E;)V

    .line 9
    :cond_4
    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LB/j;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ThumbNode$onAttach$1$1;->emit(LB/j;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
