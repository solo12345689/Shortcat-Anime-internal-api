.class Lr/d$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/d;->X(Lr/f$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/f$b;

.field final synthetic b:Lr/d;


# direct methods
.method constructor <init>(Lr/d;Lr/f$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/d$k;->b:Lr/d;

    .line 2
    .line 3
    iput-object p2, p0, Lr/d$k;->a:Lr/f$b;

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
    iget-object v0, p0, Lr/d$k;->b:Lr/d;

    .line 2
    .line 3
    iget-object v0, v0, Lr/d;->b:Lr/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/g;->h()Lr/f$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lr/d$k;->a:Lr/f$b;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lr/f$a;->c(Lr/f$b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
