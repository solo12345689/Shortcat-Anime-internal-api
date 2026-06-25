.class public final synthetic Lo7/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/ReactContext;

.field public final synthetic b:Lcom/facebook/react/modules/blob/BlobModule;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/modules/blob/BlobModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo7/a;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 5
    .line 6
    iput-object p2, p0, Lo7/a;->b:Lcom/facebook/react/modules/blob/BlobModule;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo7/a;->a:Lcom/facebook/react/bridge/ReactContext;

    .line 2
    .line 3
    iget-object v1, p0, Lo7/a;->b:Lcom/facebook/react/modules/blob/BlobModule;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/modules/blob/BlobCollector;->a(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/modules/blob/BlobModule;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
