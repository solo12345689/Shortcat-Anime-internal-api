.class final Lcom/facebook/react/uimanager/j0$c;
.super Lcom/facebook/react/uimanager/j0$v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final c:I

.field private final d:Z

.field private final e:Z

.field final synthetic f:Lcom/facebook/react/uimanager/j0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/j0;IIZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/uimanager/j0$c;->f:Lcom/facebook/react/uimanager/j0;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/j0$v;-><init>(Lcom/facebook/react/uimanager/j0;I)V

    .line 4
    .line 5
    .line 6
    iput p3, p0, Lcom/facebook/react/uimanager/j0$c;->c:I

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/facebook/react/uimanager/j0$c;->e:Z

    .line 9
    .line 10
    iput-boolean p5, p0, Lcom/facebook/react/uimanager/j0$c;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0$c;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0$c;->f:Lcom/facebook/react/uimanager/j0;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->d(Lcom/facebook/react/uimanager/j0;)Lcom/facebook/react/uimanager/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lcom/facebook/react/uimanager/j0$v;->a:I

    .line 12
    .line 13
    iget v2, p0, Lcom/facebook/react/uimanager/j0$c;->c:I

    .line 14
    .line 15
    iget-boolean v3, p0, Lcom/facebook/react/uimanager/j0$c;->d:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/react/uimanager/y;->x(IIZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0$c;->f:Lcom/facebook/react/uimanager/j0;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/facebook/react/uimanager/j0;->d(Lcom/facebook/react/uimanager/j0;)Lcom/facebook/react/uimanager/y;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/y;->d()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
