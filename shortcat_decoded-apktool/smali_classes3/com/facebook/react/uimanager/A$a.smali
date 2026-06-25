.class public final Lcom/facebook/react/uimanager/A$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/A$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IIIIII)Lcom/facebook/react/uimanager/A;
    .locals 9

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/A;->b()LK1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK1/e;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/facebook/react/uimanager/A;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/react/uimanager/A;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/A;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    move v3, p1

    .line 20
    move v4, p2

    .line 21
    move v5, p3

    .line 22
    move v6, p4

    .line 23
    move v7, p5

    .line 24
    move v8, p6

    .line 25
    move-object v2, v0

    .line 26
    invoke-virtual/range {v2 .. v8}, Lcom/facebook/react/uimanager/A;->c(IIIIII)V

    .line 27
    .line 28
    .line 29
    move-object v0, v2

    .line 30
    return-object v0
.end method
