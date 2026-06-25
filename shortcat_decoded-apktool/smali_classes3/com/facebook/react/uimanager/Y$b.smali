.class public final Lcom/facebook/react/uimanager/Y$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Thread;

.field final synthetic b:Lcom/facebook/react/uimanager/Y;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/Y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/Y$b;->b:Lcom/facebook/react/uimanager/Y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/facebook/react/uimanager/Y$b;->a:Ljava/lang/Thread;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/uimanager/Y$b;->a:Ljava/lang/Thread;

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/Y$b;->a:Ljava/lang/Thread;

    .line 12
    .line 13
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, LQ6/a;->a(Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
