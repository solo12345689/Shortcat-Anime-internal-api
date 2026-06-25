.class Lcom/facebook/react/H$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

.field private final b:Lcom/facebook/react/bridge/JSBundleLoader;

.field final synthetic c:Lcom/facebook/react/H;


# direct methods
.method public constructor <init>(Lcom/facebook/react/H;Lcom/facebook/react/bridge/JavaScriptExecutorFactory;Lcom/facebook/react/bridge/JSBundleLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/H$e;->c:Lcom/facebook/react/H;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 13
    .line 14
    invoke-static {p3}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/facebook/react/bridge/JSBundleLoader;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/react/H$e;->b:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/bridge/JSBundleLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$e;->b:Lcom/facebook/react/bridge/JSBundleLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    .line 2
    .line 3
    return-object v0
.end method
