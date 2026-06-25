.class public final Lcom/facebook/react/views/text/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/e;
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
    invoke-direct {p0}, Lcom/facebook/react/views/text/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/react/views/text/e;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/views/text/e;->a()Lcom/facebook/react/views/text/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/facebook/react/views/text/e;

    .line 8
    .line 9
    sget-object v1, LX6/a;->c:LX6/a$b;

    .line 10
    .line 11
    invoke-virtual {v1}, LX6/a$b;->c()LX6/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/text/e;-><init>(LX6/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/facebook/react/views/text/e;->b(Lcom/facebook/react/views/text/e;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v0
.end method
