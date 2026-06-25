.class public final Lcom/swmansion/rnscreens/gamma/tabs/l$i;
.super Lle/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/gamma/tabs/l;-><init>(Lcom/facebook/react/uimanager/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/swmansion/rnscreens/gamma/tabs/l;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$i;->b:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lle/b;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected c(Lpe/m;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p3, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$i;->b:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {p1, v1, v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->L(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l$i;->b:Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 28
    .line 29
    invoke-static {p1, p2, p3}, Lcom/swmansion/rnscreens/gamma/tabs/l;->r(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
