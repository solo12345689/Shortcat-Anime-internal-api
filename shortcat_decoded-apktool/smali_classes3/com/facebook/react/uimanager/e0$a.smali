.class Lcom/facebook/react/uimanager/e0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/e0;->H(Landroid/view/View;ILcom/facebook/react/uimanager/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/uimanager/O;

.field final synthetic b:Lcom/facebook/react/uimanager/e0;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/uimanager/O;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/e0$a;->b:Lcom/facebook/react/uimanager/e0;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/uimanager/e0$a;->a:Lcom/facebook/react/uimanager/O;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/e0$a;->b:Lcom/facebook/react/uimanager/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/facebook/react/uimanager/e0;->d:Lcom/facebook/react/uimanager/Y;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/react/uimanager/e0$a;->a:Lcom/facebook/react/uimanager/O;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Y;->b(Lcom/facebook/react/uimanager/O;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
