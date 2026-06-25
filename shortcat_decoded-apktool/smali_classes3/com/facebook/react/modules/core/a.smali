.class public final synthetic Lcom/facebook/react/modules/core/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/modules/core/JavaTimerManager$d;

    .line 2
    .line 3
    check-cast p2, Lcom/facebook/react/modules/core/JavaTimerManager$d;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->c(Lcom/facebook/react/modules/core/JavaTimerManager$d;Lcom/facebook/react/modules/core/JavaTimerManager$d;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
