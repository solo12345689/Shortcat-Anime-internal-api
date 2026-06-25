.class public final synthetic Lcom/facebook/react/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/H;

.field public final synthetic b:[Lcom/facebook/react/z;

.field public final synthetic c:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/H;[Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/E;->a:Lcom/facebook/react/H;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/E;->b:[Lcom/facebook/react/z;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/E;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/E;->a:Lcom/facebook/react/H;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/E;->b:[Lcom/facebook/react/z;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/E;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/facebook/react/H;->f(Lcom/facebook/react/H;[Lcom/facebook/react/z;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
