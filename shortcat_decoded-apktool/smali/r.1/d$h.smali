.class Lr/d$h;
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
    iput-object p1, p0, Lr/d$h;->a:Lr/d;

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
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr/d$h;->b(Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lr/d$h;->a:Lr/d;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Lr/d;->z(I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lr/d$h;->a:Lr/d;

    .line 14
    .line 15
    invoke-virtual {p1}, Lr/d;->C()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lr/d$h;->a:Lr/d;

    .line 19
    .line 20
    iget-object p1, p1, Lr/d;->b:Lr/g;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Lr/g;->O(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
