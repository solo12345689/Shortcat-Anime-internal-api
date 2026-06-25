.class LE3/B2$a;
.super Landroid/os/ResultReceiver;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE3/B2;->Z0(LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/util/concurrent/w;

.field final synthetic b:LE3/B2;


# direct methods
.method constructor <init>(LE3/B2;Landroid/os/Handler;Lcom/google/common/util/concurrent/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/B2$a;->b:LE3/B2;

    .line 2
    .line 3
    iput-object p3, p0, LE3/B2$a;->a:Lcom/google/common/util/concurrent/w;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method protected onReceiveResult(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$a;->a:Lcom/google/common/util/concurrent/w;

    .line 2
    .line 3
    new-instance v1, LE3/X6;

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 8
    .line 9
    :cond_0
    invoke-direct {v1, p1, p2}, LE3/X6;-><init>(ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/common/util/concurrent/w;->F(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
