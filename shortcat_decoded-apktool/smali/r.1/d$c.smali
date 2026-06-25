.class Lr/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/lifecycle/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/d;->B()V
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
    iput-object p1, p0, Lr/d$c;->a:Lr/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lr/f$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr/d$c;->b(Lr/f$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lr/f$b;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lr/d$c;->a:Lr/d;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lr/d;->Q(Lr/f$b;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lr/d$c;->a:Lr/d;

    .line 9
    .line 10
    iget-object p1, p1, Lr/d;->b:Lr/g;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0}, Lr/g;->G(Lr/f$b;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
