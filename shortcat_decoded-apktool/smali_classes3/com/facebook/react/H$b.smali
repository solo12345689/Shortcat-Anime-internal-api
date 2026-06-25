.class Lcom/facebook/react/H$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc7/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H;->j0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H;


# direct methods
.method constructor <init>(Lcom/facebook/react/H;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/H$b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/H$b;->c(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/H;->l(Lcom/facebook/react/H;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/facebook/react/H;->j(Lcom/facebook/react/H;)Lc7/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Lc7/f;->B()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/facebook/react/H;->j(Lcom/facebook/react/H;)Lc7/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Lc7/f;->E()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/facebook/react/H;->m(Lcom/facebook/react/H;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/facebook/react/H;->o(Lcom/facebook/react/H;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/H$b;->a:Lcom/facebook/react/H;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/facebook/react/H;->p(Lcom/facebook/react/H;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/I;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/I;-><init>(Lcom/facebook/react/H$b;Z)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method
