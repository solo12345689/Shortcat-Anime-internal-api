.class public final synthetic Lc9/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ8/n;


# instance fields
.field public final synthetic a:Lc9/b;

.field public final synthetic b:LL8/f;


# direct methods
.method public synthetic constructor <init>(Lc9/b;LL8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/p;->a:Lc9/b;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/p;->b:LL8/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lc9/g;

    .line 2
    .line 3
    check-cast p2, Ln9/j;

    .line 4
    .line 5
    new-instance v0, Lc9/s;

    .line 6
    .line 7
    iget-object v1, p0, Lc9/p;->a:Lc9/b;

    .line 8
    .line 9
    invoke-direct {v0, v1, p2}, Lc9/s;-><init>(Lc9/b;Ln9/j;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, LR8/c;->C()Landroid/os/IInterface;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lc9/h;

    .line 17
    .line 18
    iget-object p2, p0, Lc9/p;->b:LL8/f;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, Lc9/h;->K3(Lc9/n;LL8/f;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
