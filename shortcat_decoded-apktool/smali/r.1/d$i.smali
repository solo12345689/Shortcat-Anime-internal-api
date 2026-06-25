.class Lr/d$i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/d;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/d;


# direct methods
.method constructor <init>(Lr/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/d$i;->a:Lr/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/d$i;->a:Lr/d;

    .line 2
    .line 3
    iget-object v0, v0, Lr/d;->b:Lr/g;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lr/g;->P(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
